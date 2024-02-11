package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public static Connection con;
	
	public static Connection getConnection() {
		try {
			if(con==null) {
//				Class.forName("com.mysql.cj.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String dbURL = "jdbc:mysql://localhost:3306/jdbc?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
				con=DriverManager.getConnection(dbURL,"root","root123");

//				cn=DriverManager.getConnection(dbURL,"root","root123");
				
				System.out.println("Connection get Created");
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}

}
