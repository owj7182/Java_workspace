package com.sh.oop.person.controller;



import java.util.Scanner;

import com.sh.oop.person.model.Person;

public class PersonController {
	
	Person[] persons = new Person[5];
	Scanner sc = new Scanner(System.in);
	
	public void inputInfo() {
		
		for (int i = 0; i < persons.length; i++) {
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			System.out.print("나이를 입력하세요 : ");
			int age = sc.nextInt();
			System.out.print("키를 입력하세요 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게를 입력하세요 : ");
			double weight = sc.nextDouble();
			System.out.print("재산을 입력하세요 : ");
			int money = sc.nextInt();
			
			persons[i] = new Person(name, age, height, weight, money);
		}
	}
	
	public void printAverage() {
		
		double sumAge = 0;
		double sumHeight = 0;
		double sumWeight = 0;
		double sumProperty = 0;
		
		for(int i = 0; i < persons.length; i++) {
			
			sumAge += persons[i].getAge();
			sumHeight += persons[i].getHeight();
			sumWeight += persons[i].getWeight();
			sumProperty += persons[i].getMoney();
			
		}
		
		double avgAge = sumAge / persons.length;
		double avgHeight = sumHeight / persons.length;
		double avgWeight = sumWeight / persons.length;
		double avgProperty = sumProperty / persons.length;
		
		System.out.printf("평균 나이: %.1f, 평균 키 : %.1f, 평균 몸무게 : %.1f, 평균 재산 : %.1f", avgAge, avgHeight, avgWeight,
				avgProperty);
		
	}
	

		
	
	
}
