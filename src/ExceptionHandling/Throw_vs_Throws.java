package ExceptionHandling;

/*
 * Throw is being used for throwing exceptions and throws is being used for the methods that are
 * not handling and expecting the calling method to handle it. If the main method throws it too, 
 * than JVM will catch it.
 * 
 */

public class Throw_vs_Throws {
	
	
	static int meth1() throws Exception
    {
		return 10/0;
	}
	
	static void meth2()throws Exception// either we must handle it here or we must write throws ...
	{
		meth1();
	}
	
	static void meth3()throws Exception// either we must handle it here or we must write throws ...
	{
		meth2();
	}
	
	static void finallyMeth()throws Exception
	{
		try
		{
			throw new Exception();
		}
		finally
		{
			System.out.println("If we don't handle an exception and want the program "
					+ "to run than we can use finally block.\nBut we must use throws.");
		}
	}
	
	public static void main(String [] args) throws Exception
	{
		// either we must handle it here or we must write throws ...
		// We can define our own exception class too.
		
		System.out.println("Exception for throw vs. throws:");
		try
		{
			meth3();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("\nException for Finally Bloc:");
		
		finallyMeth();
		
	}

}
