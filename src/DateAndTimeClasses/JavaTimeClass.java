package DateAndTimeClasses;

import java.time.*;

public class JavaTimeClass {
	
	public static void main(String []args)
	{
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt1);
		
		OffsetDateTime odt=OffsetDateTime.now(); // Without zone information
		System.out.println(odt);
		
		MonthDay md=MonthDay.now();
		System.out.println("\n"+md.getDayOfMonth());
		System.out.println(md.getMonthValue()+"\n");
		
		YearMonth ym=YearMonth.now();
		System.out.println("\n"+ym.getYear());
		System.out.println(ym.getMonthValue()+"\n");
		
		Year y=Year.now();
		Year y1=Year.parse("2020");
		System.out.println(y.getValue());
		System.out.println(y.isAfter(y1)+"\n");
		
		Period p=Period.of(1,3,13); // We can define a period of time too.(y,m,d)
		System.out.println(p.addTo(LocalDate.now())+"\n");
		
		Duration dr=Duration.ofDays(9);
		System.out.println(dr+"\n"); //9*24 =216 Hours.
		
		Instant is=Instant.now();
		System.out.println(is);   //Time is different from LocalTime because it bases on Greenwich
		 
		
	}

}
