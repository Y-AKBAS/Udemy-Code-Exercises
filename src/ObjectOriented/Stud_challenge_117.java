package ObjectOriented;

class Product{
	
	private String itemNo; //We should not have a setItemNo() method.It should exist at constr. time.
	private String name;   //We should not have a setItemNo() method too.
	private float price;
	private short quantity;
	
	public Product()
	{
		setItemNo("");
		setName("");
	}
	
	public Product(String i,String s,float p,short q)
	{
		setItemNo(i);
		setName(s);
		setPrice(p);
		setQuantity(q);
	}
	
	public Product(String i,String s,float p)
	{
		setItemNo(i);
		setName(s);
		setPrice(p);
	}
	
	//We should not have a setName() method because we should not change it.
	public void setName(String name_)
	{
		if(name.equals(""))
		    name="NoName";
		else
		   name=name_;
	}
	
	//We should not have a setItemNo() method too because we should not change it.
	public void setItemNo(String no)
	{
		if(!no.equals(""))
		   itemNo=no;
		else
			itemNo="NoNumber";
	}
	
	public void setPrice(float p)
	{
		if(p>0)
			price=p;
		else
			price=0.0f;
	}
	
	public void setQuantity(short q)
	{
		if(q>0)
			quantity=q;
		else
			quantity=0;
	}
	
	public String getItemNo()
	{
		return itemNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
}

class Customer{
	
	private String cid;
	private String name;
	private String adress;
	private String phoneNum;
	
	public Customer(String id,String name_)
	{
		cid=id;
		name=name_;
	}
	
	public Customer(String id,String name_,String adr,String phon)
	{
		cid=id;
		name=name_;
		setAdress(adr);
		setAdress(phon);
	}
	public void setAdress(String a)
	{
		if(!a.equals(""))
			adress=a;
		else
			adress="No Adress";
	}
	
	public void setPhoneNum(String p)
	{
		if(!p.equals(""))
			phoneNum=p;
		else
			phoneNum="No Phone numbers";
	}
	
	public String getCid()
	{
		return cid;
	}
	public String getName()
	{
		return name;
	}
	public String getAdress()
	{
		return adress;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	
	public String toString()
	{
		return "ID: "+cid+" Name: "+name+"\n";
	}
		
}



public class Stud_challenge_117 {

  public static void main(String []args)
  {
	  
	 Customer c_list[]=new Customer[3];
	 
	 c_list[0]=new Customer("01","Halit");
	 c_list[1]=new Customer("02","Caca");
	 c_list[2]=new Customer("03","Mr abi");
	 
	 for(Customer x:c_list)
		 System.out.println(x);
	 
	 
	  
	  
	  
  }
	
}
