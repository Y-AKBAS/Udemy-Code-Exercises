package JavaInputOutputStream;

import java.io.*;

class Student2
{
	int rollNo;
	String name;
	String dept;
	float avg;
	
	Student2()
	{
	  System.out.println("With DataIn-OutputStream we can store the data with its own type.It will be then a binary file.");
	}	
}

public class DataIOStream {
	
	public static void main(String [] args)throws Exception {
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Yasin\\Desktop\\Student2.txt"))
		{
			
			DataOutputStream dos=new DataOutputStream(fos);
			
			Student2 st=new Student2();
			
			st.rollNo=12345;
			st.name="Stefan";
			st.dept="Informatik";
			st.avg=2.1f;
			
			dos.writeInt(st.rollNo);
			dos.writeUTF(st.name);
			dos.writeUTF(st.dept);
			dos.writeFloat(st.avg);
			
			dos.close();
			fos.close();
		}
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Student2.txt"))
		{
			
			DataInputStream dis=new DataInputStream(fis);
			
			Student2 std=new Student2();
			
			std.rollNo=dis.readInt();
			std.name=dis.readUTF();
			std.dept=dis.readUTF();
			std.avg=dis.readFloat();
			
			System.out.println("\n"+std.rollNo+"\n"+std.name+"\n"+std.dept+"\n"+std.avg);
			
			dis.close();
			fis.close();
		}
		
	}

}
