package JavaGenerics;

class Data<T>{
	
	private T data;
	
	public void setData(T data) {
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
}

class MyArray<T>{
	
	@SuppressWarnings("unchecked")
	private T A[]=(T[])new Object[10];
	private int le=0;
	
	public void append(T value)
	{
		A[le++]=value;
	}
	
	public void display() 
	{
		for(int i=0;i<le;i++)
			System.out.println(A[i]);
	}
	
}


public class GenericClass {
	
	public static void main(String []args) {
		
		Data<String> d=new Data<String>();
		d.setData("First");
		System.out.println(d.getData());
		
		Data<Integer> d1=new Data<Integer>();
		d1.setData(12);
		System.out.println(d1.getData());
		
		System.out.println("");
		
		MyArray<String> ma=new MyArray<String>();
		
		ma.append("First");
		ma.append("Second");
		ma.append("Third");
		
		ma.display();
		
		System.out.println("");

		
		// If we don't mention the type. It will be like a common Object. See below;
		
		MyArray arr=new MyArray(); 
		
		arr.append("String value");
		arr.append(15);
		arr.append(45.6f);
		arr.append('a');
		
		arr.display();
		
		System.out.println("");

	}

}
