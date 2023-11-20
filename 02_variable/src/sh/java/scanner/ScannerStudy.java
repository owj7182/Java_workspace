package sh.java.scanner;

import java.util.Scanner;

/**
 * Scanner
 * - 사용자입력(키보드)을 실행시간에 처리할 수 있는 클래스 
 * - 입력값(String)을 적절한 타입으로 변환해 반환한다.
 * - nextXXX()
 * - nextLine()
 */
public class ScannerStudy {

	public static void main(String[] args) {
		ScannerStudy study = new ScannerStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * nextLine()
	 * - 공백이 포함된 문자열을 읽어올때 사용
	 * - next메소드 다음에 nextLine 사용하는 경우, 버퍼에 남아있는 개행문자를 제거해야 함.
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("> 이름 : ");
		String name = sc.next();
		
		sc.nextLine(); // 개행문자 제거용
		System.out.print("> 주소 : ");
		String address = sc.nextLine();
		System.out.println(name + "님의 주소는 " + address + "입니다.");
	}
	
	/**
	 * nextXXX
	 * - 공백/개행전까지 읽어서 반환 (개행문자 처리 없음)
	 * - nextInt()
	 * - nextDouble()
	 * - nextBoolean()
	 * - next()
	 * - char를 반환하는 메소드는 없다.
	 */
	public void test1() {
		// System.in 표준입력 - 키보드
		// System.out 표준출력 - 콘솔
		Scanner sc = new Scanner(System.in); 
		
		// 문자열 입력
//		System.out.println("이름을 입력하세요...");
//		String name = sc.next();
//		System.out.println("반갑습니다. " + name + "님~ 😊");
		
		// 정수 입력
//		System.out.println("나이를 입력하세요...");
//		int age = sc.nextInt(); // "23" -> 23
//		System.out.println("당신은 " + age + "세입니다. 🎉");
		
		// 실수 입력
//		System.out.println("키를 입력해주세요...(예 : 177.7)");
//		double height = sc.nextDouble();
//		System.out.println("당신의 키는 " + height + "cm입니다.");
		
		// 논리값 입력
//		System.out.println("결혼여부를 입력해주세요...(예 : true/false)");
//		boolean married = sc.nextBoolean();
//		System.out.println("당신의 결혼 여부 : " + married);
//		// 삼항연산자 : true/false 분기처리
//		System.out.println("당신은 " + (married ? "기혼" : "미혼") + "입니다.");
		
		// 문자입력
		System.out.println("성별을 입력하세요...(예 : 남/여)");
		// Scanner#next
		// String#charAt
		char gender = sc.next().charAt(0);
		System.out.println("당신은 " + gender + "자입니다.");
	}
}









