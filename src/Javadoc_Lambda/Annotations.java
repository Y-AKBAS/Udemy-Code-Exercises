package Javadoc_Lambda;

import java.util.*;

@FunctionalInterface // Functional interfaces can have just one method.If we write this,it warns us.
interface My{
	public void myMeth();
	//public void myMeth();
}

class Old{
	
	public void display2() {
		System.out.println("I am a method of old class");
	}
	
	@Deprecated	//This tells the programmers not to use this method.It may not be supported in future 
	public void display() {
		System.out.println("I am a deprecated method");
	}
}

class Neu extends Old{
	
	@Override //If we don't write this,than the compiler will not warn us at writing mistakes.
	public void display2() {
		System.out.println("I am a method of new class");
	}
}



public class Annotations {
	
	static List <String> list=new ArrayList<String>();
	
	
	@SuppressWarnings("Deprecated")// We can suppress the warnings of compiler with this.
	public static void main(String [] args) {
		
		Old a=new Old();
		
		a.display();
		a.display2();
		
		list.add("Added");
		//System.out.println(list.get(0));
		
	}

}
