package com.sh.function.run;

import java.util.Scanner;

public class Example {
	
	public void opSample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korea = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int english = sc.nextInt();
		
		int sum = korea + math + english;
		System.out.println("총점 : " + sum);
		
		double avg = sum / 3.0;
		System.out.println("평균 : " + (float)avg);
		
		boolean pass1 = korea >= 40 && math >= 40 && english>= 40;
		boolean pass2 = avg >= 60;
		
		System.out.println(pass1 && pass2 ? "합격입니다" : "불합격입니다");
		
		System.out.println("=============================");
	}
	
	public void opSample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.print("학년을 입력해주세요 : ");
		int grade = sc.nextInt();
		
		System.out.print("반을 입력해주세요 : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호를 입력해주세요 : ");
		int num = sc.nextInt();
		
		System.out.print("성별을 입력해주세요[M/F] : ");
		char gender = sc.next().charAt(0);
		String strGender = gender == 'M' ? "남학생" : "여학생";
		
		System.out.print("성적을 입력해주세요 : ");
		double stdtMark = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s은/는 성적이 %.2f이다.\n", grade, classroom, num, strGender,name, stdtMark);
		
		System.out.println("=============================");
		
	}
	
	public void opSample3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수를 입력하세요 : ");
		int num = sc.nextInt();

		String result = num > 0 ? "양수다" : (num == 0 ? "0이다" : "음수다.");
		System.out.println(result);
		
	}
	public void opSample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 정수를 입력하세요 : ");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}

}
