package AWT;

import java.awt.*;
import java.awt.event.*;



public class Panels extends Frame implements ItemListener
{
	
	Button b1,b2,b3;
	
	TextField t1,t2,t3;
	
	
	Panel p1,p2;
	Panel cp;
	Panel mainp;
	
	Checkbox c1,c2;
	
	CardLayout c;
	
	public Panels()
	{
		super("CardLayouts with panels");
		
		CheckboxGroup cb=new CheckboxGroup();
		
		c1=new Checkbox("One",true,cb);
		c2=new Checkbox("Two",true,cb);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		
		b1=new Button("one");
		b2=new Button("two");
		b3=new Button("three");
		
		t1=new TextField(15);
		t2=new TextField(15);
		t3=new TextField(15);
		
		//Panel for Checkboxes
		cp=new Panel();
		cp.add(c1);
		cp.add(c2);
		
		// Panel for Buttons
		p1=new Panel(); 
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		
		// Panel for TextFields
		p2=new Panel();
		p2.add(t1);
		p2.add(t2);
		p2.add(t3);
		
		// Main Panel 
		mainp=new Panel();
		mainp.add("One",p1);
		mainp.add("Two",p2);
		
		c=new CardLayout();
		mainp.setLayout(c);
		
		add(cp,BorderLayout.NORTH);
		add(mainp,BorderLayout.CENTER);
		
		setSize(600,600);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(c1.getState())
			c.first(mainp);
		else
			c.last(mainp);
		
	}

	
	public static void main(String [] args)
	{
		Panels p=new Panels();
		
	}
	
}
