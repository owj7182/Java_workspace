package sh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopStudy {

	public static void main(String[] args) {
		NestedLoopStudy study = new NestedLoopStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();
	}
	
	/**
	 * <pre>
	 * □□□
	 * □
	 * □□□
	 * □
	 * □□□
	 * 
	 * 1. 5 * 3
	 * 2. 행별로 다르게 출력
	 * 
	 */
	public void test8() {
//		outer:
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print("□");
//				if(i % 2 != 0) {
//					System.out.println();
//					continue outer;
//				}
//			}
//			System.out.println();
//		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < (i % 2 != 0 ? 1 : 3); j++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
	
	/**
	 * <pre>
	 * 0 ★
	 * 1 ★★
	 * 2 ★★★
	 * 3 ★★★★
	 * 4 ★★★★★
	 * 
	 * 1. 5 * 5
	 * 2. 행별로 별의 개수를 달리 출력
	 */
	public void test7() {
//		outer:
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("★");
//				if(i == j) {
//					System.out.println();
//					continue outer;
//				}
//			}
//		}
		
		// i = 0, 1, 2, 3, 4
		for(int i = 0; i < 5; i++) {
			// j = (0), (0,1), (0,1,2), (0,1,2,3), (0,1,2,3,4)
			for(int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		
	}
	
	/**
	 * continue
	 */
	public void test6() {
		dan:
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
				
				if(i == j) {
					System.out.println();
					continue dan;
				}
			
			}
			
		}
	}
	
	/**
	 * 중첩반복문에 분기처리
	 * - break
	 * - continue
	 */
	public void test5() { 
		// 반복문 label
		red: 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("★");
				
				if(i == 2 && j == 1)
					break red; // 해당 라벨 반복문을 탈출! 
			}
			System.out.println();
		}
		
		
		
		
		
	}
	
	/**
	 * 모든 구구단출력
	 * 2 * 1 = 2
	 * 2 * 2 = 4
	 * ...
	 * 3 * 1 = 3
	 * 3 * 2 = 6
	 * ...
	 * 9 * 8 = 72
	 * 9 * 9 = 81
	 * 
	 */
	public void test4() {
		// 단
		for(int i = 2; i <= 9; i++) {
			System.out.println("=== " + i + "단 ===");
			// 수
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j , i * j);
			}
			System.out.println();
		}
	}
	
	
	/**
	 * 사용자로 부터 행/열을 입력받아 별 찍기
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int row = sc.nextInt();
		System.out.print("열 : ");
		int col = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			
			for(int j = 0; j < col; j++) {
				System.out.print("♥");
			}
			System.out.println();
		}
				
	}
	
	/**
	 * <pre>
	 * 별 찍기
	 * 
	 * ★★★★★
	 * ★★★★★
	 * ★★★★★
	 * 
	 */
	public void test2() {
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	
	/**
	 * 중첩반복문을 통해 행/열 표현
	 * - 바깥반복문 : 행
	 * - 안쪽반복문 : 열
	 */
	public void test1() {
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 3; j++) {
				System.out.print(i + "," + j +  " ");
			}
			System.out.println();
		}
		
	}
}

