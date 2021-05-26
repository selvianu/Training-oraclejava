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

		case 2:
			System.out.println("Find the Product By Id");
			System.out.println("Enter the Product Id");
			id = scanner.nextInt();
			try {
				Student student = service.findById(id);
				System.out.println(student);
			} catch (StudentNotFoundException e) {
			}
			break;

		case 3:
			System.out.println("Update the student DOB Based on the Id");

			System.out.println("enter id");
			id = scanner.nextInt();
			System.out.println("enter DOB");
			date = scanner.next();
			// date = "06/05/2021";
			dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			Student newStudent = new Student(id, LocalDate.parse(date, dateFormat));
			dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			Student updateStudent = new Student(id, LocalDate.parse(date, dateFormat));

			try {
				service.update(updateStudent);
				studentSet = service.findAll();
				System.out.println(studentSet);
			} catch (StudentNotFoundException e) {

			}
			break;

		case 4:
			System.out.println("Adding a student");
			System.out.println("enter id");
			id = scanner.nextInt();
			System.out.println("enter DOB");
			date = scanner.next();
			// date = "06/05/2021";
			dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
			Student newStudent1 = new Student(id, LocalDate.parse(date, dateFormat));
			service.save(newStudent1);
			studentSet = service.findAll();
			System.out.println(studentSet);
			break;

		/*
		 * case 5: System.out.println("Deleting a Product");
		 * System.out.println("Enter the Product Id"); id = scanner.nextInt(); try {
		 * service.delete(id); studentSet = service.findAll();
		 * System.out.println(studentSet); } catch (StudentNotFoundException e) { }
		 */
		default:
			break;
		}
		scanner.close();
	}

}
