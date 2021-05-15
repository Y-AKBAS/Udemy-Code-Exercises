package JDBC;

import java.sql.*;

public class JDBC_1 {
	
	public static void main(String []args) throws Exception {
			
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.bd");
		
		Statement stm=con.createStatement();
		
		ResultSet rs=stm.executeQuery("select * from students natural join dept");
		
		
		while(rs.next())
		{
			System.out.print(rs.getInt("roll")+" ");    // We can write the column numbers too.
			System.out.print(rs.getString("name")+" "); // We don't have to write column name.
			System.out.print(rs.getString("city")+" ");
			System.out.println(rs.getString(5));	
		}
		
		stm.close();
		con.close();
	}

}
