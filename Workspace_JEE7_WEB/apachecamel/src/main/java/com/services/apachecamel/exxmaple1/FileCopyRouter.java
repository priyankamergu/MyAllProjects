package com.services.apachecamel.exxmaple1;


import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouter extends RouteBuilder
{

	@Override
	public void configure() throws Exception {
		from("direct:start").to("seda:end");
		
		
		
	}

}
