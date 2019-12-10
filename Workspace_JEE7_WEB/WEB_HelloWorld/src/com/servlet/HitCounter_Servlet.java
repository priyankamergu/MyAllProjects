package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounter_Servlet
 */
@WebServlet("/HitCounter_Servlet")
public class HitCounter_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int counter=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounter_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config)
    {
    	counter=0;
    	System.out.println("Init");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*counter++;
		PrintWriter pw=response.getWriter();
		pw.print("<body> counter :</body>"+counter);
		*/
		
		String html="<html><head><title>Helo_Servlet</title></head></html>";
		html=html+"<body><h2>Htllo_Servlet..</h2>";
	//	html=html+""
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
