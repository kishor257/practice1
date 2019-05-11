package programmingPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class TestDb {

	@Test
	public void TestVerifyDB() throws SQLException{
		// This will load the driver
		try {
			Class.forName("sun.jdbc.odbc.OracleDriver");
			System.out.println("Driver Loaded");

			// This will connect with Database , getConnection taking three argument
			//  first argument Test_Oracle is the dsn which you can change as per your system,
			// second argument is username and third argument is password
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
			System.out.println("Connection created");

			// This will create statement  
			Statement smt=con.createStatement();

			System.out.println("Statement created");

			// Now execute the query, here facebook is the table which I have created in DB 

			ResultSet rs=  smt.executeQuery("Select * from Facebook");

			System.out.println("Query Executed");

			// Iterate the resultset now

			while(rs.next()){

				String uname=    rs.getString("username");
				String pass=    rs.getString("password");
				String email=    rs.getString("email");

				System.out.println("Uname is "+uname+" password is "+pass+" email id is "+email);

			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} 
}

