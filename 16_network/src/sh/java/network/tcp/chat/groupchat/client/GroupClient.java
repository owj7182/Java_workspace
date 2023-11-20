package sh.java.network.tcp.chat.groupchat.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class GroupClient {
	private Socket socket;
	private String name;

	public GroupClient(String serverIp, int serverPort, String name) throws UnknownHostException, IOException {
		this.socket = new Socket(serverIp, serverPort);
		this.name = name;
		System.out.println("서버에 연결되었습니다.");

		// 클라이언트의 입출력스트림을 독립된 쓰레드로 분리함.
		// 만들어진 socket을 전달.
		Thread sender = new Thread(new ClientSender(name));
		Thread receiver = new Thread(new ClientReceiver());
		sender.start();
		receiver.start();
	}

	class ClientSender implements Runnable {
		private DataOutputStream dos;

		/**
		 * 소켓과 대화명을 매개변수로 받는다.
		 * 
		 * @param socket
		 * @param name
		 * @throws IOException
		 */
		private ClientSender(String name) throws IOException {
			this.dos = new DataOutputStream(socket.getOutputStream());
			// 사용할 이름을 최초전송함.
			this.dos.writeUTF(name);
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.print("[" + name + "] ");
				String msg = sc.nextLine();
				try {
					this.dos.writeUTF(msg);

					// 사용자 입력값이 exit인 경우 종료. 스트림 반환
					if ("exit".equals(msg)) {
						this.dos.close();
						break;
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	class ClientReceiver implements Runnable {
		DataInputStream dis;

		private ClientReceiver() throws IOException {
			this.dis = new DataInputStream(socket.getInputStream());
		}

		@Override
		public void run() {
			// 소켓이 닫히기 전까지만 실행한다.
			while (!socket.isClosed()) {
				try {
					System.out.println(dis.readUTF());
				} catch (SocketException | EOFException e) {
					// ignore
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
