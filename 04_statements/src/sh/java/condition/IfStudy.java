package sh.java.condition;

import java.util.Scanner;

/**
 * 조건문
 * - if
 * - if ~ else
 * - if ~ else if
 * - 중첩 if 
 * 
 */
public class IfStudy {
	
	public static void main(String[] args) {
		IfStudy study = new IfStudy();
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
	 * 사용자로부터 문자 char 하나를 입력받고, 
	 * 영어대문자인 경우, "영대를 입력하셨습니다. : A" 출력
	 * 영어소문자인 경우, "영소를 입력하셨습니다. : a" 출력
	 * 숫자인 경우, "숫자를 입력하셨습니다. : 8" 출력
	 * 기타 특수문자인 경우, "특수문자를 입력하셨습니다. : &" 출력 
	 */
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		String type = "";

		// 비교
		if(isUpperCase(ch)) {
			type = "영대";
		}
		else if (isLowerCase(ch)) {
			type = "영소";
		}
		else if (isNumber(ch)) {
			type = "숫자";
		}
		else {
			type = "기타 특수문자";
		}
		System.out.printf("%s를 입력하셨습니다. : %c\n", type, ch);
	}
	
	public boolean isNumber(char ch) {
		return (ch >= '0') && (ch <= '9');
	}
	
	public boolean isUpperCase(char ch) {
		return (ch >= 'A') && (ch <= 'Z');
	}
	public boolean isLowerCase(char ch) {
		return (ch >= 'a') && (ch <= 'z');
	}
	
	/**
	 * 중첩 if
	 * if(){
	 *  	if() {
	 *  	}
	 * }
	 * 
	 * 95 ~ 100 : A+
	 * 90 ~ 94 : A
	 * 85 ~ 89 : B+
	 * 80 ~ 84 : B
	 * 75 ~ 79 : C+
	 * 70 ~ 74 : C
	 * 65 ~ 69 : D+
	 * 60 ~ 64 : D
	 * ~ 59 : F
	 * 
	 * 
	 */
	public void test7() {
		int score = 77;
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95) {
				grade += "+";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 85) {
				grade += "+";
			}
		}
		else if(score >= 70) {
			grade = "C";
			if(score >= 75) {
//				grade = grade + "+";
				grade += "+";
			}
		}
		else if(score >= 60) {			
			grade = "D";
			if(score >= 65) {
				grade += "+";
			}
		}
		else {
			grade = "F";
		}
		
		System.out.printf("점수 : %d, 등급 : %s\n", score, grade);
	}
	
	/**
	 * 학점부여
	 * - 복수개의 if문처리
	 */
	public void test6() {
		int score = 90;
		char grade = ' '; // char 기본값
		
		if(score >= 90) {
			grade = 'A';
		}
		
		if(score >= 80 && score <= 89) {
			grade = 'B';
		}
		
		if(score >= 70 && score <= 79) {
			grade = 'C';
		}
		
		if(score >= 60 && score <= 69) {
			grade = 'D';
		}
		
		if(score < 60){
			grade = 'F';
		}
		
		System.out.printf("점수 : %d, 등급 : %c\n", score, grade);
	}
	
	/**
	 * 학점부여
	 * - 90 ~ 100 A
	 * - 80 ~ 89 B
	 * - 70 ~ 79 C
	 * - 60 ~ 69 D
	 * - ~ 59 F
	 */
	public void test5() {
		int score = 55;
		char grade = ' '; // char 기본값
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score >= 80) {
			grade = 'B';
		}
		else if(score >= 70) {
			grade = 'C';
		}
		else if(score >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("점수 : %d, 등급 : %c\n", score, grade);
	}
	
	/**
	 * if ~ else if
	 */
	public void test4() {
		int a = -10;
		
		if (a == 0) {
			// a == 0 참이면 실행!
			System.out.println("a == 0 참!!!");
		}
		else if (a > 0) {
			// a > 0 참이면 실행!
			System.out.println("a > 0 참!!!");
		}
		else {
			// a < 0 참이면 실행!
			System.out.println("a < 0 참!!!");
		}
		
		System.out.println("test4 end...");
	}
	
	/**
	 * 사용자로부터 나이를 입력받고, 
	 * - 20세이상 성인이면, "게임을 시작합니다." 출력
	 * - 20세미만 미성년이면, "미성년자는 게임을 할수 없습니다" 출력
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요...");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("게임을 시작합니다...");
		} 
		else {			
			System.out.println("미성년자는 게임을 할수 없습니다...");
		}
	}
	
	/**
	 * if ~ else
	 */
	public void test2() {
		int n = 3;
		if (n > 0) {
			// 조건식이 참일때 실행되는 구문
			System.out.println("참참참!!!");
		}
		else {
			// 조건식이 거짓일때 실행되는 구문			
			System.out.println("거짓거짓거짓!!!");
		}
		System.out.println("test2 end!!!");
	}
	
	/**
	 * if
	 */
	public void test1() {
		int a = 3;
		// a가 1이상 10이하의 숫자인가?
		if(a >= 1 && a <= 10){
			// 조건이 true일때 실행되는 구문
			System.out.println("참참참!!!!");
		}
		System.out.println("test1 end!!!");
	}
			
}
