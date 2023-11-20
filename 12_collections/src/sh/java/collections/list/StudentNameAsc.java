package sh.java.collections.list;

import java.util.Comparator;

import sh.java.collections.student.vo.Student;

public class StudentNameAsc implements Comparator<Student> {

	/**
	 * 기타정렬
	 * - Student#name 기준 오름차순
	 */
	@Override
	public int compare(Student o1, Student o2) {
		// String#compareTo메소드를 이용해서 int를 반환
		return o1.getName().compareTo(o2.getName());
	}

}
