package sh.java.anonymous.clazz;

/**
 * <pre>
 * 익명클래스(무명클래스)
 * - 1회성으로 클래스 선언과 객체생성을 동시에 처리하는 문법
 * - 부모클래스의 자식클래스를 간단히 선언하고자 할때
 * @author sisna
 *
 */
public class AnimalMain {
	
	private Animal cat = new Animal() {
		public void say() {
			System.out.println("안녕하세요, 고양이입니다.");
		}
	};
	public static void main(String[] args) {
		AnimalMain main = new AnimalMain();
//		main.test1();
		main.test2();
	}
	
	
	/**
	 * 1. 필드로 선언
	 * 2. 지역변수 선언
	 * 3. 매개인자 사용
	 */
	private void test2() {
		// 필드
		cat.say();
		
		// 지역변수 duck
		Animal duck = new Animal() {
			@Override
			public void say() {
				System.out.println("안녕하세요, 오리입니다");
			}
		};
		duck.say();
		
		// 매개인자로 전달
		introduce(new Animal() {
			@Override
			public void say() {
				System.out.println("안녕하세요, 스네이크입니다.");
			}
		});
		
	}

	private void introduce(Animal animal) {
		animal.say();
	}

	/**
	 * 주로 추상클래스/인터페이스 자식클래스를 선언할 목적으로 사용
	 */
	private void test1() {
		// Animal을 상속한 클래스 선언 + 객체생성
		Animal dog = new Animal() {
			@Override
			public void say() {
				System.out.println("안녕하세요, 강아지입니다");
			}
		};
		dog.say();
	}
	

}
