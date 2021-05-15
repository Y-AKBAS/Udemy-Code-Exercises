package Swing;

//Swing doesn't have all required classes for developing an application. We use awt and swing together.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FirstApp extends JFrame{
	
	int count=0;
	JButton b;
	JLabel l;
	
	FirstApp()
	{
		super("First Swing App");
		
		l=new JLabel("Clicked "+count+" times");
		b=new JButton("   Click   ");
		
		// We can click with this operation with space and enter key too. It will work
		getRootPane().setDefaultButton(b);
		
		//We can add an image too:
		//b.setIcon(new ImageIcon("C:\\Users\\Yasin\\Desktop\\download.png"));
		
		//If we move the cursor we can see a tool tip via setToolTipText("");
		l.setToolTipText(" Counter ");
		
		b.addActionListener((ActionEvent a)->{
			l.setText("Clicked "+(++count)+" times");
		});
		
		// Our program doesn't stop automatically if we close it. We have to write some code.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// FlowLayout comes from AWT.
		setLayout(new FlowLayout());
		
		add(l);
		add(b);
		
		setSize(600,600);
		setVisible(true);
	}
	
	

	public static void main(String [] args)
	{
		FirstApp a = new FirstApp();
	}
	
}
