package com.sh.oop.student.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private int stdtNo;
	private String name;
	private int mark;
	
	public Student() {}

	public Student(int grade, int classroom, int stdtNo, String name, int mark) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.stdtNo = stdtNo;
		this.name = name;
		this.mark = mark;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getStdtNo() {
		return stdtNo;
	}

	public void setStdtNo(int stdtNo) {
		this.stdtNo = stdtNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	
	public String information() {
		return "Student [grade=" + grade + ", classroom=" + classroom + ", stdtNo=" + stdtNo + ", name=" + name
				+ ", mark=" + mark + "]";
	}
	
	

}
