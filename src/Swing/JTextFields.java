package Swing;

import java.awt.*;
import javax.swing.*;
import java.text.*;
import javax.swing.text.NumberFormatter;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class JTextFields extends JFrame {
	
	JTextField tf;
	JFormattedTextField ftf1,ftf2;
	
	JTextFields()
	{
		tf=new JTextField(10);
		
		add(tf);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		ftf1=new JFormattedTextField(dtf);
		LocalDateTime now=LocalDateTime.now();
		ftf1.setColumns(10);
		ftf1.setValue(dtf.format(now));
		add(ftf1);
		
		NumberFormat nf=NumberFormat.getInstance();
		NumberFormatter nft=new NumberFormatter(nf);
		nft.setAllowsInvalid(false);
		nft.setMaximum(100000000);
		nft.setMinimum(50);
		ftf2=new JFormattedTextField(nft);
		ftf2.setColumns(15);
		ftf2.setValue(50);
		add(ftf2);
		
		setLayout(new FlowLayout());
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String [] args)
	{
		JTextFields t=new JTextFields();
	}

}
