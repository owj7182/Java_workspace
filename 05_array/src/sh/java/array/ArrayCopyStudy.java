package sh.java.array;


/**
 * <pre>
 * 
 * 얕은복사 shallow copy
 * 	- 배열 주소값 복사
 *  - 같은 배열객체를 공유
 * 깊은복사 deep copy
 * 	- heap영역의 배열객체를 복사
 *  - 직접복사 / System.arraycopy() / Array#clone()
 * 
 * 2023-09-18
 * 
 */
public class ArrayCopyStudy {

	public static void main(String[] args) {
		ArrayCopyStudy study = new ArrayCopyStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 여러 배열값 합치기
	 */
	public void test5() { 
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = {7, 8, 9, 10};
		
		// 길이가 10인 int[]에 값복사하기
		int len = a.length + b.length + c.length;
		int[] d = new int[len];
		
		// a복사 -> d[0]
		int start = 0;
		System.arraycopy(a, 0, d, start, a.length);
		start += a.length; // 3
		// b복사 -> d[3]
		System.arraycopy(b, 0, d, start, b.length);
		start += b.length; // 6
		// c복사 -> d[6]
		System.arraycopy(c, 0, d, start, c.length);
		
		for(int i = 0; i < d.length; i++) {
			System.out.println(i + " -> " + d[i]);
		}
	}
	
	/**
	 * 깊은 복사3
	 * - Array#clone()
	 */
	public void test4() { 
		int[] arr = {10, 20, 30};
		int[] arr2 = arr.clone();
		
		System.out.println(arr.hashCode()); // 1554547125
		System.out.println(arr2.hashCode()); // 617901222
		
		arr[1] *= 100;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", " + arr2[i]);
		}
	}
	
	/**
	 * 깊은 복사2
	 * - System.arraycopy()
	 */
	public void test3() {
		char[] arr = {'a', 'b', 'c'};
		char[] arr2 = new char[arr.length];
		
		// void java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		arr[1] = 'B';
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ", " + arr2[i]);
		}
		
	}
	
	/**
	 * 깊은 복사1
	 */
	public void test2() {
		int[] arr = {1, 2, 3};
		int[] arr2 = new int[arr.length];
		
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		
		// 번지수별로 값복사
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr[1] *= 100;
		
		// 확인
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d, arr2[%d] = %d\n", i, arr[i], i, arr2[i]);
		}
	}
	
	/**
	 * 얕은 복사
	 */
	public void test1() {
		int[] nums = {1, 2, 3};
		int[] nums2 = nums; // nums2공간에 nums주소값을 대입! 
		
		System.out.println(nums.hashCode()); // 1554547125
		System.out.println(nums2.hashCode()); // 1554547125
		System.out.println(nums == nums2); // 주소값이 같은가?
		
		nums[1] *= 100;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println("[" + i + "] " + nums[i]);
		}
		for(int i = 0; i < nums2.length; i++) {
			System.out.println("[" + i + "] " + nums2[i]);
		}
		
	}
}






