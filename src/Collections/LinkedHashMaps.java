package Collections;

import java.util.*;

public class LinkedHashMaps {

	public static void main(String [] args) {
		
		//At LinkedHashMap the elements are ordered according to our insertion(better than HashMap)
		//But we can order them according to their access to.Like Constructor(5,0.75f,true)
		//We need extra space.If we limit the size(Not size initialization) and more element than
		//this size our map will delete the first element to insert the new element.No duplicates.
		
		LinkedHashMap<Integer,Character> lhm=new LinkedHashMap<>(3);
		
		lhm.put(1,'A');
		lhm.put(3,'C');
		lhm.put(4,'E');
		lhm.put(4,'Z'); // If we insert the same key more than once.It will change the value.
		
		lhm.forEach((k,v)->System.out.print(k+"="+v+" "));
		System.out.println("\n\nWith Changing order:");
		
		LinkedHashMap<Integer,Character> lhm1=new LinkedHashMap<>(3,0.75f,true);
		
		lhm1.put(1,'A');
		lhm1.put(3,'C');
		lhm1.put(2,'B');
		lhm1.put(4,'E');
		
		System.out.println(lhm1);
		
		lhm1.get(3); // We are accessing these elements now. The order will be changed.
		lhm1.get(1); // Not accessed element are coming forward so that we can delete them.
		
		System.out.println(lhm1);
		
		System.out.println("\nLimiting the size:");
		
		// in order to limit the size we have to override a method of LinkedHashMap class.
		
		@SuppressWarnings("unchecked")
		LinkedHashMap<Integer,Character> lhm2=new LinkedHashMap(4,0.75f,true) {
			//In the constructor we can just write the limit if we want an insertion order too.
			//This constructor will provide us an access order.
			protected boolean removeEldestEntry(Map.Entry e) {
				return size()>4;
			}
		}; // Do not forget the semicolon.
		
		
		lhm2.put(1,'A');
		lhm2.put(3,'C');
		lhm2.put(2,'B');
		lhm2.put(4,'E');
		
		System.out.println(lhm2);
		
		lhm2.get(3); // We are accessing these elements now. The order will be changed.
		lhm2.get(1);
		
		System.out.println(lhm2);
		
		System.out.println("\nWe are adding one more.Least accessed will be deleted.");
				
		lhm2.put(5,'Y');
		System.out.println(lhm2);//insertion itself is an access too.The added element goes to end.

		System.out.println("\nWe are changing now a value with compute.");
		lhm2.compute(5,(k,v)-> v='K');
		System.out.println(lhm2);
		
		System.out.println("\nWe are now adding a value via computeIfAbsent(key,mappingfunction())");
		lhm2.computeIfAbsent(6,(v)->'T');
		System.out.println(lhm2);
		
		
	}
}
