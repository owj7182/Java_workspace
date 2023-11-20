package sh.java.oop.method;


/**
 * <pre>
 * 재귀호출
 * - recursion 스스로에게 돌아온다. -> 메소드안에서 메소드 자신을 다시 호출하는 것
 * - 재귀호출시에는 종료조건이 명확해야 한다.
 * - 종료조건이 명확하지 않다면, 무한 재귀호출되고, StackOverflowError가 발생! 
 * 
 * 
 * - 하노이의 탑 예제
 * 
 * 
 * 2023-09-22
 * 
 */
public class RecursionStudy {

	public static void main(String[] args) {
		RecursionStudy study = new RecursionStudy();
		// factorial
//		System.out.println(study.test(5));
		
		// 주사위 던지기 예제
		System.out.println(study.test2());
	}

	/**
	 * 주사위 2개의 합 구하기
	 * - 같은 수가 나오면 한번 더 던질수 있음.
	 * @return
	 */
	private int test2() {
		int dice1 = (int)(Math.random() * 6) + 1; 
		int dice2 = (int)(Math.random() * 6) + 1;
		System.out.printf("%d, %d\n", dice1, dice2);
		int total = dice1 + dice2;
		if(dice1 == dice2)
			return total + test2();
		
		return total;
	}

	/**
	 * factorial
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * @param i
	 * @return
	 */
	private int test(int i) {
		System.out.println(i);
		if(i == 1) 
			return 1;		
		return i * test(i - 1);
	}

}
