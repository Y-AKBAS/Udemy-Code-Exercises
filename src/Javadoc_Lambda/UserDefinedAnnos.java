package Javadoc_Lambda;

import java.lang.annotation.*;


@Documented //If we use this,than our defined annotation will be in javadoc documented too.

@interface MyAnno{ //We can define our annotations. @ don't forget 
	
	String name();
	String project();
	String version() default "13";//We don't have to write it every time.We have default value. 
}

@MyAnno(name="Akbas",project="User defined annotations")
public class UserDefinedAnnos {
	
	//We can write our definitions overall.
	public static void main(String [] args) {
		
		
	}

}
