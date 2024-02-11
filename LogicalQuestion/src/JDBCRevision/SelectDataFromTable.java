package JDBCRevision;
import static JDBC.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectDataFromTable {
public static void main(String[] args) {
	try {
		Connection cn=openConnection();
		String q="select * from table2";
		Statement stmt=cn.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String city=set.getString(3);
			System.out.println("Id : "+id+" Name : " + name + " City : " + city);
		}
		cn.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
