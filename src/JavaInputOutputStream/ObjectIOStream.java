package JavaInputOutputStream;

import java.io.*;

class Student3 implements Serializable
{
	int rollNo;
	String name;
	String dept;
	float avg;
	public static String uni;
	public transient int age;  //Transient will not be read correctly. But static will be.
	
	Student3()
	{
		System.out.println("If we want correct Object out-input(Binary),we need to implement Serializable interface");
		System.out.println("and if we don't want to store any data we can make it static or transient.");
		System.out.println("We should write a default constructor too.It is important.\n");
	}
	
	Student3(int r,String n,int ag,String d,float a,String u){
		rollNo=r;
		name=n;
		age=ag;
		dept=d;
		avg=a;
		uni=u;
	}
	
	 public String toString()
	    {
	        return "\nStudent Details:\n"+
	                "\nRollNo: "+rollNo+
	                "\nName: "+name+
	                "\nAge(Transient):"+age+
	                "\nDept: "+dept+
	                "\nAverage: "+avg+
	                "\nUni(Static): "+uni+"\n";
	    }	
}



public class ObjectIOStream {
	
	public static void main(String [] args) throws Exception
	{
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Yasin\\Desktop\\Student3.txt"))
		{
			Student3 s=new Student3(12543,"John",27,"Informatik",1.9f,"Uni Leipzig");
			
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			oos.close();
			fos.close();
		}
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Student3.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student3 st=new Student3();
			
			st=(Student3)ois.readObject();
			
			System.out.println(st);
			
			ois.close();
			fis.close();
		}
		
		
	}

}
