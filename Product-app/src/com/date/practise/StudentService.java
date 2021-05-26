package com.date.practise;

import java.util.Set;

public interface StudentService {
	Set<Student> findAll();

	Student findById(int id) throws StudentNotFoundException;

	void save(Student student);

	void update(Student student) throws StudentNotFoundException;

	void delete(int id) throws StudentNotFoundException;

}