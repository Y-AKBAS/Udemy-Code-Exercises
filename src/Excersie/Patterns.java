package Excersie;

import java.util.Scanner;

public class Patterns {
	public static void main(String[]args) {

		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{ 
				if(j+i>5)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
				
			}
			
			for(int k=1;k<=5;k++)
			{
				    if(count+k>6)
					System.out.print("*");
					else
					System.out.print("");
			}
				
			count++;
			System.out.println("");
		}
		
		//Print triangle
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{ 
//				if(j+i>5)
//				{
//					System.out.print("* ");
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println("");
//			
//		}
		
		//Fibonacci
//		
//		Scanner sc=new Scanner(System.in);
//	    
//		System.out.print("n: ");
//		int n=sc.nextInt();
//		
//	 int a = 0 ,b =1,c=0;
//	 
//	 System.out.print(a+","+b+",");
//	 for(int i=0;i<n;i++)
//	 {
//		 c=a+b;
//		 a=b;
//		 b=c;
//		 System.out.print(c+",");
//		 
//	 }
	
	 
	 
	 
	 
  }	
}
