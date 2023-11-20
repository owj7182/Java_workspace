package sh.java.io._char;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * 문자기반스트림 (텍스트파일 처리)
 * - FileReader 문자기반 입력 스트림
 * - FileWriter 문자기반 출력 스트림
 * 
 * @author sisna
 *
 */
public class FileRWStudy {

	public static void main(String[] args) {
		FileRWStudy study = new FileRWStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}

	/**
	 * 사용자로 부터 두 정수를 입력받아 합을 출력하세요.
	 * - Scanner사용금지
	 * - BufferedReader사용
	 * 
	 * - 정수1 입력 : 10
	 * - 정수2 입력 : 20
	 * - 결과 : 30
	 */
	private void test4() {
		try {
			BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
			int no1 = inputNumber(num);
			int no2 = inputNumber(num);
			System.out.println("결과 : " +(no1 + no2));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int inputNumber(BufferedReader num) throws IOException {
		while(true) {
			try {
				System.out.println("정수 입력 : ");
				return Integer.parseInt(num.readLine());
			} catch(NumberFormatException e) {
				System.err.println("정수만 입력하세요...");
			}
		}
	}
	/**
	 * jdk1.5에 추가된 Scanner이전의 사용자입력값
	 * - System.in - BufferedReader
	 */
	private void test3() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("아무말 : ");
			String str = br.readLine();
			System.out.printf("\"%s\"라고 하셨습니다.", str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 보조스트림
	 */
	private void test2() {
		File src = new File("abc/abc.txt"); // 읽을 파일은 반드시 존재해야함.
		File dest = new File("abc/abc_copy4.txt"); 
		// 쓸 파일은 없으면, 스트림클래스에서 생성함. 디렉토리는 반드시 존재해야함.
		
		try(
			BufferedReader br = new BufferedReader(new FileReader(src));
			BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
		) {
			String data = null;
			// readLine() : 개행문자까지 읽어서 개행문자를 버리고 반환
			while((data = br.readLine()) != null) {
				System.out.println(data);
				bw.write(data + "\n"); // 개행을 추가해야 원본과 동일
			}
			System.out.println("복사완료!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private void test1() {
		// 실제/가상의 파일을 가리키는 자바객체
		// file객체를 통해서 실제 파일을 제어
		File src = new File("abc/abc.txt");
		File dest = new File("abc/abc_copy3.txt");
		try(
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);	
		) {
			int data = 0;
			while((data = fr.read()) != -1) {
//				System.out.println((char)data);
				fw.write(data);
			}
			System.out.println("복사완료!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
