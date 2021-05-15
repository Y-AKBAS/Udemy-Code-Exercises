package ObjectOriented;

abstract class Abstr{
	
	public Abstr()
	{
		System.out.println("Abstract class constructor. Abstract classes cannot have Objekts.\n");
	}
	
	public void Meth()
	{
		System.out.println("Abstract class method");
	}
	
	abstract void abstMeth(); // Abstract methods have no definition.
	
	public String toString() {
		return "If a class has at least one absract method, than it is called defitely as an"
		     + "\nabstract class. But for abst classes it is allowed to have no abstract methods too.\n";
	}
	
}

class Sub extends Abstr{
	
	@Override
	public void abstMeth()
	{
		System.out.println("A subclass of an abstract class should implement(override) the"
				+ "\nabstract methods in the abstract class to be used.\n");
	}
}


public class AbstractClasses {
	
	public static void main(String [] args )
	{
		
		Abstr abs;
		Sub sb=new Sub();
		sb.abstMeth();
		System.out.println(sb);
		
		
		
	}

}
