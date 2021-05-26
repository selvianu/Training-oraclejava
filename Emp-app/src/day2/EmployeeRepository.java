package day2;

import java.util.Set;

public interface EmployeeRepository {

	Set<Employee> findAll();

	Employee findById(int id);

	void save(Employee employee);

	void update(Employee employee);

	void delete(int id);

}