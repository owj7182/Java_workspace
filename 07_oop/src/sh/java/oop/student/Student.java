package sh.java.oop.student;


/**
 * <pre>
 * 클래스 & 객체
 * - 작성된 클래스를 기반으로 객체가 만들어 진다.
 * - new연산자를 통해 heap영역에 생성된 메모리 조각.
 * - 클래스를 하나 작성하면, 객체는 개수 제한 없이 만들수 있다.
 * 
 * 클래스
 * - 여러 자료형, 여러값을 관리(구조체)
 * - 구조체 + 접근제한기능
 * - 상태(field)
 * - 기능(method)
 * - 상태와 기능을 묶어서 관리함(캡슐화)
 * 
 *  
 *  김철수,남,90,true
 *  김영희,여,95,true
 *  
 * 2023-09-21
 * 
 */
public class Student {
	// 상태 field
	private String name;
	private char gender;
	private int score;
	private boolean valid; // 유효한
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public int getScore() {
		return this.score;
	}
	public boolean isValid() {
		return this.valid;
	}
	
	// 기능 method
	public void printStudentInfo() {
		System.out.println("------------------");
		System.out.println("이름 : " + this.gender);
		System.out.println("성별 : " + this.gender);
		System.out.println("점수 : " + this.score);
		System.out.println("유효학생여부 : " + this.valid);
		System.out.println("------------------");
	}
	
	
}
