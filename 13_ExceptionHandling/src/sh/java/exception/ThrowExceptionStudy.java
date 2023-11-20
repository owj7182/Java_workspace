package sh.java.exception;

import java.util.Scanner;

public class ThrowExceptionStudy {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ThrowExceptionStudy study = new ThrowExceptionStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 시험점수 입력 - 60점 미만인 경우 보충수업메소드를 호출
	 * - inputScore():void 60점 미만인 경우 예외를 던짐.
	 */
	private void test3() {
		try {
			inputScore();
			System.out.println(".....");
		} catch(Exception e) {
			System.out.println(e.getMessage() + "으로 보충수업 대상자입니다...");
			doMakeupClass();
		}
	}
	
	private void inputScore() {
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		if(score < 60)
			// 커스텀 예외클래스
			throw new NotEnoughScoreException(score + "점");
	}

	public void doMakeupClass() {
		System.out.println("보충수업....");
	}

	/**
	 * 예외던지기를 통한 분기 흐름 만들기
	 */
	private void test2() {
		try {
			checkAge2(); // 미성년자인 경우 예외가 던져짐 
			System.out.println("게임을 시작합니다...🎉🎉🎉🎉🎉🎉");
		} catch(Exception e) {
			System.out.println("미성년자는 게임을 할 수 없습니다. 🚫🚫🚫🚫");
			System.out.println(e.getMessage());
		}
	}
	
	private void checkAge2() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age < 20)
			throw new UnderAgeException("미성년자 : " + age + "세");
	}

	/**
	 * if...else 흐름
	 */
	private void test1() {
		boolean isAdult = checkAge();
		if(isAdult) {
			System.out.println("게임을 시작합니다...🎉🎉🎉🎉🎉🎉");
		}
		else {
			System.out.println("미성년자는 게임을 할 수 없습니다. 🚫🚫🚫🚫");
		}
	}

	private boolean checkAge() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		return age >= 20;
	}

}
