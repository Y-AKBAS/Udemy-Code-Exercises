package JavaInputOutputStream;

import java.io.*;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class Customer implements Serializable{
	
	String cId,name,phNo;
	
	static int count=111;
	
	Customer(){} // Do not forget this default constructor while writing with serializable
	
	Customer(String name,String phNo){
		
		this.name=name;
		this.phNo=phNo;
		int pos=name.lastIndexOf(" ")+1;
		cId=this.name.substring(0,2)+this.name.substring(pos,pos+2)+count++;
	}
	
	public String toString() {
		
		return "\nCustomer Details:\n"+
				"\nCustomer ID:"+cId+
				"\nName:"+name+
				"\nPhone No:"+phNo;
	}
}

public class Challange3 {
	
	public static void main(String [] args) {
		
		Customer c1=new Customer("John Walter","01234");
		Customer c2=new Customer("Jack Black","34562356");
		Customer c3=new Customer("Walter White","2342352");
		Customer c4=new Customer("Stefanie White","2342356");
		
		Customer list[]= {c1,c2,c3,c4};
		
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Yasin\\Desktop\\Student3.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.write(list.length); //We should first store the length of array.
			
			for(int i=0;i<list.length;i++)
				oos.writeObject(list[i]);
			
			oos.close();
			fos.close();
			
		}catch(Exception e) {System.out.println(e);}
		
		try(FileInputStream fis=new FileInputStream("C:\\Users\\Yasin\\Desktop\\Student3.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			int le=ois.read(); // We should read first the length of the array.
			
			Customer arr[]=new Customer[le];
			
			for(int i=0;i<le;i++)
				arr[i]=(Customer)ois.readObject();
			for(Customer cs:arr)
				System.out.println(cs);
			
			// Search for a particular customer:
			
			System.out.print("\nCustomer name: ");
			Scanner input=new Scanner(System.in);
			String n=input.nextLine();
			
			for(int i=0;i<le;i++) {
				if(n.equalsIgnoreCase(arr[i].name))
				{
					System.out.println(arr[i]);
				}
			}
			
		}catch(Exception e) {System.out.println(e);}
		
		
		
	}

}
