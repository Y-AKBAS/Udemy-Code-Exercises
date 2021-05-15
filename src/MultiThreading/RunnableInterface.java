package MultiThreading;

// Here we can make our threading with Runnable interface but we must write a Thread object in main.


class RunnableThread implements Runnable{
	
	public void run() {
		
		int i=1;
		while(i<100) {
			System.out.println(i+" Hello");
			i++;
		}
	}
	
}

public class RunnableInterface {
	
	public static void main(String [] args) {
		
		RunnableThread r=new RunnableThread();
		Thread t=new Thread(r);
		t.start();
		
		int i=1;
		while(i<100) {
			System.out.println(i+" World");
			i++;
		}
		System.out.println(t.isAlive());
		int j=1;
		while(j<100) {
			System.out.println(i+" World2");
			j++;
		}
		
	}

}
