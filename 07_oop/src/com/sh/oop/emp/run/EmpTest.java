package com.sh.oop.emp.run;

import java.util.Scanner;

import com.sh.oop.emp.model.vo.Employee;

public class EmpTest {
	// 여러메소드에서 사용할 수 있도록 멤버변수로 선언
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		EmpTest t = new EmpTest();
		t.mainMenu();

	}

	public void mainMenu() {
		String menu = "******* 사원 정보 관리 프로그램 **********\n" 
					+ "1. 새 사원 정보 입력\n" 
					+ "2. 사원 정보 삭제\n" 
					+ "3. 사원정보 출력\n"
					+ "9. 끝내기\n" 
					+ "*************************************\n" 
					+ "선택하세요 =>";
		Employee e = null;
		int selected = 0;
		while (true) {
			System.out.print(menu);
			selected = sc.nextInt();
			switch (selected) {
			case 1:
				e = new Employee();
				empInput(e);
				break;
			case 2:
				// 사원정보삭제는 참조주소값을 삭제한다.
				// 실제 heap영역의 객체 삭제는 garbage collector가 담당.
				e = null;
				break;
			case 3:
				// 사원정보 미입력시 출력하지 않도록함.
				// NullPointerException 유발
				if (e == null) 
					System.out.println(">>먼저 사원정보를 입력하세요.");
				else 					
					empOutput(e);
				break;
			}
			if (selected == 9)
				break;
		}

	}
	
	//키보드입력용메소드
	public void empInput(Employee e){
		System.out.print("사번 : ");
		e.setEmpNo(sc.nextInt());
		System.out.print("이름 : ");
		e.setEmpName(sc.next());
		System.out.print("소속부서 : ");
		e.setDept(sc.next());
		System.out.print("직급 : ");
		e.setJob(sc.next());
		System.out.print("나이 : ");
		e.setAge(sc.nextInt());
		System.out.print("성별 : ");
		e.setGender(sc.next().charAt(0));
		System.out.print("급여 : ");
		e.setSalary(sc.nextInt());
		System.out.print("보너스포인트 : ");
		e.setBonusPoint(sc.nextDouble());
		System.out.print("핸드폰 : ");
		e.setPhone(sc.next());
		sc.nextLine();//13 날리기용
		System.out.print("주소 : ");
		e.setAddress(sc.nextLine());
	}
	
	//출력용메소드
	public void empOutput(Employee e){
		String str = "사번 : "+ e.getEmpNo();
		str += "\n이름 : "+ e.getEmpName();
		str += "\n소속부서 : "+ e.getDept();
		str += "\n직급 : "+ e.getJob();
		str += "\n나이 : "+ e.getAge();
		str += "\n성별 : "+ e.getGender();
		str += "\n급여 : "+ e.getSalary();
		str += "\n보너스포인트 : "+ e.getBonusPoint();
		str += "\n핸드폰 : "+ e.getPhone();
		str += "\n주소 : "+ e.getAddress();
		System.out.println(str);
	}
}
