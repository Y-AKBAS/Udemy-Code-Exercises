package AWT;

import java.awt.*;
import java.awt.event.*;


class Text extends Frame{
	
	Label l1,l2;
	TextField tf;
	
	Text()
	{
		super("TextFields");
		
		l1=new Label("No text is entered.");
		l2=new Label("Enter is not yet hit");
		
		tf=new TextField(25);
		
		tf.setEchoChar('*');
		
		Handler h=new Handler();
		
		tf.addTextListener(h); // we could write tf.addTextListener(this) as before but while our 
		tf.addActionListener(h); // constructor is not complete we are passing it.That is dangerous.
		
		setLayout(new FlowLayout());
		
		add(l1);
		add(tf);
		add(l2);
		
		setSize(500,500);
		setVisible(true);
			
	}
	
	//Inner Class
	class Handler implements TextListener,ActionListener{

		@Override
		public void textValueChanged(TextEvent e) {
			l1.setText(tf.getText());
			l2.setText("Enter is not yet hit");//If we write something new it will be as before
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			l2.setText(tf.getText());
		}
		
	}
}



public class TextFields {
	
	public static void main(String [] args)
	{
		Text t=new Text();
	}

}
