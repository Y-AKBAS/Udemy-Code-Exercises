package JavaGenerics;


class Super2 <T extends Number> // We say here that the class can take many types but they 
{								// should be numbers.They can not be String
	
}
class Super<T>{
	
	@SuppressWarnings("unchecked")
	T Arr[]=(T[]) new Object[5];
	int len=0;
	
	public void append(T value) {
		Arr[len++]=value;
	}
	
	public void display() {
		for(int i=0;i<len;i++)
			System.out.println(Arr[i]);
	}
	
}


class Child1<T> extends Super<T>{
	
}

class Child2 extends Super<String>{ // This one takes all the properties for String type
	
}

class Child3 extends Super{ // This one takes Object type
	
}


public class BoundsOfGenerics {
	
	public <E> void show(E [] list) //Our generic method. E stands for element and it is convention
	{
		for (E x:list)
			System.out.print(x+" ");
		System.out.println("");
	}
	
	public static void main(String [] args) throws Exception{
		
		String str[]= {"ge","ne","ric"};
		Character c []={'G','E','N','E','R','I','C'};
		char ch[]={'G','E','N','E','R','I','C'};//Doesn't work with generic.We need Character class
		
		BoundsOfGenerics b=new BoundsOfGenerics();
		b.show(new String[]{"Gen","eric"});
		b.show(str);
		b.show(c);
	//	b.show(ch);  //ch doesn't work. Because char is a primitive type. We need an object here.
		
	}

}
