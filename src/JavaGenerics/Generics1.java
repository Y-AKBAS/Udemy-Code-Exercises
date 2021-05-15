package JavaGenerics;

class Generics<T>{ // We can use this class to have type safety,which we don't have
	 			   // if we just use Object class like in main class.
	@SuppressWarnings("unchecked")
	T data[]=(T[]) new Object[4];
	int le=0;
	
	public void append(T value) {
		data[le++]=value;
	}
	
	public void display() {
		for(int i=0;i<le;i++)
			System.out.println(data[i]);
	}
	 
	
}

public class Generics1 {
	
	public static void main(String []args)throws Exception{
		
		
		Object obj[]=new Object[4];
		
		obj[0]="String";
		obj[1]=21;
		obj[2]=23.4f;
		obj[3]='c';
		
		for(int i=0;i<obj.length;i++)
			System.out.println(obj[i]);
		
		
		Generics<String> g=new Generics<String>();
		
		g.append("Hi I am ");
		g.append("a generic");
		g.append("class");
		
		g.display();
		
		
	}

}
