package ObjectOriented;

import java.time.LocalDate;

class Student{
	
	private String rollNo;
	
	private static int count=1;
	
	private static String generateRollNo()
	{
		LocalDate ld=LocalDate.now();
		int year=ld.getYear();
		String rn="UL-"+year+"-"+count++;
		return rn;
	}
	
	Student()
	{
	   rollNo=generateRollNo();	
	}
	
	public String getRollNo()
	{
		return rollNo;
	}
}

class Customer3{
	
	private String customerNo;
	private String name;
	private static int count=1;
	
	
	final private static String generateCustomerNo()
	{
		return "#-"+count++;
	}
	
	Customer3()
	{
		customerNo=generateCustomerNo();
	}
	
	public String getCustomerNo()
	{
		return customerNo;
	}
}

public class StaticChallenge {
	
	public static void main(String []args)
	{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		System.out.println(s1.getRollNo());
		System.out.println(s2.getRollNo());
		System.out.println(s3.getRollNo());
		
		Customer3 c1=new Customer3();
		Customer3 c2=new Customer3();
		Customer3 c3=new Customer3();
		
		System.out.println(c1.getCustomerNo());
		System.out.println(c2.getCustomerNo());
		System.out.println(c3.getCustomerNo());
		
	}

}
