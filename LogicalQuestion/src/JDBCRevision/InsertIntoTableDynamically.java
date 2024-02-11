package JDBCRevision;

import static JDBC.DBUtils.openConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoTableDynamically {
public static void main(String[] args) throws IOException {
	try {
		Connection cn=openConnection();
		String q="Insert into table2 (tName,tCity) values(?,?)";
		PreparedStatement pstmt=cn.prepareStatement(q);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name : ");
		String name=br.readLine();
		System.out.println("Enter the city : ");
		String city=br.readLine();
		
		pstmt.setString(1, name);
		pstmt.setString(2, city);
		
		pstmt.executeUpdate();
		System.out.println("inserted...........");
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
