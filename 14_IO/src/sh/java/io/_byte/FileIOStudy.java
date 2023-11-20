package sh.java.io._byte;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * <pre>
 * - FileInputStream 파일을 대상으로 하는 기본 입력스트림(필수)
 * - FileOutputStream 파일을 대상으로 하는 기본 출력스트림(필수)
 * @author sisna
 *
 */
public class FileIOStudy {

	public static void main(String[] args) {
		FileIOStudy study = new FileIOStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 보조스트림
	 * - 기본스트림 성능향상 또는 부가기능을 위해 n개 추가해 쓸 수 있다.
	 * - 반드시 기본스트림을 필요로 하고, 단독사용 불가하다.
	 * - 기본 스트림 객체를 감싼 구조로, 보조 스트림 객체만 제어하면 된다.
	 * - 보조 스트림 객체만 반환하면, 기본 스트림까지 반환된다.
	 */
	private void test4() {
		String srcName = "C:\\Users\\sisna\\OneDrive\\aaa\\a.jpg";
		String destName = "abc/a_copy5.jpg";
		try (
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcName));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destName));
		){
			byte[] buf = new byte[8192]; // 8kb
			int len = 0; // read(byte[])의 반환값은 읽어낸 byte수
			
			while((len = bis.read(buf)) != -1) {
				System.out.println(len);
				bos.write(buf, 0 ,len);
			}
			System.out.println("복사완료!!!");
	
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}
	
	/**
	 * 입출력 스트림 처리 개선
	 * - read():int
	 * - read(byte[]):int
	 * - try...with..resource (jdk1.7) - 스트림 개체의
	 */
	private void test3() {
		
		try (
			FileInputStream pis = new FileInputStream("C:\\Users\\sisna\\OneDrive\\aaa\\a.jpg");
			FileOutputStream pos = new FileOutputStream("abc/a_copy5.jpg");
		){
			byte[] buf = new byte[8192]; // 8kb
			int len = 0; // read(byte[])의 반환값은 읽어낸 byte수
			
			while((len = pis.read(buf)) != -1) {
				System.out.println(len);
				pos.write(buf, 0 ,len);
			}
			System.out.println("복사완료!!!");
	
		} catch (IOException e) {
			e.printStackTrace();
		} 		
	}
	
	/**
	 * 내 컴퓨터의 임의의 사진을 프로젝트 하위에 복사/붙여넣기 해주세요.
	 */
	private void test2() {
		FileInputStream pis = null;
		FileOutputStream pos = null;
		try {
		pis = new FileInputStream("C:\\Users\\sisna\\OneDrive\\aaa\\a.jpg");
		pos = new FileOutputStream("abc/a_copy4.jpg");
		
		int data = 0;
		while((data = pis.read()) != -1) {
			pos.write(data);
		}
		System.out.println("복사완료!!!");
	
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			pis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			pos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	
	/**
	 * abc.txt 파일을 읽어오기
	 * 
	 * - 표준 입출력을 제외한 모든 스트림클래스는 사용후 close를 통해 자원반납해야 한다.
	 * 
	 * 경로
	 * - 상대적 경로 : 현재 디렉토리(프로젝트 루트 디렉토리)기준
	 * - 절대적 경로 : 루트 디렉토리 기준 ex)윈도우(C:\로 시작) MAC(/로 시작)
	 */
	private void test1() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
//			fis = new FileInputStream("abc/abc.txt");
//			fos = new FileOutputStream("abc/abc_copy.txt", true); // true는 이어쓰기 여부
			fis = new FileInputStream("C:\\Users\\sisna\\OneDrive\\aaa\\abc.txt");
			fos = new FileOutputStream("abc/abc_copy2.txt", true); // true는 이어쓰기 여부
			
			int data = 0;
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
				// 영문자/숫자등은 1btye씩 처리되므로 온전히 출력되지만,
				// 한글등은 utf-8방식에서 3byte로 처리되므로, 1byte씩 읽어버리면 깨지게된다.
				fos.write(data);
			}
		
		} catch (IOException e) {
			// FileNotFoundException도 핸들링
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
