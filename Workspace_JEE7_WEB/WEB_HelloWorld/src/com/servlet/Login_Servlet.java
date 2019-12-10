package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login_Servlet")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Login_Servlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	PrintWriter pw=response.getWriter();
		String nm=request.getParameter("uname");
		String pd=request.getParameter("pwd");
				if(nm.equals(pd))
			request.getRequestDispatcher("Login Successfully..").forward(request, response);
		else
		{
		//	pw.print("Login Unsuccessfully..");
		//	response.sendRedirect("Login.html");
			
			response.setHeader("Refresh", "5; URL="+ "Login.html");
			pw.print("Login is incoorect.."+"<br>");
			pw.append("You will be taken back to login page in 5 second.");
			pw.flush();
			
		}	
	}


}
