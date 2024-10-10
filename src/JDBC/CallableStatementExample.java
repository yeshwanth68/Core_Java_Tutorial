package JDBC;

import com.mysql.cj.jdbc.CallableStatement;

import java.sql.*;
public class CallableStatementExample {
	
	public static void main (String args[]) throws SQLException, ClassNotFoundException {
//		CallableStatement callableStatement = null;
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TargetHigh", "root", "root");
//		
//		String sql = "{CALL GetUserByID(?, ?)}"; // Make sure this stored procedure exists
//        callableStatement = con.prepareCall(sql);
//        
//        // 4. Set the input parameter for user ID
//        callableStatement.setInt(1, 1);  // Assume we're looking for user with ID = 1
//
//        // 5. Register the output parameter for the user name
//        callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
//
//        // 6. Execute the stored procedure
//        callableStatement.execute();
//
//        // 7. Retrieve the output parameter (user name)
//        String userName = callableStatement.getString(2);
//        System.out.println("User Name: " + userName);

		
	}

}
