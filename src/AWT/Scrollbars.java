package AWT;

import java.awt.*;
import java.awt.event.*;


class ScFrame extends Frame implements AdjustmentListener
{
	Scrollbar red,blue,green;
	TextField tf;
	
	ScFrame()
	{
		super("Scrollbar Uebung");
		
		tf=new TextField(20);
		
		red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		
		tf.setBounds(50, 50, 300, 50);
		red.setBounds(50, 150, 300, 30);
		blue.setBounds(50, 250, 300, 30);
		green.setBounds(50, 200, 300, 30);
		
		setLayout(null);
		add(tf);
		add(red);
		add(blue);
		add(green);
		
		red.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		
		setSize(600,600);
		setVisible(true);
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
		
	}
}


public class Scrollbars {
	
	public static void main(String [] args)
	{
		ScFrame s=new ScFrame();
		
	}

}
