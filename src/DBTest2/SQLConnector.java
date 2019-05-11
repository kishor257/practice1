package DBTest2;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLConnector {

	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
		String dbUrl = "jdbc:mysql://localhost:3306/kishor";					

		//Database Username		
		String username = "root";	

		//Database Password		
		String password = "kishor123";				

		//Query to Execute		
		String query = "select * from user;";	

		//Load mysql jdbc driver		
		Class.forName("com.mysql.jdbc.Driver");			

		//Create Connection to DB		
		Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
		Statement stmt = con.createStatement();		

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
		while (rs.next()){
			String id = rs.getString(1);								        
			String name = rs.getString(2);
			String city = rs.getString(3);
			String age= rs.getString(4);
			System. out.println(id+"  "+name+"  "+city+"  "+age);		
		}		
		// closing DB Connection		
		con.close();			
	}
}
