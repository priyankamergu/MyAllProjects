package com.prime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/first")
public class Prime 
{
	@GET
	@Produces("application/xml")
	public String cal()
	{
		int cnt=0;
		for(int i=1;i<10;i++)
		{
			if(5%i==0)
				cnt++;
		}
		
		if(cnt==2)
			return "Prime";
		else
			return " Not Prime";
	}
	
}
