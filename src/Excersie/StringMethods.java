package Excersie;

import java.lang.*;
import java.util.Scanner;

public class StringMethods {
	
	public static void main (String [] args) {
		
	// toLowerCase()/toUpperCase method does return a new object and the old object is than gone.
		
		String str="JaVa" ;     // This will be in pool created.
		str=str.toLowerCase();  // This will be in heap created.
		System.out.println(str);
		
	// Trim trims the blank spaces and It doesn't modify the object but creates a new object. 
		
		String str1="  Welcome  ";
		System.out.println(str1);
		System.out.println(str1.trim());
		
	// Substring()
		
		String str2="Welcome";
		System.out.println(str2.substring(3));  //From position 3 till end.
		System.out.println(str2.substring(3,6));//From position 3 till 6(without 6).
		
    // replace('','')
		
		String str3="Welcome";
		System.out.println(str3.replace('e','k'));
		
    // startsWith(), endsWith() 
		
		String str4="www.abcd.com";
		System.out.println(str4.startsWith("www"));
		System.out.println(str4.endsWith("com"));
			
	// 	charAt(),indexOf(),lastIndexOf()
		
		System.out.println(str4.charAt(3));  
		System.out.println(str4.indexOf("ab"));
		System.out.println(str4.indexOf('.'));   // This gives us just the first dot.
		System.out.println(str4.indexOf('.',4)); // We can set a beginning point.
		System.out.println(str4.lastIndexOf('c'));
	
	// equals(),equalsIgnoreCase(),compareTo() (Compare gives us also the difference between the chars)
		
		String str5="JAVA",str6="java",str7="python",str8="python";
	
	    System.out.println(str5.equals(str6));
	    System.out.println(str5.equalsIgnoreCase(str6));
	    System.out.println(str7.equals(str8));
	    System.out.println(str5.compareTo(str6)); //Dict.Order,if smaller -1,if same 0,if greater 1
	    System.out.println(str6.compareTo(str7));
	    System.out.println(str7.compareTo(str6));
	    int i=str6.compareTo(str7);
	    System.out.println("i: "+i);
	    
	// equals() vs. ==   
	// equals() compares the content of variables. 
    // == compares if the variables referencing the same content.
	    
	   String str9="java"; 
	   String str0 =new String("java");    
	   
	   System.out.println(str9==str0);         // gives false
	   System.out.println(str9.equals(str0));  // gives true
	    
	 // valueOf() converts any datatype to another datatype
	   
	   int x=2345;
	   String str11=String.valueOf(x);
	   System.out.println(str11);
	    
// matches().  * shows us that the letter can come many times.{number} shows us how many times can
// come the letters. + means it should be used at least 1 times. 
	   
	      String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("1.Return Value :" );
	      System.out.println(Str.matches("(.*)Tutorials(.*)"));

	      System.out.print("2.Return Value :" );
	      System.out.println(Str.matches("Tutorials"));

	      System.out.print("3.Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	      
	      System.out.print("4.Return Value :" );
	      System.out.println(Str.matches("[a-z]*")); // Since we have capital letters.It is false.
	      
	      System.out.print("5.Return Value :" );
	      System.out.println(Str.matches("[a-z]*-[A-Z]*")); // Since we have "." it is false again.
	      
	      String STR="aabbabaacccaccba";
	      System.out.print("6.Return Value: ");
	      System.out.println(STR.matches("[abc]*"));//Since string consist of these 3 Letters true.
	  
	   // Student Challenge: Seperate the domain name and username and check if it is a gmail acc.
	      
//	      System.out.println("E-mail: ");
//	      Scanner input=new Scanner(System.in);
//	      String email=input.nextLine();
//	      
//	      int pos=email.indexOf("@");
//	      
//	      String userName=email.substring(0,pos);
//	      String domainName= email.substring(pos+1);
//	      
//	      System.out.println("Username: "+userName);
//	      System.out.println("Domain: "+domainName);
//	      System.out.println("Gmail: "+(domainName.startsWith("gmail")));
//	      System.out.println("Gmail: "+(email.matches(".*@gmail.com")));
	      
	   // Student Challenge: Check if a number is in binary,hexadecimal or date form. 
	      
	      int b=1001110;
	      String bin=String.valueOf(b);
	      System.out.println("Binary: "+bin.matches("[01]+")); 
	      
	      int h=0XBDF;
	      String hex=String.valueOf(h);
	      System.out.println("Hexadecimal: "+hex.matches("[0-9A-F]*"));
	      
	      String d="01/12/2020";
	      System.out.println("Date: "+d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
	      
	 // Student Challenge: Remove special chars,remove extra spaces,find number of words in a str.   
	      
	      Scanner sc=new Scanner(System.in);
	      System.out.println("String: ");
	      String s=sc.nextLine();
	      
	   // System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));// ^ is not here.
	      
	   // s=s.trim();
	   // System.out.println(s.replaceAll("\\s+"," "));
	      
	      s=s.replaceAll("\\s+"," ").trim();
	      String words [] =s.split("\\s");
	      System.out.println(words.length);
	      
	      
	}

}
