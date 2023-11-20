package sh.java.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Wrapper Class
 * - 기본형 값을 감싼 클래스
 * - 기본형8가지에 대응하는 클래스가 존재
 * - boolean -> java.lang.Boolean
 * - char -> java.lang.Character
 * - byte -> java.lang.Byte
 * - short -> java.lang.Short
 * - int -> java.lang.Integer
 * - long -> java.lang.Long
 * - float -> java.lang.Float
 * - double -> java.lang.Double
 *   
 * 존재이유
 * 1. 기본형값을 참조형으로 사용해야 하는 경우 - Generics
 * 2. 기본형과 관련한 상수 또는 메소드(형변환)를 제공
 * 
 * Boxing / Unboxing
 * - 모두 자동으로 처리됨.
 * - Boxing : 값(기본형) -> 참조형 
 * - Unboxing : 참조형 -> 값
 * 
 * 2023-10-04
 *
 */
public class WrapperStudy {

	public static void main(String[] args) {
		WrapperStudy study = new WrapperStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}

	/**
	 * Wrapper제공 부가기능
	 * - 상수
	 * - 형변환 메소드
	 */
	private void test3() {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// 문자열 -> 각타입
		int n = Integer.parseInt("123");
		double d = Double.parseDouble("123.456");
		boolean bool = Boolean.parseBoolean("true");
		char ch = "y".charAt(0);
	}

	/**
	 * 기본형이 아닌 참조형만 허용되는 경우
	 * - Generics
	 */
	private void test2() {
		// int값 여러개를 관리하는 객체
		ArrayList<Integer> nums = new ArrayList<Integer>();
//		ArrayList<int> nums = new ArrayList<int>();
	}

	/**
	 * boxing | unboxing
	 */
	private void test1() {
		int n = 100;
		Integer num = n; // boxing 기본형 -> 참조형
//		Integer num = Integer.valueOf(n);
		
		int n2 = num; // unboxing 참조형 -> 기본형
//		int n2 = num.intValue();
		
		System.out.println(n + num); // int + Integer -> int + Integer#intValue()
	}

}
