package com.calc;

public class Calculator {

	/**
	 * 실행매개인자로 두 정수를 제공해야 한다.
	 * 1 ~ 9 사이의 정수2개 : 4 2
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 프로그램 실행인자 유효성 검사
		if(args.length == 0) {
			System.out.println("[오류] 두 정수를 프로그램에 제공해야 합니다.");
			return; // 조기리턴
		}
		
		// {"4", "2"}
		// String -> int
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		if(!(isValid(first) && isValid(second))) {
			System.out.println("[오류] 1 ~ 9 사이의 두 정수를 입력하세요.");
			return;
		}
		
		System.out.println("합: " + (first + second));
		System.out.println("차: " + (first - second));
		System.out.println("곱: " + (first * second));
		System.out.println("나머지 : " + (first / second));
		
	}

	public static boolean isValid(int n) {
		return n >= 1 && n <= 9;
	}

}