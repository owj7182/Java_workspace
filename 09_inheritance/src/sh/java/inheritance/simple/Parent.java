package sh.java.inheritance.simple;

public class Parent extends Object {
	String name;
	int age;
	
	public void hello() {
		System.out.println("내가 애비다~");
	}
	
	public String info() { 
		return this.name + ", " + this.age;
	}
}
