package MultiThreading;

/*
 *  All of the thread classes should inherit from Thread class and override the public void run()
 *  method. Since we can just inherit from one class we can use runnable interface too.
 *  To run our thread we use ThreadName.start() method and not ThreadName.run() method.
 *  We can use our main method to write Threads too.
 */


class MyThread extends Thread{
	
	public void run() {
		
		int i=1;
		while(true) {
			System.out.println(i+" Hello");
			i++;
		}
	}
}

public class Intro // extends Thread  // We can write the same program just with our main class.
{
	
//      public void run() {
//		
//		int i=1;
//		while(true) {
//			System.out.println(i+" Hello");
//			i++;
//		}
//	  }
//	
	public static void main(String [] args) {
		
		MyThread mt=new MyThread();
		mt.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+" World");
			i++;
		}
	}

}
