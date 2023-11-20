package sh.java.polymorphism.animal;

import java.util.Random;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain main = new AnimalMain();
//		main.test1();
//		main.test2();
//		main.test3();
//		main.test4();
//		main.test5();
//		main.test6();
//		main.test7();
//		main.test8();
//		main.test9();
		main.test10();
		
	}
	
	/**
	 * Animal을 상속하고, Flyable인터페이스를 구현한 Eagle클래스를 작성.
	 * 
	 * - Eagle 
	 * - Animal
	 * - Eatable
	 * - Flyable
	 * - Object
	 */
	private void test10() {
		Animal animal = new Eagle();
		animal.say(); // 저는 이글이글입니다.
		animal.attack(); // 이글이 발톱으로 낚아챘습니다.
		animal.eat("아보카도");
		
		Flyable flyAnimal = (Flyable) animal;
		flyAnimal.fly(); // 이글이 날고 있습니다.
		
	}

	/**
	 * 추상클래스는 추상메소드를 구현하지 않고, 자식클래스로 위임할 수 있다.
	 */
	private void test9() {
		Eatable animal = new Tiger();
		Eatable animal2 = new Lion();
		
		animal.eat("사과");
		animal2.eat("복숭아");
	}

	/**
	 * 인터페이스도 부모클래스처럼 사용가능
	 */
	public void test8() {
		Runnable[] runnables = {
			new Tiger(),
			new Lion(),
			new Tiger(),
//			new Snake()
		};
		
		for(Runnable animal : runnables) {
			animal.run();
		}
		
	}
	
	/**
	 * 추상클래스/인터페이스
	 * - 추상메소드 구현 강제화 기능
	 * - 특정클래스에 규격을 제공
	 * - 부모타입 제어시 자동으로 동적바인딩 처리
	 */
	private void test7() {
		// Animal animal = new Animal(); // Cannot instantiate the type Animal
		// Runnable runnable = new Runnable(); // Cannot instantiate the type Runnable
		
		
		Runnable run1 = new Tiger();
		Runnable run2 = new Lion();
		run1.run();
		run2.run();
		
		// Runnable타입으로는 Tiger타입의 기능을 사용할 수 없다.
//		run1.say();
//		run1.attack();
//		run1.punch();
		Tiger tiger = (Tiger) run1;
		tiger.say();
		tiger.attack();
		tiger.punch();
		
		Animal animal = (Animal) run1;
		animal.say();
		animal.attack();
//		animal.punch();
		
		Object obj = run1; // upcasting
//		obj.say(); 
		
	}

	/**
	 * 정적바인딩
	 * 	- 메소드 호출시 해당객체의 타입에 따라 실행메소드 결정
	 *  - compile-time에 결정
	 * 동적바인딩
	 *  - 상속/다형성, overriding을 전제로 함.
	 *  - 해당객체의 타입이 아닌 실제객체의 overriding된 메소드 실행
	 * 
	 */
	private void test6() {
//		Lion lion = new Lion();
//		lion.kick();
//		lion.say(); // 오버라이드된 say가 호출됨. 
//		
//		Animal animal = lion;
//		animal.say(); // Animal#say가 아닌 Lion#say가 호출됨.
		
		Animal[] animals = new Animal[] {
			generateAnimal(),
			generateAnimal(),
			generateAnimal(),
		};
		
		for(Animal animal : animals) {
			animal.say(); // Lion#say, Tiger#say
			animal.attack(); // Lion#attack(kick), Tiger#attack(punch)
		}
		
		
	}




	/**
	 * 다형성활용3
	 * - 리턴타입에서 사용하기
	 */
	private void test5() {
		Animal animal1 = generateAnimal();
		Animal animal2 = generateAnimal();
		
		System.out.println(animal1);
		System.out.println(animal2);
	}

	private Animal generateAnimal() {
		Random rnd = new Random();
		if(rnd.nextBoolean()) 
			return new Lion();
		else
			return new Tiger();
	}


	/**
	 * 다형성활용2
	 * - 매개변수부에서 사용
	 */
	private void test4() {		
		action(new Lion());
		action(new Tiger());
	}

//	private void action(Lion lion) {}
//	private void action(Tiger tiger) {}
	
	private void action(Animal animal) {
		animal.say();
		if(animal instanceof Lion)
			((Lion) animal).kick();
		else if(animal instanceof Tiger)
			((Tiger) animal).punch();
	}

	/**
	 * 다형성활용1
	 * - 부모타입의 객체배열 사용하기
	 */
	private void test3() {
		Animal[] animals = new Animal[3];
		animals[0] = new Lion();
		animals[1] = new Tiger();
		animals[2] = new Lion();
		
		for(Animal animal : animals) {
//			System.out.println(animal);
			animal.say();
			
			// instanceof 해당타입을 확인. 해당타입으로 형변환 문제없음 보장.
//			if(animal instanceof Tiger)
//				((Tiger) animal).punch();
//			else if(animal instanceof Lion)
//				((Lion) animal).kick();
			
			// 클래스객체 
			// 1. 객체.getClass()
			// 2. 타입.class
			if(animal.getClass() == Tiger.class)
				((Tiger) animal).punch();
			else if(animal.getClass() == Lion.class)
				((Lion) animal).kick();
				
		}
		
	}

	/**
	 * - 해당타입으로 제어 : 모든 기능 사용가능
	 * - 부모타입으로 제어 : 부모클래스에 선언된 기능만 사용가능
	 */
	private void test2() {
		Lion lion = new Lion();
		lion.say(); 	// 상속 받은 메소드
		lion.kick(); 	// 확장한 메소드
		
		Animal animal = new Lion();
		animal.say();
//		anim`(); // Lion#kick 사용불가
		
		// downcasting후에 다시 사용가능
		Lion lion2 = (Lion) animal;
		lion2.kick();
		
		((Lion) animal).kick();
		
		Animal animal2 = new Tiger();
		Tiger tiger = (Tiger) animal2;
		tiger.punch();
	}



	/**
	 * 다형성
	 * - 상속을 이용한, 자식객체를 부모타입으로써 제어하는 기술
	 * 
	 * 형변환
	 * - up-casting 부모타입으로 변환. 자동
	 * - down-casting 자식타입으로 변환. 명시적 변환
	 */
	private void test1() {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		// upcasting
		Animal animal1 = lion; // Lion -> Animal upcasting
		Animal animal2 = tiger;
		
		// downcasting
		Lion lion2 = (Lion) animal1;
		Tiger tiger2 = (Tiger) animal2;
		Lion lion3 = (Lion) animal2; // compile-time에 문제없음.
		// runtime 오류
		// java.lang.ClassCastException: class sh.java.polymorphism.animal.Tiger cannot be cast to class sh.java.polymorphism.animal.Lion 
		
	}

}
