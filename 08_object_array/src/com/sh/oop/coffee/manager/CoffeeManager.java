package com.sh.oop.coffee.manager;

import java.util.Scanner;

import com.sh.oop.coffee.model.dto.Coffee;

import sh.java.object.array.student.Student;

public class CoffeeManager {
	
	private Scanner sc = new Scanner(System.in);
	public static final int MAX_COFFEE = 3;
	private Coffee[] coffee = new Coffee[MAX_COFFEE];
	private int coffeeIndex = 0;
	
	
	
	public void inputCoffee() {
		System.out.println("> 커피 정보를 입력하세요(세계 3대 커피 : )");
		
		for(int i = 0; i < MAX_COFFEE; i++) {
			System.out.print("원산지를 입력하세요.");
			String origion = sc.next();
			System.out.print("커피명을 입력하십시오");
			String coffeeName = sc.next();
			
			coffee[coffeeIndex++] = new Coffee(origion, coffeeName);
		}
	}
	

	public void printCoffee() {
		System.out.println("세계 3대 커피");
		for(int i = 0; i < coffeeIndex; i++) {
			System.out.print(coffee[i].getOrigion() + "  ");
			System.out.println(coffee[i].getCoffeeName());
			
		}
	}	

}
