package com.sh.test;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 변수선언부
		System.out.print("이름 > ");
		String name = sc.next();
		System.out.print("나이 > ");
		int age = sc.nextInt();
		System.out.print("성별 (예: 남/여) > ");
		char gender = sc.next().charAt(0);
		System.out.print("전화번호 > ");
		String phone = sc.next();
		System.out.print("이메일 > ");
		String email = sc.next();
		System.out.print("주소 > ");
		String address = sc.next();
		
		// 출력부
		System.out.println("=======================================================================");
		System.out.printf("%-10s%-10s%-10s%-20s%-20s%-20s\n", "이름", "나이", "성별", "전화번호", "이메일", "주소");
		System.out.println("=======================================================================");
		System.out.printf("%-10s%-10s%-10s%-20s%-20s%-20s\n", name, age, gender, phone, email, address);
		
		
		
	}
}
