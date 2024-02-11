 package JDBC;

import java.sql.Connection;
import java.sql.Statement;
import static JDBC.DBUtils.openConnection;

public class CreateTable {
	
public static void main(String[] args)  {
	
	try{
		Connection cn=openConnection();
	
		String q="create table table1(tId int(20) primary key auto_increment,tname varchar(20) not null,tCity varchar(20))";
	
		Statement stmt=cn.createStatement();
	
		stmt.executeUpdate(q);
	
		System.out.println("table created in database..");
		
		cn.close();

		}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	
		}finally {
			System.out.println("in finally block");
		}	
	
	}
}