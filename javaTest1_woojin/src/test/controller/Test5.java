package test.controller;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.test5();
	}
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		int avg;
		
		if((num > 0 && num <= 9) && (num2 > 0 && num2 <= 9)) {
			avg = num * num2;
			if (avg > 0 && avg <= 9) {
				System.out.println("한 자리 수 입니다.");
			}
			else {
				System.out.println("두 자리 수 입니다.");
			}
			
		}
		else {
			System.out.println("1 ~ 9 사이의 정수를 입력해주세요.");
		}
		
	}

}
