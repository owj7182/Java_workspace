package sh.java.loop;

import java.util.Scanner;

/**
 * <pre>
 * for
 * 
 * - 초기식 : 반복문 최초 1회 실행. 증감변수를 선언.
 * - 조건식 : true면 블럭실행, false면 반복중지
 * - 증감식 : 증감변수의 증감처리
 * 
 * 처리순서
 * 1. 초기식
 * 2. 조건식
 * 3. 블럭실행
 * 4. 증감식 ---> 조건식
 * 
 * <blockquote><pre>
 * for(초기식; 조건식; 증감식) {
 * 		// 반복처리구문
 * }
 * </pre></blockquote>
 * 
 *
 */
public class ForStudy {

	public static void main(String[] args) {
		ForStudy study = new ForStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
		study.test7();
	}
	
	/**
	 * 분식집 키오스크
	 * - 메뉴를 반복해서 출력하고, 사용자가 선택한 메뉴의 결제금액을 합산한다.
	 * - 메뉴 선택후 추가주문여부를 물어보고 결정한다.
	 * - 메뉴 선택이 모두 끝나면, 총결제금액 출력!
	 * 
	 * 
	 * 1. 메뉴반복출력
	 * 2. 선택한 메뉴의 금액을 합계 변수에 담기
	 * 3. 추가주문여부 
	 * 4. 총 결제금액 출력
	 */
	public void test7() {
		Scanner sc = new Scanner(System.in);
		String menu = "===== 352분식 =====\n"
					+ "1. 떡뽂이 - 4500\n"
					+ "2. 순대 - 3500\n"
					+ "3. 튀김 - 3000\n"
					+ "==================\n"
					+ "입력 : ";
		int total = 0;
		for(;;) {
			System.out.print(menu);
			String choice = sc.next();
			switch(choice) {
			case "1" : 
				System.out.println("떡볶이를 선택하셨습니다.");
				total += 4500;
				break;
			case "2" : 
				System.out.println("순대를 선택하셨습니다."); 
				total += 3500;
				break;
			case "3" : 
				System.out.println("튀김를 선택하셨습니다."); 
				total += 3000;
				break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.print("더 주문하시겠습니까? (y/n) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'n')
				break;
		}
		
		System.out.printf("최종 결제금액은 %d원입니다. 감사합니다.", total);
	}
	
	/**
	 * 반복횟수 runtime에 지정하기2
	 * - 사용자가 매턴마다 계속여부 결정
	 */
	public void test6() {
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복
		for(;;) {			
			System.out.println("Hello World");
			System.out.print("더 할까요? (y/n) : ");
			char yn = sc.next().charAt(0);
			if(yn == 'n')
				break;
		}
		
		System.out.println("---- 감사합니다. ----");
	}
	
	/**
	 * 반복횟수 runtime에 지정하기
	 * - 사용자가 몇번 반복할지 정하기
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("출력 횟수 : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(name);
		}
	}
	
	/**
	 * 1 ~ 10까지 합계 구하기
	 * 
	 * 누적합을 구할변수는 반드시 for문 전(바깥)에 선언해야 한다. 
	 */
	public void test4() {
		int sum = 0; // 누적합이 더해질 변수(공간)
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i + ", " + sum);
		}
		System.out.println(sum);
	}
	
	/**
	 * 구구단 8단
	 * - 증감변수 선정!!!
	 * 
	 * 8 * 1 = 8
	 * 8 * 2 = 16
	 * 8 * 3 = 24
	 * 8 * 4 = 32
	 * 8 * 5 = 40
	 * 8 * 6 = 48
	 * 8 * 7 = 56
	 * 8 * 8 = 64
	 * 8 * 9 = 72
	 * 
	 */
	public void test3() {
		int dan = 8;
		for(int n = 1; n <= 9; n++) {
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
	}
	
	/**
	 * 숫자출력
	 */
	public void test2() {
		// 1 2 3 4 5
//		for(int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + " ");
//		}
		
		// 1 3 5 7 9
//		for(int i = 1; i < 10; i = i + 2) {
//			System.out.print(i + " ");
//		}
		
		// 2 4 6 8 10 12 14 16 18 20
//		for(int i = 2; i <= 20; i = i + 2) {
//			System.out.print(i + " ");
//		}
//		for(int i = 1; i <= 10; i++) {
//			System.out.print(i * 2 + " ");
//		}
		
		// 10 9 8 7 6 5 4 3 2 1
//		for(int i = 10; i > 0; i--) {
//			System.out.print(i + " ");
//		}
//		for(int i = 0; i < 10; i++) {
//			System.out.print((10 - i) + " ");
//		}
		
		// 20 18 16 14 12 10 8 6 4 2
//		for(int i = 20; i > 0; i -= 2) {
//			System.out.print((i) + " ");
//		}
		for(int i = 10; i > 0; i--) {
			System.out.print((i * 2) + " ");
		}
	}
	
	/**
	 * - n번 반복?
	 * - 증감변수 추이?
	 */
	public void test1() {
		for(int i = 0; i < 3; i++) {			
			System.out.println("Hello world" + (i));
		}
	}
}
