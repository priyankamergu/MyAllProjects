package com.swt.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AbsoluteEx {

	public AbsoluteEx(Display display)
	{
		initUI(display);
	}
	public void initUI(Display display) 
	{
		Shell shell=new Shell(display,SWT.SHELL_TRIM | SWT.CENTER);
		Button button1=new Button(shell,SWT.PUSH);
		button1.setText("Button");
		button1.setBounds(150,100,50,50);
		
		Button button2=new Button(shell,SWT.PUSH);
		button2.setText("Button");
		button2.setSize(80,30);
		button2.setLocation(50,100);
		
		shell.setText("Absolute Layout");
		shell.setSize(300,250);
		shell.open();
		
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
				
			}
		}
		display.close();
	}
	public static void main(String[] args) {
		
		Display display=new Display();
		
		AbsoluteEx ab=new AbsoluteEx(display);
		

	}

}
