package com.services.apachecamel.exxmaple1;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorldCamel
{
	public static void main(String args[])
	{
		//creating an instance for camel context
		CamelContext context=new DefaultCamelContext();
		
		//creating an instance for router
		HelloWorld route= new HelloWorld();
		try
		{
			//adding router to context
			context.addRoutes(route);
			
			//starting the camel context
			context.start();
			
			//stopping the camel context
			context.stop();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}