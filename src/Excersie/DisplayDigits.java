package Excersie;

import java.lang.*;
import java.util.Scanner;

public class DisplayDigits {
	
	public static void main (String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Number: ");
		 int num=sc.nextInt();
		 
		 int temp=num;
		 int r=0,count=0;
		 
		 //Find the number of digits
		 while(num>0)
		 {
			 num=num/10;
			 count++;
		 }
		 
		 System.out.println("Number of digits: "+count);
		 num=temp;
		 
		 
		 // Print digits and reverse the number
		 while(num>0)
		 {
			 r=num%10;
			 num=num/10;		 
			 System.out.println((count--)+". digit: "+r);
		 }
		 
		 //reverse the number and if its palindrome
		 num=temp;
		 int reversed=0;
		 
		 while(num>0)
		 {
			r=num%10;
			num=num/10;
			reversed=reversed*10+r;
		 }
		 
		 System.out.println("Reversed: "+reversed);
		 
		 if(reversed==temp)
			 System.out.println("It is a palindrome");
		 else
			 System.out.println("It is not a palindrome");
		 
		 //Armstrong
		 num=temp;
		 int armstrong=0;
		 
		 while(num>0)
		 {
			 r=num%10;
			 num/=10;
			 armstrong=armstrong+r*r*r;
		 }
		 
		 if(armstrong==temp)
		 {
			 System.out.println("Its a Arsmtrong number");
		 }
		 else
		 {
			 System.out.println("Its not a Armstrong number");
		 }
	     
		 
		 // factorial
		 
//		 Scanner sc=new Scanner(System.in);
//		 System.out.print("Number: ");
//		 int num=sc.nextInt();
		 
//		 int sum=1;
//		 
//		 if(num>=0)
//		 {
//			 for(int i=1;i<=num;i++) 
//		     {
//		    	 sum=sum*i;
//		     }
//			 
//			 System.out.println("Factorial: "+sum);
//		 }
//	     else
//	    	 System.out.println("Invalid number!");
	     
	}
}
