package test.controller;

public class Test3 {
	
	public static void main (String[] args) {
		Test3 t = new Test3();
		t.test3();
	}
	public void test3() {
		int n = 100;
		int sum = 0;
		int i = 1;
		double avg;
		
		while(true) {
			sum += i;
			if(i == n)
				break;
			i++;
		}
		avg = sum / n;
		System.out.println("합계 : " + (double)sum);
		System.out.printf("평균 : %.1f", avg);
		
	}
	

}
