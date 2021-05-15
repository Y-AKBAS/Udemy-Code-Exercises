package Collections;

import java.util.*;
import java.io.*;


class Account implements Serializable{
	
	private String accno;
	private String name;
	private double balance;
		
	int count=101;
	
	public String getAccno()
	{
	  return accno;	
	}
	
	Account()
	{
			
	}
	
	Account(String n,double b,HashMap<String,Account> hm)
	{
		count+=hm.size();
		name=n;
		balance=b;
		
		int pos=name.lastIndexOf(" ");
		
		if(pos!=name.length()-1)
		{
			accno=name.substring(pos+1,pos+3)+(count++);
		}
		else
		{
			char c=' ';
			while( !((c>='a' && c<='z') || (c>='A' && c<='Z')) )
			{
				pos--;
				c=name.charAt(pos);
			}
			name=name.substring(0,pos+1);
			
			pos=name.lastIndexOf(" ");
			accno=name.substring(pos+1,pos+3)+(count++);
		}
		
		// or just write name=name.trim(); :)))
		
	}
	public void einzahlen(double b)
	{
		balance+=b;
	}
	public void auszahlen(double b)
	{
		if(balance>=b)
			balance-=b;
		else
			System.out.println("Ungueltige Angabe");
	}
	
	public String toString()
	{
		return "Account No: "+accno+"\nName: "+name+"\nBalance: "+balance+"\n"; 
	}
}


public class ChallengeMenuDriven {
	
	static void saveAllAccounts(HashMap<String,Account> hm)
	{
		try(FileOutputStream fos=new FileOutputStream("C:/Users/Yasin/Desktop/ChMenu.txt"))
		{
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeInt(hm.size());
			
			hm.forEach
			(
					(k,v)->
			{
				try
				{
					oos.writeObject(hm.get(k));
				}
				catch(Exception e) {System.out.println(e);}
			}
			
			);	
			
			oos.close();
			fos.close();
		}						
		catch(Exception e) {System.out.println(e);}
	}
	
	
	static void putAllAccounts(HashMap<String,Account> hm)
	{
		try(FileInputStream fis=new FileInputStream("C:/Users/Yasin/Desktop/ChMenu.txt"))
		{
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Account temp=null;
			
			int count=ois.readInt();
			for(int i=0;i<count;i++)
			{
				temp=(Account)ois.readObject();
				hm.put(temp.getAccno(),temp);
			}
			ois.close();
			fis.close();
		}
		catch(Exception e) {System.out.println(e);}
		
	}
	
	
	public static void main(String [] args)  {
		
		HashMap<String,Account> hm=new HashMap<>();
		
		//I will delete the file that is in my desktop.FileNotFoundException will be thrown
		//Just comment the line below and run it again.Enter some values and uncomment it.
		putAllAccounts(hm);
		
//		hm.clear();
//		saveAllAccounts(hm);
		
		Scanner input=new Scanner(System.in);
		int i;
		String name,accno;
		double balance;
		
		do{
			System.out.print  ("For Creating an Account  choose: 1\n"
					          +"For Deleting an Account  choose: 2\n"
							  +"For Viewing an Account   choose: 3\n"
					          +"For Viewing all Accounts choose: 4\n"
							  +"For Saving all Accounts  choose: 5\n"
					          +"For Exiting              choose: 6\n\n"
							  +"Enter your choice:");
			
			i=input.nextInt();
			input.nextLine();
			switch(i) 
			{
			
			case 1: System.out.print("\nName:");
			 		name=input.nextLine();
			 		System.out.flush();
			 		System.out.print("Balance:");
			 		balance=input.nextDouble();
			 		Account temp=new Account(name,balance,hm);
			 		accno=temp.getAccno();
			 		hm.put(accno,temp);
			 		saveAllAccounts(hm);
			 		break;
			 		
			case 2: System.out.print("\nAccount No:");
				    accno=input.next();
				    hm.remove(accno);
				    if(hm.containsKey(null))
				    hm.remove(null);
				    saveAllAccounts(hm);
				    break;
				    
			case 3: System.out.print("\nAccount No:");
					accno=input.next();
					System.out.println(hm.get(accno));
					break;
					
			case 4: System.out.println("");
				    hm.forEach((k,v)->System.out.println(v));
					break;
					
			case 5: saveAllAccounts(hm);
					break;
					
			case 6: System.out.println("Goodbye!");
				 	break;
				 	
			default: System.out.println("Undefined choice! To exit choose 6");
					 break;		
			}
			
		}while(i!=6);
		
	
		input.close();
	}

}
