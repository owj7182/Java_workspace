package sh.java.oop.init.block;

import java.util.Random;

/**
 * <pre>
 * 초기화블럭
 * - 객체필드값 초기화 -> 객체 생성시 멤버변수의 값설정
 * 
 * 멤버변수의 초기화
 * 1. 멤버변수 타입별 초기값
 * 2. 명시한 리터럴 대입
 * 3. 초기화블럭에 의한 대입
 * 4. 생성자(객체생성) 안에서 대입 (우선순위 가장 높음)
 * 
 * 클래스변수의 초기화
 * 1. 클래스변수 타입별 초기값
 * 2. 명시한 리터럴 대입
 * 3. static 초기화블럭에 의한 대입 (우선순위 가장 높음)
 * 
 * 2023-09-22
 *
 */
public class Sample {
	static int s = 88;
	int n = 100;
	
	// 멤버변수의 초기화 블럭
	{
		Random rnd = new Random();
		this.n = rnd.nextInt(100) + 1;
		System.out.println("초기화블럭 값대입 : " + n);
	}
	// 클래스변수의 초기화 블럭
	static {
		s = 888;
		System.out.println("static 초기화블럭 값대입 : " + s);
	}
	
	// 생성자 메소드 - 객체생성시 호출되는 메소드(리턴타입 없음. 메소드명은 클래스와 동일)
	public Sample() {
		this.n = 999;
		System.out.println("생성자 값대입 : " + n);
	}
	
}
