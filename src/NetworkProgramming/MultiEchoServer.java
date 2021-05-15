package NetworkProgramming;

import java.net.*;
import java.io.*;

//!!! To run this program with cmd we have to export Runnable jar files of these two classes.
//After exporting we can run MultiEchoServer with >java -jar MultiEchoServer.jar 
//We can run Clients with >java -jar Clients.jar

public class MultiEchoServer extends Thread {
	
	Socket stk;
	
	MultiEchoServer(Socket s)
	{
		stk=s;
	}
	
	public void run()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
			PrintStream ps=new PrintStream(stk.getOutputStream());
			
			String str;
			StringBuffer sb;
			
			do
			{
				str=br.readLine();
				
				sb=new StringBuffer(str);
				sb=sb.reverse();
				str=sb.toString();
				
				ps.println(str);
				
			}while(!str.equals("dne"));
			
			stk.close();
		}
		catch(Exception e) {System.out.println(e);}
		
	}
	
	public static void main(String [] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(2500);
		
		Socket stk;
		MultiEchoServer mes;
		int count=0;
		
		
		System.out.println("Connection established.\n");
		while(true)
		{
			stk=ss.accept();
			System.out.println(++count+". Client connected.");
			mes=new MultiEchoServer(stk);
			mes.start();
		}
	}

}

class Clients{
	
	
	public static void main(String [] args) throws Exception
	{
		Socket stk=new Socket("localhost",2500);//or instead of localhost cmd-ipconfig-ip4Adress
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
		PrintStream ps=new PrintStream(stk.getOutputStream());
		
		String str;
		
		do
		{
			str=input.readLine();
			ps.println(str);
			str=br.readLine();
			System.out.println("The message of the server: "+str);
			
		}while(!str.equals("dne"));
		
		stk.close();
	}
	
}
