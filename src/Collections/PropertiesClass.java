package Collections;

import java.util.*;
import java.io.*;

public class PropertiesClass  {
	
	public static void main(String [] args) throws Exception
	{
		//With properties we should just store String values.Otherwise we have error while storing the data
		Properties p=new Properties();
		
		p.put("Buchtitel","Die Aufgeregte Gesellschaft");
		p.put("Autor","Philipp Huebl");
		p.put("Seite", "432");
		p.put("Verlag","C. Bertelsmann Verlag");
		
		System.out.println(p.get("Buchtitel"));
		System.out.println(p);
		p.forEach((k,v)->System.out.print(k+"="+v+", "));
		
		
		p.store(new FileOutputStream("C:/Users/Yasin/Desktop/Test.txt"),"Storing as txt.");
		p.storeToXML(new FileOutputStream("C:/Users/Yasin/Desktop/Test.xml"), "Storing as XML");
		
		Properties pr=new Properties();
		
		pr.loadFromXML(new FileInputStream("C:/Users/Yasin/Desktop/Test.xml")); // For XML Data
		System.out.println("\n\nLoaded new property:\n"+pr);
		System.out.println("getProperty: "+pr.getProperty("Buchtitel"));
		
		pr.load(new FileInputStream("C:/Users/Yasin/Desktop/Test.txt")); // For txt
		System.out.println("\nLoaded new property:\n"+pr);
		
		
	}

}
