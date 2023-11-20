package com.sh.oop.coffee.run;

import com.sh.oop.coffee.manager.CoffeeManager;

import com.sh.oop.coffee.model.dto.Coffee;

public class Run {
	
	public static void main(String[] args) {
		
		CoffeeManager coffee1 = new CoffeeManager();
		coffee1.inputCoffee();
		coffee1.printCoffee();
		
	}

}
