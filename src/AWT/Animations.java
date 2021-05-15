package AWT;

import java.awt.*;
import java.awt.event.*;

public class Animations extends Frame implements Runnable
{
	int x,y,tx,ty;
	
	
	Animations()
	{
		x=100;
		y=100;
		tx=1;
		ty=1;
		
		Thread t=new Thread(this);
		t.start();
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		
		setSize(600,600);
		setVisible(true);
	}
	
	
	public void paint(Graphics g)
	{
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x, y, 25,30);
	}
	
	
	public void run()
	{
		while(true)
		{
			x+=tx;
			y+=ty;
			
			if(x<25 || x>565)
				tx*=-1;
			if(y<20 || y>570)
				ty*=-1;
			repaint();
		
			try
			{
				Thread.sleep(1);
			}catch(Exception e) {}	
		}
	}
	
	public static void main(String [] args)
	{
		Animations a=new Animations();
	}
}
