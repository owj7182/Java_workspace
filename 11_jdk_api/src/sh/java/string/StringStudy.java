package sh.java.string;
/**
 * <pre>
 * API란
 * - Application Programming Interface
 * - 프로그램을 작성하기 위해 제공받는 기능 혹은 규격
 * - API Doc에 모든 명세(spec(ification))가 작성되어 있으니 참고해야 함.
 * 
 * 
 * 2023-10-04
 *
 */
public class StringStudy {

	public static void main(String[] args) {
		StringStudy study = new StringStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 문자열 변경
	 */
	private void test3() {
		String str = "java";
		System.out.println(str.hashCode()); // 3254818		
		str = "oracle";
		System.out.println(str.hashCode()); // -1008861826
		
		String str2 = new String("java");
		System.out.println(str2.hashCode());
		str2 = new String("oracle");
		System.out.println(str2.hashCode());
	}

	private void test2() {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.println(str1.hashCode()); // 3254818
		System.out.println(str2.hashCode()); // 3254818
		System.out.println(str3.hashCode()); // 3254818
		System.out.println(str4.hashCode()); // 3254818
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
		System.out.println(str3.equals(str4)); // true
		
		// 주소값 비교
		System.out.println(str1 == str2); // true
		System.out.println(str2 == str3); // false
		System.out.println(str3 == str4); // false
	}

	/**
	 * <pre>
	 * String은 immutable이다.
	 * - 한번 생성된 리터럴은 변경불가
	 * - 생성된 리터럴은 heap영역에 String constant pool(Literal pool)에서 관리된다.
	 * - 리터럴로 생성된 문자열 참조변수는 Literal Pool을 직접 참조한다.
	 * - new 연산자를 통해 생성된 문자열 참조변수는 heap영역 객체를 통해 Literal Pool을 참조한다.
	 */
	private void test1() {
		String str = "hello";
		str += "world"; // 기존 "hello"를 변경하지 않고, 새롭게 "helloworld" 생성후 참조
		System.out.println(str); // "helloworld"
	}

}
