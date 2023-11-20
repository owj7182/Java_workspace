package com.sh.exception.number;

import java.util.*;

public class Run {
	
	Scanner sc = new Scanner(System.in);
	private NumberProcess num = new NumberProcess();
	
	public static void main(String[] args) {
		Run test = new Run();
		test.test1();
	}
	public void test1() {
		try {
			System.out.print("첫번째 정수를 입력해주세요 : ");
			int a = sc.nextInt();
			System.out.print("두번째 정수를 입력해주세요 : ");
			int b = sc.nextInt();
		
			boolean result = num.checkDouble(a, b);
		
			if(result) {
				System.out.println(a + " 는 " + b + " 의 배수입니다." );
			}
			else {
				System.out.println(a + " 는 " + b + " 의 배수가 아닙니다.");
			}
		} catch(NumberRangeException e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
