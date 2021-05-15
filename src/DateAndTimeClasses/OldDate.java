package DateAndTimeClasses;

import java.util.*;

public class OldDate {
	
	public static void main(String [] args) {
		
		// This old java class calculates the time with milliseconds in long data type.
		// We should add 1970 to find current year add divide the milliseconds by 1000/60/60/24/365
		// Millisecond/second/minute/hour/day
		
		// Date Class is a old class. Just for learning purpose.
		
		System.out.println("Year: "+(1970+ (System.currentTimeMillis()/1000/60/60/24/365)));
		
		Date d=new Date(); // Date class
		System.out.println(d); // Returns the current date and time
		System.out.println(d.getDay());// Sunday is 0 and so on
		System.out.println(d.getMonth()+1);//Jan is 0
		System.out.println(1900+d.getYear());
		

		Date d1=new Date("08/18/1994");
		System.out.println(d1);
		
		
		GregorianCalendar gc=new GregorianCalendar();
		
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.isLeapYear(2021));
		
		TimeZone tz=gc.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName());
		
		
	}

}
