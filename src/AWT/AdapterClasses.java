package AWT;

import java.awt.*;
import java.awt.event.*;

//If we use Listener interfaces we have a lot of methods to override.
//Because of that we have Adapter classes that allow us to override the method that we need.
//But we can just inherit from one class. As a solution we can write another class, a inner class or 
//an anonymous class. Other than that we can implement the interface as an anonymous interface too.

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent e) {
		System.exit(0); // This means system exits without problems
	}
}

public class AdapterClasses extends Frame {
	
	TextField t;
	int count=0;
	Button b;

	AdapterClasses()
	{
		super("Ways of Event Implementation");
		
		b=new Button("Count");
		t=new TextField(3);
		add(t); add(b);
		setLayout(new FlowLayout());
		
		// Adapter Class:
		
		// With the help of outer class(MyWindowAdapter):
		// addWindowListener(new MyWindowAdapter());
		
		
        // With the help of anonymous class: (Mostly we use this one)	
		addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e)
			{
				 System.exit(0);
			}
			 
		}  );
		
		//With the help of inner class:
		
//		class MyInnerAdapter extends WindowAdapter
//		{
//			public void windowClosing(WindowEvent e)
//			{
//				System.exit(0);
//			}
//		}
//		addWindowListener(new MyInnerAdapter());
		
		//We are trying it now with ActionListener interface without writing implements ActionListener
//		b.addActionListener(new ActionListener()
//		{
//			public void actionPerformed(ActionEvent e)
//			{
//				t.setText(String.valueOf(++count));
//			}
//			
//		}); 
		
		// Now here is important. We are doing the same thing with the lambda expression.
		// We are just writing the parameter of the method,which we normally override and not the 
		// method itself like just above.
		
		b.addActionListener( (ActionEvent a)->
		{
			t.setText(String.valueOf(++count));
		} );
			
				
		setSize(600,600);
		setVisible(true);
	}
	
	public static void main(String [] args)
	{
		AdapterClasses a=new AdapterClasses();
	}
	
}
