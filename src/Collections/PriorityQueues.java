package Collections;

import java.util.*;

//We have to override compare method to provide max heap property
class MyComparison implements Comparator<Integer>{
	
	public int compare(Integer i,Integer j)
	{
		if(i>j)
			return -1;
		if(j>i)
			return 1;
		return 0;
	}
}

public class PriorityQueues {

	public static void main(String []args) {
		
		//PriorityQueue uses the data structure Heap.The elements are listed depending on their priority
		//By default it uses min heap but we can change it as max too.
		//Smaller elements come first and we can just delete the smallest element.
		//The time complexity is log n
		
//		PriorityQueue<Integer> p=new PriorityQueue<Integer>(); //Min Heap property
		PriorityQueue<Integer> p=new PriorityQueue<Integer>(new MyComparison());//Max Heap property
		
		p.add(18); p.add(14); p.add(5);	p.add(89); p.add(35); p.add(22);
		
		System.out.println(p);
		
		p.poll();
		
		System.out.println(p);
		
		
		
		
		
	}
}
