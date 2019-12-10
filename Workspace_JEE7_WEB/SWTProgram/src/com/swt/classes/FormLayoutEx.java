package com.swt.classes;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FormLayoutEx {

	public FormLayoutEx(Display display)
	{
		initUI(display);
	}
	public void initUI(Display display)
	{
		Shell shell=new Shell(display,SWT.SHELL_TRIM | SWT.CENTER);
		FormLayout layout=new FormLayout();
		shell.setLayout(layout);
		Button button1=new Button(shell,SWT.PUSH);
		button1.setText("OK");
		
		Button button2=new Button(shell,SWT.PUSH);
		button2.setText("Cancel");
		
		FormData cancelData=new FormData(80,30);
		cancelData.right=new FormAttachment(98);
		cancelData.bottom=new FormAttachment(95);
		
		button2.setLayoutData(cancelData);
		
		
		
		FormData OkData=new FormData(80,30);
		OkData.right=new FormAttachment(button2, -5, SWT.LEFT);
		OkData.bottom=new FormAttachment(button2,0,SWT.BOTTOM);
		button1.setLayoutData(OkData);
		shell.setText("Buttons");
		shell.setSize(350,200);
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
	public static void main(String[] args) {
		
		
		FormLayoutEx form=new FormLayoutEx(new Display());
		

	}

}
