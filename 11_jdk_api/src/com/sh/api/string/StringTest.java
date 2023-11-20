package com.sh.api.string;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringProcess sp = new StringProcess();
		System.out.print("> 영문자 입력1 : ");
		String result = sp.preChar(sc.nextLine());
		System.out.println(result);
		
		System.out.print("> 검색 대상 영문자 입력2 : ");
		String str = sc.nextLine();
		System.out.print("> 검색문자 입력(1글자) : ");
		char ch = sc.next().charAt(0);
		int num = sp.charSu(str, ch);
		System.out.println(num);
	}

}
