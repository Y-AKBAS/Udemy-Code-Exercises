package ObjectOriented;

class Outer{
	
	int o=12;
	
   // Definition of inner class. We cannot access the members and methods directly. We need an object.
	class Inner{
		
		int i=13;
		
		public void innerMethod()
		{
			System.out.println("Method of inner class.");
		}
	}
	
	public void outerMethod()
	{
		System.out.println("Method of outer class.");
		// innerMethod();  // We cannot call it like this directly. But:
		Inner inner=new Inner();
		inner.innerMethod();
		System.out.println("We can access members of inner class just by objects: "+inner.i);
	}
	
	public void methToDefinelocalInnerClass() {
		
		class LocalInnerClass{
			 
			public void localInnerMeth() 
			{
			System.out.println("\nIf a class is being defined inside of a method we call it as "
					+ " \nlocal inner class and it is not accesible outside of this method.\n");
			}
		}
		LocalInnerClass lic=new LocalInnerClass();
		lic.localInnerMeth(); // or:
	  //new LocalInnerClass().localInnerMeth(); // This is called as anonymous class
		
	}
	
}


// For every class in java a class file is being generated after compilation. For inner classes
// it seems like that: Outer$Inner.class

public class InnerClasses {

	public static void main(String [] args) {
		
  		Outer outer=new Outer();
		outer.outerMethod();
		
		// We can create an object of inner class but its is usually useless.
		Outer.Inner oi=new Outer().new Inner(); 
		oi.innerMethod();
		
		outer.methToDefinelocalInnerClass();
		
		// We can implement the abstract classes as *anonymous* classes inside of a class.For Exemp:
		// Abstract abs=new Abstract(){
		//
		//  public void OverridingMeth(){
	    //  System.out.println("I am overriding the method of the abstract class to make it concret.");
	    //  }
		//
		// } // and now we can use abs as an object. This is being used a lot.
	
	}
	
}
