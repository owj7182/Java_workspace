package ncs.test4;

public class TestSort {

	public static void main(String[] args) {
		TestSort test = new TestSort();
		test.test4();
	}
	
	public void test4() {
		final int NUM_MIN = 51;
		final int NUM_MAX = 50;
		final int NUM_LEN = 10;
		int[] num = new int[NUM_LEN];
		
		for (int i = 0;;) {
			int n = (int)(Math.random() * NUM_MAX) + NUM_MIN;
			
			num[i++] = n;
			if (i == NUM_LEN)
				break;
		}
		System.out.printf("before : [%d, %d, %d, %d, %d, %d, %d, %d, %d, %d]\n",
				num[0], num[1], num[2], num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
		
		for (int i = 0; i < num.length - 1; i++) {
			
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j])
					swap(num, i, j);
			}
		}
		print(num);
		
	}
	public void print(int[] num) {
		System.out.printf("after : [%d, %d, %d, %d, %d, %d, %d, %d, %d, %d]\n",
				num[9], num[8], num[7], num[6], num[5], num[4], num[3], num[2], num[1], num[0]);
	}

	public void swap(int[] num, int i, int j) {
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		
	}
}
