package com.date.practise;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class StudentServiceImpl implements StudentService {
	private static Connection con;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	private static Set<Student> studentSet;

	public StudentServiceImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public Set<Student> findAll() {
		System.out.println(con);
		try {
			pstmt = con.prepareStatement("select * from student");
			rs = pstmt.executeQuery();
			studentSet = new HashSet<>();
			while (rs.next()) {
				Student student = new Student(rs.getInt("id"), rs.getDate("dateofbirth").toLocalDate());
				studentSet.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentSet;
	}

	@Override
	public Student findById(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Student student) {
		try {
			pstmt = con.prepareCall("insert into student values(?, ?)");
			pstmt.setInt(1, student.getId());
			pstmt.setDate(2, Date.valueOf(student.getDateOfBirth()));
			int records = pstmt.executeUpdate();
			System.out.println(records+"record inserted in DB");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student student) throws StudentNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws StudentNotFoundException {
		// TODO Auto-generated method stub

	}

}
