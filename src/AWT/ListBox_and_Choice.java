package AWT;

import java.awt.*;
import java.awt.event.*;

class ListBoxes extends Frame
{
	List l;
	Choice c;
	TextArea ta;
	
	ListBoxes()
	{
		super("List Boxes and Choice");
		
		l=new List(4,true);// 4 of them will be visible and true means multiple items can be selected
		c=new Choice();
		ta=new TextArea(10,20);
		
		l.add("Montag");
		l.add("Dienstag");
		l.add("Mittwoch");
		l.add("Donnerstag");
		l.add("Freitag");
		l.add("Samstag");
		l.add("Sonntag");
		
		c.add("Januar");
		c.add("Februar");
		c.add("Maerz");
		c.add("April");
		c.add("Mai");
		
		setSize(600,600);
		setVisible(true);
		
	}
	
	
	class Handler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}

public class ListBox_and_Choice {
	
	public static void main(String [] args)
	{
		
	}

}
