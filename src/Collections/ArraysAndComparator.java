package Collections;

import java.util.*;

//If we want to define our own sorting we have to implement Comparator<>
//Do not mix Comparable and Comparator

class My implements Comparator<Integer>{
	
	public int compare(Integer i,Integer j) {
		
		if(i>j)
			return -1;
		if(i<j)
			return 1;
		return 0;
	}
}

public class ArraysAndComparator {
	
	public static void main(String []args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
		int c[]= {1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.compare(a, b)); // Equal returns 0
		System.out.println(Arrays.compare(b, c)); // B is greater than(1 Element) C.It returns 1
		System.out.println(Arrays.compare(c, b)); // C is smaller than(1 Element) B.It returns -1
		
		int d[]= Arrays.copyOf(a, 4); // I want 4 elements to be copied.
		
		for(int x:d)
			System.out.print(x+" ");
		
		System.out.println("\n");
		
		int e[]=new int[5];
		Arrays.fill(e, 10); //We will fill the array with 10
		
		for(int x:e)
			System.out.print(x+" ");
		
		System.out.println("\n\nSorting(Comparable interface will be used automatically):");
		
		int f[]= {5,4,3,2,1};
		Arrays.sort(f);
		
		for(int x:f)
			System.out.print(x+" ");
		
		System.out.println("\n\nSorting in reverse order(With implementing Comparator):");
		
		Integer r[]= {1,2,3,4,5};
		Arrays.sort(r,new My());
		
		for(int x:r)
			System.out.print(x+" ");
		
		
	}

}
