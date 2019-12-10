package com.swt.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ButtonListener 
{
	public void buttonListner(Display display)
	{
		Shell shell=new Shell(display);
		Button button1=new Button(shell, SWT.None);
		button1.setText("B1");
		button1.setBounds(50, 50, 50,50);
		
		button1.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e)
			{
				System.out.println("Submit button was clicked");
			}
		});
		
		Text text1=new Text(shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL );
		text1.setText("Border scrolled text box");
		text1.setBounds(200, 100, 100,100);
		
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
	
	public static void main(String args[])
	{
		ButtonListener b=new ButtonListener();
		b.buttonListner(new Display());
	}
}
