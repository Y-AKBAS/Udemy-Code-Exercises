package AWT;

import java.awt.*;
import java.awt.event.*;


public class Painting_Color extends Frame
{
	int x=0,y=0;
	
	Painting_Color()
	{
		super("Painting and Color");
		
		addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent m)
			{
				x=m.getX();
				y=m.getY();
				repaint();
			}
		});
		
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
		g.setColor(Color.GREEN);
		g.drawOval(x, y, 30,30);
		g.setFont(new Font("Arial",Font.BOLD,30));
        g.drawString("Hello", x, y);
	}



	public static void main(String [] args)
	{
		Painting_Color p=new Painting_Color();
	}
}
