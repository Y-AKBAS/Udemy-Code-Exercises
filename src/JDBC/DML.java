package JDBC;

import java.sql.*;
import java.util.Scanner;

public class DML {

	public static void main(String [] args) throws Exception
	{
		
		Class.forName("org.sqlite.JDBC");
		
		Connection con=DriverManager.getConnection("jdbc:sqlite:C://SQLite//univ.bd");
		
		// Normal statement
		Statement stm=con.createStatement();
		
		stm.executeUpdate("insert into dept values(60,'Aero')");  // insert values
		stm.executeUpdate("update dept set dname='DaF' where deptno=60" ); // update values
		
		ResultSet rs=stm.executeQuery("Select * from dept");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.println(rs.getString(2));
		}
		
		stm.executeUpdate("delete from dept where deptno=60"); // Delete it again.
		
		// PreparedStatement:
		
		PreparedStatement pstm=con.prepareStatement("insert into students values(?,?,?,?)");
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter student informations:");
		
		System.out.print("Roll No: ");
		int FirstColumn=input.nextInt();
		input.nextLine();
		System.out.print("Name: ");
		String SecondColumn=input.nextLine();
		System.out.print("City: ");

		String ThirdColumn=input.nextLine();
		System.out.print("Department No: ");
		int FourthColumn=input.nextInt();
		
		pstm.setInt(1,FirstColumn);
		pstm.setString(2,SecondColumn);
		pstm.setString(3,ThirdColumn);
		pstm.setInt(4,FourthColumn);
		
		pstm.executeUpdate();
		
		rs=stm.executeQuery("Select * from students where roll>12");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.println(rs.getInt(4));
		}
		
		stm.executeUpdate("delete from students where deptno>17");
		
		pstm.close();
		stm.close();
		con.close();
	}
}
