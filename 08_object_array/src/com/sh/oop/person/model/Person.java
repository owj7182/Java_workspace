package com.sh.oop.person.model;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private int money;
	
	public Person() {}
	
	public Person(String name, int age, double height, double weight, int money) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	
	public String information() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", money="
				+ money + "]";
	}

	
	
	
}
