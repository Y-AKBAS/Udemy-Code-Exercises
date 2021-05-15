package Collections;

import java.util.*;

public class LinkedLists {
	
	static void even(int e)
	{
		if(e%2==0)
		{
			System.out.println(e+" is even");
		}
		else
			System.out.println(e+" is odd");
	}
	
	public static void main(String [] args) {
		
		// If we insert an element in ArrayList it rotates the rest of the elements
		// But if we insert an element in LinkedList it changes just the pointers.
		// Because of that it is better to use LinkedLists with large amount of data.
		// One drawback of it is the extra space to store the pointers.
		
		LinkedList<Byte> ll=new LinkedList<Byte>();// We cannot mention size here.
		
		LinkedList<Integer> ll2=new LinkedList<>(List.of(50,65,85,100));
		
		Byte b []= {11,12,13,14,15,16};//We cannot use byte with List of.Because of Integer type
		
		for(var x:b)  // var is like auto in c++.
			ll.add(x);
		
		System.out.println(ll);
		
		ll2.forEach((n)->even(n)); // We can call our method with lambda
		
		Iterator it=ll2.descendingIterator();// It goes from right to left.
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("");
		
		ll2.addFirst(40);  // We can add to first and last index.
		ll2.addLast(110);
		
		System.out.println(ll2);
		
		ll2.removeFirst();
		ll2.removeLast();
		
		ll2.peek();// Shows us the first element
		
		ll2.poll(); // Retrieves and removes the head
		
		System.out.println(ll2);
		
		
	}

}
