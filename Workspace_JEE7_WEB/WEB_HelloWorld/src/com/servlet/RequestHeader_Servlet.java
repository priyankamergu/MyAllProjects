package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestHeader_Servlet")
public class RequestHeader_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestHeader_Servlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		Enumeration<String> header=request.getHeaderNames();
		StringBuffer buf=new StringBuffer();
		while(header.hasMoreElements())
		{
			String headerName=header.nextElement();
			String headerValue=request.getHeader(headerName);
			buf.append(headerName + " : "+headerValue);
			buf.append("<br>");
		}
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<!DOCTYPE html><html><head><title></title></head></body>");
		pw.print(buf.toString());
		pw.print("</body></html>");
	}


	

}
