package day2.model.test;

import java.util.Set;

import day2.Employee;
import day2.EmployeeRepository;
import day2.EmployeeRepositoryImpl;

public class EmployeeRepositoryTest {
	public static void main(String[] args) {
		// Car car = new SportsCar();
		System.out.println("Find All Employees");
		EmployeeRepository repository = new EmployeeRepositoryImpl();
		Set<Employee> resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Find By Id");
		int id = 103;
		Employee resultEmployee = repository.findById(id);
		System.out.println(resultEmployee);

		System.out.println("Adding an employee");
		Employee newEmployee = new Employee(104, "Roopa");
		repository.save(newEmployee);
		resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Updating an employee");
		Employee updateEmployee = new Employee(104, "RoopaR");
		repository.update(updateEmployee);
		resultSet = repository.findAll();
		System.out.println(resultSet);

		System.out.println("Delete By Id");
		id = 103;
		repository.delete(id);
		resultSet = repository.findAll();
		System.out.println(resultSet);

	}
}