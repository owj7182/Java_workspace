package sh.java.io._byte;

import java.io.IOException;

/**
 * <pre>
 * - System.in 표준입력(키보드)
 * - System.out 표준출력(콘솔)
 * - System.err 표준에러
 * 
 *
 */

public class SystemIOStudy {

	public static void main(String[] args) {
		SystemIOStudy study = new SystemIOStudy();
		study.test1();
	}
	
	/**
	 * System.in
	 */
	private void test1() {
		int input = 0; // InputStream#read() : int 읽어온값이 없으면 -1 반환
		System.out.println("키보드입력을 시작하세요...");
		// ((대입) 조건)
		try {
			while((input = System.in.read()) != -1) {
				System.out.println(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
