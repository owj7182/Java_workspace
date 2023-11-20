package sh.java.error;

/**
 * <pre>
 * Error
 * - 프로그램 수행시 회복불가능한 치명적인 상황을 Error클래스로 정의해둠.
 * - 문제가 되는 상황이 발생하면, JVM은 해당 Error객체를 만들어 throw함.
 * - 에러처리는 불가능하고, 프로그램 소스코드 수정 또는 프로그램으로 재시작만 가능
 * 
 * 
 * 2023-10-10
 *
 */
public class ErrorStudy {

	public static void main(String[] args) {
		ErrorStudy study = new ErrorStudy();
//		study.test1();
//		study.test2();
		System.out.println("---- 프로그램 정상 종료 ----");
	}
	
	/**
	 * StackOverflowError
	 * - jvm이 할당받은 call stack 영역을 모두 소진한 경우
	 */
	private void test2() {
		test2(); 
		// Exception in thread "main" java.lang.StackOverflowError
	}

	/**
	 * OutOfMemoryError 
	 * - jvm이 할당받은 heap메모리영역을 모두 소진한 경우. 
	 */
	private void test1() {
		long[] arr = new long[Integer.MAX_VALUE];
		// Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	}

}
