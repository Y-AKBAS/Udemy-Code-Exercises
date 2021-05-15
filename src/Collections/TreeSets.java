package Collections;

import java.util.*;

class Point implements Comparable
{
	int x,y;
	
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int compareTo(Object o)
	{
		Point p=(Point) o;
		
		if(this.x>p.x)
			return 1;
		else if(this.x<p.x)
			return -1;
		else
		{
			if(this.y<p.y)
				return -1;
			else if(this.y>p.y)
				return 1;
		}
		return 0;
	}
	
	public String toString()
	{
		return "("+x+","+y+")";
	}
}


public class TreeSets {

	public static void main(String []args) {
		
		//This guarantees a time complexity of log n for basic operations like add,remove etc.
		//and the elements are being sorted automatically.Duplicates are not allowed.
		//If we want to store our own classes we have to override the compare method of Comparable class.
		
		TreeSet<Integer> t=new TreeSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>(List.of(10,50,30,70,40,40,40));
		
		t.add(15);
		
		System.out.println(ts);
		System.out.println(ts.ceiling(35));//This gives us the first element that is > or = 
		System.out.println(ts.floor(35)); //This gives us the first element that is < or =
		
		TreeSet<Point> tp=new TreeSet<Point>();
		
		tp.add(new Point(3,5));
		tp.add(new Point(3,4));
		tp.add(new Point (1,2));
		tp.add(new Point (2,5));
		
		System.out.println(tp);
		
		
	}
}
