package sh.java.oop.method;


/**
 * <pre>
 * overloading
 * - 메소드명은 동일하고, 매개변수 선언부가 다른 메소드를 선언가능
 * - 동일한 작업흐름 가지되, 매개인자의 타입이 다른 경우 사용.
 * 
 * - 매개변수선언부가 어떻게든 달라야 한다.
 * - 타입, 개수, 순서
 * - 매개변수명, 접근제한자, 리턴타입은 오버로딩 고려대상이 아니다. 
 *  
 * 2023-09-22
 * 
 */
public class MethodOverloadingStudy {

	public static void main(String[] args) {
		MethodOverloadingStudy study = new MethodOverloadingStudy();
		System.out.println(study.concat(1, 2));
		System.out.println(study.concat("abc", 2));
		System.out.println(study.concat(2, "xyz"));
		System.out.println(study.concat('a', 'b', 'c'));
	}
	// 매개변수명이 다른 것은 오버로딩이 아니다.
//	public String concat(int m, int n) {
//		return "";
//	}
	// 리턴타입이 다른 것은 오버로딩이 아니다.
//	public void concat(int a, int b) {
//		
//	}
	// 접근제한자가 다른 것은 오버로딩이 아니다.
//	private String concat(int a, int b) {
//		
//	}
	
	public String concat(int n, String str) {
		return n + str;
	}
	
	public String concat(char ch1, char ch2, char ch3) {
		return "" + ch1 + ch2 + ch3;
	}
	public String concat(String str, int n) {
		return str + n;
	}
	public String concat(int a, int b) {
		return "" + a + b;
	}
}
