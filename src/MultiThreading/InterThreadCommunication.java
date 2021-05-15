package MultiThreading;


class MyData{
	
	private int value;
	boolean flag=true;
	
	synchronized public void setValue(int i)
	{
		while(flag ==false)
			try{ wait(); }catch(Exception e) {}
		
		value=i;
		flag=false;
		notify();
	}
	
	synchronized public int getValue()
	{
		int x=0;
		while(flag==true)
			try{ wait(); }catch(Exception e) {}
		
		x=value;
		flag=true;
		notify();
		return x;
		
	}
	
}


class Producer extends Thread{
	
	MyData d;
	
	Producer(MyData d){
		this.d=d;
	}
	
	public void run()
	{
		int count=0;
		while(count<20) 
		{
			System.out.println("Produced: "+ count);
    		d.setValue(count++);
		}
	}
}

class Consumer extends Thread{
	
	MyData d;
	
	Consumer(MyData d)
	{
		this.d=d;
	}
	
	public void run()
	{
		int count=0;
		while(count<20) {
			
			System.out.println("Consumed: "+d.getValue());
			count++;
		}
		
	}
}


public class InterThreadCommunication {

	public static void main(String [] args) {
		
		MyData d=new MyData();
		
		Producer p=new Producer(d);
		Consumer c=new Consumer(d);
		
		p.start();
		c.start();
	}
	
}
