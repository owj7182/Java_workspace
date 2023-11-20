package ncs.test10;

import java.text.DecimalFormat;

import ncs.test10.Employee;

public class Company {

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secreatary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);
		
		
		System.out.println("name\t" + "department\t" + "salary\t");
		System.out.println("----------------------------------");
		for (int i = 0; i < employees.length; i++) {
			System.out.print(employees[i].getName() + "\t");
			System.out.print(employees[i].getDepartment() + "    \t");
			System.out.print(employees[i].getSalary() + "\n");
			
		}
		for(Employee employee : employees) {
			employee.incentive(100);
		}
		
		System.out.println();
		System.out.println("인센티브 100지급");
		System.out.println("name\t" + "department\t" + "salary\t" + "tax\t");
		
		DecimalFormat df = new DecimalFormat("#.0");
		for (int i = 0; i < employees.length; i++) {
			double tax = employees[i].tax();
			System.out.print(employees[i].getName() + "\t");
			System.out.print(employees[i].getDepartment() + "    \t");
			System.out.print(employees[i].getSalary() + "\t");
			System.out.println(df.format(tax));
		}
	}
}
