package sh.java.array;

/**
 * <pre>
 * 변수 - 값하나를 보관하는 자료형(공간)
 * 배열 - 같은 타입의 값여러개를 보관하는 자료형
 * 	- 인덱스 기반으로 값에 접근가능
 *  - 크기가 고정. 변경할 수 없다.
 *  
 *  
 * 2023-09-15
 *
 */
public class ArrayStudy {

	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * 배열객체의 특징 
	 * 1. heap에 배열객체 생성
	 * 2. 배열크기 변경불가
	 * 3. 관련 예외 
	 * 	- ArrayIndexOutOfBoundsException
	 *  - NullPointerException
	 */
	public void test6() {
		int[] arr = {1, 2, 3, 4, 5}; // 크기가 5인 int배열
		double[] arr2 = {1.0, 2.2, 3.3};
		String[] names = new String[3];
		
		// 객체는 속성/기능 제공
		// length는 배열만 가진 속성
		System.out.println(arr.length);
		
		// hashCode 객체식별자 (주소값이 아님)
		System.out.println(arr.hashCode()); // 1554547125
		System.out.println(arr2.hashCode()); // 617901222
		
		// 객체출력(문자열) - 자동으로 toString() 호출됨.
		// 타입@hashCode(16진수)
		System.out.println(arr); // [I@5ca881b5
		System.out.println(arr.toString()); // [I@5ca881b5
		System.out.println(arr2); // [D@24d46ca6
		System.out.println(arr2.toString()); // [D@24d46ca6
		
		// 배열의 크기는 변경불가!
		arr = new int[100]; // arr변수에 새로운 배열(크기가 100)을 할당!
		System.out.println(arr.length);
		System.out.println(arr.hashCode());
		
		// 객체 삭제 
		// - 메모리에서 삭제하는 것 코드상 불가
		// - 주소값 제거를 대신 사용
		// - garbage collection이 실제 메모리에서 사용이 끝난(더이상 참조하지 않는) 객체를 제거 
		arr = null; // 값없음을 의미하는 키워드. 참조형변수의 기본값.
		
		// 참조형변수가 null일때, 속성/기능(메소드)를 사용하게 되면, NullPointerException 발생!
//		System.out.println(arr.length);
//		System.out.println(arr.hashCode());
		
		// 존재하지 않는 인덱스 참조시 ArrayIndexOutOfBoundsException 발생!
		System.out.println(arr2[3]); // ArrayIndexOutOfBoundsException
	}
	
	/**
	 * 규칙적인 배열요소라면 반복문을 통해 값설정할수 있다.
	 * {1, 2, 3, 4, 5}
	 * {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
	 */
	public void test5() {
		int[] nums = new int[5];
		
		// 값설정
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i + 1; 
		}
		
		// 값출력
		for(int n : nums) {
			System.out.println(n);
		}
	}
	
	/**
	 * for-each문 (향상된 for문)
	 * - 인덱스 사용불가
	 */
	public void test4() {
		double[] nums = {1.2, 3.4, 5.777, 8.8};
		
		// 인덱스 없이 배열의 모든 요소를 차례로 순회
		for(double num : nums) {
			System.out.println(num);
		}
		
	}
	
	/**
	 * 배열초기화
	 *  - 배열변수 선언 + 배열객체할당 + 번지수별 값할당
	 */
	public void test3() {
//		char[] arr;
//		arr = new char[5];
//		arr[0] = 'a';
//		arr[1] = 'b';
//		arr[2] = 'c';
//		arr[3] = 'd';
//		arr[4] = 'e';
		
//		char[] arr = new char[] {'a', 'b', 'c', 'd', 'e'};
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	/**
	 * 철수의 국영수사과 점수과 다음과 같은때, 이를 배열에 담아 총점/평균을 출력하세요.
	 * - 국어 80
	 * - 영어 70
	 * - 수학 90
	 * - 사회 85
	 * - 과학 65
	 * 
	 * int[5]
	 */
	public void test2() {
		int[] scores;
		scores = new int[5];
		scores[0] = 80;
		scores[1] = 70;
		scores[2] = 90;
		scores[3] = 85;
		scores[4] = 67;
		
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		double avg = (double) total / scores.length;
		System.out.printf("총점 : %d점\n평균 : %.2f점", total, avg);
	}
	
	/**
	 * 1. 배열변수 선언 (call stack)
	 * 2. 배열객체할당 (heap)
	 * 3. 인덱스를 통해 값할당
	 * 
	 * JVM 메모리구조
	 * - call stack 메소드호출스택
	 * - heap
	 * - static
	 *  
	 */
	public void test1() { 
		// 1. 배열변수
		// int arr[];
		int[] arr;
		
		// 2. 배열객체 할당(크기 지정 필수)
		// heap영역의 공간에 변수가 선언되면 타입별 기본값(0)으로 자동설정된다.
		// int 0, double 0.0, char NULL문자, boolean false, 참조형 null
		arr = new int[3];
		
		// 3. 번지수별 값확인
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 4. 번지수별 값대입
		arr[0] = 50;
		arr[1] = 60;
		arr[2] = 70;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 5. 반복문 통해서 배열접근
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		System.out.println(arr[3]); 
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
	}
}





