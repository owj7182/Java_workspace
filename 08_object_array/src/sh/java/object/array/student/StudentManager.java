package sh.java.object.array.student;

import java.util.Scanner;

/**
 * <pre>
 * 관리자 control 클래스
 * - Student객체를 배열로 관리
 * - 필드 Student[] 
 * - 메소드 학생정보입력, 학생정보출력
 * 
 * Has-a 포함관계
 * - StudentManager has a Student.
 * - 연관 Association 	관계 : 실선으로 표시
 * 
 * 2023-09-25
 * 
 */
public class StudentManager {
	public static final int MAX_STUDENT = 10;
	private Student[] students = new Student[MAX_STUDENT];
	private int studentIndex = 0; // 실제 입력값을 가리킬 인덱스변수, 현재까지 입력된 학생수
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 학생정보 입력메소드
	 */
	public void inputStudents() {
		System.out.println("> 학생정보를 입력하세요(최대학생수 : " + MAX_STUDENT + "명)...");
		
		for(int i = 0; i < MAX_STUDENT; i++) {
			System.out.println("> 학생" + (studentIndex + 1) + " 정보 입력...");
			// 학생번호 입력
			System.out.print("> 학생번호 : ");
			long id = sc.nextLong();
			// 이름 입력
			System.out.print("> 이름 : ");
			String name = sc.next();
			// 성별 입력
			System.out.print("> 성별(M/F) : ");
			char gender = sc.next().toUpperCase().charAt(0); // m/f -> M/F
			
			// 학생객체 생성 및 students배열에 할당
			students[studentIndex++] = new Student(id, name, gender);
			
			System.out.print("> 더 입력하시겠습니까? (y/n) : ");
			char yn = sc.next().charAt(0);
			if(yn != 'y')
				break;
		}
		
		System.out.println("> 학생정보를 모두 입력했습니다...");
		
	}
	
	/**
	 * 학생정보 출력메소드
	 */
	public void printStudents() {
		System.out.println();
		System.out.println("> 학생 정보를 출력합니다...");
		// studentIndex : 현재까지 입력된 학생수 의미
//		for(int i = 0; i < students.length; i++) {
//			if(students[i] == null)
//				break;
//			System.out.println("번호 : " + students[i].getId());
//			System.out.println("이름 : " + students[i].getName());
//			System.out.println("성별 : " + students[i].getGender());
//			System.out.println("---------------------");
//		}
		for(int i = 0; i < studentIndex; i++) {
			System.out.println("번호 : " + students[i].getId());
			System.out.println("이름 : " + students[i].getName());
			System.out.println("성별 : " + students[i].getGender());
			System.out.println("---------------------");
		}
	}
}
