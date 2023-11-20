package ncs.test6;

import java.util.*;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.print("2부터 5까지의 값을 입력하세요 ->");
		int inputData = sc.nextInt();
		
		try {
			double result = cal.getSum(inputData);
			System.out.println("결과값 : " + result);
		} catch (InvalidException e) {
			System.out.println(e.getMessage());
		}
	}

}
