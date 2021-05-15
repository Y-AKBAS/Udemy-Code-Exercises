package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DDL {
	
	public static void main(String [] args) throws Exception{
		
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.bd");
		
		Statement stm=con.createStatement();
		
		stm.executeUpdate("create table temp(a integer primary key,b Text)");
			
	    stm.executeUpdate("drop table temp");
	    
	    
	    
	    stm.close();
	    con.close();
		
	}

}
