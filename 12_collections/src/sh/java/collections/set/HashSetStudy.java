package sh.java.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sh.java.collections.student.vo.Student;

/**
 * <pre>
 * Set
 * - 집합을 의미. 중복을 허용하지 않는 자료구조.
 * - 저장한 순서를 보장하지 않음.
 * - 커스텀클래스인 경우 equals/hashCode override 필수
 * 
 * 구현클래스
 * - HashSet
 * - LinkedHashSet : 저장한 순서를 유지
 * - TreeSet : 기본정렬을 지원
 *  
 * 2023-10-06
 * 
 */
public class HashSetStudy {

	public static void main(String[] args) {
		HashSetStudy study = new HashSetStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
		study.test8();
	}

	
	/**
	 * 1 ~ 45사이의 중복없는 난수 6개를 뽑아서 오름차순 정렬
	 */
	private void test8() {
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) 
			lotto.add((int) (Math.random() * 45) + 1);
		System.out.println(lotto);
	}



	/**
	 * abc, ABC, xyz, Java, code, happy, dinner, good, java, XYZ
	 * - 위 데이터를 모두 대문자로 변환해서 Set자료구조로 관리
	 * 
	 */
	private void test7() {
		String data = "abc, ABC, xyz, Java, code, happy, dinner, good, java, XYZ";
		String[] arr = data.split(", ");
		System.out.println(Arrays.toString(arr));
		
		Set<String> set = new HashSet<>();
		for(String str : arr) {
			set.add(str.toUpperCase());
		}
		System.out.println(set);
	}

	/**
	 * <pre>
	 * - LinkedHashSet 중복제거. 저장한순서유지(인덱스기반 접근 x)
	 * - TreeSet 중복제거. 기본정렬지원
	 */
	private void test6() {
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(5);
		set1.add(4);
		set1.add(1);
		System.out.println(set1);
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(5);
		set2.add(4);
		set2.add(1);
		System.out.println(set2);
	}

	/**
	 * 학생데이터 처리 : 다음데이터에서 중복을 제거하고, 번호순 정렬해서 출력
	 * 
	 * - 1, 홍길동
	 * - 100, 신사임당
	 * - 35, 이순신
	 * - 100, 신사임당
	 * - 55, 유관순
	 */
	private void test5() {
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(1, "홍길동"));
		studentSet.add(new Student(100, "신사임당"));
		studentSet.add(new Student(35, "이순신"));
		studentSet.add(new Student(100, "신사임당"));
		studentSet.add(new Student(55, "유관순"));
		
		System.out.println(studentSet);
		System.out.println(studentSet.size());
		
		List<Student> studentList = new ArrayList<>(studentSet);
		studentList.sort(null);
		
		Iterator<Student> iter = studentList.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}
	

	/**
	 * List -> Set
	 * - 중복 제거 
	 * 
	 * Set -> List
	 * - 순서가 필요할때. 정렬
	 */
	private void test4() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(3);
		System.out.println(list);
		
		// Set으로 변환
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set); // 중복 제거
		
		// List로 변환
		List<Integer> list2 = new ArrayList<>(set);
		System.out.println(list2); // 순서기반 접근 가능
	}

	/**
	 * 요소 순회
	 * - 하나의 요소만 가져오기 기능이 없고, 전체를 열람할 수 있다.
	 * 
	 * 1. for each문
	 * 2. iterator
	 */
	private void test3() {
		Set<Integer> nums = new HashSet<>();
		nums.add(20);
		nums.add(10);
		nums.add(55);
		nums.add(77);
		
		// for each문
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		// iterator
		Iterator<Integer> iter = nums.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num);
		}
		
		System.out.println(nums);
	}

	/**
	 * Set API
	 */
	private void test2() {
		Set<String> set = new HashSet<>();
		
		// 요소추가 - 중복저장 안됨. 저장한 순서 유지 안함.
		set.add("abc");
		set.add("짬뽕");
		set.add("떡뽁이");
		set.add("Hello");
		set.add("ㅋㅋㅋ");
		set.add("ㅋㅋㅋ");
		set.add("ㅋㅋㅋ");
		set.add("ㅋㅋㅋ");
		
		// 삭제 - equals/hashCode기반으로 요소를 찾아 삭제
		System.out.println(set.remove("abc")); // true
		System.out.println(set.remove("ㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ")); // false
		
		// 요소 개수
		System.out.println(set.size());
		
		// 포함여부
		System.out.println(set.contains("ㅋㅋㅋ")); // true
		System.out.println(set.contains("xxxx")); // false
		
		// toString
		System.out.println(set);
	}

	/**
	 * 다형성 적용
	 * 제네릭 적용
	 */
	private void test1() {
		HashSet<Integer> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Collection<Double> set3 = new HashSet<>();
		
		set2.add("hello");
		set2.add("world");
		set2.add("byebye");
		set2.add("world");
		
		// set2.get(0); // 순서가 없으니 인덱스 없다.
		
		System.out.println(set2);
	}

}
