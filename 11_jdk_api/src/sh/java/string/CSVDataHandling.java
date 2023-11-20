package sh.java.string;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * <pre>
 * CSV란
 * - Comma Separated Value 콤마로 구분된 값
 * - 구분자로 ,뿐 아니라 공백 등 특수문자로 사용가능
 * - 단, 구분자가 data에 포함되어서는 안된다.
 * 
 * 1. String#split
 * 2. StringTokenizer
 * 	- hasMoreTokens():boolean
 *  - nextToken():String
 *  
 *  
 * 2023-10-04
 * 
 */
public class CSVDataHandling {

	public static void main(String[] args) {
		CSVDataHandling app = new CSVDataHandling();
//		app.test1();
//		app.test2();
//		app.test3();
//		app.test4();
//		app.test5();
	}

	
	private void test5() {
		String data = """
				홍길동|남|010-1234-5678
				신사임당|여|010-3333-5555
				허각|남|010-7777-8888""";
		// \n  |
		StringTokenizer tokenizer = new StringTokenizer(data, "\n");
		Person[] persons = new Person[tokenizer.countTokens()];
		int i = 0;
		while(tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			StringTokenizer tokenizer2 = new StringTokenizer(token, "|");
			String name = tokenizer2.nextToken();
			char gender = tokenizer2.nextToken().charAt(0);
			String phone = tokenizer2.nextToken();
			persons[i++] = new Person(name, gender, phone);
		}
		
		// 출력
		for(Person person : persons) {
			System.out.println(person);
		}
	}

	/**
	 * StringTokenizer
	 */
	private void test4() {
		String data = "java,oracle,html,css,js";
		// csv데이터를 구분자로 쪼개서 순서대로 접근가능하도록 목록화한 객체
		StringTokenizer tokenizer = new StringTokenizer(data, ",");
		System.out.println(tokenizer.countTokens()); // 5

		// 남은 토큰이 있으면 true, 없으면 false
		while(tokenizer.hasMoreTokens()) {
			String value = tokenizer.nextToken();
			System.out.println(value);
		}
		System.out.println(tokenizer.countTokens()); // 0
	}

	/**
	 * csv -> Person객체배열
	 */
	private void test3() {
		String data = """
			홍길동|남|010-1234-5678
			신사임당|여|010-3333-5555
			허각|남|010-7777-8888""";
		
		// String[]로 변환
		// 정규표현식 |를 escaping 처리후 전달
		String[] persons = data.split("\n");
		Person[] _persons = new Person[persons.length];
		
		for(int i = 0; i < persons.length; i++) {
//			System.out.println(persons[i]);
			String[] person = persons[i].split("\\|");
			String name = person[0];
			char gender = person[1].charAt(0);
			String phone = person[2];
			_persons[i] = new Person(name, gender, phone);
		}
		
		// Person[] 출력
		for(Person person : _persons){
			System.out.println(person);
		}
		
	}

	/**
	 * 
	 */
	private void test2() {
		// multiline string(text block) jdk15부터 사용가능 (개행문자, 들여쓰기 모두 포함)
//		String data = "사과/3000\n"
//					+ "배/4000";
		String data = """
			사과/3000
				배/4000
			고구마/2000
			토마토/1500
			딸기/5000""";
//		System.out.println(data) ;
		
		String[] values = data.split("\n");
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			String[] info = values[i].split("/");
			String name = info[0];
			int price = Integer.parseInt(info[1]); // String -> int
			System.out.println("이름 : " + name + ", 가격 : " + price + "원");
		}
		
	}

	/**
	 * String#split(delimiter:String):String[]
	 */
	private void test1() {
		String data = "사과 배 고구마 토마토 딸기";
		String[] values = data.split(" ");
		System.out.println(Arrays.toString(values));
		
		for(int i = 0; i < values.length; i++) {
			System.out.println("\"" + values[i] + "\"");
		}
	}

}
