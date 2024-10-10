package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;


public class PreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String userdata="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TargetHigh", "root", "root");
		String sqlQuery = "SELECT * FROM JDBCCON WHERE ID = ?";
		java.sql.PreparedStatement preparedStatement = con.prepareStatement(sqlQuery);
		preparedStatement.setString(1, "1");
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()) {
	    	userdata = rs.getInt(1)+" : "+rs.getString(2);
	        System.out.println(userdata); 
	   
	    }
        preparedStatement.close();
        con.close();
        System.out.println("Connection Closed....");
        

		
		

	}

}
