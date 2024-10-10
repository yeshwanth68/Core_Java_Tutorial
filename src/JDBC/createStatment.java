package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class createStatment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String query = "select *from JDBCCON";
		String userdata ="";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TargetHigh", "root", "root");
	    System.out.println("Connection Established successfully");
	    Statement st = con.createStatement();
	    ResultSet rs= st.executeQuery(query);
	    
	    while(rs.next()) {
	    	userdata = rs.getInt(1)+" : "+rs.getString(2);
	        System.out.println(userdata); 
	   
	    }
        st.close();
        con.close();
        System.out.println("Connection Closed....");

	}

}
