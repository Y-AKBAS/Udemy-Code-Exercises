package AWT;

import java.awt.*;
import java.awt.event.*;


public class Menus extends Frame{
	
	MenuBar mb;
	Menu file,sub1,sub2;
	MenuItem open,save,close,closeall,neu,Project,Class,Package,Interface;
	CheckboxMenuItem autoSave;
	
	
	Menus()
	{
		super("Menu Creating");
		
		file=new Menu("File");
		sub1=new Menu("Close");
		sub2=new Menu("New");
		
		open=new MenuItem("Open");
		save=new MenuItem("Save");
		close=new MenuItem("Close");
		closeall=new MenuItem("Close All");
		
		Project=new MenuItem("Project");
		Class=new MenuItem("Class");
		Package=new MenuItem("Package");
		Interface=new MenuItem("Interface");
		
		autoSave=new CheckboxMenuItem("Auto Save");
		
		setLayout(new FlowLayout());
		
		file.add(sub2);
		file.add(open);
		file.add(save);
		file.add(autoSave);
		file.add(sub1);
		
		sub1.add(close);
		sub1.add(closeall);
		
		sub2.add(Project);
		sub2.add(Interface);
		sub2.add(Class);
		sub2.add(Package);
		
		mb=new MenuBar();
		mb.add(file);
		setMenuBar(mb);
		
		
		addWindowListener(new WindowAdapter()
		{
			 public void windowClosing(WindowEvent e)
			 {
				 System.exit(0);
			 }
		} );
				
		
		autoSave.addItemListener((ItemEvent i)->
		{
			
		} );
				
		
		
		
		
		
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		Menus m=new Menus();
	}

}
