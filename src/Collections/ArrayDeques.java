package Collections;

import java.util.*;

public class ArrayDeques {
	
	public static void main(String []args)
	{
		//At ArrayDeques we can add to our head as well as last index.
		//It is faster than LinkedList and Stack when it is used as a Queue.
		
		
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		
		dq.offerLast(40); // offerLast is used for inserting.
		dq.offerLast(50);
		dq.offerLast(60);
		dq.offerLast(70);
		
		dq.pollLast();// If we use this than it will be like a Stack.
		dq.pollFirst(); // If we use this it will than like a Queue.
		
		dq.forEach(n->System.out.print(n+" "));
		
		System.out.println("");
		
		dq.offerFirst(10);
		dq.offerFirst(20);
		dq.offerFirst(30);
		
		dq.forEach(n->System.out.print(n+" "));
		
		
	}

}
