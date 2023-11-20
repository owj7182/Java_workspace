package sh.java.args;

/**
 * 
 * <pre>
 * 프로그램에 값 전달하기
 * 1. rumtime에 사용자 입력값 전달 Scanner
 * 2. 실행전 입력값 전달
 *  - 문자열 ( 공백 구분자로 사용)
 *  - main메소드의 매개인자로 전달 (공백 기준으로 분할, String[]타입으로 전달)
 *  
 * @author sisna
 *
 */
public class ArgsStudy {

	public static void main(String[] args) {
		ArgsStudy study = new ArgsStudy();
//		study.test1(args);
		
		System.out.println(study.test2(1, 2, 3));
		System.out.println(study.test2(1, 2, 3, 4, 5));
		System.out.println(study.test2(15, 30, 40, 55));
				

	}
	/**
	 * 가변인자
	 * - 동일한 타입 n개의 매개인자를 담을 수 있는 매개변수.
	 * - 배열타입으로 처리됨.
	 * - 가변인자 선언은 마지막에 한번만 가능하다.
	 */
	public int test2(int... arr) {
		int sum = 0;
		for(int  i = 0; i < arr.length; i++) {
	//		System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		return sum;
	}
	
	public void test1(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("[" + args[i] + "]");
			switch(i) {
			case 0 : System.out.println("String : " + args[i]); break;
			case 1 : 
				int n = Integer.parseInt(args[i]); // String -> int
				System.out.println("int : " + n);
				break;
			case 2 :
				double d =Double.parseDouble(args[i]); // String -> double
				System.out.println("double : " + d);
				break;
			case 3 :
				boolean bool = Boolean.parseBoolean(args[i]); //  String -> boolean
				System.out.println("boolean : " + bool);
				break;
			case 4:
				char ch =args[i].charAt(0); // String -> char 
				System.out.println("ch : " + ch);
				break;
			}
		}
		
	}

}
