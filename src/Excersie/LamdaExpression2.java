package Excersie;

@FunctionalInterface
interface Common{
	
	public void display();
}


class UseCommon{
	
	public void callCommon(Common c) {
		c.display();
	}
}

class Demo{
	
	public void method1() {
		
		UseCommon c1=new UseCommon();
		c1.callCommon(()->{System.out.println("Hello");});
	}	
}


public class LamdaExpression2 {

	public static void main(String [] args) {
		
		Demo d1=new Demo();
		d1.method1();		
	}
}
