package array;

public class Test7 {
	
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.test7();
	}
	
	public void test7() {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for (int i = 1; i < array.length; i ++) {
			if (i % 2 == 0)
				continue;
			sum += i;
			System.out.println(i);
		}
		System.out.println("합계 : " + (double)sum);
		
	}

}
