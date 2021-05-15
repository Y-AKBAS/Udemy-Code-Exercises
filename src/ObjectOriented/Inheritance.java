package ObjectOriented;

class Account{
	
	private String acNo;
	private String name;
	private String address;
	private String dob;
	private String phonNum;
	protected double balance;
	
	public Account() {
		System.out.println("Account class constructor.");
	}
	
	public Account(String acNo,String name,String address,String dob,String phonNum)
	{
		this.acNo=acNo;
		this.name=name;
		this.address=address;
		this.dob=dob;
		this.phonNum=phonNum;
		balance=0.0;
	}
	
	public void setBalance(double b)
	{
		balance=b;
	}
	
	public void setPhoneNum(String p)
	{
		phonNum=p;
	}
	
	public String getAcNo()
	{
		return acNo;
	}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getDob()
	{
		return dob;
	}
	public String getPhonNum()
	{
		return phonNum;
	}
	public double getBalance()
	{
		return balance;
	}
		
}


class SavingsAccount extends Account
{
	public SavingsAccount() {
		System.out.println("Savings Account constructor.");
		System.out.println("Altough we create just a Sav_acc class.Because of the inheretance we create an Account class too.");
			
	}

	public void deposit(double d)
	{
		balance=balance+d;
	}
	
	public void withdraw(double w)
	{
		if(balance>=w)
		    balance=balance-w;
		else
			System.out.println("Not enough amount");
	}
	
}


class LoanAccount extends Account{
	
	public void LoanAccoutn() {
		System.out.println("Loan Account constructor.");
	}
	
	 public void payEMI(long amt)
	    {
	        balance-=amt;
	    }
	    public void repay(long amt)
	    {
	        if(balance==amt)
	            balance=0;
	    }
}


public class Inheritance {
	
	public static void main(String []args)
	{
		SavingsAccount sa=new SavingsAccount();
		
		sa.setBalance(120);
		sa.deposit(80);
		System.out.println(sa.getBalance());
		
		
	}

}
