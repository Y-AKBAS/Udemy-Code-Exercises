package JavaInputOutputStream;

import java.io.*;

public class ByteArrayInputStreams 
{
	
	public static void main(String [] args)throws Exception
	{
		
		byte b []= {'a','b','c','d','e','f','g','h','i','o'};
		
		ByteArrayInputStream bis=new ByteArrayInputStream(b);
		
		String str = new String(bis.readAllBytes());
		System.out.println(str);
		
//		int x;
//		
//		while((x=bis.read())!=-1)
//			System.out.print((char)x);
		
		ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
		
		bos.write('a');
		bos.write('b');
		bos.write('c');
		bos.write('d');
		
		byte []c=bos.toByteArray();
		
		for(byte x:c)
			System.out.print((char)x);
		
		
		// bis.close();
		
	}

}
