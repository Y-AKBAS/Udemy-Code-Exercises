package AWT;

import java.awt.*;
import java.awt.event.*;


public class WindowEvents extends Frame implements WindowListener{

	Label l;
	
	WindowEvents()
	{
		super("Window Events");
		
		l=new Label();
		l.setBounds(35,70, 100,30);
		
		setLayout(new FlowLayout());
		add(l);
		
		addWindowListener(this);
		
		setSize(600,600);
		setVisible(true);
	}
	
	// We won't see all the messages.
	@Override
	public void windowOpened(WindowEvent e) {
		l.setText("Window opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		l.setText("Window Closing");
		System.exit(0); // This means system exits without problems
	}

	@Override
	public void windowClosed(WindowEvent e) {
		l.setText("Window Closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		l.setText("Window Iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		l.setText("Window Deiconified");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		l.setText("Window Activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		l.setText("Window Deactivated");
	}
	
	public static void main(String [] args)
	{
		WindowEvents w=new WindowEvents();
		
	}

}
