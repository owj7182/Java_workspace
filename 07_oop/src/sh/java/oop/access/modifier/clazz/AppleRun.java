package sh.java.oop.access.modifier.clazz;

/**
 * <pre>
 * class의 접근제한자
 * - public : 어디서든 사용가능한 클래스(다른 패키지라면, import문 작성후 사용)
 * - default : 같은 패키지에서만 사용가능
 * 
 * 2023-09-21
 *
 */
public class AppleRun {

	public static void main(String[] args) {
		Apple apple = new Apple();
		PineApple pineApple = new PineApple();
	}

}
