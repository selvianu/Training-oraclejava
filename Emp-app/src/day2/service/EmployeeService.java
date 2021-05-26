package day2.service;

import java.util.Set;

import day2.Employee;
import day2.exception.EmployeeNotFoundException;

public interface EmployeeService {
	Set<Employee> findAll();

	Employee findById(int id) throws EmployeeNotFoundException;

	// TODO
	void save(Employee employee);

	void update(Employee employee) throws EmployeeNotFoundException;

	// TODO
	void delete(int id);

}