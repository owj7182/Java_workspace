package sh.java.oop.access.modifier.member;

/**
 * 
 * <pre>
 * 멤버필드/메소드의 접근제한자
 * - private 같은 클래스에서만 접근
 * - default(package) 같은 패키지에서만 접근
 * - protected 같은 패키지에서만 접근. 자식클래스인 경우는 다른 패키지에서 접근 허용.
 * - public 아무데서나 접근
 * 
 * 
 * 2023-09-21
 *
 */
public class Foo {
	private int a = 1;
	int b = 2;
	protected int c = 3;
	public int d = 4;
	
	private void e() {}
	void f() {}
	protected void g() {}
	public void h() {}
}
