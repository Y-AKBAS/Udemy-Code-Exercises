package Collections;

import java.util.*;

public class ArrayLists {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> arr1=new ArrayList<Integer>(20); //We can mention the size. It is up to us.
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		arr1.add(10);
		arr1.add(1,5); // to index 1 we add element 5
		arr1.addAll(List.of(3,4,7,8,9)); // We can directly add another list.
		
		System.out.println(arr1.indexOf(5)); // We find where the 5 is.
		System.out.println(arr1.get(5));     // We find out what is in index 5
		
		System.out.println(arr1);
		
		arr2.addAll(arr1); //We can add directly a list to another. We can mention the index too.
		
		arr2.set(5,100); //We can change the elements with set method.If we directly add it rotates.
		
		System.out.println(arr2);
		
		Iterator<Integer> it=arr2.iterator(); //Iterator moves just forward.
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println("");
		
		ListIterator<Integer> lit=arr2.listIterator(arr2.size());//ListIterator can move forward and backward.
		
		while(lit.hasPrevious())
		{
			System.out.print(lit.previous()+" ");
		}
		
		System.out.println("");
		
		arr2.forEach(n->System.out.print(n+" "));// with lambda expression we can print them too.
		
		
	}
	
	
	

}
