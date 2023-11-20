package com.sh.exception.charcheck;

import java.util.*;

public class Run {

	Scanner sc = new Scanner(System.in);
	private CharacterProcess num = new CharacterProcess(); 
	
	public static void main(String[] args) {
		Run test = new Run();
		test.test1();
	}
	public void test1() {
		System.out.print("문자열을 입력하시오 : ");
		String s = sc.nextLine();
		try {
			int count = num.countAlpa(s);
			System.out.println("영문자 개수 : " + count + "개");
			
		} catch (CharCheckException e) {
			System.err.println("에러 메세지" + e.getMessage());
		}
		
		
	}

}
