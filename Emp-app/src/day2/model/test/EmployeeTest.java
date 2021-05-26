package day2.model.test;

import day2.Employee;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee1 = new Employee(210, "nithin");
		System.out.println(employee1);

		Employee employee2 = new Employee(212, "Vinyl");
		System.out.println(employee2);

		if (employee1.equals(employee2)) {
			System.out.println("equal");
		} else {
			System.out.println("unequal");
		}

		Employee[] employees = new Employee[2];
		employees[0] = employee1;
		employees[1] = employee2;
		System.out.println(employees[0]);
		System.out.println(employees[1]);
		for (Employee emp : employees) {
			System.out.println(emp);
			System.out.println(emp.getName());
		}

	}
}