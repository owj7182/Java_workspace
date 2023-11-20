package sh.java.network.tcp.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	// port : 0 ~ 1024 (well-known port) 이후의 값을 지정 (0 ~ 65535)
	static final int PORT = 7777;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("""
				===============
				서버
				===============	
					""");
		new ChatServer().start();
	}
	private void start() {
		try {
			// 1. server socket 생성후 대기
			ServerSocket serverSocket = new ServerSocket(PORT);
			// 서버 반복처리
			while(true) {
				System.out.printf("%s:%s 서버 대기중...\n", InetAddress.getLocalHost().getHostAddress(),PORT);
				Socket socket = serverSocket.accept();
				System.out.printf("%s 클라이언트 접속...\n",socket.getInetAddress().getHostAddress());
				
				// 2. 입출력 스트림 준비
				try (
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream());
				){
					pw.println("welcome to 서버");
					pw.flush();
					
					String inMsg = null;
					while((inMsg = br.readLine()) != null) {
						if("exit".equals(inMsg)) {
							System.out.println("> 클라이언트가 채팅을 종료했습니다.");
							break;
						}
						
						System.out.println("[클라이언트]" + inMsg);
						System.out.print("[서버 ] ");
						String outMsg = sc.nextLine();
						pw.println(outMsg);
						pw.flush();
						
						if("kick".equals(outMsg)) {
							System.out.println("> 채팅을 종료했습니다.");
							break;
						}
					}
				}
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}