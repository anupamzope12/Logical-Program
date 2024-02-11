package JDBC;
import static JDBC.DBUtils.openConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertIntoTableDynamically {
public static void main(String[] args) {
	try {
		Connection cn=openConnection();
		//Create a querry
		String q="insert into table1 (tName,tCity) values(?,?)";
		//get the PreparedStatement object
		PreparedStatement psmt=cn.prepareStatement(q);
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name : ");
		String name=br.readLine();

		
		System.out.println("Enter city : ");
		String city=br.readLine();
		
		//set the values to querry
		psmt.setString(1, name);
		psmt.setString(2,city);
		
		psmt.executeUpdate();
		System.out.println("inserted...");
		cn.close(); 
	}catch (Exception e) {
		e.printStackTrace();
	}
  }
}