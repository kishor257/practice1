package DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySqlReadData {

	Connection connect = null;
	Statement stmt;

	// Database URL.
	// "kishor" Is database name. You can change It as per your database name.
	String sqldb_url = "jdbc:mysql://localhost:3306/kishor";

	// Use your database username here. It Is "root" for root account.
	String sqldb_uname = "root";

	// Use your database password here which we have set during configuration step.
	String sqldb_pass = "kishor123";

	@BeforeTest
	public void setUp() throws Exception {
		try {
			String dbClass = "com.mysql.jdbc.Driver";
			Class.forName(dbClass).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void printTableData() {
		PreparedStatement pstmt = null;
		try {
			// To Create database connection.
			connect = DriverManager.getConnection(sqldb_url, sqldb_uname, sqldb_pass);

			stmt = connect.createStatement();

			// Printing all records of user table
			String query = "select * from user";
			// Get the contents of user table from DB
			ResultSet res = stmt.executeQuery(query);
			// Print the result untill all the records are printed res.next() returns true if there is any next record else returns false.
			while (res.next()) {
				System.out.println(String.format("%s - %s - %s - %s ",
						res.getString(1), res.getString(2), res.getString(3),
						res.getString(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void tearDown() throws Exception {
		// Close database connection.
		if (connect != null) {
			connect.close();
		}
	}
}