package com.sh.test;

public class Test2 {
	
	public static void main(String[] args) {
		// 변수선언부
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String phone = "01012341234";
		String email = "honggd@naver.com";
		String address = "서울시 강남구";
		
		// 출력부
		System.out.println("=======================================================================");
		System.out.printf("%-10s%-10s%-10s%-20s%-20s%-20s\n", "이름", "나이", "성별", "전화번호", "이메일", "주소");
		System.out.println("=======================================================================");
		System.out.printf("%-10s%-10s%-10s%-20s%-20s%-20s\n", name, age, gender, phone, email, address);
		
		// 값 다시 대입
		name = "신사임당";
		age = 30;
		phone = "01033334444";
		email = "sinsa@naver.com";
		address = "경기도 광주시";
		System.out.printf("%-10s%-10s%-10s%-20s%-20s%-20s\n", name, age, gender, phone, email, address);
		
		
		
	}
}
