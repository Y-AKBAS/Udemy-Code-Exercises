package ObjectOriented;


interface Member{
	public void callBack();
}

class Store{
	
	Member mem[]=new Member[100];
	private int count=0;
	
	public void register(Member m) {
		mem[count++]=m;
	}
	
	public void inviteSale() {
		
		for(int i=0;i<count;i++)
		{
			mem[i].callBack();
		}
	}
}


class Customer2 implements Member{
	
	private String name;
	
	Customer2(String s){
		name=s;
	}
	
	public void callBack() {
		System.out.println("Ok, i will visit "+name);
	}
	
}

public class InterfaceChallenge {
	
	public static void main(String []args){
		
		Store s=new Store();
		Customer2 c1=new Customer2("Stefan Schmidt");
		Customer2 c2=new Customer2("Otto Müller");
		Customer2 c3=new Customer2("Julia Tischendorf");
		
		s.register(c3); // At register method we have just member interface.But Customer implements
		s.register(c2); // the member interface and because of that it a member too.
		s.register(c1);
		
		s.inviteSale();
		
		
	}

}
