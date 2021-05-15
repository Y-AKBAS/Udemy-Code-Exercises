package AWT;

import java.awt.*;
import java.awt.event.*;


public class MouseEvents extends Frame implements MouseListener,MouseMotionListener{

	Label l;
	Label l1;
	
	MouseEvents()
	{
		super("Mouse events");
		
		l=new Label("");
		l1=new Label("");
		
		l.setBounds(15, 50, 150, 20);
		l1.setBounds(15, 80, 150, 20);
		
		add(l);
		add(l1);
		
		setLayout(null);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setSize(600,600);
		setVisible(true);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l.setText("Mouse exited");
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		l.setText("Mouse dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		l.setText("Mouse moved");
		l1.setText("("+e.getX()+","+e.getY()+")"); // This will show the x,y axis for the mouse
	}
	
	
	
	
	public static void main(String [] args)
	{
		MouseEvents m=new MouseEvents();
		
	}
	

}
