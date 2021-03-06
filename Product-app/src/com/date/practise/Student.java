package com.date.practise;

import java.time.LocalDate;

public class Student {

	public Student() {

	}

	public Student(int id, LocalDate dateofbirth) {
		this.id = id;
		this.dateOfBirth = dateofbirth;
	}

	private int id;
	private LocalDate dateOfBirth;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String toString() {
	return id+"  "+dateOfBirth;
	}
}
