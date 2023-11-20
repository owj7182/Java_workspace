package com.sh.oop.student.controllor;

import java.util.Arrays;
import java.util.Scanner;

import com.sh.oop.student.model.vo.Student;


public class StudentControllor {

	Scanner sc  = new Scanner(System.in);

	static int count = 0;
	
	public static final int MAX_STUDENT = 10;
	Student[] students = new Student[MAX_STUDENT];
	
	public void insertStudent(){
		
		while(true) {
			System.out.print("학생정보를 추가하시겠습니까? (Y/N)");
			char yn = sc.next().charAt(0);
			if(yn != 'y'){
				if(count == 0) {
					System.out.println("학생정보가 존재하지 않습니다.");
					break;
				}
				break;
			}
			
			System.out.print("등급을 입력하십시오. : ");
			int grade = sc.nextInt();
			System.out.print("반을 입력하십시오. : ");
			int classroom = sc.nextInt();
			System.out.print("학번을 입력하십시오. : ");
			int stdNo = sc.nextInt();
			System.out.print("이름을 입력하십시오. : ");
			String name = sc.next();
			System.out.print("점수를 입력하십시오. : ");
			int mark = sc.nextInt();		
			
			
			students[count] = new Student(grade, classroom, stdNo, name, mark);
			count++;
		}
		
	}
	
	public void printAvg() {
		if(count == 0) {
			System.out.println("학생정보가 존재하지 않습니다.");
			return;
		}
		double avgMark = 0;
		double sumMark = 0;
		for(int i = 0; i < count; i++) {
			sumMark += students[i].getMark();
		}
		avgMark = sumMark/count;
		System.out.printf("현재 입력된 학생들의 점수의 평균은 : %.1f입니다.", avgMark);
	}


	public void printStdt() {
		if(count == 0) {
			System.out.println("학생정보가 존재하지 않습니다.");
			return;
		}	
		for(int i = 0; i < count; i++) {
			System.out.printf("%d번째 학생의 정보는 : %s", i, students[i].information());
		
		}
	
	}


}