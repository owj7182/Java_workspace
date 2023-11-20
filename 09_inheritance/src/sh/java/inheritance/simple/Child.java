package sh.java.inheritance.simple;

public class Child extends Parent {
	
	/**
	 * 메소드 오버라이딩
	 * - 메소드 시그니쳐(접근제한자/리턴타입/이름/매개변수부)가 동일해야 한다.
	 * - @Override 사용하면, 문법적 오류를 컴파일타임에 체크할 수 있다.	 
	 */
	@Override
	public void hello() {
		super.hello(); // 부모타입에 선언된 메소드 호출가능
		System.out.println("내가 자식이다~");
	}
	
	public void camp() {
		System.out.println("자식이 캠핑을 간다~");
	}
}
