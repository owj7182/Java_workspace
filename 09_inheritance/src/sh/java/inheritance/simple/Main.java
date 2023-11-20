package sh.java.inheritance.simple;

/**
 * <pre>
 * 부모클래스의 선언된 멤버변수/멤버메소드를 
 * 자식클래스에서 선언없이 제것처럼 사용할수 있게 하는 문법
 * 
 * 2023-09-26
 */
public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "홍길동";
		child.age = 33;
		child.hello();
		child.camp();
		System.out.println(child.info());
		
		Child2 child2 = new Child2();
		child2.name = "윤봉길";
		child2.age = 25;
		child2.hello();
		child2.game();
//		child2.camp(); // 형제클래스의 기능 사용불가
		System.out.println(child2.info());
		
		GrandChild gc = new GrandChild();
		gc.name = "이순신";
		gc.age = 15;
		gc.hello();
		gc.camp();
		System.out.println(gc.info());
		
		// 부모도 자식의 필드/메소드를 사용할 수 있을까?
		Parent parent = new Parent();
		parent.hello();
//		parent.camp(); // 부모타입에서 자식타입은 사용불가
	}

}
