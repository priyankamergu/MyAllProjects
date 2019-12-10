package com.jsp.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Login_Filter
 */
@WebFilter("/LoginUseBean.jsp")
public class Login_Filter implements Filter {


    public Login_Filter() {
    	System.out.println("LogFilter->default constructor..");
    }


	public void destroy() {
		System.out.println("LogFilter->Init..");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("LogFilter->doFilter started");
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		if(uname == null || "".equals(uname) || pwd==null || "".equals(pwd))
		{
			PrintWriter pw=response.getWriter();
					pw.print("Empty_Message, One or both fields are empty");
			RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp");//.forward(request, response);;
			rd.include(request, response);
		}
		else {
		chain.doFilter(request, response);
		}
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("LogFilter->Init..");
	}

}
