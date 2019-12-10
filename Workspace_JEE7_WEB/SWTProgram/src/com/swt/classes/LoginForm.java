package com.swt.classes;



import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginForm
{
	public LoginForm(Display display) {
		initUI(display);
		
	}
	public void initUI(Display display)
	{
//		Shell shell=new Shell(display);
//		Label label1=new Label(shell,SWT.NORMAL);
//		label1.setText("Login Page");
//		label1.setBounds(430, 50, 100,90);
//		
//		Label user=new Label(shell,SWT.NORMAL);
//		user.setText("UserName");
//		user.setBounds(350,100, 100,70);
//		
//		Text usertxt=new Text(shell,SWT.NORMAL);
//		usertxt.setEditable(true);
//		usertxt.setBounds(480, 100, 100, 70);
//		
		
		Shell shell=new Shell(display);
		
		shell.setLayout(new GridLayout(2, false));
		  shell.setText("Login form");
		  Label label1=new Label(shell, SWT.NULL);
		  label1.setText("User Name: ");
		  
		  Text username = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  username.setText("");
		  username.setTextLimit(30);
		  
		  Label label2=new Label(shell, SWT.NULL);
		  label2.setText("Password: ");
		  
		  Text password = new Text(shell, SWT.SINGLE | SWT.BORDER);
		  System.out.println(password.getEchoChar());
		  password.setEchoChar('*');
		  password.setTextLimit(30);

		  Button button=new Button(shell,SWT.PUSH);
		  button.setText("Submit");
		  button.addListener(SWT.Selection,new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				System.out.println("Button clicked");
				
			}
		});
			
			
			
		
		  
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
	public static void main(String args[])
	{
		LoginForm log=new LoginForm(new Display());
	}
}