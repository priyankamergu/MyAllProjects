package com.services.apachecamel.exxmaple1;

import org.apache.camel.builder.RouteBuilder;

public class HelloWorld extends RouteBuilder
{

	@Override
	public void configure() throws Exception
	{
		//execution goes here
		System.out.println("Hello world");
		
	}
	
}
