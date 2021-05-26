package day1.test;

import day1.EmpArr;
import day1.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		EmpArr e1 = new EmpArr();
		e.setId(10);
		e.setName("selvi");
		e.setAge(18);
		// System.out.println(e.getId() + e.getName() + e.getAge());
		e.toString();
		System.out.println();
	}
}
