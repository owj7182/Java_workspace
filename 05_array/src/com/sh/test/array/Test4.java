package com.sh.test.array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 test = new Test4();
		test.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String nums = sc.next();
		char[] ch = new char[nums.length()];
		char[] copyArray = new char[ch.length];
		
		for(int i = 0; i < nums.length(); i++) {
			ch[i] = nums.charAt(i);
		}
		for(int i = 0; i < nums.length(); i++) {
			copyArray[i] = ch[i];
		}
		
		System.out.print("출력 : ");
		
		for(int i = 0; i < nums.length(); i++) {
			if(i > 2 && i < 7) {
				copyArray[i] = '*';
			}
			System.out.print(copyArray[i]);
		}
		System.out.println();
		
	
	}

}
