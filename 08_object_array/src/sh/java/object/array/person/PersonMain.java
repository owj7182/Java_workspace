package sh.java.object.array.person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		PersonMain main = new PersonMain();
//		main.test1();
//		main.test2();
		main.test3();
	}

	/**
	 * 사용자입력값으로 Person배열 생성하기
	 */
	private void test3() {
		Scanner sc = new Scanner(System.in);
		Person[] persons = new Person[3];
		char[] seq = {'첫', '두', '셋'};
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println("----- " + (seq[i]) + "번째 사람 정보 입력 -----");
			// 사용자 이름 입력
			System.out.print("이름 : ");
			String name = sc.next();
			// 사용자 나이 입력
			System.out.print("나이 : ");
			int age = sc.nextInt();
			// Person객체 생성 및 persons에 할당
//			Person person = new Person(name, age);
//			persons[i] = person;
			persons[i] = new Person(name, age);
		}
		System.out.println("----- 입력을 완료했습니다. -----");
		
		for(Person person : persons) {
			System.out.println(person);
		}
		
		
	}

	/**
	 * 초기화
	 * - 배열변수선언 + 배열객체할당 + 번지수별 객체할당
	 */
	private void test2() {
//		Person[] persons = new Person[] {
//			new Person("홍길동", 23),	
//			new Person("신사임당", 33),	
//			new Person("세종대왕", 66),	
//		};
		Person[] persons = {
				new Person("홍길동", 23),	
				new Person("신사임당", 33),	
				new Person("세종대왕", 66),	
		};
		
		// 하나의 요소를 담을 변수 : 순회할 배열
		for(Person person : persons) {
			System.out.println(person);
		}
		
	}

	/**
	 * 객체배열
	 * 1. 배열변수 선언
	 * 2. 배열객체 할당
	 * 3. 번지수별로 객체 할당
	 */
	private void test1() {
		// 1. 배열변수 선언
		Person[] persons;
		
		// 2. 배열객체 할당
		persons = new Person[3];
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		
		// 3. 번지수별로 객체 할당
		persons[0] = new Person("홍길동", 33);
		persons[1] = new Person("신사임당", 48);
		persons[2] = new Person("이순신", 40);
		
//		System.out.println(persons[0].toString());
//		System.out.println(persons[1]);
//		System.out.println(persons[2]);
		
		for(int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		
	}
	
	

}
