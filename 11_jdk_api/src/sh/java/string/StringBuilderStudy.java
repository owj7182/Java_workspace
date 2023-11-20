package sh.java.string;

/**
 * <pre>
 * StringBuilder
 * - mutable 문자열 관리
 * - 싱글쓰레드 환경에서 사용
 * - 객체내에서 직접 문자열을 관리. 상수풀 이용 안함.
 * - 싱글쓰레드에서는 StringBuffer보다 StringBuilder 사용
 * 
 * StringBuffer
 * - mutable 문자열 관리
 * - 멀티쓰레드 환경에서 사용 - 동기화(쓰레드간 접근 순서 지정) 지원
 * - 객체내에서 직접 문자열을 관리. 상수풀 이용 안함.
 * 
 * 2023-10-04
 *
 */
public class StringBuilderStudy {

	public static void main(String[] args) {
		StringBuilderStudy study = new StringBuilderStudy();
//		study.test1();
		study.test2();
	}

	/**
	 * StringBuffer
	 */
	private void test2() {
		StringBuffer sb = new StringBuffer("java");
		sb.append("oracle");
		sb.append("html");
		sb.append("css");
		sb.append("js");
		System.out.println(sb);
		
	}

	/**
	 * StringBuilder
	 * - 문자열 더하기 연산이 많은 경우는 String보다 StringBuilder의 성능이 더 좋다.
	 */
	private void test1() {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("oracle");
		sb.append("html");
		sb.append("css");
		sb.append("js");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		String str = "java";
		str += "oracle";
		str += "html";
		str += "css";
		str += "js";
		System.out.println(str);
		
	}

}
