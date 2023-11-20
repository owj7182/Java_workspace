package com.sh.test.star;

/**
 * @실습문제5
 * <pre>
 * 
 * ***** 0-5
 *   *** 2-3
 *     * 4-1   
 *
 */
public class Star5 {

	public static void main(String[] args) {
		Star5 s = new Star5();
		s.test1();
//		s.test2();

	}

	public void test1() {
		int total = 5;
		// total 0 2 4
		for (int i = 0; i < total; i += 2) {
			// * 출력
			// j < 5 -> 0 1 2 3 4 
			// j < 3 -> 0 1 2 
			// j < 1 -> 0
			for (int j = 0; j < total - i; j++) {
				if(j == 0) {					
					// 공백을 출력하기 위한 반복문
					// k < 0
					// k < 2
					// k < 4
					for (int k = 0; k < i; k++) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}
			System.out.println("");
		}
	
	}

	private void test2() {
		int total = 5;
		for (int i = total / 2; i >= 0; i--) {
			for (int j = 0; j < total; j++) {
				System.out.print((j >= (total / 2) - i && j <= (total / 2) + i) ? "*" : "  ");
			}
			System.out.println();
		}
	}

}
