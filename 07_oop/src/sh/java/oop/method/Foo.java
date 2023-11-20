package sh.java.oop.method;

/**
 * <pre>
 * 
 * 멤버메소드 (non-static)
 * - 멤버변수 사용가능
 * - 클래스변수 사용가능
 * 
 * 클래스메소드 (static)
 * - 멤버변수 사용불가
 * - 클래스변수만 사용가능
 * - this참조가 없다.
 * - 객체없이 실행가능한 용도의 기능제공 
 * 
 * 2023-09-22
 *
 */
public class Foo {
	static int s = 99;
	int n = 100;
	
	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.test();
		
		Foo.test2();
		
		System.out.println(s);
//		System.out.println(n); // Cannot make a static reference to the non-static field n
	}
	
	public void test() {
		System.out.println(s);
		System.out.println(n);
	}
	
	
	public static void test2() {
		System.out.println(s);
//		System.out.println(n); // Cannot make a static reference to the non-static field n
	}
}
