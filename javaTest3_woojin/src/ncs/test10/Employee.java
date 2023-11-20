package ncs.test10;

public abstract class Employee implements Bonus {
	
	private String name;
	private int number;
	private String department;
	protected int salary;

	public Employee() {
		super();
	}

	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public abstract double tax(); 

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int newSalary) {
		this.salary = newSalary;
	}

}
