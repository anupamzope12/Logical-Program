package JDBCRevision;
import static JDBC.DBUtils.openConnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateTable {
public static void main(String[] args) {
	try {
		Connection cn=openConnection();
		String q="update table2 set tName=? , tCity=? where tId=?";
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the new name");
		String name=br.readLine();
		System.out.println("Enter the new City");
		String city=br.readLine();
		
		System.out.println("Enter the StudentId");
		int id=Integer.parseInt(br.readLine());
		
		PreparedStatement psmt=cn.prepareStatement(q);
		
		psmt.setString(1, name);
		psmt.setString(2, city);
		psmt.setInt(3, id);

		psmt.executeUpdate();
		System.out.println("Data updated successfully");
		cn.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
