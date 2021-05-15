package ExceptionHandling;


class StackOverFlowException extends Exception{
	
	public String toString() {
		return "StackOverFlow Exception!";
	}
}

class StackUnderFlowException extends Exception{
	
	public String toString() {
		return "StackUnderFlow Exception!";
	}
}

class Stack{
	
	private int size;
	private int arr[];
	private int count=0;
	
	Stack(int s){
		size=s;
		arr=new int[size];
	}
	
	public void push(int i) {
		
		try
		{
		if(count<0)
			count=0;
		if(count>=size)	
			throw new StackOverFlowException();
		arr[count]=i;
		count++;
			
		}
		catch(StackOverFlowException s)
		{
			System.out.println(s);
		}
	}
	
	public void pop() {
		try
		{
		  if(count>size-1)
			  count=size-1;
		  if(count<0)
				throw new StackUnderFlowException();
		  
		  arr[count]=-1;
		  count--;
		
		}
		catch(StackUnderFlowException s)
		{
			System.out.println(s);
		}
	}
	
	public void display()
	{
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println("");
	}
}


public class Exception_Challnge {
		
	public static void main (String []args ) {
		
		Stack s=new Stack(3);
		s.push(0);
		s.push(1);
		s.push(2);
		
		s.display();
		s.push(4);
		
		s.pop();
		s.pop();
		s.pop();
		
		s.display();
		s.pop();
		
				
	}

}
