package ncs.test10;

public class Sales extends Employee implements Bonus{

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public double tax() {
		return salary * 0.13;
	}
	
	public void incentive(int pay) {
		int bonusAmount = (int)(pay * 1.2);
		setSalary(salary + bonusAmount);
	}
}
