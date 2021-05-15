package JavaInputOutputStream;

import java.io.*;


public class Challenge2 {
	
	public static void main(String []args) 
	{
	
		float arr[]= {1.2f,2.3f,3.4f,5.6f};
		int size=arr.length;
		
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Yasin\\Desktop\\Data.txt"))
		{
			DataOutputStream dos=new DataOutputStream(fos);
			
			dos.writeInt(arr.length);
			for(int i=0;i<size;i++)
			dos.writeFloat(arr[i]);
			
			dos.close();
			fos.close();
			
		}catch(Exception e) {System.out.println(e);}
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Data.txt"))
		{
			DataInputStream dis=new DataInputStream(fis);
			
		    int le=dis.readInt();	
		   		   
		    float arr1[]=new float[le];
			
			for(int i=0;i<le;i++)
			  arr1[i]=dis.readFloat();
			
			for(float x:arr1)
				System.out.println(x);
			
			dis.close();
			fis.close();
			
		}catch(Exception e) {System.out.println(e);}
		
		
	}

}
