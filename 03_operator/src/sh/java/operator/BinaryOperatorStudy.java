package sh.java.operator;

import java.util.Scanner;

public class BinaryOperatorStudy {

	public static void main(String[] args) {
		BinaryOperatorStudy study = new BinaryOperatorStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 복합대입연산자
	 * +=
	 * -=
	 * *=
	 * /=
	 * %=
	 */
	public void test5() {
		int a = 10;
//		a = a + 5;
//		a += 5;
		
//		a = a - 3;
//		a -= 3;
		
//		a = a * 3;
//		a *= 3;
		
//		a = a / 4;
//		a /= 4;
		
//		a = a % 3;
		a %= 3;
		System.out.println(a);
	}
	
	/**
	 * 논리비교연산자 예제
	 */
	public void test4() {
		// 사용자로부터 양수 2개 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		// 올바른 값일 경우 true, 아니면 false
		System.out.println(num1 > 0 && num2 > 0);
		
		// 둘중 하나의 값이 0인경우 true, 아니면 false
		System.out.println(num1 == 0 || num2 == 0);
	}
	
	/**
	 * 논리 비교연산자
	 * - && and
	 * - || or
	 * 
	 * (bool1) && (bool2)
	 * 		- bool1이 참이면서, bool2도 참인 경우 -> true
	 * 		- bool1이 참이면서, bool2이 거짓인 경우 -> false
	 * 		- bool1이 거짓이면서, bool2이 참인 경우 -> false
	 * 		- bool1이 거짓이면서, bool2이 거짓인 경우 -> false
	 * (bool1) || (bool2)
	 * 		- bool1이 참이면서, bool2도 참인 경우 -> true
	 * 		- bool1이 참이면서, bool2이 거짓인 경우 -> true
	 * 		- bool1이 거짓이면서, bool2이 참인 경우 -> true
	 * 		- bool1이 거짓이면서, bool2이 거짓인 경우 -> false
	 * 		
	 */
	public void test3() {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// 좌항의 결과와 상관없이 우항을 검사하는 and/or
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
	}
	
	/**
	 * 비교연산자
	 * > gt greater than
	 * < lt less than
	 * >= ge greater than or equal to
	 * <= le less than or equal to
	 * 
	 * == eq equal to
	 * != ne not equal to
	 * 
	 */
	public void test2() {
		int x = 3, y = 5, z = 4;
		System.out.println(y > x);
		System.out.println(z < y);
		System.out.println(x + z >= y);
		System.out.println(z <= y);
		System.out.println(x + 2 == y);
		System.out.println(x != y);
		
		System.out.println(x > y);
		System.out.println(y < z);
		System.out.println(x >= y + z);
		System.out.println(x - z >= y);
		System.out.println(x / y == z);
		System.out.println(x + y != z + z);
		
	}
	
	/**
	 * 오칙연산
	 * *
	 * /
	 * %
	 * +
	 * - 
	 * 
	 * 
	 */
	public void test1() {
		int a = 30;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		// 짝수/홀수
		System.out.println(10 % 2 == 0); // true 짝수
		System.out.println(11 % 2 == 0); // false 홀수
	}
}
