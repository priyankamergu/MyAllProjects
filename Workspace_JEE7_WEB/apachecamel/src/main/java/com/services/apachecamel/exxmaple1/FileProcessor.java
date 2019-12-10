package com.services.apachecamel.exxmaple1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FileProcessor  implements Processor
{

	public void process(Exchange exchange) throws Exception
	{
		File file=exchange.getIn().getBody(File.class);
		Files.write(Paths.get(file.getAbsolutePath()), "\n By ,\n Allianz Developer".getBytes(),StandardOpenOption.APPEND);
		
	}

}
