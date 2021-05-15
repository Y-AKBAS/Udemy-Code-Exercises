package AWT;

import java.awt.*;
import java.awt.event.*;

class MyArea extends Frame 
{
	TextArea ta; // parameters are row and column
	TextField tf;
	Label l;
	Button b;
	
	MyArea()
	{
		super("Showing TextArea class");
		
		ta=new TextArea(30,80);
		l=new Label("I am a Label                    ");// So that we can see longer text field.
		tf=new TextField(30);
		b=new Button("send");
		
		
		Handler h=new Handler();
		
		b.addActionListener(h);
		
		setLayout(new FlowLayout());
		
		
		add(ta);
		add(l);
		add(tf);
		add(b);
		
		setSize(600,600);
		setVisible(true);
		
	}
	
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			ta.insert(tf.getText(),ta.getCaretPosition());//Caret is cursor.Where we click,there will be sent
			// ta.append(tf.getText());
			// l.setText(ta.getSelectedText()); //We can select a part of text and send it to label. 
			
			
			
		}
	}
	
	
}

public class TextAreas {
	
	public static void main(String [] args)
	{
		MyArea ma=new MyArea();
	}

}
