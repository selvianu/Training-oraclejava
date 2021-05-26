package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Util.getConnection();
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException

	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		System.out.println(" connection:  " + connection);
		return connection;

	}

}
