package com.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletFirst
 */
@WebServlet("/ServletFirst")
public class ServletFirst extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFirst() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter pw=response.getWriter();
//		RequestDispatcher rd;
//		pw.print("Before Forward..");
//		
//		System.out.println("Console....");
//		
//		String name=request.getParameter("name");
//		HttpSession s=request.getSession();
//		s.setAttribute("name",name);
//		
//		rd=request.getRequestDispatcher("ServletSecond");
//		rd.forward(request, response);
//		
//		pw.print("After Forword..");
		
		String n=request.getParameter("name");
		Cookie c=new Cookie("nm",n);
		response.addCookie(c);
		
		
		PrintWriter pw=response.getWriter();
		pw.print("<html>");
		pw.print("<body><form action=\"ServletSecond\">");
		pw.print("<pre>");
		pw.print("User <input type=\"text\" name=\"user\">");
		pw.print("Passowrd <input type=\"password\" name=\"pwd\">");
	//	pw.print("<input type=\"hidden\" name=\"hname\" value='"+n+"'>");
		pw.print("<input type=\"Submit\" value=\"submit\">");
		pw.print("</pre></from></body>");
		pw.print("</html>");
		
		
		
	}



}
