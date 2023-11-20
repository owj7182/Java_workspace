package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Test01 test = new Test01();
		test.test1();
	}	
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("(10 ~ 99사이의)숫자 5개를 입력해주세요 -> ");
		String str = sc.nextLine();
		String arr[];
		arr = str.split(" ");
		int narr[] = new int[arr.length]; 
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr.length == 5) {
				narr[i] = Integer.parseInt(arr[i]);
				if (!(narr[i] >= 10 && narr[i] <= 99)) {
					
					System.out.println("다시 입력하세요");
					return;
				}
			}	
			else {
				System.out.println("다시 입력하세요");
				return;
			}
		}
        
        double score = ((narr[0] + narr[1]) / 2) * 0.6 + ((narr[2] + narr[3]) / 2) * 0.2 + narr[4] * 0.2;

        
        String grade;
        if (score >= 90) {
            grade = "Gold Class";
        } else if (score >= 80) {
            grade = "Silver Class";
        } else if (score >= 70) {
            grade = "Bronze Class";
        } else {
            grade = "Normal Class";
        }

        System.out.printf("평가점수: %.1f점\n", score);
        System.out.println("Class: " + grade);
    }
}
		
		

