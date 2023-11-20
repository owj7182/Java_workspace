package sh.java.network.tcp.chat.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;



public class ChatClient {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("""
				===============
				클라이언트
				===============	
					""");
		if(args.length != 2) {
			System.err.println("ChatClient사용법 : ip port 필수입니다. 예)192.168.20.100 7777");
			return;
		}
		new ChatClient().start(args[0], Integer.parseInt(args[1])); // ip port
	}

	private void start(String ip, int port) {
		System.out.printf("%s:%s에 접속중...\n", ip, port);
		// 1. 서버 접속 및 소켓 생성
		try {
		Socket clientSocket = new Socket(ip, port);
		System.out.printf("%s:%s에 접속되었습니다...\n", ip, port);
		
		// 2. 입출력 스트림 준비
			try (
					BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
					PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
			){
				String inMsg = null;
				while((inMsg = br.readLine()) != null) {
					if("kick".equals(inMsg)) {
						System.out.println("> 서버가 채팅을 종료했습니다.");
						break;
					}
					
					System.out.println("[서버]" + inMsg);
					System.out.print("[클라이언트] ");
					String outMsg = sc.nextLine();
					pw.println(outMsg);
					pw.flush();
					
					if("exit".equals(outMsg)) {
						System.out.println("> 채팅을 종료했습니다.");
						break;
					}
				}
				
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
