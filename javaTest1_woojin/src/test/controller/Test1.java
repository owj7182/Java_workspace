package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test1();

	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		if (num > 0 && num <= 100) {
			if (num % 2 == 0)
				System.out.println("2의 배수입니다.");
			else {
				System.out.println("2의 배수가 아닙니다.");
			}
			
		}
		else {
		System.out.println("1 ~ 100의 값을 입력하세요");
		}
	}

}
