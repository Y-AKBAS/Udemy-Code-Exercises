package Excersie;

@FunctionalInterface
interface forLamda{
	public void display();
}

@FunctionalInterface
interface forParamLamda{
	public void display(String s);
}

@FunctionalInterface
interface forParamLamda2 {
	public int sum(int a,int b);
}

public class LambdaExpression {
	
	public static void main(String [] args) {
		
		//Instead of writing a new class that is implementing our functional interface we can use
		//lamda expression and override the method.It is very handy and it is being oft used.
		
		forLamda f=()->{System.out.println("Lamda expression");};
		
		f.display();// Display method is overriden.
		
		forParamLamda fpl=(s)->{System.out.println(s);};
		
		fpl.display("Lamda expression with parameter. Instead of s we can write anything.");
		
		forParamLamda2 fpl2=(i,j)->i+j; // we don't even have to write "return a+b"
		
		System.out.println("Sum: "+fpl2.sum(34,45));
	}

}
