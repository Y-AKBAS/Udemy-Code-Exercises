package MultiThreading;

// We have 2 Threads and another class. If we dont write syncronize in our display method
// in class Synchronized, than "Hello World" and "Welcome" will be mixed printed.

class Synchronized{
	
/* synchronized */public void display(String s) //We can write synchronized at the signature too.
{
		
		synchronized(this) // If we write synchronized,than threads will wait each other.
		{
			for(int i=0;i<s.length();i++)
			{
				System.out.print(s.charAt(i));
			}
		}
	}	
}

class MyThread1 extends Thread{
	
	Synchronized s;
	
	MyThread1(Synchronized s){
		this.s=s;
	}
	
	public void run() {
		
		s.display("Hello World");
	}
}


class MyThread2 extends Thread{
	
	Synchronized s;
	
	MyThread2(Synchronized s){
		this.s=s;
	}
	
	public void run() {
		
		s.display("Welcome");
	}
	
}


public class Synchron {
	
	public static void main(String [] args) {
		
		Synchronized s=new Synchronized();
		
		MyThread1 t1=new MyThread1(s);
		MyThread2 t2=new MyThread2(s);
		
		t1.start();
		t2.start();
		
	}

}
