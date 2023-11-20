package sh.java.method;

import java.util.Scanner;

/**
 * method의 선언/호출
 * - call/return
 * - 중복(공통)된 코드를 별도의 메소드를 선언해서 효율적인 코드 작성
 * - 매개변수/매개인자
 *
 */
public class MethodStudy {
	
	public static void main(String[] args) {
		MethodStudy study = new MethodStudy();
//		study.test1();
//		study.test2();
		
		study.test3();
	}
	
	/**
	 * 리턴값
	 */
	public void test3() {
		int num1 = inputNum();
		int num2 = inputNum();
		
		int sum = num1 + num2;
		System.out.println("두 수의 합은 " + sum + "입니다.");
	}
	
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		return sc.nextInt();
	}
	
	
	/**
	 * 매개변수 Parameter
	 * - 메소드 선언부의 변수
	 * - 메소드 호출시 전달한 매개인자가 대입된다.
	 * - 매개인자/매개변수의 순서/타입 일치 필수!
	 * @param name
	 * @param age
	 */
	public void printPerson(String name, int age) {
		System.out.println("이름은 " + name + ", 나이는 " + age + "세입니다.");
	}
	
	public void test1() {
		// 변수 선언
		String name = "홍길동";
		int age = 30;
		// 변수 출력
		// 메소드 호출부 
		// 매개인자 Argument
		printPerson(name, age);
//		printPerson("홍길동", 30);
	}
	public void test2() {
		// 변수 선언
		String name = "신사임당";
		int age = 40;
		// 변수 출력
		printPerson(name, age);
	}
	
	
}
