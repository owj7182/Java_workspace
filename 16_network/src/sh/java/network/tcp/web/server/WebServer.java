package sh.java.network.tcp.web.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Web Server
 * - http, https의 기본 포트 80, 443
 * - 다른 포트 넘버 사용가능
 * - 브라우저 요청시 tcp 소켓을 통해 연결하고, html을 응답하면 끝.
 * 
 * @author sisna
 *
 */
public class WebServer {
	
	public static final int PORT = 80;
	
	public static void main(String[] args) {
		new WebServer().init();
	}

	private void init() {
		try (ServerSocket serverSocket = new ServerSocket(PORT);){
			
			while(true) {
				System.out.printf("%s:%s 웹서버 대기중...\n", InetAddress.getLocalHost(), PORT);
				try(
					Socket socket =serverSocket.accept();
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
				){
					// 요청처리
					// 헤더 전체 열람
//					String data = null;
//					while((data = br.readLine()).length() != 0) {
//						System.out.println(data);
//					}
					// 요청주소
					String[] temp = br.readLine().split(" "); // Get / HTTP/1.1
					String url = temp[1];
					
					// html 응답 처리
					String html = null;
					if(url.startsWith("/abc")) {
						
						Map<String, String> param = getParameterMap(url.split("\\?")[1]); // ["/abc", "id=honggd&num=123"]
						
						System.out.println(param);
						
						html = """
							<!DOCTYPE html>
							<html>
								<head>
									<meta charset="utf-8"/>
								</head>
								<body>
									<h1>ABC</h1>
									<div>id : %s</div>
									<div>num : %s</div>
									<a href="/">인덱스페이지로 이동</a>
								</body>
							</html>
							
							""".formatted(param.get("id"), param.get("num"));
					}
					else {
						html = """
							<!DOCTYPE html>
							<html>
								<head>
									<meta charset="utf-8"/>
								</head>
								<body>
									<h1>Hello world</h1>
									<a href="/abc?id=Woojin&num=5049">ABC페이지로 이동</a>
								</body>
							</html>
							
							""";
					}
					// 응답헤더
					pw.println("HTTP/1.1 200 OK"); // 정상응답
					pw.println("Content-Type : text/html");
					pw.println(); // 헤더/바디 구분자
					// 응답바디
					pw.println(html);
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Map<String, String> getParameterMap(String queryStrings) {
		String[] temp = queryStrings.split("&"); // ["id=bonggd", "num=123"]
		Map<String, String> param = new HashMap<>();
		for(String qs : temp) {
			String[] _temp = qs.split("=");
			param.put(_temp[0], _temp[1]);
		}
		return param;
	}

}
