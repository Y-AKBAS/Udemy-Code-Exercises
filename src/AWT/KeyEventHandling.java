package AWT;

import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class KeyEventHandling extends Frame implements KeyListener{

	Label l1,l2,l3,l4;
	
	KeyEventHandling()
	{
		super("Key event handling");
		
		l1=new Label("");
		l2=new Label("");
		l3=new Label("");
		l4=new Label("");
		
		setLayout(null);
		
		l1.setBounds(170,45,300,20); // x axis, y axis, width, height
		l2.setBounds(30,75,150,20);
		l3.setBounds(30,105,150,20);
		l4.setBounds(30,135,150,20);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		l1.setText("We can see now how Key event with keybord works.");
		
		addKeyListener(this);
		
		
		setSize(600,600);
		setVisible(true);
	}	
	
	@Override
	public void keyTyped(KeyEvent e) 
	{
		l3.setText("Key typed");
		l2.setText("");
		l4.setText("");
	}

	@Override
	public void keyPressed(KeyEvent e) // if we press a key continuously
	{
		l4.setText("");
		l2.setText("Key is being pressed");
		l3.setText("");
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		l4.setText("Key realesed");
		l2.setText("");
		l3.setText("");
	}
	
	public static void main(String [] args)
	{
		KeyEventHandling k=new KeyEventHandling();
		
	}

}
