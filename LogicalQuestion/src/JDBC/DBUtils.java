package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;

	public static Connection openConnection( ) throws SQLException {
		//1 load the driver
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dbURL = "jdbc:mysql://localhost:3306/jdbc?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		
		cn=DriverManager.getConnection(dbURL,"root","root123");
		
		System.out.println("Connection get Created");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return cn;
  }
}
