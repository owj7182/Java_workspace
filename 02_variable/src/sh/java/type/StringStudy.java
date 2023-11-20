package sh.java.type;

public class StringStudy {
	
	public static void main(String[] args) {
		StringStudy study = new StringStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * 문자열 더하기 연산
	 * "abc" + "def" -> "abcdef"
	 */
	public void test2() {
		String a = "abc";
		String b = "def";
		String c = a + b;
		System.out.println(c);
		
		// 다른 타입과의 더하기 연산 결과는 무조건 문자열
		System.out.println(a + 123);
		System.out.println((123 + 4) + a);
		
		System.out.println(a + ('c' + 1)); // abc100
		System.out.println(a + 'c' + 1); // abcc1
		System.out.println('a' + 'b'); // 195
	}
	
	/**
	 * String은 참조형 타입.
	 * - 사용빈도를 고려해 기본형(리터럴대입)처럼 사용하도록 지원
	 * - 쌍따옴표로 감싸서 표현
	 */
	public void test1() {
		String str = new String("Hello");
		String str2 = "Hello";
		
		System.out.println(str);
		System.out.println(str2);
		
		// 값중에 쌍따옴표가 있는 경우 escaping처리
		// \문자 형식으로 문자그대로 사용가능
		String word = "안녕, \"철수\"";
		System.out.println(word);
		
		// 개행, 탭문자도 포함가능
		System.out.println("\t윗집\n아랫집");
		System.out.print("abc\n");
		
	}
	
}
