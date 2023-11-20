package sh.java.loop;

import java.util.Scanner;

/**
 * <pre>
 * while 반복문
 * - 100% for반복문 호환
 * 
 * <blockquote>
 * 초기식
 * while(조건식){
 * 	// 반복실행구문
 * 	증감식
 * }
 * 
 * 2023-09-15
 *
 */
public class WhileStudy {

	public static void main(String[] args) {
		WhileStudy study = new WhileStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * do ~ while
	 * - 기본적인 반복문은 조건문 - 반복실행순이지만, 우선실행 ~ 조건문순으로 처리
	 * - 최소 1번은 실행되어야 할 반복문에 사용하면 좋다.
	 * 
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		char yn = ' '; // 계속여부
		do {
			System.out.println("----- 게임시작 -----");
			System.out.println("😀😁😂😋😀😁😂");
			System.out.println("----- 게임끝 ------");
			
			System.out.print("계속 하시겠습니까? (y/n) : ");
			yn = sc.next().charAt(0);
		} while(yn == 'y');
		System.out.println("이용해 주셔서 감사합니다.");
	}
	
	/**
	 * 합계 구하기
	 * 1 ~ 사용자입력값까지의 합계 출력
	 * (무한반복 버젼)
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		while(true) {
			sum += i;
			if(i == n)
				break;
			i++;
		}
		System.out.println(sum);
	}
	
	/**
	 * 합계 구하기
	 * 1 ~ 사용자입력값까지의 합계 출력
	 * 
	 * 1. 사용자입력값 받기
	 * 2. 1 ~ n 반복
	 * 3. 누적합 구하기(반복문)
	 * 4. 최종출력
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		while(i <= n) {
			sum += i++;
		}
		System.out.println(sum);
	}
	
	/**
	 * 구구단 출력
	 */
	public void test2() {
		int dan = 7;
		int i = 1;
		while(i <= 9) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			i++;
		}
		
	}
	
	/**
	 * while
	 */
	public void test1() {
//		int i = 0; // 초기식
//		while(i < 5) { // 조건식
//			System.out.println(i);
//			i++; // 증감식
//		}
		
//		for(int j = 0; j < 5; j++) {
//			System.out.println(j);
//		}
		
		// 1 2 3 4 5 6 7 8 9 10
//		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		// 10 9 8 7 6 5 4 3 2 1
//		int i = 10;
//		while(i > 0) {
//			System.out.println(i);
//			i--;
//		}
		
		// 2 4 6 8 10 12 14 16 18 20
//		int i = 1;
//		while(i <= 20) {
//			if(i % 2 == 0)
//				System.out.println(i);
//			i++;
//		}
//		
//		int j = 2;
//		while(j <= 20) {
//			System.out.println(j);
//			j += 2;
//		}
		
		
		// 19 17 15 13 11 9 7 5 3 1
		int i = 19;
		while(i > 0) {
			System.out.println(i);
			i -= 2;
		}
		
		int j = 20;
		while(j > 0) {
			if(j % 2 != 0)
				System.out.println(j);
			j--;
		}
		
		
	}
}
