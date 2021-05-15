package Collections;

import java.util.*;
import java.util.Map.*;

public class Tree_and_HashMap {
	
	public static void main(String [] args) {
		
		//TreeMap takes log n time for all basic operations. HashMap takes constant time.
		//TreeMap is already sorted but HashMap isn't sorted.
		
		TreeMap<Integer,Character> tm=new TreeMap<>(Map.of(10,'A',20,'B',30,'C',60,'F'));
		
		System.out.println("TreeMap:\n"+tm);
		System.out.println(tm.ceilingEntry(40));
		System.out.println(tm.floorEntry(40));
		
		tm.put(50,'G'); tm.put(80,'Z');
		
		Entry<Integer, Character> e=tm.firstEntry();
		System.out.println(e.getKey()+"="+e.getValue());
		
		tm.pollFirstEntry();
		System.out.println(tm);
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		String str=""; Character ch='A';
		System.out.println("\nHashMap:");
		for(int i=5;i>0;i--)
		{
     		hm.put(i,str+(ch++));
		}
		
		System.out.println(hm);
		
		System.out.println("Key 5:"+hm.get(5));
		hm.replace(5,hm.get(5), "Replaced");
		System.out.println("Key 5:"+hm.get(5));
		
		System.out.println(hm);
		
	}

}
