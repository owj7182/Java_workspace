package sh.java.object.array.student;

import java.util.Scanner;

/**
 * <pre>
 * 실행클래스(main)
 * 
 * 의존관계 (Dependency)
 * - StudentMain의 메소드에서 지역변수로 StudentManager클래스 사용
 * 
 * 2023-09-25
 *
 */
public class StudentMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
//		manager.inputStudents();
//		manager.printStudents();
		
		
		String menu = "==============\n"
					+ "학생관리 프로그램\n"
					+ "==============\n"
					+ "1. 학생정보 입력\n"
					+ "2. 학생정보 출력\n"
					+ "0. 종료\n"
					+ "==============\n"
					+ "입력 : ";
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(menu);
			String choice = sc.next();
			switch (choice) {
			case "1":
				manager.inputStudents();
				break;
			case "2":
				manager.printStudents();
				break;
			case "0":
				System.out.println("> 이용해 주셔서 감사합니다.");
				return;
			default:
				System.out.println("> 잘못 입력하셨습니다.");
				break;
			}
			
		}
		
	}
	
	
	

}
