package sh.java.inner.clazz;

/**
 * <pre>
 * 내부 클래스
 * - 클래스 안에 클래스 선언
 * - 외부클래스 안에서만 내부 클래스를 사용하는 경우
 * - 외부클래스의 private 자원을 사용해야 하는 경우
 * 
 * 종류
 * 1. static 내부클래스
 * 2. non-static 내부클래스
 * 3. 지역 내부클래스
 * @author sisna
 *
 */
public class OuterClass {
	private static int s = 99;
	private int n = 100;
	
	/**
	 * <pre>
	 *static 내부클래스
	 */
	public static class Inner1{
		public void a() {
			System.out.println(s);
//			System.out.println(n); // 외부클래스의 멤버변수 접근 불가
		}
	}
	
	/**
	 * <pre>
	 * non-static 내부클래스
	 *
	 */
	public class Inner2 {
		public void a() {
			System.out.println(s);
			System.out.println(n);
	
		}
	}
	
	public void test() {
		// 지역 내부 클래스 - 메소드 내부에서만 사용가능
		
		class Inner3 {
			public void a() {
				System.out.println(s);
				System.out.println(n);
			}
		}
		Inner3 app = new Inner3();
		app.a();
	}
}
