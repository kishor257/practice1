package seleniumProg;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	Connection con;
	
	public DBConnection()
	{
		try {
			//load and register the class
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("class loaded successfully");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
	}
	public Connection setConnection(){
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost", "scott", "tiger");
			System.out.println("connection established");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return con;
	}
	public static void main(String[] args) {
		
		DBConnection dbcon=new DBConnection();
		dbcon.setConnection();
	}
}
