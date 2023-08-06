package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbc1.DB;

public class Programa {

	public static void main(String[] args) throws SQLException {
		
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
	try {
		conn = DB.getConnection();
		
		st = conn.createStatement();
		
		rs = st.executeQuery("select * from department");
		
		while (rs.next()) {
			System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
		}
	
	} 
	catch (SQLException e) {
		e.printStackTrace();
	}
	
	finally {
		DB.closeResultSet(rs);
		DB.closeStatement(st);
		DB.closeConnection();
	}
	}
	
}
