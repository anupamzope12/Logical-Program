package JDBCRevision;
import static JDBC.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class CreateTable {
public static void main(String[] args) {
	try {
		Connection cn=openConnection();
		String q="create table table2 ( tId int primary key auto_increment, tName varchar(20) not null,tcity varchar(20))";
		Statement stmt=cn.createStatement();
		stmt.executeUpdate(q);
		System.out.println("table created..........");
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
