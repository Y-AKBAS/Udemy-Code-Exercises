package ExceptionHandling;

/*
  Exceptions are run time errors and they are faced by users.
  Logical(Tracing/Debugger helps) and Syntax errors (Compiler helps) are faced by programmers.

  Runtime errors are caused by users. For example program asks a user his age
  and he writes -10. That is an invalid input or program needs internet access to
  work properly but user doesn't supply it. These are all runtime errors.
  
  Programmers can inform users in such cases with exception handling.
  
  Even in case of exception we want that the rest of the program runs smoothly.
  
  First exception should be the subclass of next ones an so on.
  
  Finally block will be definitely executed.
  
  Every programmer defined exception class should inherit from Exception class.
  
  Checked Exceptions are the exceptions that are already being checked before we run the program
  like File input exceptions.But unchecked Exceptions like AritmeticException are not being
  automatically checked.Programmers should take care of them.
     
 */

class TwoFunctionException extends Exception{
	
	public String toString() {
		
		return "Our defined exception.";
	}
	
}



public class Exception1 {
	
	static public void func1() {
		
		try 
		{
			throw new TwoFunctionException();
		}
		catch(TwoFunctionException e) 
		{
			System.out.println(e);
		}
	}
	
	static public void func2() {
		
		try
		{
			int a=5,b=0,c;
			c=a/b;
		}
		catch(ArithmeticException e) // Checked Exception
		{
			
			System.out.println("Already defined exception: "+e.getMessage());
		}
		
		func1();
		
	}
	
	
	public static void main (String [] args) {
		
		func2();
		
	}
	

}
