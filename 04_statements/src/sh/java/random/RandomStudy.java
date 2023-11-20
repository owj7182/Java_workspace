package sh.java.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 자바에서 난수만들기
 * - Math.random():double
 * - Random객체 이용
 *
 */
public class RandomStudy {
	
	public static void main(String[] args) {
		RandomStudy study = new RandomStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * <pre>
	 * 홀짝 게임
	 * 1. 사용자는 홀짝을 지정
	 * 2. 프로그램은 랜덤하게 홀짝을 발행
	 * 3. 사용자선택값과 프로그램 결과값을 비교
	 *   - 같으면 사용자승리!
	 *   - 다르면 사용자패배!
	 */
	public void test4() {
		// 1. 사용자 홀짝
		Scanner sc = new Scanner(System.in);
		System.out.println("===============================");
		System.out.println("\t홀짝 게임");
		System.out.println("===============================");
		System.out.println("홀짝을 입력하세요... 1.홀 2.짝");
		int user = sc.nextInt();

		// 2. 프로그램 홀짝
		Random rnd = new Random();
		int com = rnd.nextInt(2) + 1; // 1 2
		System.out.println("컴퓨터는 " + (com == 1 ? "홀" : "짝") + "을 뽑았습니다.");
		
		// 3. 결과비교 및 출력		
		String result = user == com ?
							"🎉🎉🎉 승리했습니다. 🎉🎉🎉" : 
								"😥😥😥 패배했습니다.😥😥😥";
		System.out.println("-----------------------------");
		System.out.println(result);
		
	}
	
	/**
	 * 
	 * 1. 0 ~ 9 사이의 난수 출력
	 * 2. 1 ~ 100 사이의 난수 출력
	 * 3. 0 또는 1 출력
	 * 4. 동전 앞/뒤 출력
	 * 5. 가위/바위/보 출력
	 */
	public void test3() {
		Random rnd = new Random();
		// 1. 0 ~ 9 사이의 난수 출력 (경우의 수: 10, 최소값: 0)
		System.out.println("1. 0 ~ 9 사이의 난수 : " + rnd.nextInt(10));
		// 2. 1 ~ 100 사이의 난수 출력 (경우의 수: 100, 최소값: 1)
		System.out.println("2. 1 ~ 100 사이의 난수 : " + (rnd.nextInt(100) + 1));
		// 3. 0 또는 1 출력 (경우의 수: 2, 최소값: 0)
		System.out.println("3. 0 또는 1 출력 : " + rnd.nextInt(2));
		// 4. 동전 앞/뒤 출력 (경우의 수: 2, 최소값: 0)
		System.out.println("4. 동전 앞/뒤 출력 : " + (rnd.nextBoolean() ? "앞" : "뒤"));
		// 5. 가위/바위/보 출력 (경우의 수: 3, 최소값: 0)
		int n = rnd.nextInt(3); // 0(가위) 1(바위) 2(보)
		String rps = n == 0 ? 
						"가위" : 
							(n == 1 ? "바위" : "보");
		System.out.println("5. 가위/바위/보 출력 : " + rps + "(" + n + ")");
	}
	
	/**
	 * 
	 * Random객체
	 * 
	 * - Random#nextInt():int
	 * - Random#nextDouble():double
	 * - Random#nextBoolean():boolean
	 */
	public void test2() {
		Random rnd = new Random();
//		int n = rnd.nextInt(); // int범위내에서의 난수
		int n = rnd.nextInt(10) + 1; // nextInt(경우의 수) + 최소값
		System.out.println(n);
		
		double d = rnd.nextDouble(); // 0.0이상 1.0미만의 실수
		System.out.println(d);
		
		boolean bool = rnd.nextBoolean();
		System.out.println(bool);
	}
	
	/**
	 * Math.random():double
	 * - static메소드는 객체를 만들지 않고, 클래스명으로 바로 호출가능!
	 * - 0.0 이상 1.0 미만의 실수를 반환
	 * - (int)(Math.random() * 경우의수) + 최소값
	 */
	public void test1() {
//		System.out.println(Math.random());
		
		// 1 ~ 10사이의 난수 가져오기
		double n = Math.random();
		System.out.println(n);
		int result = (int)(n * 10) + 1;
		System.out.println(result);
	}
}




