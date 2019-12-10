package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie_Servlet
 */
@WebServlet("/Cookie_Servlet")
public class Cookie_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_Servlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c1=new Cookie("userName","apache");
		Cookie c2=new Cookie("password","tomcat");
		c1.setMaxAge(1000*60*60);
		c2.setMaxAge(1000*60*60);
		response.addCookie(c1);
		response.addCookie(c2);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<HTML>");
		pw.print("<HEAD>");
		pw.print("<TITLE>Cookie Test</TITLE>");
		pw.print("</HEAD>");
		pw.print("<BODY>");
		pw.print("Please click the button to see the cookie sent to you.");
		pw.print("<BR>");
		pw.print("<FORM METHOD=POST>");
		pw.print("<INPUT TYPE=HIDDEN NAME='COMPANY' VALUE='Allianz'>");
		pw.print("<INPUT TYPE=SUBMIT VALUE=submit>");
		pw.print("</FORM>");
		pw.print("<BODY>");
		pw.print("</HTML>");
		pw.flush();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<HTML>");
		pw.print("<HEAD>");
		pw.print("<TITLE>cookie Test</TITLE>");
		pw.print("</HEAD>");
		pw.print("<BODY>");
		
		pw.print("<H2>And, here are all the cookies.</H2>");
		Cookie[] cookie=request.getCookies();
		
		//enhanced for loop, introduced in java 5..
		for(Cookie cook:cookie)
		{
			pw.print("<B>Cookie Name:<B>"+cook.getName()+"<BR>");
			pw.print("<B>Cookie Value:<B>"+cook.getValue()+"<BR>");
		}
		pw.print("Hidden Field:"+request.getParameter("COMPANY"));
		pw.print("</BODY>");
		pw.print("</HTML>");
	}

}
