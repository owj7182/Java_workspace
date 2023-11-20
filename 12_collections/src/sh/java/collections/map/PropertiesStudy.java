package sh.java.collections.map;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * <pre>
 * Properties
 * - Collections Framework 이전부터 사용된 legacy클래스
 * - key, value의 타입을 String으로 제한한 맵형식의 자료구조
 * - 실제 설정파일 *.properties의 내용을 읽어 프로그램으로 가져오는데 사용함.
 * 
 * 2023-10-06
 * 
 */
public class PropertiesStudy {

	public static void main(String[] args) throws Exception {
		PropertiesStudy study = new PropertiesStudy();
		study.test1();
//		study.test2();
//		study.test3();
	}

	/**
	 * app.properties의 lang설정을 읽어와서 해당언어의 메뉴 보여주기
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void test3() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("app/app.properties"));
		
		String menu = "";
		String lang = prop.getProperty("lang");
		
		switch(lang) {
		case "ko" : 
			menu = """
				---------------
				메뉴
				---------------
				1. 된장찌게
				2. 김치찌게
				0. 종료
				---------------
				입력 :""";
			break;
		case "en" : 
			menu = """
			---------------
			MENU
			---------------
			1. Soy bean paste soup
			2. Kimchi soup
			0. End
			---------------
			Select :""";
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
		}
		
		
	}

	/**
	 * .properties -> Properties
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void test2() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		System.out.println(prop);
		
		// 파일의 내용을 불러와 prop객체에 설정
		prop.load(new FileReader("user.properties"));
		System.out.println(prop);
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
	}

	/**
	 * Properties -> .properties
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void test1() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		// 값저장
		prop.setProperty("username", "admin");
		prop.setProperty("password", "1234");
		
		// 값조회
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		
		// 파일저장
		prop.store(new PrintWriter("user.properties"), "user");
	}

}
