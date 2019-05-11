package DBTest4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.testng.annotations.Test;


public class InsertToDB {
	@Test
	public void InsertToDB() {
	try {
		 // create a mysql Database connection
		 String myUrl = "jdbc:mysql://localhost:3306/kishor";
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn = DriverManager.getConnection(myUrl, "root", "kishor123");
		 
		 // the mysql insert statement
		 String query = " Insert into user (id, name , city, age) values(?,?,?,?)";
		 
		 // create the mysql insert preparedstatement
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 preparedStmt.setString(1, "7");
		 preparedStmt.setString(2, "lobita");
		 preparedStmt.setString(3, "chennai");
		 preparedStmt.setString(4, "18");
		 
		 // execute the preparedstatement
		 preparedStmt.execute();
		 conn.close();
		 } catch (Exception e) {
		 System.out.println("Got an exception!");
		 System.out.println(e.getMessage());
		 }
	}
}
