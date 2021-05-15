package Collections;

import java.util.*;

public class HashSets {

	public static void main(String []args) {
		
		// At HashSets the hashing technique is being used.By default we have a size of 16 and a
		// loading factor of 0.75.It means we should just fill 75% of the table. The size increases
		// automatically if we add more elements. It is better to have a loading factor of 0.5(float)
		// Time complexity is constant time, which means it is faster than ArrayList and LinkedList
		// But we waste more space.Duplicates are not allowed(See h below)
		
		HashSet<Integer> h=new HashSet<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>(10,0.5f);//Size is 10 and loading factor is 0.5
		
		h.add(18); h.add(14); h.add(5);	h.add(89); h.add(35); h.add(22); h.add(22); h.add(22);
		hs.add(5); hs.add(8); hs.add(10); hs.add(7);
		
		System.out.println("The sum of hs:"+hs.hashCode()); // Returns the sum of elements.
		
		System.out.println(h);
		
		h.remove(89); h.remove(22);
		
		System.out.println(h);
		
	}
}
