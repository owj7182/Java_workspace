package sh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * <pre>
 * checked exception
 * - Exception후손클래스 중에서 RuntimeException과 관계 없는 모든 클래스
 * - 예외처리(try...catch)를 강제화(컴파일 오류 유발) 
 * - 우회적인 처리를 강제화할 목적으로 입출력관련 메소드등에서 확인가능
 * - 예외처리(try...catch) 또는 예외회피(throws) 둘중하나는 반드시 해야함.
 *  
 * 2023-10-10
 *
 */
public class ThrowsExceptionStudy {

	public static void main(String[] args) /* throws Exception  */{
		ThrowsExceptionStudy study = new ThrowsExceptionStudy();
		try {
			study.test1();			
		} catch(Exception e) {
			e.printStackTrace();
		}
//		study.test1();
		System.out.println("정상종료!!!");
	}

	// 예외회피 : 예외처리의 의무를 메소드호출부를 미룸
	private void test1() throws FileNotFoundException {
		// 예외처리
//		try {
//			FileReader fr = new FileReader("abc.txt");
//		} catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		FileReader fr = new FileReader("abc.txt");
	}

}
