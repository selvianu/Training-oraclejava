package day2.exception;
public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException(String message) {
		System.out.println(message);
	}
}