package com.sh.test.star;

public class Star1 {

	public static void main(String[] args) {
		Star1 s = new Star1();
		s.test1();
	}

	/**
	 * <pre>
	 * @실습문제1
	 * 
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 * </pre>
	 * 
	 */
	public void test1() {
		int total = 5;
		for (int i = 0; i < total; i++) {
			for (int j = 0; j < total - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
