package Excersie;

public class Arrays_Exemp {

	public static void display(int []a)
	{
		System.out.print("{");
		for(int i=0;i<a.length;i++)
		{
			if(i==a.length-1)
			System.out.print(a[i]);
			else
			System.out.print(a[i]+",");
			
		}
		System.out.print("}");
		System.out.println("");
	}
	
	
	public static void main(String [] args)
	{
		
//		Scanner sc=new Scanner(System.in);
//		
//		//left rotation
//		int arr []= {3,9,7,8,12,16,14,6,15,5,4,10};
//		
//		int temp=arr[0];
//		for(int i=0;i<arr.length-1;i++)
//		{
//			arr[i]=arr[i+1];
//		}
//		arr[arr.length-1]=temp;
//		
//		display(arr);
//				
//		//Right rotation
//		int ar []= {3,9,7,8,12,16,14,6,15,5,4,10};
//		temp=ar[ar.length-1];
//		for(int i=ar.length-1;i>0;i--)
//		{
//			ar[i]=ar[i-1];
//		}
//		ar[0]=temp;
//		
//		display(ar);
//		
//		//Inserting an element.
//		int [] a= new int [5];
//		a[0]=0;
//		a[1]=1;
//		a[2]=2;
//		a[3]=3;
//		
//		System.out.print("Stelle: ");
//		int stelle=sc.nextInt();
//		System.out.print("Wert: ");
//		int wert=sc.nextInt();
//		
//		for(int i=a.length-1;i>=stelle;i--)
//		{
//			a[i]=a[i-1];
//		}
//		a[stelle]=wert;
//		
//		display(a);
//		
//		//Deleting an element
//		
//		System.out.print("Stelle: ");
//		int pos=sc.nextInt();
//		
//		for(int i=pos;i<a.length-1;i++)
//		{
//			a[i]=a[i+1];
//		}
//		
//		display(a);
//		
//		// Reverse copy
//		int [] array= {1,2,3,4,5,6,7,8,9};
//		int [] array2= new int[array.length];
//		
//		for(int i=array.length-1,j=0;i>=0;i--,j++)
//		{
//			array2[j]=array[i];
//		}
//		
//		display(array2);
		
		//2D Arrays
	
		//How to define a jagged array;
//		int A[][];
//		A=new int[3][];
//		A[0]=new int[4];
//		A[1]=new int[3];
//		A[2]=new int[5];
//		
//		for(int i=0;i<A.length;i++)
//		{
//			for(int j=0;j<A[i].length;j++)
//			{
//				System.out.print(A[i][j]+" ");
//			}
//			System.out.println("");
//		}
//		
//		for(int x[]:A)
//		{
//			for(int j:x)
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println("");
//		}
		
		//Add two matrices
		
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int B[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int C[][]= new int [A.length][A[0].length];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		for(int x[]:C)
		{
			for(int y:x)
			{
				System.out.printf("%2d ",y);
			}
			System.out.println("");
		}
		
		
		
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        
        java.util.Arrays.sort(arr);
        
        for(String x:arr)
            System.out.println(x);
		
		
		
		// Find the second largest element.
//		int max1=arr[0],max2=arr[0];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max1)
//			{
//				max2=max1;
//				max1=arr[i];
//			}
//			else if(arr[i]>max2)
//			{
//				max2=arr[i];
//			}
//		}
//		
//		System.out.println("Max2 :"+max2);
	
	}	
}
