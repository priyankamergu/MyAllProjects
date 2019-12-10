package com.swt.classes;



import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT
{
	public static void main(String[] args) {
		
		Display display=new Display();
		
		
		/*Define shell, it represents a window, you can add more than one shell to display*/
		Shell shell=new Shell(display);
		
		//define widgets to add to the shell
		Label label1=new Label(shell,SWT.CENTER);
		label1.setText("Hello World");
		label1.setBounds(shell.getClientArea());
		//open shell window
	
		shell.open();
		
		while(!shell.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
				
			}
		}
		
		
		
		Shell shell1=new Shell(display);
		Button button=new Button(shell1, SWT.CHECK);
		button.setText("Submmit");
		button.setBounds(100, 100, 100, 100);
		shell1.open();
		while(!shell1.isDisposed())
		{
			if(!display.readAndDispatch())
			{
				display.sleep();
				
			}
		}
		
		//dispose the display
		display.dispose();
	
	}
	
	
}