package AWT;

import java.awt.*;
import java.awt.event.*;


class MyFrame1 extends Frame implements ActionListener
{
	int count=0,back=20;
	Label l,la;
	Button b,bu;
	
 public	MyFrame1()
 {
	 super("Action Listeners");
	 
	 l=new Label("  "+String.valueOf(count));//We add some space so that it seems better
	 b=new Button("Count");
	 
	 la=new Label("  "+String.valueOf(back));
	 bu=new Button("Back");
	 
	 b.addActionListener(this);
	 bu.addActionListener(this);
	 
	 setLayout(new FlowLayout());
	 
	 add(l);
	 add(la);
	 add(b);
	 add(bu);
	 
	 
	 setSize(500,500);
	 setVisible(true); 
 }

  @Override
  public void actionPerformed(ActionEvent e)
  {
	if(e.getSource()==b)
	{
		count++;
		l.setText("  "+String.valueOf(count));
	}
	
	if(e.getSource()==bu)
	{
		back--;
		la.setText("  "+String.valueOf(back));
	}
	
  }
  
  
}


public class ActionListeners {
	
	public static void main(String [] args)
	{
		MyFrame1 mf=new MyFrame1();
		
	}

}
