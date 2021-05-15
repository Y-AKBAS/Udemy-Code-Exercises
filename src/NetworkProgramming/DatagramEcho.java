package NetworkProgramming;

import java.net.*;
import java.io.*;

//This shows us how UDP works. We are going to see the packet exchange between the client and server


public class DatagramEcho {
	
	public static void main(String [] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(2200);
		
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your message: ");
		String msg=input.readLine();
		
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2001);
		
		ds.send(dp);
		
		byte b[]=new byte[1024];
		dp=new DatagramPacket(b,1024);
		ds.receive(dp);
		
		msg=new String(dp.getData()).trim();
		System.out.println("From Server: "+msg);
				
		ds.close();
	}
}

class Server
{
	public static void main(String [] args) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(2001);
		
		byte b[]=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,1024);
		ds.receive(dp);
		
		String msg=new String(dp.getData()).trim();
		System.out.println("From Client: "+msg);
		
		StringBuffer sb=new StringBuffer(msg);
		sb.reverse();
		msg=sb.toString();
		
		dp=new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("localhost"),2200);
		
		ds.send(dp);
		
		ds.close();
	}
}
