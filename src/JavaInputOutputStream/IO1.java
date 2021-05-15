package JavaInputOutputStream;

//import java.lang.*;
import java.io.*;



public class IO1 {
	
	public static void main(String [] args) {
//		try
//		{
//			// We can use try with resources too. You can find it below.
//			FileOutputStream fos=new FileOutputStream("C:/Users/Yasin/Desktop/Test.txt");
//			
//			String str="Java is a common programming language.";
//			
//			fos.write(str.getBytes()); // First way
//			
//			/* byte b[]=str.getBytes();
//			
//			for(byte x:b) 			// Second way 
//				fos.write(x);*/
//			
//			fos.close();// we should close it when we are done.
//			
//			System.out.println(str);
//			
//			
//		}
		try(FileOutputStream fos=new FileOutputStream("C:/Users/Yasin/Desktop/Test.txt")){
        
			String str="Java is a common programming language.";
		
			fos.write(str.getBytes()); 
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
