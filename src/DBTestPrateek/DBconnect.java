package DBTestPrateek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kishor", "root", "kishor123");
		Statement stmt = conn.createStatement();
		ResultSet exec = stmt.executeQuery("select city from user where name='sanjeeth'");
		while (exec.next()) {
			System.out.println(exec.getString(1));
		}
		
	}

}
