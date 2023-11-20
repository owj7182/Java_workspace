package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해 주세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력해 주세요.");
		int num2 = sc.nextInt();
		if (num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
			int sum = calc.sum(num1, num2);
			int subtract = calc.subtract(num1, num2);
			int multiply = calc.multiply(num1, num2);
			int divide = calc.divide(num1, num2);
			
			System.out.println("합: " + sum);
			System.out.println("차: " + subtract);
			System.out.println("곱: " + multiply);
			System.out.println("나누기: " + divide);
		
		}
		else {
			System.out.println("1 ~ 9까지의 정수를 입력해주세요.");
		}
	}
		

}
