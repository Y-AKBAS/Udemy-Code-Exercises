package JavaInputOutputStream;

import java.io.*;

public class Challenge1 {
	
	public static void main(String [] args) {
		
		try(FileOutputStream fos = new FileOutputStream("C:/Users/Yasin/Desktop/Challenge.txt"))
		{
			String str="ich moechte alles mit kleinen buchstaben.";
			
			fos.write(str.getBytes());
			fos.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		try(FileOutputStream fos=new FileOutputStream("C:/Users/Yasin/Desktop/Challenge2.txt"))
		{
			try(FileInputStream fis=new FileInputStream("C:/Users/Yasin/Desktop/Challenge.txt"))
			{
				int b;
				while((b=fis.read())!=-1)
				fos.write((char)Character.toUpperCase(b));
				
		//		SequenceInputStream sis=new SequenceInputStream(fis,fis);// We can add two files
								
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
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		try(FileInputStream fis=new FileInputStream("C:/Users/Yasin/Desktop/Challenge.txt"))
		{
			int x;
			while((x=fis.read())!=-1) 
			{    
			   System.out.print((char)Character.toUpperCase(x));
			}
			System.out.println("");
			fis.close();
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
