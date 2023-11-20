package sh.java.network.tcp.chat.groupchat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;



public class GroupServer {
	// key(String 사용자 이름), value(DataOutputStream 각 클라이언트별 출력스트림)
	private HashMap<String, DataOutputStream> clients;
	private ServerSocket serverSocket = null;

	public GroupServer(int port) throws IOException {
		this.serverSocket = new ServerSocket(port);
		System.out.println("서버를 시작합니다.");

		this.clients = new HashMap<>();
		// 동기화 처리
		Collections.synchronizedMap(this.clients);
		init();
	}

	public void init() {
		// 접속자가 생길때마다 새 쓰레드를 생성한다.
		while (true) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]에서 접속했습니다.");
				// 사용자입력값을 받아 전체 전송할 용도의 쓰레드
				Thread serverReceiver = new Thread(new ServerReceiver(socket));
				serverReceiver.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 접속한 모든 클라이언트에게 메세지를 쓰는 메소드.
	 * 
	 * @param msg
	 */
	public void sendToAll(String name, String msg) {
		// 맵 clients의 키타입은 String이다.
		Iterator<String> it = clients.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			if(key.equals(name)) continue;

			// iterator에 담아둔 키값을 이용해서 맵에 저장된 dos를 리턴한다.
			DataOutputStream eachDos = clients.get(key);
			try {
				eachDos.writeUTF("[" + name + "] " + msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	/**
	 * Receiver역할을 할 쓰레드클래스를 내부에 정의함.
	 * 
	 * @author shqkel1863
	 *
	 */
	class ServerReceiver implements Runnable {
		private Socket socket;
		private DataInputStream dis;
		private DataOutputStream dos;

		// 매번 접속자가 생길때 마다 생성함.
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				dis = new DataInputStream(socket.getInputStream());

				// receiver에 웬 OutputStream??
				// client 맵에 저장할거임
				dos = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			String name = "";

			try {
				// 접속하면, 클라이언트는 이름을 읽어서, 그걸 받아서 맵의 key로 쓰겠음.
				name = dis.readUTF();
				sendToAll(name, "#" + name + "님이 들어오셨습니다.");

				// 클라이언트맵에 저장함
				clients.put(name, dos);
				System.out.println("현재 접속자수는 " + clients.size() + "명 입니다.");

				// 글을 쓰면 접속한 모든 클라이언트에게 전송함.
				while (true) {
					String msg = dis.readUTF();
					// 서버로그
					// System.err.println("["+name+"] "+msg);

					// 네가 나간다는 말만하지 않으면...
					if (!"exit".equals(msg))
						sendToAll(name, msg);
					else {
						dis.close();
						break;
					}
				}

				// 클라이언트 종료로 발생하는 Exception은 무시한다.
			} catch (SocketException | EOFException e) {
				// ignore
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendToAll(name, "#" + name + "님이 나가셨습니다.");
				// 이 클라이언트을 맵에서 삭제함.
				clients.remove(name);

				// 서버로그
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]에서 접속을 종료했습니다.");
				System.out.println("현재 접속자수는 " + clients.size() + "명입니다.");
			}
		}

	}
}
