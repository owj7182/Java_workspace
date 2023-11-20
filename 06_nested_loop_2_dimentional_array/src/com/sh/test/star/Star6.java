package com.sh.test.star;

/**
 * @실습문제6
 * <pre>
 * 
 *       *
 *     ***
 *   *****
 * *******
 *   *****
 *     ***
 *       *
 * 
 */
public class Star6 {

	public static void main(String[] args) {
		Star6 s = new Star6();
//		s.test1();
		s.test2();
	}
	
	

	
	/**
	 * i - 공백 - * 
	 * ----------------- 
	 * 0-4-1:     * 
	 * 1-2-3:   *** 
	 * 2-0-5: ***** 
	 * 3-2-3:   ***
	 * 4-4-1:     *
	 * 
	 */
	public void test1() {
		int total = 5; // 5행, 5*
		int space = 4; // 공백
		int mid = total / 2;// 가운데기준으로 i와 mid의 값을 비교해 space값을 변경한다.

		// i : 0 1 2 3 4
		for (int i = 0; i < total; i++) {
			// j : 0 1 2 3 4
			for (int j = 0; j < total; j++) {
				System.out.print(j < space ? " " : "*");
			}

			// 다음행을 위한 공백설정
			// space : 4 - 2 - 0 - 2 - 4
			if (i < mid)
				space -= 2;
			else
				space += 2;
			System.out.println();
		}

	}

	/** 
	 * <pre>
	 *	              *
	 *	            ***
	 *	          *****
	 *	        *******
	 *	      *********
	 *	    ***********
	 *	  *************
	 *	***************
	 *	  *************
	 *	    ***********
	 *	      *********
	 *	        *******
	 *	          *****
	 *	            ***
	 *	              *
	 */
	private void test2() {
		int total = 15;
		for (int i = 0, j = 0; i < total; i++) {
			for (int k = 0; k < total / 2 + 1 + j; k++) {
				System.out.print((k < total / 2 - j) ? "  " : "*");
			}
			if (i < total / 2)
				j++;
			else
				j--;
			System.out.println();
		}

	}

}
