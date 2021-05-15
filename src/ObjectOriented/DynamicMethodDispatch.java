package ObjectOriented;

// Dynamic method dispatch called as Runtime polymorphism too.
//Because objects are being created in heap 

class Phone{
	
	public void call()
	{
		System.out.println("Phone is calling.");
	}
	
	public void message()
	{
		System.out.println("Phone is sending the text message.");
	}
}

class SmartPhone extends Phone{
	
	@Override
	public void call()
	{
		System.out.println("Smart phone is calling.");
	}
	
	@Override
	public void message()
	{
		System.out.println("Smart phone is sending the text message.");
	}
	
	public void appInstallation()
	{
		System.out.println("The App is installed");
	}
	
	
}


public class DynamicMethodDispatch {
	
	public static void main(String []args)
	{
		
		Phone p=new Phone();
		p.message();
		p.call();
		
		SmartPhone sp=new SmartPhone();
		sp.message();
		sp.call();
		
		Phone ph=new SmartPhone(); // the methods of SmartPhone will be called.
		ph.call();
		ph.message();
  	//  ph.appInstallation();      // Error. Because there is no such method in ph.
		
	//	SmartPhone sph=new Phone(); // Error. Because phone is being inherited from SmartPhone.
		
		
	}
	
}
