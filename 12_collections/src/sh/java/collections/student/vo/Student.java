package sh.java.collections.student.vo;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private int no; // 고유식별 필드
	private String name;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}

	/**
	 * List#sort메소드에 의해 호출되는 메소드
	 * - 기본정렬만 지원 (no필드 오름차순)
	 * 
	 * 반환값
	 * - 음수 : this.no < other.no -> 자리교환
	 * - 0 : this.no == other.no
	 * - 양수 : this.no > other.no
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Student other) {
		return this.no - other.no;
	}
	
	
}
