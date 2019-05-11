package DBTestPrateek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) throws Exception{

		Connection conn= null;
		Statement stmt=null;
		ResultSet rset=null;

			Class.forName("com.mysql.jdbc.Driver");
		
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/galaxy", "root", "kishor123");
			
			stmt=conn.createStatement();
			
			rset=stmt.executeQuery("select * from emp where job='CLERK'");
		
			while (rset.next()) {
				System.out.println(rset.getString(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4)+"\t"+rset.getString(5)+"\t"+rset.getString(6)+"\t"+rset.getString(7)+"\t"+rset.getString(8));
			}
			if (rset!=null) {
				try {
					rset.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
}
