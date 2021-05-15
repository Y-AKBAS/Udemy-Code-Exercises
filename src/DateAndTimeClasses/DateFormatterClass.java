package DateAndTimeClasses;

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class DateFormatterClass {
	
	public static void main(String [] args)
	{
		LocalDateTime dt=LocalDateTime.now();
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter df2=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		// d:Day M:Month y:Year  H:(0-23)Hours h:(0-11)Hours m:Minutes s:Seconds z:Zone Z:Offset
		
		System.out.println(dt);
		System.out.println(df.format(dt));
		System.out.println(df2.format(dt));
		
		//If we add a time zone than we have to define a ZonedDateTime object
		
		ZonedDateTime zdt=ZonedDateTime.now();
		DateTimeFormatter df3=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss z");// can use - too
		System.out.println(df3.format(zdt));
		
		System.out.println("\nWe can extract a particular data with ChoronoField:");
		System.out.println(dt.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
		System.out.println(dt.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
		System.out.println(dt.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
		System.out.println(dt.get(ChronoField.YEAR));
		
		
	}

}
