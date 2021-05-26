package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws Exception {
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("classname");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		System.out.println(" connection..:  " + connection);
		return connection;
	}
}
