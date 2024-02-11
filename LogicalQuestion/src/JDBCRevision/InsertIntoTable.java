package JDBCRevision;
import static JDBC.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertIntoTable {
	public static void main(String[] args) {
		try {
			Connection cn=openConnection();
			String q="insert into table2 (tName,tCity)values(?,?)";
			PreparedStatement pstmt=cn.prepareStatement(q);
			pstmt.setString(1, "Anupam");
			pstmt.setString(2, "Bhusawal");
			pstmt.executeUpdate();
			cn.close();
			System.out.println("data added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
