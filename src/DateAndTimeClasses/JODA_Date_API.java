package DateAndTimeClasses;

import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class JODA_Date_API {
	
	public static void main(String [] args)
	{
		//Date class includes date and time together and it's mutable.We can change date and time
		//But LocalDate,LocalTime and LocalDateTime classes of JODA are immutable
		
		System.out.println("Deprecated Date Class: \n");
		Date d=new Date();
		System.out.println(d);
		d.setHours(15);
		System.out.println(d);
		
		System.out.println("\nLocalDate Class: \n");
		
		LocalDate ld=LocalDate.now(); //It gets the date and the time from PC
		System.out.println(ld);
		
		ld=LocalDate.of(1994,8,18); //We can define any other date too.
		System.out.println(ld);
		
		ld=LocalDate.parse("1994-08-18");//Day and month must have 2 digits like 08 otherwise error
		System.out.println(ld);
		
		ld=ld.plusYears(27);//We can add and subtract years,days,months etc. to our date
		System.out.println(ld);
		
		System.out.println("\nLocalTime Class: \n");
		
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		lt=lt.minusHours(4); //We can add and subtract years,days,months etc. to our date
		
		System.out.println("\nLocalDateTime Class: \n");
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		
	}

}
