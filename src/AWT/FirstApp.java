package AWT;

import java.awt.*;

class MyFrame extends Frame
{
	Label l;
	TextField tf;
	Button b;
	
	//We can write those with a non parameterized constructor too. 
	MyFrame(Label l,TextField tf,Button b)
	{
		super("My first App with MyFrame");
		this.setLayout(new FlowLayout());
		
		this.l=l;
		this.tf=tf;
		this.b=b;
		
		this.add(l);
		this.add(tf);
		this.add(b);
		
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	
}

public class FirstApp {  // Instead of writing another class we can extend this class from Frame too.

	public static void main(String [] args)
	{
		// Either we can do this with Frame class or we can define our Frame class and inherit from Frame class 
		Frame f=new Frame("My first App");
		f.setLayout(new FlowLayout());
		
		Button b=new Button("Send");
		Label l=new Label("Message: ");
		TextField tf=new TextField(30);
		
		f.add(l);
		f.add(tf);
		f.add(b);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		//We are doing it with our class now
		
		Label ml=new Label("Grund: ");
		TextField mtf=new TextField(30);
		Button mb=new Button("Senden");
		
		MyFrame mf=new MyFrame(ml,mtf,mb);
	}
}
