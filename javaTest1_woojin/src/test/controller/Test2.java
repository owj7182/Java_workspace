package test.controller;

public class Test2 {
	
	public static void main (String[] args) {
		Test2 t = new Test2();
		t.test2();
	}
	
	public void test2() {
		
		
		for(int dan = 2; dan <= 5; dan++) {
			for(int n = 1; n <=9; n++) {
				if ((dan * n) % 2 == 1)
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
		}
			
	}

}
