package sh.java.loop;

import java.util.Scanner;

/**
 * <pre>
 * 반복문 흐름 제어
 * 
 * - break 즉시 반복문 탈출!
 * - continue continue이하 코드를 실행하지 않고, 반복 블럭 새로 시작!
 * 		- for 증감식 이동
 * 		- while 조건식 이동
 * 
 * 
 * 2023-09-15
 *
 */
public class BreakContinueStudy {

	public static void main(String[] args) {
		BreakContinueStudy study = new BreakContinueStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 1부터 1씩 증가하며 제곱수를 출력
	 * - 1000까지만 출력하고 중지!
	 * 
	 * 1 
	 * 4
	 * 9
	 * ...
	 * 
	 */
	public void test5() { 		
		for(int n = 1;; n++) {
			long square = n * n;
			if(square > 1000)
				break;
			System.out.println(n + " -> " + square);
		}
	}
	
	/**
	 * <pre>
	 * 1. 구구단 5단 출력
	 * 2. 곱하는 수가 짝수인 경우는 건너뛸것.
	 * 
	 * <blockquote>
	 *  5 * 1 = 5
	 *  5 * 3 = 15
	 *  5 * 5 = 25
	 *  5 * 7 = 35
	 *  5 * 9 = 45
	 */
	public void test4() {
		int dan = 5;
		for(int i = 1; i <= 9; i++) {
			if(i % 2 == 0)
				continue;
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
	}
	
	/**
	 * continue
	 */
	public void test3() { 
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0)
				continue;
			System.out.println(i);			
		}
	}
	
	/**
	 * 1 ~ 사용자입력값까지 합계 출력
	 * 
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; ; i++) {
			sum += i;
			System.out.println(i + " -> " + sum);
			if(i == n)
				break;
		}
		System.out.println("최종합 : " + sum);
	}
	
	/**
	 * break
	 */
	public void test1() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 7)
				break;
		}
	}
}








