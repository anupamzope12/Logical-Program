package JDBC;
import static JDBC.DBUtils.openConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertIntoTable1 {
public static void main(String[] args) {
	try {
		Connection cn=openConnection();
		//Create a querry
		String q="insert into table1 (tName,tCity) values(?,?)";
		//get the PreparedStatement object
		PreparedStatement psmt=cn.prepareStatement(q);

		psmt.setString(1, "Nitin");
		psmt.setString(2,"Sambhaji Nagar");
		
		psmt.executeUpdate();
		System.out.println("inserted...");
		cn.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
  }
}