package sh.java.format;

public class PrintfStudy {

	public static void main(String[] args) {
		PrintfStudy study = new PrintfStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * 너비/정렬
	 * - %[flag][width]문자
	 * 
	 * - flag가 없는 경우, width에서 값을 우측정렬
	 * - flag가 -인 경우, width에서 값을 좌측정렬
	 * 
	 */
	public void test2() {
		System.out.printf("%10s%10s\n", "hello", "world");
		System.out.printf("%-10s%-10s\n", "hello", "world");
	}
	
	/**
	 * System.out.printf
	 * - PrintStream#printf
	 */
	public void test1() {
		// public PrintStream printf(String format, Object... args)
		System.out.printf("char = %c\n", '한');
		System.out.printf("정수(byte/short/int/long) = %d %d %d\n", 100, 200, 300);
		System.out.printf("실수(float/double) = %f %.2f\n", 123.456, 123.456);
		System.out.printf("boolean = %b\n", true);
		System.out.printf("String = %s\n", "helloworld");
		System.out.printf("%s %s %s %s\n", '국', 123, 123.456, true);
		
	}
}






