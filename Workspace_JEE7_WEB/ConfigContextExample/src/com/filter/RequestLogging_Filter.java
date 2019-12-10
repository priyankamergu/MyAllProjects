package com.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class RequestLogging_Filter
 */
@WebFilter(
		urlPatterns = { "/Cookie_Servlet" }, // '/*' for all servlet
		initParams = { 
				@WebInitParam(name = "filterName", value = "RequestLogging_Filter"), 
				@WebInitParam(name = "urlPattern", value = "/*_Servlet"), 
				@WebInitParam(name = "description", value = "RequestLogging_Filter logs the request parameters")
		})
public class RequestLogging_Filter implements Filter {

	private ServletContext context;
   public RequestLogging_Filter() {
	   
    }

   public void init(FilterConfig fConfig) throws ServletException {

		this.context=fConfig.getServletContext();
		this.context.log("RequestLogging_Filter->Init...");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("RequestLogging_Filter->doFilter...");
		HttpServletRequest req=(HttpServletRequest)request;
		Enumeration<String> params=req.getParameterNames();
		while(params.hasMoreElements())
		{
			String name=params.nextElement();
			String value=request.getParameter(name);
			this.context.log("RequestLogging_Filter->"+req.getRemoteAddr()+":: Request Params::{"+name+": "+value+"}");
		}
		
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie:cookies)
				this.context.log("RequestLogging_Filter->"+req.getRemoteAddr()+"::Cookie::{"+cookie.getName()+ " "+cookie.getValue()+"}");
		}
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}


	
	public void destroy() {
	}

}
