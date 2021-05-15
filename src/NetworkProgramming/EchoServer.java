package NetworkProgramming;

import java.net.*;
import java.io.*;

// !!! To run this program with cmd we have to export Runnable jar files of these two classes.
// After exporting we can run EchoServer with >java -jar EchoServer.jar 
// We can run Client with >java -jar Client.jar

public class EchoServer {
	
	public static void main(String [] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(2000); //We enter the port number of Server
		Socket stk=ss.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps=new PrintStream(stk.getOutputStream());
		
		String msg;
		StringBuffer sb;
		
		do
		{
			msg=br.readLine();  // Reading the message of client 
			
			sb=new StringBuffer(msg); // Reversing it back
			sb=sb.reverse();
			msg=sb.toString();
			
			ps.println(msg);  // Sending it back.
			
		}while(!msg.equals("dne")); //We are reversing the msg since it should be dne(end)
		
		stk.close();
		ss.close();
	}

}

class Client {
	
	public static void main(String [] args) throws Exception
	{
		Socket stk=new Socket("localhost",2000);
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps=new PrintStream(stk.getOutputStream());
		
		String msg;
		
		do
		{
			msg=input.readLine();
			ps.println(msg);
			msg=br.readLine();
			System.out.println("Message of server: "+ msg);
			
		}while(!msg.equals("dne"));
		
	 stk.close();
	}
}

