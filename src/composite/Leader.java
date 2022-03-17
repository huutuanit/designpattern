package composite;

import java.util.ArrayList;

public class Leader extends Employee {

	private ArrayList<Employee> arraylistEmployee = new ArrayList<Employee>();

	public Leader(int age, String name, double salary) {
		super(age, name, salary);
	}

	@Override
	public void add(Employee employee) {
		arraylistEmployee.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		arraylistEmployee.remove(employee);
	}

	@Override
	public void print() {
		System.out.println("========================");
		System.out.println("Age: " + this.age);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		for (Employee employee : arraylistEmployee) {
			employee.print();
		}
	}

}
