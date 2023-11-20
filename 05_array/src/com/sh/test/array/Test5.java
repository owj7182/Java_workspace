package com.sh.test.array;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Test5 test = new Test5();
		test.test();

	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인 양의 정수 하나를 입력하세요 -->  ");
		int num = sc.nextInt();
		
		int j = 1;
		
		if (num % 2 == 1) {
			int[] numArr = new int[num];
			System.out.print("[ ");
			for(int i = 0; i < numArr.length; i++) {
				if(i < numArr.length / 2)
					numArr[i] = j++;
				
				else
					numArr[i] = j--;				
				System.out.print(numArr[i] + ", ");
				
			}
			System.out.print("] ");
		}
	else
		System.out.println("잘못 입력했습니다. 홀수가 아닙니다.");
	}

}
