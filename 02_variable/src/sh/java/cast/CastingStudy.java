package sh.java.cast;

public class CastingStudy {
	
	public static void main(String[] args) {
		CastingStudy study = new CastingStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 형변환과정 설명하기
	 */
	public void test4() {
		int a = 10;
		int b = 10;
		System.out.println(a == b); // 값이 같으면 true, 다르면 false
		b = 20;
		System.out.println(a != b); // 값이 다르면 true, 같으면 false
		
		
		System.out.println(2.0 == (5 / 2)); 
		// double == (int / int) 
		// double == int 
		// double == double
		System.out.println('C' == 67); 
		// char == int
		// int == int  
		System.out.println('A' == ('B' - 1)); 
		// char == (char - int)
		// char == (int - int)
		// char == int
		// int == int
		System.out.println('a' != 97);
		// char != int
		// int != int
	}
	
	/**
	 * 형변환 특이케이스
	 * - byte, short, char 연산시 무조건 int변환이 먼저 일어난다.
	 * - int에서 char로 자동형변환
	 */
	public void test3() {
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; // byte + byte -> int + int -> int
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		char ch = 97; // char = int 명시적형변환 없이 처리
		ch = 65535; // 0 ~ 65535
		System.out.println(ch);
	}
	
	/**
	 * 명시적 형변환
	 * - 값손실이 발생할 수 있다.
	 */
	public void test2() {
		// 값손실 있는 경우
		double d = 3.3333;
		System.out.println((int) d);
		
		// 값손실 없이 크기가 큰 타입으로 변환
		int n = 10;
		int m = 4;
		System.out.println(n / m); // int / int -> int 2
		System.out.println(((double) n) / m); // 10 / 4 -> 10.0 / 4 -> 10.0 / 4.0 -> 2.5
		
		// data overflow 없이 2147483648을 출력하려면?
		int i = Integer.MAX_VALUE;
		System.out.println(i + (long) 1); // int + int -> int + long -> long 2147483648
		System.out.println(i + 1L);
	}
	
	/**
	 * 컴퓨터 작동원리
	 * 1. 리터럴은 같은 자료형의 변수에만 대입될 수 있다.
	 * 2. 같은 자료형 사이에서만 연산이 가능하다.
	 * 3. 그 연산 결과 또한 동일한 자료형이다.
	 * 
	 * 
	 * 형변환
	 * - 암묵적 형변환(자동) - 
	 * 		- byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
	 * 				  	 char(2)  -> 
	 * 
	 * - 명시적 형변환(수동)
	 * 
	 */
	public void test1() {
		int a = 10;
		double b = 12.34;
		System.out.println(a + b); 
		// int 10 + double 12.34
		// double 10.0 + double 12.34 -> 22.34
		
		double k = 3; // double = int 3 -> double = double 3.0
		System.out.println(k);
		
		char ch = 'c';
		int n = ch; // int = char 'a' -> int = int 97
		// ascii code 표에 따른 변환
		System.out.println(n);
		
	}
}






