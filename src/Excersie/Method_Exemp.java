package Excersie;

public class Method_Exemp {
	
	static void varArgs(int ... x)
	{
		// This method takes as much as int arguments as we want.
		// It is like an array.It can take array arguments too.
		for(int a:x)
			System.out.print(a+" ");
		System.out.println("");
	}
	
	static int varArgsMax(int ... x)
	{
		if(x.length==0)
			return Integer.MIN_VALUE;
		int max=x[0];
		for(int i:x)
		{
			if(i>max)
				max=i;
		}
			return max;
	}
	
	static int varArgsSum(int ...x )
	{
		if(x.length==0)
			return Integer.MIN_VALUE;
		int sum=0;
		for(int i:x)
			sum+=i;
		return sum;
	}
	
	
	public static void main(String [] args)
	{
		
		System.out.println(isPrime(26));
		System.out.println(GCD(19,23));
		System.out.println(reverse(137));
		
		int a []= {1,2,3,4,5,6,7,8,9};
		//a=reverse(a);
		for(int x:reverse(a))
			System.out.print(x+" ");
		System.out.println("");
		for(int x:a)
			System.out.print(x+" ");
		
		System.out.println("");
		
		varArgs(3,4,5,6,7);
		varArgs(new int[] {12,13,14,15,16});
		
		System.out.println("Max of variable Args: "+varArgsMax(3,14,4,16));
		System.out.println("Return of empty variable Args(Max): "+varArgsMax());
		
		System.out.println("Sum of variable Args: "+varArgsSum(12,13,14,5,3,8));
		
	}
	
	static boolean isPrime(int x)
	{
		for(int i=2;i<x/2;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static int GCD(int x,int y)
	{		
		while(x!=y)
		{
			if(x>y)
				x=x-y;
			else if(y>x)
				y=y-x;
		}
		return x;
	}
	
	static int reverse(int x)
	{
	   int r,reversed=0;
	   while(x!=0)
	   {
		   r=x%10;
		   x=x/10;
		   reversed=reversed*10+r;
	   }
	   return reversed;
	}	
	
	static int[] reverse(int[]a)
	{
		int temp;
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		return a;
	}
	

}
