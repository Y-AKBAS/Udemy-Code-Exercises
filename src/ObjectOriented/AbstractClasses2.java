package ObjectOriented;

abstract class Hospital{
	// abstract classes imposes us some standards
	abstract void emergency();
	abstract void appointment();
	abstract void admit();
	abstract void billing();
}

class MyHospital extends Hospital{
	
	
	public void emergency()
	{
		System.out.println("Emergency overridened.");
	}
	
	public void appointment()
	{
		System.out.println("Appointment overridened.");
	}
	
	public void admit()
	{
		System.out.println("Admit overridened.");
	}
	
	public void billing()
	{
		System.out.println("Billing overridened.");
	}
	
	public void zusatz()
	{
		System.out.println("Zusätzlich hinzugefügt.");
	}
	
}

public class AbstractClasses2 {
	
	public static void main(String [] args)
	{
		// An abstract class cannot have(refer) its own object but its kinds.
		
		Hospital h=new MyHospital();
		h.emergency();
		h.admit();
		h.appointment();
		h.billing();
		
		MyHospital mh=new MyHospital();
		mh.zusatz(); // This doesn't work with h.
		
	}

}
