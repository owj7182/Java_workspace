package com.sh.oop.student.run;

import com.sh.oop.student.controllor.StudentControllor;


public class Run {

	public static void main(String[] args) {

		Run test = new Run();
		test.test1();
		
	}
	
	public void test1() {
		StudentControllor sc = new StudentControllor();
		sc.insertStudent();
		sc.printStdt();
		sc.printAvg();
		
		
	}

}