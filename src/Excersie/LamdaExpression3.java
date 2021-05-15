package Excersie;

@FunctionalInterface
interface MyLambda{
	public void display(String s);
}

@FunctionalInterface
interface MyLambda2{
	public int compare(String s,String st);
}


public class LamdaExpression3 {
	
	public static void reverse(String s) {
		
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		String str=sb.toString();
		System.out.println(str);
	}
	
	public static void main(String [] args) {
		
		MyLambda mld=System.out::println;
		mld.display("Was soll das?");
		
		MyLambda mlr=LamdaExpression3::reverse;
		mlr.display("Was soll das?");
		
		mld.display("We can make it so shorter.");
		
		MyLambda2 mlc=String::compareTo;
		
		System.out.println(mlc.compare("Yasin","Yasin"));
		System.out.println(mlc.compare("Yasin","yasin"));
		
		
		
	}

	
}
