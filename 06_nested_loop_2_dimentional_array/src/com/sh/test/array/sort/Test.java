package com.sh.test.array.sort;

public class Test {
	
	public static void main (String[] args) {
		Test t = new Test();
		t.Test();
	}
	public void Test() {
		final int NUM_MIN = 1;
		final int NUM_MAX = 100;
		final int NUM_LEN = 10;
		int[] num = new int[NUM_LEN];
		
		// 1. 중복없이 10개 뽑기
		outer:
		for(int i = 0;;) {
			int n = (int) (Math.random() * NUM_MAX) + NUM_MIN;
			System.out.println(n);
			// 중복검사
			for(int j = 0; j < i; j++) {
				if(num[j] == n)
					continue outer;
			}
			num[i++] = n;
			if(i == NUM_LEN)
				break;
		}
		
		for(int i = 0; i < num.length - 1; i++) {
			
			for(int j = i + 1; j < num.length; j++) {
				if(num[i] > num[j]) {
					
				
					swap(num, i, j);
					
					print(i, j, num);
				}
			}
		}	
		System.out.println("==========정렬 완료 값==========");
		print(num);
		
		}
		public void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		public void print(int i, int j, int[] num) {
			System.out.printf("%d - %d [%d, %d, %d, %d, %d, %d, %d, %d, %d, %d]\n", 
								i, j, num[0], num[1], num[2], num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
		}
		public void print(int[] arr) {
			System.out.printf("[%d, %d, %d, %d, %d, %d, %d, %d, %d, %d]\n", 
								arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
		}
}
