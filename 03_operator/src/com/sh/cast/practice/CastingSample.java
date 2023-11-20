package com.sh.cast.practice;

import java.util.Scanner;

public class CastingSample {
	
	public void printUniCode(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력 : ");
		char a = sc.next().charAt(0);
		int b = a;
		System.out.println(a + " is unicode : " + b);
		System.out.println("===================================");
		
	}
	
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		float korea = sc.nextFloat();
		
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		System.out.print("영어 : ");
		float english = sc.nextFloat();
		
		System.out.println("-------------------");
		
		float sum = korea + math + english;
		System.out.println("총점 : " + (int)sum);
		float m = sum / 3;
		System.out.println("평균 : " + (int)m);
		
	}
	

}
