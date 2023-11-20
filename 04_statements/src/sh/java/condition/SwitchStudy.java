package sh.java.condition;

import java.util.Scanner;

/**
 * switch
 * - 값을 검사해 분기처리가 가능한 문법
 * - byte/short/char/int/String/enum 타입만 검사 가능 
 * - 실수/논리형/정수(long) 사용불가!
 */
public class SwitchStudy {

	public static void main(String[] args) {
		SwitchStudy study = new SwitchStudy();
//		study.test1();
		study.test2();
//		study.test3();
//		study.test4();
	}
	
	/**
	 * 학점부여
	 * 
	 * 90 ~ 100 : A
	 * 80 ~ 89 : B
	 * 70 ~ 79 : C
	 * 60 ~ 69 : D
	 * ~ 59 : F
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' ';
		switch(score / 10) {
		case 10: 
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default:
			grade = 'F'; 
		}
		System.out.println(score + " -> " + grade);
	}

	/**
	 * switch fall-through 사용하기
	 * 
	 * 주유소 고객사은대잔치
	 * 1. VIP : 스마트tv, 전자렌지, 두루마리휴지
	 * 2. GOLD : 전자렌지, 두루마리휴지
	 * 3. SILVER : 두루마리휴지
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("고객등급을 입력하세요. 1.VIP 2.GOLD 3.SILVER");
		System.out.print("입력 : ");
		String grade = sc.next(); // "1" "2" "3"
		
		String present = "";
		switch(grade) {
		case "1" : present += "스마트tv, ";
		case "2" : present += "전자렌지, ";
		case "3" : present += "두루마리휴지"; break;
		default : System.out.println("잘못 입력하셨습니다."); return;
		}
		System.out.println(present);
	}

	/**
	 * 과일판매정보는 다음과 같다. 과일/수량을 입력받고 결제금액 출력하세요.
	 * 1. 사과 : 1500원
	 * 2. 바나나 : 3000원
	 * 3. 오렌지 : 2000원
	 * 
	 */
	public void test2() {
		Scanner sc = new Scanner(System.in);
		// 과일선택
		String menu = "==============\n"
					+ "1. 사과 : 1500원\n"
					+ "2. 바나나 : 3000원\n"
					+ "3. 오렌지 : 2000원\n"
					+ "==============\n"
					+ "선택 : ";
		System.out.print(menu);
		String choice = sc.next();
		// 수량입력
		System.out.print("수량 입력 : ");
		int cnt = sc.nextInt();
		
		// 계산 및 출력
		int price = 0;
		switch(choice) {
		case "1" : 
			price = 1500;
			break;
		case "2" : 
			price = 3000;
			break;
		case "3" : 
			price = 2000;
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		int total = price * cnt;
		System.out.printf("총 금액은 %d원입니다.\n", total);
		
	}
	
	public void test1() { 
		Scanner sc = new Scanner(System.in);
		String menu = "===========\n"
					+ "1. 순대국\n"
					+ "2. 뚝배기불고기\n"
					+ "3. 평양냉면\n"
					+ "===========\n"
					+ "선택 : ";
		System.out.println(menu);
		int choice = sc.nextInt();
		
		String name = "";
		int price = 0;
		
		switch(choice) {
			case 1: 
				name = "순대국";
				price = 8000;
				break;
			case 2: 
				name = "뚝배기불고기";
				price = 9000;
				break;
			case 3: 
				name = "평양냉면";
				price = 8500;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return; // 조기리턴. 이하코드를 실행하지 않고, 바로 현재메소드 호출부로 돌아간다.
		}
		
		System.out.printf("%s은 %d원입니다.\n", name, price);
		
		
	}
}




