package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//1.Import the package
//2.Load and Register the driver
//3.Establish the connection
//4.Create the statement
//5.Execute the query
//6.Process the result
//7.Close the connection

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/TargetHigh";
		String username = "root"; 
		String password = "root";
		String query = "select *from JDBCCON";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
	    System.out.println("Connection Established successfully");
	    Statement st = con.createStatement();
	    ResultSet rs= st.executeQuery(query);
	    rs.next();
        String name = rs.getString("USERNAME"); 
 
        System.out.println(name); 
        st.close();
        con.close();
        System.out.println("Connection Closed....");
	    

	}

}
