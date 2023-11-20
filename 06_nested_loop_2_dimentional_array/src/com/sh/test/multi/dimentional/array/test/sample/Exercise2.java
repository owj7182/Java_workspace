package com.sh.test.multi.dimentional.array.test.sample;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
	
	public static void main (String []args) {
		Exercise2 test = new Exercise2();
		test.exercise2();
	}
	
	public void exercise2() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[][] exercise = new int[4][4];
		final int TEST_MIN = 1;
		final int TEST_MAX = 100;
		
		exercise[0][0] = rnd.nextInt(100) + 1;
		exercise[0][1] = rnd.nextInt(100) + 1;
		exercise[0][2] = rnd.nextInt(100) + 1;
		
		
		exercise[1][0] = rnd.nextInt(100) + 1;
		exercise[1][1] = rnd.nextInt(100) + 1;
		exercise[1][2] = rnd.nextInt(100) + 1;
		
		
		exercise[2][0] = rnd.nextInt(100) + 1;
		exercise[2][1] = rnd.nextInt(100) + 1;
		exercise[2][2] = rnd.nextInt(100) + 1;
		
		for (int i = 0; i < exercise.length; i++) {
			int sum = 0;
			int sum2 = 0;
			for (int j = 0; j < exercise[i].length; j++) {
				if((j != exercise[i].length - 1)&&(i != 3)) { 
					sum += exercise[i][j];
					sum2 += exercise[j][i];
				}
//				if(i != exercise[i].length - 1) {
//
//					
//				}
//				else if (i == 3 && j == 3) {
//					sum2 = 0;
//				}
			} // j 끝
			// 여기서 더해
			if(i != 3) {
				exercise[3][i] = sum2;
			}
			exercise[i][3] = sum;
			
		} // i 끝
		
		for(int i = 0; i < exercise.length; i++) {
			for(int j = 0; j < exercise[i].length; j++) {
				if((j == exercise.length-1) && (i == exercise.length-1)) {
					System.out.println("");
				}else {
					System.out.print(exercise[i][j] + " ");
					
				}
			}

			System.out.println();
		}
	}
}
