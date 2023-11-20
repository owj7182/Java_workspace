package sh.java.polymorphism.animal;

/**
 * <pre>
 * 메소드 구현 강제화
 * - 부모클래스의 정의된 메소드를 강제로 override하도록 함.
 * - 추상클래스 또는 인터페이스 작성
 * 
 * 1. 추상클래스 abstract class
 *  - 미완성 클래스
 *  - 0개 이상의 추상메소드를 가지고 있다.
 *  - 추상메소드 : abstract, 메소드 바디 없음.
 *  - 추상클래스의 자식클래스는 부모추상메소드를 반드시 구현해야 한다.
 *  - 객체화 할수 없다. 
 *  - 일반클래스이므로 추상메소드 외에도 필드/메소드를 가질 수 있다.
 *  
 * 2. 인터페이스 interface
 * 	- 추상메소드와 상수만 가질 수 있다.
 *  - jdk8이후에는 default메소드, static메소드를 가질 수 있다. 
 *  - 객체화 할 수 없다.
 *  - 다중구현 가능. implements A, B, C...
 *  - 인터페이스간의 구현은 extends 키워드 사용 
 *  <blockquote>
 *  	public interface A extends B {}
 *  
 * 
 * 2023-09-27
 *
 */
public abstract class Animal implements Eatable {
	
	/**
	 * 추상메소드
	 * - 반드시 추상클래스 하위에 있어야 한다.
	 */
	public abstract void attack();
	
//	public void eat(String food) {
//		System.out.println(food + "와구와구~~");
//	}
	
	public void say() {
		System.out.println("저는 동물입니다.");
	}
	
}
