package ObjectOriented;

// Singleton is a class which can have just one object. This object is being used everwhere
// For example we have a coffee machine and every employee will use this machine.

class CofMachine{
	
	private float sugar,milk,coffee,water;
	
	static CofMachine cm=null;
	
	private CofMachine()
	{
		sugar=1.0f;
		milk=1.0f;
		coffee=1.0f;
		water=1.0f;
	}
	
	public void setSugar(float f)
	{
		sugar=f;
	}
	public void setMilk(float m)
	{
		milk=m;
	}
	public void setCoffee(float c)
	{
		coffee=c;
	}
	public void setWater(float w)
	{
		water=w;
	}
	
	 static CofMachine getInstance()
	{
		if(cm==null)
			cm=new CofMachine();
		return cm;
	}
	
}

public class Singleton {
	
	static public void main(String [] args) {
		
		CofMachine cm1=CofMachine.getInstance();
		CofMachine cm2=CofMachine.getInstance();
		CofMachine cm3=CofMachine.getInstance();

		if(cm1==cm2 && cm1==cm3)
			System.out.println("They are all the same. *Singleton*");
		
	}
	
	
}
