package ncs_javaTest2.com.kh.test.model.vo;

import java.util.Objects;

public class Fruit {
	
	private String name;
	private String color;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
	}
	
	
	
}
