package ObjectOriented;


// static class StaticTry{
							// A outer cannot be a static class. It is not allowed.
							// Just a inner class can be static
// }

class StaticClass{
	
	static int s=12;
	int a,b;
	
	public static int staticMethod(int n) {
	  //	return n*a;  // Gives error because a and b are not static members.
		return s*n;      // It works now because s is static.
	}
	
	public int nonStaticMethod(int n) {
		return s*n;  // A non-static method can also access static members of a class.
	}
}

public class Static_vs_Final {
	
	public static void main(String []args) {
		
		// We can access static members and methods without creating an object.
		
		System.out.println(StaticClass.s);
		System.out.println(StaticClass.staticMethod(5));
		
		// If we change a static value it will be changed at every object of our class
		StaticClass sc=new StaticClass();
		sc.s=20;
		
		System.out.println(StaticClass.s);
		System.out.println(StaticClass.staticMethod(5));
		
		final int FINAL=12;
	//	FINAL=13;  // final is like const in c++ but we can also have final methods and classes
				   // and they are written in capital letters. A final class cannot be extended.
			  // Final members can be initialized directly,inside a constructor or an instance block
	}
	
	

}
