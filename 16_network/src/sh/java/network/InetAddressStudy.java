package sh.java.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <pre>
 * InetAddress
 * - Ip관련된 정보를 관리하는 클래스
 * - 생성자가 없다. static메소드만 제공
 * 
 * @author sisna
 *
 */

public class InetAddressStudy {

	public static void main(String[] args) {
		InetAddressStudy study = new InetAddressStudy();
		study.test1();
	}
	
	/**
	 * domain(hostname) -> ip
	 * - DNS(Domain Name Server) 질의 결과를 알려줌
	 */
	private void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver); // naver.com/223.130.200.104
			System.out.println(naver.getHostAddress()); // 223.130.200.104
			
			// 복수개의 ip조회
			InetAddress[] navers = InetAddress.getAllByName("naver.com");
			for(InetAddress n : navers)
				System.out.println(n.getHostAddress());
			
			// 내 컴퓨터의 ip조회 (자신이 속한 네트워크 ip)
			// localhost 내 컴퓨터를 가리키는 도메인(127.0.0.1)
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostAddress()); // 192.168.20.126
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
