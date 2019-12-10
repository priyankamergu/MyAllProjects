package com.swt.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonClass {

	public static void main(String[] args) 
	{
		Display display=new Display();
		final Shell shell=new Shell(display);
		shell.setLayout(new FillLayout());
		
		Composite parent=new Composite(shell, SWT.None);
		FillLayout fillLayout=new FillLayout();
		//fillLayout.type=SWT.VERTICAL;
		fillLayout.type=SWT.HORIZONTAL;
		parent.setLayout(fillLayout);
		Button button1=new Button(parent, SWT.None);
		button1.setText("B1");
		Button button2=new Button(parent, SWT.None);
		button2.setText("B2");
		Button button3=new Button(parent, SWT.None);
		button3.setText("Button 3");
		
		
		
		
		
		//window back to natural size
		shell.pack();
		 shell.open();
		 while(!shell.isDisposed())
		 {
			 if(!display.readAndDispatch())
			 {
				 display.sleep();
			 }
		 }
		 display.dispose();
	}

}
