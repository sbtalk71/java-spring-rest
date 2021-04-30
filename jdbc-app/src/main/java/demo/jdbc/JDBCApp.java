package demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApp {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		//Load the driver
		Class.forName("org.mariadb.jdbc.Driver");
		
		//get the connection
		Connection conn= DriverManager.getConnection("jdbc:mariadb://localhost:3306/springdb", "root", "root");
		
		//Statement stmt=conn.createStatement();
		PreparedStatement pst = conn.prepareStatement("select * from emp");
		//System.out.println(stmt.getClass().getName());
		
		ResultSet rs= pst.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
		}

		conn.close();
	}

}
