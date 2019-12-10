package controller;
import java.sql.*;

import com.util.*;

import bean.or.pojo.RegistrationPOJO;
import dao.service.RegisterDAO;
import dao.service.RegistreDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
			RegistrationPOJO rpojo=new RegistrationPOJO();
			rpojo.setId(Integer.parseInt(request.getParameter("id")));
			rpojo.setFname(request.getParameter("fname"));
			rpojo.setLname(request.getParameter("lname"));
			rpojo.setAdd(request.getParameter("add"));
			rpojo.setMobile(request.getParameter("mobile"));
			rpojo.setDept(request.getParameter("dept"));
			rpojo.setUname(request.getParameter("uname"));
			rpojo.setUpwd(request.getParameter("upwd"));
			
			RegisterDAO reimpl=new RegistreDAOImpl();
			boolean result=reimpl.register(rpojo);
			System.out.println(result);
			try
			{
			if(result==true)
			{
			//	pw.print("Registration Successfully Completed");
				RequestDispatcher rd1=request.getRequestDispatcher("successOk.jsp");
				rd1.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Failure.jsp" );
				rd.forward(request, response);
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
