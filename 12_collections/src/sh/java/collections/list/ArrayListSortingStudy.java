package sh.java.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sh.java.collections.student.vo.Student;

/**
 * <pre>
 * 객체정렬
 * 1. Comparable인터페이스 구현방식 : 객체의 기본정렬. 해당클래스에서 직접 구현. compareTo 오버라이드
 * 2. Comparator인터페이스 구현방식 : 객체의 기본정렬외. 별도의 클래스를 작성. compare 오버라이드
 * 
 * 2023-10-05
 *
 */
public class ArrayListSortingStudy {

	public static void main(String[] args) {
		ArrayListSortingStudy study = new ArrayListSortingStudy();
//		study.test1();
		study.test2();
	}

	/**
	 * Student
	 * - no:int
	 * - name:String
	 * 
	 */
	private void test2() {
		List<Student> list = new ArrayList<>();
		list.add(new Student(30, "홍길동"));
		list.add(new Student(99, "신사임당"));
		list.add(new Student(5, "강감찬"));
		
//		list.sort(null); // 기본정렬 - no 오름차순 Comparable#compareTo
//		list.sort(Collections.reverseOrder()); // 기타정렬 - no 내림차순 Comparator#compare
//		list.sort(new StudentNameAsc());// 기타정렬 - name 오름차순 Comparator#compare
		list.sort(Collections.reverseOrder(new StudentNameAsc()));// 기타정렬 - name 내림차순 Comparator#compare
		
		System.out.println(list);
	}

	/**
	 * String, Integer 정렬
	 */
	private void test1() {
		List<String> strList = new ArrayList<>();
		strList.add("홍길동");
		strList.add("논개");
		strList.add("강감찬");
		strList.add("동방신기");
		
		// String클래스의 기본정렬(가나다순)
//		Collections.sort(strList);
//		strList.sort(null);
		
		// 기타정렬(가나다역순) - Comparator구현체(Collections.reverseOrder()) 사용
//		Collections.sort(strList, Collections.reverseOrder());
		strList.sort(Collections.reverseOrder());
		
		System.out.println(strList);
		
		
		List<Integer> intList = new ArrayList<>();
		intList.add(30);
		intList.add(20);
		intList.add(50);
		intList.add(10);
		intList.add(40);
		
		intList.sort(null); // 기본정렬
//		intList.sort(Collections.reverseOrder()); // 기타정렬
		
		
		System.out.println(intList);
	}

}
