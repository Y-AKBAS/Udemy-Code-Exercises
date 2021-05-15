package MultiThreading;

class Test implements Runnable{
	
	public void run() {
		int i=0;
		while(i<50) {
			System.out.println("Run Mehtod of Class Test");
			try 
			{
			    Thread.sleep(1);	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			i++;
		}
		
	}
}

class Test2 extends Thread{
	
	Test2(String name){
		super(name);
		this.setPriority(MAX_PRIORITY);
		//this.setPriority(MIN_PRIORITY);
	}
	
	public void run() {
		
		int i=0;
		while(i<50) {
			System.out.println("Test2 from Thread");
			try 
			{
				Thread.sleep(1); // With sleep function waits the Thread 10 miliseconds. Changeable
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			i++;
		}
	}
}

public class ThreadMethods {

	public static void main(String [] args) {
		
		Thread t=new Thread(new Test());
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
		
		t.start();
		
		Test2 t2=new Test2("Thread Test2");
		
//		try {
//			t2.join(100);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		
		t2.yield();
		
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println("State "+t2.getState());
        System.out.println("Alive "+t2.isAlive());
		
        
		t2.start();
		
		
	}
	
}
