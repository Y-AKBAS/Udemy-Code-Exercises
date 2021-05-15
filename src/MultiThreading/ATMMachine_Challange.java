package MultiThreading;

// We have just one atm(Monitor) and many people(Threads) want to use it. Because of that we
// should synchronize it.

class ATM{
		
	synchronized public void checkBalance(String name) 
	{
		System.out.println(name+" is checking his balance.");
		
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e) 
		{
			System.out.println(e);
	    }		
    }

     synchronized public void withdraw(String name,float amount) 
    {
    	System.out.println(name+ " is withdrawing "+amount+" Euro.");
    	
    	try
		{
			Thread.sleep(100);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}

    }
}

class Customer extends Thread{
	
	ATM atm;
	private String name;
	private float amount;
	
	Customer(String name,float amount,ATM atm){
		this.name=name;
		this.amount=amount;
		this.atm=atm;
	}
	
	public void useAtm()
	{
		atm.checkBalance(name);
		atm.withdraw(name,amount);
	//	System.out.println(atm); // As we can see we are using the same atm
	}
	
	public void run() {
		useAtm();
	}
}

public class ATMMachine_Challange {
	
	public static void main(String []args) {
		
		ATM atm=new ATM();
		
		Customer c1=new Customer("A",120.0f,atm);
		Customer c2=new Customer("B",130.0f,atm);
		Customer c3=new Customer("C",140.0f,atm);
		Customer c4=new Customer("D",150.0f,atm);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
	}
	 
}
