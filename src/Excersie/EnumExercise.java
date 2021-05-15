package Excersie;

enum Dept{
	IT,HR,MA,FA;
// Enum classes can have Constructors and methods too. But They must be either default or private.
	
	private Dept() 
	{
		System.out.println("Name: "+ this.name());
	}
	public String toString() {
	return "All names are being loaded, if we define a type and constructor will be called.\n";
	}
}

enum Modul{
	
	// Modul is a class and the modules are objects of this class.
	Java("Abdulbari","Udemy"),
	DatenbankSysteme("E.Rahm","Uni"),
	Algorithmen("Stadler,Gatter,Abdulbari","Uni,YouTube"),
	Cpp("Eisenecker","Uni");
	
	String instructor;
	String wo;
	
	Modul(String instructor,String wo)
	{
		this.instructor=instructor;
		this.wo=wo;
	}
	
	public String getInstructor()
	{
		return instructor;
	}
	
	public String getWo()
	{
		return wo;
	}
	
}


public class EnumExercise 
{
	
	public static void main(String [] args)
	{
		
		Dept f=Dept.FA;
		Dept list[]=Dept.values();
		
		for(Dept x:list)
			System.out.print(x+" ");
		
		System.out.println("");
		
		Modul m=Modul.Java;
		
		System.out.println("Instructor of Java: "+m.getInstructor());
		System.out.println("Where: "+m.getWo());
		
	}	
	
}
