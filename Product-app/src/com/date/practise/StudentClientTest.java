package com.date.practise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

public class StudentClientTest {
	public static void main(String[] args) {

		Set<Student> studentSet;
		StudentServiceImpl service = new StudentServiceImpl();
		String date;
		DateTimeFormatter dateFormat;
		int id;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Find All Products");
			studentSet = service.findAll();
			System.out.println(studentSet);
			break;
		/*
		 * case 2: System.out.println("Find the Product By Id");
		 * System.out.println("Enter the Product Id"); id = scanner.nextInt(); try {
		 * Product product = service.findById(id); System.out.println(product); } catch
		 * (ProductNotFoundException e) { } break; case 3:
		 * System.out.println("Update the Product Name Based on the Id"); date =
		 * "06/05/2019"; dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy"); Product
		 * updateProduct = new Product(3, "noodles", LocalDate.parse(date, dateFormat));
		 * try { service.update(updateProduct); productSet = service.findAll();
		 * System.out.println(productSet); } catch (ProductNotFoundException e) {
		 * 
		 * } break;
		 */

		case 4:
			System.out.println("Adding a student");
			System.out.println("enter id");
			id=scanner.nextInt();
			System.out.println("enter DOB");
			date=scanner.next();
		//	date = "06/05/2021";
			dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		Student newStudent = new Student(id,LocalDate.parse(date, dateFormat));
			service.save(newStudent);
			studentSet = service.findAll();
			System.out.println(studentSet);
			break;

		/*
		 * case 5: System.out.println("Deleting a Product");
		 * System.out.println("Enter the Product Id"); id = scanner.nextInt(); try {
		 * service.delete(id); productSet = service.findAll();
		 * System.out.println(productSet); } catch (ProductNotFoundException e) { }
		 * default: break; } scanner.close(); }
		 */

		}
	}
}