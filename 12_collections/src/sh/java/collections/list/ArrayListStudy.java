package sh.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import sh.java.collections.student.vo.Student;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayListStudy study = new ArrayListStudy();
//		study.test0();
//		study.test1();
		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
	}
	
	/**
	 * Student객체관리
	 */
	private void test5() {
		List<Student> list = new ArrayList<>();
		// Student객체 3개 list에 추가
		list.add(new Student(1, "홍길동"));
		list.add(new Student(2, "신사임당"));
		list.add(new Student(3, "이순신"));
		
		// Student객체 2개 list에 추가
		list.add(new Student(4, "세종대왕"));
		list.add(new Student(5, "유관순"));
		
		// list의 2번지 요소 제거
//		list.remove(2);
		list.remove(new Student(3, "이순신"));

		// list의 2번지에 새 Student객체 추가
		list.add(2, new Student(100, "잔나비"));
		
		System.out.println(list);
	}

	/**
	 * 반복문 처리
	 * 1. for
	 * 2. for each
	 * 3. Iterator객체
	 */
	private void test4() {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신사임당");
		list.add("이순신");
		
		// 1. for
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		// 2. for each
//		for(String str : list) {
//			System.out.println(str);
//		}
		// 3. Iterator객체(반복객체) - 요소를 순서대로 접근가능하게 목록화한다.
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}


	/**
	 * List API 
	 * - 포함여부
	 */
	private void test3() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(5);
		
		// 요소 포함여부
		System.out.println(list.contains(5)); // true
		// 존재하는 요소의 인덱스를 반환, 존재하지 않으면 -1 반환
		System.out.println(list.indexOf(5)); // 2번지
		System.out.println(list.lastIndexOf(5)); // 5번지
		System.out.println(list.indexOf(5) > -1); // contains처럼 사용하기
		
		System.out.println(list);
		
		// 커스텀클래스 포함여부는 반드시 equals/hashCode 오버라이드 후 사용한다. 
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "신사임당"));
		
		System.out.println(students.contains(new Student(1, "홍길동"))); // false
		System.out.println(students.indexOf(new Student(1, "홍길동"))); // 0
		
	}



	/**
	 * List API
	 */
	private void test2() {
		List<String> list = new ArrayList<>(); // 객체생성부분의 제네릭 타입 생략 가능
		
		// 요소 추가
		list.add("hello");
		list.add("world");
		list.add("hello");
		list.add("java");
		
		// 요소 삽입
		list.add(2, "ㅋㅋㅋㅋㅋㅋ");
		
		// 요소 대체 
		list.set(2, "ㅎㅎㅎㅎㅎㅎ");
		
		// 요소 하나 가져오기
		String elem = list.get(4);
//		String elem = list.get(100); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 5
		System.out.println(elem);
		
		// 저장된 요소 개수
		int size = list.size();
		System.out.println(size);
		
		// 반복문 처리
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// 요소 삭제
		// 1. 인덱스 삭제
//		list.remove(1);
		// 2. 요소로 삭제(equals기반)
//		list.remove("hello");
		
		// 리스트가 비어있는지 확인(요소가 0개이면 true)
		System.out.println(list.isEmpty()); // false
		
		// 전체요소 삭제
		list.clear();
		
		System.out.println(list.isEmpty()); // false
		
		// toString 
		System.out.println(list);
	}



	/**
	 * List - ArrayList 
	 * - 순서가 있는 데이터를 관리
	 * 
	 * Generics - 요소의 타입을 제한하는 문법
	 * - 요소의 타입검사를 컴파일타임에 수행
	 * - 반환된 요소의 타입을 보장 
	 */
	private void test1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>(); // 동적바인딩에 의해서 부모타입으로도 ArrayList의 거의모든 메소드를 사용가능!
//		Collection list3 = new ArrayList();
		Collection<Object> list3 = new ArrayList<Object>();
//		Collection<?> list3 = new ArrayList<Object>(); // ? 모든 타입을 의미. 객체생성시에는 타입 명시
		
		// 맨뒤에 요소 추가
		list.add(10); 
		list.add(20);
//		list.add("안녕"); // Integer가 아닌 타입 추가 불가
		
		list2.add("hello");
		list2.add("world");
//		list2.add(123);
		list3.add(123);
		list3.add("abc");
		list3.add(new Student());
		
		// 요소 가져오기 - index
		System.out.println(list.get(0));
		System.out.println(list2.get(0));
		System.out.println(list3); // Collection#get 없음
		
	}

	/**
	 * 배열의 한계
	 * - 대용량 데이터를 처리하기엔 배열에 한계가 있다.
	 * - 크기가 한번 지정되면 변경불가
	 * - 요소 중간에 추가/삭제하기 불편
	 */
	private void test0() {
		Student[] arr = new Student[] {
			new Student(1, "홍길동"),	
			new Student(2, "신사임당"),	
			new Student(3, "이순신"),	
		};
		
		// 요소추가 (공간부족) 
		Student[] arr2 = new Student[100]; // 사용하지 메모리 공간이 생겨 효율성이 떨어짐.
		System.arraycopy(arr, 0, arr2, 0, arr.length);		
		
		arr2[3] = new Student(4, "세종대왕");
		arr2[4] = new Student(5, "유관순");
		
		// 중간에 요소제거 
//		arr2[2] = null; // 중간에 요소가 비어있게 되므로 실패!
		arr2[2] = arr2[3];
		arr2[3] = arr2[4];
		arr2[4] = null;
		
		// 중간에 요소추가
//		arr2[0] = new Student(100, "이효리"); // 0번지요소 대체하는 것이므로 실패!
		arr2[4] = arr2[3];
		arr2[3] = arr2[2];
		arr2[2] = arr2[1];
		arr2[1] = arr2[0];
		arr2[0] = new Student(100, "이효리");
		
		System.out.println(Arrays.toString(arr2));
		
	}

}
