package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;


public class PreparedStatements {
	
	public static void main(String []args) throws Exception{
		
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.bd");
		
		PreparedStatement pstm=con.prepareStatement("select * "
												  + "from students "
												  + "where deptno=?" );
		
		
		Scanner input=new Scanner(System.in);
		System.out.print("Department No: ");
		int dno=input.nextInt();
		pstm.setInt(1,dno);
		
		ResultSet rs=pstm.executeQuery();
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.println(rs.getInt(4));
		}
		
		pstm.close();
		con.close();
		
	}

}
