package sh.java.network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * <pre>
 * java.net.URL
 * - 실제 url을 parsing해서 각 항목별로 getter를 제공
 * 
 * 
 * @author sisna
 *
 */

public class URLStudy {
	// 기본 port : http(80), https(443), ftp(21)  // ? 뒤에 쿼리 스트링 작성 가능 #뒤에 북마크 작성 가능
	String path = "https://docs.oracle.com:443/en/java/javase/17/docs/api/java.base/java/lang/String.html?mode=en&num=123#bookmark";
	
	public static void main(String[] args) {
		URLStudy study = new URLStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * https://upload.wikimedia.org/wikipedia/commons/a/a3/June_odd-eyed-cat.jpg
	 * 다운로드해서 cat.jpg로 저장하기
	 */
	private void test3() {
        // 사진이라. byte기반으로 객체생성.
        String path = "https://upload.wikimedia.org/wikipedia/commons/a/a3/June_odd-eyed-cat.jpg";
        URL url;
        try {
            url = new URL(path);
            URLConnection conn = url.openConnection(); 
            
            try(
            BufferedInputStream bi = new BufferedInputStream(conn.getInputStream());
            BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream( "cat.jpg"));        
                    ){
            int data = 0;    
            while((data = bi.read()) != -1) {
                bo.write(data);
            }
            System.out.println("복사완료!!");
            } 
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	

	/**
	 * 인터넷상의 데이터 가져오기
	 */
	private void test2() {
		try {
			URL url = new URL(path);
			URLConnection conn = url.openConnection();
			try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new FileWriter("STring.html"));	
			){
				String data = null;
				while((data = br.readLine()) != null) {
					System.out.println(data);
					bw.write(data + "\n");
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void test1() {
		try {
			URL url = new URL(path);
			// origin : protocol + host + port
			System.out.println(url.getProtocol()); // https
			System.out.println(url.getHost()); // docs.oracle.com
			System.out.println(url.getPort()); // 443
			System.out.println(url.getPath()); // /en/java/javase/17/docs/api/java.base/java/lang/String.html
			System.out.println(url.getQuery()); // mode=en&num=123
			System.out.println(url.getRef()); // bookmark
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
