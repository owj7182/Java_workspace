package ncs.test10;

public class Secreatary extends Employee implements Bonus{

	public Secreatary() {
		super();
	}

	public Secreatary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	public double tax() {
		return salary * 0.1;
	}
	
	public void incentive(int pay) {
		int bonusAmount = (int)(pay * 0.8);
		setSalary(salary + bonusAmount);
		
	}
	
}
