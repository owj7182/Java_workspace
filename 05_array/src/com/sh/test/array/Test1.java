package com.sh.test.array;


public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test();
	}

	private void test() {
		int[] iArr = new int[100];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		}

		
		for (int i = 0; i < iArr.length; i++) {
			System.out.println("iArr[" + i + "]=" + iArr[i]);
		}
	}

}