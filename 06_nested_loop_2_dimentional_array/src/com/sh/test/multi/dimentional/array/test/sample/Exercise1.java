package com.sh.test.multi.dimentional.array.test.sample;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Exercise1 test = new Exercise1();
		test.exercise1();
	}
	
	public void exercise1() {
		int[][] test = new int[3][5];
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		final int TEST_MIN = 1;
		final int TEST_MAX = 100;
		
		test[0][0] = rnd.nextInt(100) + 1;
		test[0][1] = rnd.nextInt(100) + 1;
		test[0][2] = rnd.nextInt(100) + 1;
		test[0][3] = rnd.nextInt(100) + 1;
		test[0][4] = rnd.nextInt(100) + 1;
		
		test[1][0] = rnd.nextInt(100) + 1;
		test[1][1] = rnd.nextInt(100) + 1;
		test[1][2] = rnd.nextInt(100) + 1;
		test[1][3] = rnd.nextInt(100) + 1;
		test[1][4] = rnd.nextInt(100) + 1;
		
		test[2][0] = rnd.nextInt(100) + 1;
		test[2][1] = rnd.nextInt(100) + 1;
		test[2][2] = rnd.nextInt(100) + 1;
		test[2][3] = rnd.nextInt(100) + 1;
		test[2][4] = rnd.nextInt(100) + 1;
		
		// 난수 값 확인
		System.out.println("====배열안의 난수====");
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.println(test[i][j] + " ");
			}
		}
		
		System.out.println("===========5의 배수 출력==========");
		
		//5의 배수 출력
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				if (test[i][j] % 5 == 0) 
					System.out.print(test[i][j] + "  ");
				
			}
			System.out.println();
		}
	}
	

}
