package sh.java.sort;

/**
 * 
 * <pre>
 * 배열정렬
 * - 정렬알고리즘은 시간이 적게 소요되고, 메모리를 적게 사용할수록 성능이 좋다.
 * 
 * - 순차정렬
 * - 선택정렬
 * - 버블정렬
 * - 삽입정렬
 * 
 * - 퀵정렬
 * - 합병정렬
 * - 팀정렬
 * - ...
 * 
 * 
 * 2023-09-19
 *
 */
public class ArraySortStudy {

	public static void main(String[] args) {
		ArraySortStudy study = new ArraySortStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
	}
	
	/**
	 * 로또번호 생성기
	 * - 1 ~ 45 중에 난수 6개
	 * - 중복이 없고, 오름차순정렬해서 출력
	 */
	public void test5() {
		final int LOTTO_MIN = 1;
		final int LOTTO_MAX = 45;
		final int LOTTO_LEN = 6;
		int[] lotto = new int[LOTTO_LEN];
		
		// 1. 중복없이 6개 뽑기
		outer:
		for(int i = 0;;) {
			int n = (int) (Math.random() * LOTTO_MAX) + LOTTO_MIN;
			System.out.println(n);
			// 중복검사
			for(int j = 0; j < i; j++) {
				if(lotto[j] == n)
					continue outer;
			}
			lotto[i++] = n;
			if(i == LOTTO_LEN)
				break;
		}
		
		// 2. 정렬(삽입 Insertion)
		// 1번지부터 시작, 왼쪽부터 정렬되는 구조
		for(int i = 1; i < lotto.length; i++) {
			int tmp = lotto[i]; // i번지 임시저장
			int j; // 안쪽 for문 끝난 이후 사용을 위해 미리 선언
			for(j = i; j > 0; j--) { 
				// 왼쪽 숫자가 tmp보다 크다면 j번지에 해당값 쓰기
				if(lotto[j - 1] > tmp) {
					lotto[j] = lotto[j - 1];
				}
				// 왼쪽 숫자가 tmp보다 작다면 정렬이 끝났으므로 break
				else {
					break;
				}
			}
			lotto[j] = tmp;
		}
		
		
		// 3. 출력
		System.out.printf("[%d, %d, %d, %d, %d, %d]\n", 
							lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
	}
	
	/**
	 * 버블정렬 Bubble Sort
	 * - 인접한 2개의 요소를 비교해서 큰값을 오른쪽 위치시키는 방법
	 */
	public void test4() {
		int[] arr = {5, 4, 1, 3, 2};
		
		// 4 3 2 1 반복횟수
		for(int i = arr.length - 1; i > 0; i--) {
			// i = 4, j = 0 1 2 3
			// i = 3, j = 0 1 2
			// i = 2, j = 0 1
			// i = 1, j = 0
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
				print(i, j, arr);
			}
		}
		
		print(arr);
	}
	
	/**
	 * 선택정렬 Selection Sort
	 * - 매회차에 최소값에 해당하는 변수를 선정하고 적당수를 찾아 마지막에 한번만 자리교환.
	 */
	public void test3() {
		int[] arr = {5, 4, 1, 3, 2};
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i; // 최소값을 가리키는 인덱스변수
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[min] > arr[j]) 
					min = j;
				print(i, j, min, arr);
			}
			swap(arr, min, i);
		}
		print(arr);
		
	}
	
	/**
	 * 순차정렬 Sequential Sort
	 * - 회차에 해당하는 인덱스에 알맞은 수를 찾는 방식
	 * - 한 회차가 끝나면 해당자리는 정렬완료
	 */
	public void test2() {
		int[] arr = {5, 4, 1, 3, 2};
		
		// 마지막 번지 전까지만 검사
		// 0 1 2 3 
		for(int i = 0; i < arr.length - 1; i++) {
			// i+1번지부터 마지막 번지 검사
			// 1 2 3 4
			// 2 3 4
			// 3 4
			// 4
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j])
					swap(arr, i, j);
				print(i, j, arr);
			}
		}
		
		print(arr);
	}
		
	public void print(int i, int j, int min, int[] arr) {
		System.out.printf("%d - %d - %d [%d, %d, %d, %d, %d]\n", 
				i, j, min, arr[0], arr[1], arr[2], arr[3], arr[4]);
	}
	
	public void print(int i, int j, int[] arr) {
		System.out.printf("%d - %d [%d, %d, %d, %d, %d]\n", 
							i, j, arr[0], arr[1], arr[2], arr[3], arr[4]);
	}
	
	public void print(int[] arr) {
		System.out.printf("[%d, %d, %d, %d, %d]\n", 
							arr[0], arr[1], arr[2], arr[3], arr[4]);
	}
	
	/**
	 * 변수의 값교환 
	 * 배열의 자리교환
	 */
	public void test1() {
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a); // 20
		System.out.println(b); // 10
		
		int[] arr = {2, 1, 3};
		
		swap(arr, 0, 1);
//		temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(i != 0)
				System.out.print(", ");
			System.out.print(arr[i]);
//			if(i != arr.length - 1)
//				System.out.print(", ");
			
		}
		
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
			
}




