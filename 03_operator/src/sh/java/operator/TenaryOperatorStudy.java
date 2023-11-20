package sh.java.operator;

import java.util.Scanner;

public class TenaryOperatorStudy {

	public static void main(String[] args) {
		TenaryOperatorStudy study = new TenaryOperatorStudy();
		study.test1();
	}
	
	/**
	 * 삼항연산자
	 *  (조건식) ? (참일때 값) : (거짓일때 값)
	 */
	public void test1() {		
		int a = 10;
		int b = 20;
		int c = a < b ? a : b;
//		System.out.println(c);
		
		// 사용자로부터 두수를 입력받고, 큰수/작은수를 차례로 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 : ");
		int n1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int n2 = sc.nextInt();
		
		int big = n1 > n2 ? n1 : n2;
		int small = n1 < n2 ? n1 : n2;
		
		System.out.printf("입력한 수는 %d, %d입니다.", big, small);
		
		
	}
}




