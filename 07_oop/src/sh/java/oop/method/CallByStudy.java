package sh.java.oop.method;

import java.util.Arrays;

/**
 * <pre>
 * Call By Value
 * - 매개인자로 기본형을 전달할때
 * 
 * Call By Reference
 * - 매개인자로 참조형을 전달할때
 * 
 * 
 * 2023-09-22
 * 
 */
public class CallByStudy {

	public static void main(String[] args) {
		CallByStudy study = new CallByStudy();
		int a = 10;
//		a = study.test1(a);
//		System.out.println(a); // 10 -> 50(반환타입)
		
		int[] arr = {1, 2, 3};
//		study.test2(arr);
//		System.out.println(Arrays.toString(arr));
		
		String s = "hello";
		s = study.test3(s);
		System.out.println(s);
		
		study.test4(a, arr);
	}

	/**
	 * 매개변수/매개인자의 타입에 따라 call by value 또는  call by reference로 처리된다.
	 * @param a
	 * @param arr
	 */
	private void test4(int a, int[] arr) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * String은 참조형이지만, call by value처럼 작동한다.
	 * - String immutable
	 * @param s
	 */
	private String test3(String s) {
		s += "world";
		return s;
	}

	/**
	 * call by reference
	 * - 얕은복사
	 * - heap영역의 객체를 메소드간에 공유
	 * 
	 * @param brr
	 */
	private void test2(int[] brr) {
		brr[1] *= 100;
	}

	/**
	 * call by value
	 * @param b
	 */
	private int test1(int b) {
		b *= 5;
		return b;
	}


}
