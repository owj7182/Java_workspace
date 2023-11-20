package com.sh.var;

import java.util.Scanner;

public class Example {
	
	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 :");
		int a = sc.nextInt();
		System.out.print("두번째 정수: ");
		int b = sc.nextInt();
		System.out.println("--------------------------");
		
		int sum = a + b;
		System.out.println("더하기 결과 :" + sum);
		int suv = a - b;
		System.out.println("빼기 결과 :" + suv);
		int mul = a * b;
		System.out.println("곱하기 결과 :" + mul);
		int div = a / b;
		System.out.println("나누기한 몫 :" + div);
		int rest = a % b;
		System.out.println("나누기한 나머지 :" + rest);
		
		System.out.println("==============================");
	}
	
	public void example2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		Float width = sc.nextFloat();
		System.out.print("세로 : ");
		Float height = sc.nextFloat();
		System.out.println("--------------------------");
		
		Float a = width * height;
		System.out.println("면적 : " + a);
		Float b = (width + height) * 2;
		System.out.println("둘레 : " + b);
		
		sc.close();
		
		
	}
	

}
