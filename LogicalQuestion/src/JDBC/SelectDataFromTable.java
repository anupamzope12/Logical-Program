package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDataFromTable {
	public static void main(String[] args) {
		try {
			Connection cn=ConnectionProvider.getConnection();
			String query="Select * from table1";
			Statement stmt=cn.createStatement();
			ResultSet set=stmt.executeQuery(query);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String city=set.getString(3);
				System.out.println("Name : "+ name +"  Id : "+ id +"  City : "+ city);
			}
			cn.close();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
