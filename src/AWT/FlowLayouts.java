package AWT;

import java.awt.event.*;
import java.awt.*;

public class FlowLayouts extends Frame {
	
	Button b1,b2,b3,b4,b5,b6;
	
	FlowLayouts()
	{
		super("Flow Layout");
		
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		
		// Default Layout is border Layout. We can uncomment and try various Layouts below.
		
//		FlowLayout f=new FlowLayout(); // Not our class. It is without 's' at the end.
//		f.setAlignment(FlowLayout.RIGHT); // By Default it is center
//		f.setHgap(20); //We are adding gap between the buttons.
		
	//  f.setAlignment(FlowLayout.CENTER);
		
		GridLayout f=new GridLayout(3,2); // rows and columns
		
		setLayout(f);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		setVisible(true);
		setSize(600,600);
		
	}
	
	
	public static void main(String [] args)
	{
		
		FlowLayouts fl=new FlowLayouts();
		
	}

}
