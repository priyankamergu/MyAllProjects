package com.swt.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowLayoutEx {

	public RowLayoutEx(Display display)
	{
		initUI(display);
	}
	
	public void initUI(Display display)
	{
		Shell shell=new Shell(display,SWT.SHELL_TRIM | SWT.CENTER);
		RowLayout rowLayout=new RowLayout(SWT.HORIZONTAL);
		rowLayout.marginTop=50;
		rowLayout.marginBottom=50;
		rowLayout.marginLeft=10;
		rowLayout.marginHeight=10;
		shell.setLayout(rowLayout);
		
		Button button=new Button(shell,SWT.PUSH);
		button.setText("Button");
		button.setLayoutData(new RowData(80,30));
		
		Button button1=new Button(shell,SWT.PUSH);
		button1.setText("Button");
		button1.setLayoutData(new RowData(80,30));
		
		Button button2=new Button(shell,SWT.PUSH);
		button2.setText("Button");
		button2.setLayoutData(new RowData(80,30));
		
	
		shell.setText("Row Layout");
		
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
		
		//Display display=new Display();
	RowLayoutEx row=new RowLayoutEx(new Display());

	}

}
