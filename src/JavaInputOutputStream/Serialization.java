package JavaInputOutputStream;

import java.io.*;

class Student{
	
	int rollNo;
	String name;
	String faculty;
	
	Student()
	{
		System.out.println("With PrintStream we store the data in text form.");
	}
}

public class Serialization {
	
	public static void main(String []args) throws Exception{
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Yasin\\Desktop\\Test.txt");
		
		PrintStream ps=new PrintStream(fos);
		
		Student s=new Student();
		s.rollNo=342234;
		s.faculty="Computer Science";
		s.name="Ali";
		
		ps.println(s.rollNo);
		ps.println(s.name);
		ps.println(s.faculty);
		
		fos.close();
		ps.close();
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Test.txt")){
			
			int x;
			while((x=fis.read())!=-1) {
				System.out.print((char)x);
			}

			fis.close();
		}
		System.out.println("");
		
		try(FileInputStream fis1=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Test.txt")){
			
			BufferedReader br=new BufferedReader(new InputStreamReader(fis1));
			//Student s1=new Student();
			s.rollNo=Integer.parseInt(br.readLine());
			s.name=br.readLine();
			s.faculty=br.readLine();
			
			System.out.println(s.rollNo+" "+s.name+" "+s.faculty);
			
			fis1.close();
		}
		
		
	}

}
