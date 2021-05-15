package MultiThreading;


class WhiteBoard{
	
    String note;
	int numberOfStudents=0;
	
	int count=0;
	
	public void attendance()
	{
		numberOfStudents++;
	}
	
	synchronized public void setNote(String s) 
	{
		while(count!=0)
			try { wait(); }catch(Exception e){}
		
		note=s;
		count=numberOfStudents;
		notifyAll();
	}
	
	synchronized public String getNote()
	{
		while(count==0)
			try{ wait(); }catch(Exception e) {}
		
		String temp=note;
		count--;
		
		if(count==0)
		{
			notify();
		}
					
		return temp;
	}
}

class Teacher extends Thread{
	
	WhiteBoard wb;

	String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
	
	public Teacher(WhiteBoard wb){
		this.wb=wb;
	}
	
	public void run() {
		
		for(int i=0;i<notes.length;i++)
		{
			wb.setNote(notes[i]);
			System.out.println(notes[i]);
		}
		     
	}
	
}


class Student extends Thread{
	
	WhiteBoard wb;
	String name;
	
	Student(WhiteBoard wb,String name){
		this.wb=wb;
		this.name=name;
	}
	
	public void run() {
		
		wb.attendance();
		String text;
		
		do {
			text=wb.getNote();
			System.out.println(name+" is writing "+text);
			System.out.flush();
			
		}while(!text.equals("end"));
		

	}
	
}



public class InterThreadChallenge {
	
	public static void main(String [] args) {
		
		WhiteBoard wb=new WhiteBoard();
		
		Teacher t=new Teacher(wb);
		
		Student s1=new Student(wb,"A");
		Student s2=new Student(wb,"B");
		Student s3=new Student(wb,"C");
		Student s4=new Student(wb,"D");
		
		t.start();
		
 	    s1.start();
		s2.start();
		s3.start();
		s4.start();		
		
	}

}
