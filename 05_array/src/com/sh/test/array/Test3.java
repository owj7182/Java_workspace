package com.sh.test.array;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();

	}

	private void test() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("문자열을 하나 입력하세요 ==> ");
		String str = sc.nextLine(); //
	
		char[] arr = str.toCharArray();
		
		
		System.out.print("검색할 문자를 하나 입력하세요 ==> ");
		char searchK = sc.nextLine().charAt(0);

		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchK)
				cnt++;
		}

		System.out.printf("입력값 : %s\n", str);
		System.out.printf("검색값 : %s\n", searchK);
		System.out.printf("찾으시는 문자 '%s'은(는) %d개 입니다.", searchK, cnt);
	}

}