package sh.java.type;

/**
 * bit 0/1
 * byte - 8bit
 * kb - 1024byte
 * mb - 1024kb
 * gb - 1024mb
 * tb - 1024gb
 * petabyte
 * exabyte
 * zetta
 * yotta
 * 
 * 자바 자료형
 * 1. 기본형(원시형) - 변수에 값(리터럴) 대입
 * 		- 문자형 : 문자하나
 * 			- char 2byte 한글자 홑따옴표 감싸기 (유니코드기반)
 * 				- char ch = '가'; // 'A' 'a' '1' ' '
 * 		- 정수형 : 정수(부호)
 * 			- byte 1byte -128 ~ 127
 * 			- short 2byte -32768 ~ 32767
 * 			- int (default) 4byte -2,147,483,648 ~ 2,147,483,647
 * 			- long 8byte -922경 ~ 922경
 * 		- 실수형 : 실수(정밀도)
 * 			- float 4byte (7자리)
 * 			- double (default) 8byte (16자리)
 * 		- 논리형 : 참/거짓
 * 			- boolean 1byte - true/false	
 * 
 * 2. 참조형 - 변수에 주소값 대입
 * 		- String
 * 		- Object
 * 		- 사용자정의 클래스(타입)
 * 		
 * 
 * 변수명 규칙
 * 1. 대소문자 구분하고, 길이 제한 없음.
 * 2. 자바 예약어 사용불가
 * 3. 숫자로 시작할 수 없음.
 * 4. 특수문자는 _, $만 허용.
 * 
 * 5. 여러단어 조합인 경우 CamelCasing 적용
 * 6. 한글입력 가능하지만 사용자제.
 * 7. 직관적인 변수명 추천. 
 *
 */
public class PrimitiveTypeStudy {
	
	public static void main(String[] args) {
		PrimitiveTypeStudy study = new PrimitiveTypeStudy();
//		study.test1();		
//		study.test2();	
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * Data Overflow
	 * - 특정자료형의 값범위를 넘어선 경우, 최대/최소값으로 넘어가버리는 현상
	 */
	public void test5() {
		int i = Integer.MAX_VALUE; // 2_147_483_647
		i = i + 1; // 2_147_483_648
		System.out.println(i);
	}
	
	/**
	 * 상수 final
	 * - 값이 한번 대입되면 변경 불가한 변수
	 * - 반드시 초기화(선언과 동시에 값대입)해야 함.
	 * - 변수명을 모두 대문자로 작성
	 */
	public void test4() {
		final int K = 10;
//		K = 20;
		System.out.println(K + 20);
		
		// jdk 제공하는 상수들
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
	}
	
	/**
	 * 초기화 
	 * - 변수선언 + 값대입
	 */
	public void test3() {
		int n = 100;
		System.out.println(n);
		
		char ch = '뷁';
		System.out.println(ch);
	}
	/**
	 * 적정한 범위의 값을 변수에 대입하기
	 */
	public void test2() {
		byte b;
		b = 100;
//		b = 200; // 값의 범위를 넘어서 오류!
		System.out.println(b);
		
		long bigNum;
		bigNum = 10_000_000_000L; // l/L 접미사 long타입의 리터럴 명시!
		System.out.println(bigNum);
		
		float f;
		f = 0.1234567890f; // f/F 접미사로 float타입을 명시!
		System.out.println(f);
	}
	
	
	
	/**
	 * 변수선언 - 값대입 - 사용
	 */
	public void test1() {
		char ch;
		ch = '馬'; // ''는 사용불가
		System.out.println(ch);
		
		
		int n;
		n = 10; // 대입연산자 : 좌항의 공간에 우항의 값을 대입하라!
		n = 20;
		System.out.println(n);
		
		
		double d;
		d = 0.12345678901234567890;
		System.out.println(d);
		
		
		boolean bool;
		bool = !true; // ! (not)
		System.out.println(bool);
	}
}






