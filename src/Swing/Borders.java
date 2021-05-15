package Swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class Borders extends JFrame{
	
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b;
	JPanel p;
	JCheckBox cb;
	JLabel spacer;
	boolean check;
	
	Borders()
	{
		
		l1=new JLabel("Benutzername: ");
		l2=new JLabel("Passwort: ");
		
		tf1=new JTextField(15);
		tf2=new JTextField(15);
		
		b=new JButton("Login");
		
		cb=new JCheckBox("Ich bin kein Roboter");
		
		p=new JPanel();
		
		Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY),"Login");
		Border br2=BorderFactory.createRaisedSoftBevelBorder();
		p.setBorder(br);
		
		
		p.add(l1);
		p.add(tf1);
		p.add(spacer = new JLabel(" "),"span, grow");
		p.add(l2);
		p.add(tf2);
		p.add(spacer = new JLabel(" "),"span, grow");
		p.add(b);
		p.add(spacer = new JLabel(" "),"span, grow");
		p.add(cb);
		
		add(p);
	
		setLayout(new FlowLayout());
		
		setSize(775,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String [] args)
	{
		Borders b=new Borders();
	}
}
