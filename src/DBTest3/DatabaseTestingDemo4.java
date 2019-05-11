package DBTest3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatabaseTestingDemo4 {

	// Connection object
	static Connection con = null;

	// Statement object
	private static Statement stmt;

	// Constant for Database URL
	public static String DB_URL = "jdbc:mysql://localhost:3306/kishor";   

	// Constant for Database Username
	public static String DB_USER = "root";

	// Constant for Database Password

	public static String DB_PASSWORD = "kishor123";


	@BeforeMethod
	public void setUp() throws Exception {

		try{

			// Make the database connection

			String dbClass = "com.mysql.jdbc.Driver";

			Class.forName(dbClass).newInstance();

			// Get connection to DB

			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// Statement object to send the SQL statement to the Database

			stmt = con.createStatement();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try{
			String query = "select id from user";

			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);

			// Print the result untill all the records are printed
			// res.next() returns true if there is any next record else returns false
			while (res.next())
			{
				System.out.println(res.getString(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}     
	}
	@AfterMethod
	public void tearDown() throws Exception {

		// Close DB connection
		if (con != null) {
			con.close();
		}
	}
}
