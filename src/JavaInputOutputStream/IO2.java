package JavaInputOutputStream;

import java.io.*;



public class IO2 {
	
	public static void main(String [] args) throws Exception
	{
		
		try(FileInputStream fis=new FileInputStream("C:/Users/Yasin/Desktop/Test.txt")){
			
//			byte b[]=new byte[fis.available()];  // First way
//			
//			fis.read(b);
//			
//			String str=new String(b);
//			
//			System.out.println(str);
			
			int x;								// Second way
			
			while((x=fis.read())!=(-1))
			{
				System.out.print((char)x);
			}
		}

	}
	
	
}
