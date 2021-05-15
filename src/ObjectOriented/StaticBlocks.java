package ObjectOriented;

// Static blocks are executed when the class is loaded

class Trial{
	
	static 
	{
		System.out.println("Block 1");
	}
	
	static
	{
		System.out.println("Block 2");
	}
}

public class StaticBlocks {
	
	static
	{
		System.out.println("Block 3");
	}
	
	public static void main(String [] args)
	{
		Trial t=new Trial();  // Block 1,2 are not executed if we dont create an object.But others
		System.out.println("Main");
		
	}
	
	static
	{
		System.out.println("Block 4");
	}

}
