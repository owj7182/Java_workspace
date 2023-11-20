package sh.java.exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 * Exception 
 * - 예외처리를 통해서 핸들링(다시 정상흐름으로 복귀)할 수 있는 오류
 * 
 * 구분
 * - Unchecked Exception : RuntimeException을 포함한 모든 자식클래스
 * - Checked Exception : RuntimeException계층을 제외한 모든 Exception의 자식클래스
 * 
 * 
 * 2023-10-10
 *
 */
public class ExceptionStudy {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ExceptionStudy study = new ExceptionStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
		study.test7();
		
		
		System.out.println("----- 프로그램 정상 종료 -----");
	}

	/**
	 * 정수 2개를 차례로 입력받아 두수의 합을 출력
	 * - 정수: 10
	 * - 정수: 5
	 * - 결과는 10 + 5 = 15입니다.
	 */
	private void test7() {
		System.out.print("정수1 입력 : ");
		int n1 = inputNumber();
		System.out.print("정수2 입력 : ");
		int n2 = inputNumber();
		System.out.printf("결과는 %d + %d = %d\n", n1, n2, n1 + n2);
	}
	
	private int inputNumber() {
		int n = 0;
		while(true) {
			try {
				n = sc.nextInt();
				break;				
			} catch(InputMismatchException e) {
				System.err.print("정수만 입력하세요! 다시 입력 : ");
				sc.next(); // 잘못 입력값이 들어있는 버퍼 비우기
			}
		}
		return n;
	}

	/**
	 * 사용자 입력 예외처리후 다시 받기
	 */
	private void test6() {
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				int n = sc.nextInt();
				System.out.println(n);	
				break;
			} catch(InputMismatchException e) {
				System.err.println("정수만 입력하세요~");
				sc.next(); // buffer의 잘못 입력한 값을 날리기
			}
		}
	}

	/**
	 * 예외객체 메소드
	 */
	private void test5() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
		} catch(Exception e) {
//			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//			System.out.println(e.getMessage()); // Index 10 out of bounds for length 10
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * catch절의 다형성
	 * - 자식객체를 부모타입으로 제어
	 * - 자식/부모타입의 catch블럭을 나열할때는 자식-부모순으로 작성해야 한다.
	 */
	private void test4() {
		try {
			System.out.print("정수 입력 : ");
			int m = sc.nextInt();
			System.out.println(m);
			
			String str = null;
			System.out.println(str.length());
//		} catch(InputMismatchException e) {
//			System.out.println("정수만 입력가능합니다.");
//		} catch(NullPointerException e) {
//			System.out.println("str는 null일 수 없습니다.");
//		} catch(RuntimeException e) {
//			System.out.println("RuntimeException이 발생!! " + e);
		} catch(Exception e) {
			System.out.println("Exception 발생!! " + e);
		}
		
	}

	/**
	 * try...catch블럭 실행순서
	 */
	private void test3() {
		System.out.println(1);
		try {
			System.out.println(2);
			if(true) return; // 조기리턴
			
			String str = null;
//			str.length();
			System.out.println(3);
		} catch (NullPointerException e) {
			System.out.println(4);
		} finally {
			// try절의 예외발생여부와 관계없이 무조건 실행 (조기리턴시에도 실행)
			System.out.println(100);
		}
		System.out.println(5);
	}

	/**
	 * 던져진 예외(checked, unchecked 모두)는 예외처리를 통해 정상흐름을 돌릴 수 있다. 
	 * - 예외가 던져질수 있는 코드를 try...catch블럭을 감싸는 것
	 */
	private void test2() {
		try {
			// 예외가 발생가능한 코드
			System.out.print("정수 입력 : ");		
			int n = sc.nextInt();
			System.out.println(n);
			
			String str = null;
			System.out.println(str.length());
			
			int[] arr = new int[10];
			System.out.println(arr[10]);
			
		} catch(InputMismatchException e) {
			// 던져진 예외를 처리하는 블럭
			// 던져진 예외가 해당타입이면 해당 catch블럭으로 jump한다.
//			System.out.println("InputMismatchException 발생!! : " + e);
			System.out.println("정수만 입력하셔야 합니다!");
		} catch(NullPointerException e) {
			System.out.println("str는 null일수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index입니다.");
		}
		
	}

	/**
	 * <pre>
	 * Unchecked Exception
	 * - RuntimeException 후손클래스
	 * - InputMismatchException
	 * - ArithmeticException
	 * - NullPointerException
	 * - ArrayIndexOutOfBoundsException
	 * - IndexOutOfBoundsException
	 * ...
	 */
	private void test1() {
		// checked exception은 예외처리가 없는 경우 컴파일오류를 유발 -> 확인가능
//		FileReader fr = new FileReader("abc.txt"); 
		
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt(); // Exception in thread "main" java.util.InputMismatchException
//		System.out.println(n);
		
//		int n = 100;
//		int m = 0;
//		System.out.println(n / m); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
//		String str = null;
//		System.out.println(str.length()); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null-
		
//		int[] arr = new int[10];
//		System.out.println(arr[10]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		
		List<Integer> list = new ArrayList<>();
		System.out.println(list.get(10)); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 0
	}

}
