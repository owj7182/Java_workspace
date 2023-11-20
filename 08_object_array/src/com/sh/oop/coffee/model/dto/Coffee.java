package com.sh.oop.coffee.model.dto;

public class Coffee {
	
	private String origion;
	private String coffeeName;
	
	public Coffee() {}

	public Coffee(String origion, String coffeeName) {
		this.origion = origion;
		this.coffeeName = coffeeName;
	}

	public String getOrigion() {
		return origion;
	}

	public void setOrigion(String origion) {
		this.origion = origion;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	
	
	

}
