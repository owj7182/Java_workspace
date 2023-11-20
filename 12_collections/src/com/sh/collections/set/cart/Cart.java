package com.sh.collections.set.cart;

import java.util.Objects;

public class Cart {
	private String name;
	private int count;
	
	public Cart() {
		super();
	}

	public Cart(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getCount() {
		return count;
	}

	void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return name + " - " + count  + "개";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	

}
