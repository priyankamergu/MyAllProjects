package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*** Servlet implementation class Hello_Servlet */
@WebServlet("/Hello_Servlet")
public class Hello_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello_Servlet() {
        super();
        System.out.println("Hello_Servlet->Default Comstructor....");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello_Servlet->=DoGet.....");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String html="<html><head><body<>Hellooo</body></head></title>";
		response.getWriter().append("Seve dat");
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello_Servlet->DoPost...");
		doGet(request, response);
	}

}
