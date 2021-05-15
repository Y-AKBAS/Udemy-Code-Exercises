package Collections;

import java.util.*;
import java.io.*;

public class StringTokenizers {
	
	public static void main(String [] args) throws Exception {
		
		String data="Autor=Philipp Hübl, Seite=432, Verlag=C. Bertelsmann Verlag,"
				+   "Buchtitel=Die Aufgeregte Gesellschaft";
		
		StringTokenizer stk=new StringTokenizer(data,",");//"," mean where to separate tokens.
		
		while(stk.hasMoreTokens())
		{
			System.out.print(stk.nextToken()+"; ");
		}
		
		System.out.println("\n\nFile Input Stream:");
		FileInputStream fis=new FileInputStream("C:/Users/Yasin/Desktop/Test.txt");
		byte b[]=new byte[fis.available()];
		fis.read(b);
		
		String str=new String(b);
		
		StringTokenizer stk1=new StringTokenizer(str,"\n");
		
		System.out.println("\nOutput: ");
		while(stk1.hasMoreTokens())
		{
			System.out.print(stk1.nextToken());
		}
		
		System.out.println("\n\nStoring String numbers as int in ArrayList<Integer>:\n");
		
		String numbers="10,20,30,40,50,60,70,80,90";
		
		StringTokenizer stk3=new StringTokenizer(numbers,",");
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		while(stk3.hasMoreTokens())
		{
			al.add(Integer.valueOf(stk3.nextToken()));
		}
		
		System.out.println(al);
		
		
	}

}
