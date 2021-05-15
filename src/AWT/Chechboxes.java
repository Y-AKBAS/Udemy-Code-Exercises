package AWT;

import java.awt.*;
import java.awt.event.*;


class MyFrame3 extends Frame implements ItemListener
{

	Label l;
	Checkbox c1,c2,c3;
	CheckboxGroup cbg;
	
	public MyFrame3()
	{
		super("Checkbox Application");
		
		l=new Label("Nothing is selected");
		
		cbg=new CheckboxGroup();
		
		//If we do not group them:
//		c1=new Checkbox("Java");    // Label of c1 is java
//		c2=new Checkbox("Python");  // Label of c2 is Python
//		c3=new Checkbox("C#");
		
		//if we group them:
		c1=new Checkbox("Java",false,cbg);    //false shows us the initial state.If true than checked
		c2=new Checkbox("Python",false,cbg);  
		c3=new Checkbox("C#",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		
		add(l);
		add(c1);
		add(c2);
		add(c3);
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		String str="";
		
		if(c1.getState())
			str=str+" "+c1.getLabel();
		if(c2.getState())
			str=str+" "+c2.getLabel();
		if(c3.getState())
			str=str+" "+c3.getLabel();
		if(str.isEmpty())
			l.setText("Nothing is selected");
		
		l.setText(str);
		
	}
	
}


public class Chechboxes {
	
	public static void main(String [] args)
	{
		MyFrame3 mf=new MyFrame3();
		
	}

}
