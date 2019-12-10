package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.openpisces.Dasher;

/**
 * Servlet implementation class SessionHitCount
 */
@WebServlet("/SessionHitCount")
public class SessionHitCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionHitCount() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Integer count=new Integer(0);
		String head;
		if(session.isNew())
			head="This is the new session";
		else
		{
			head="This is the old Session";
			Integer oldCount=(Integer)session.getAttribute("count");
			if(oldCount!=null)
				count=new Integer(oldCount.intValue()+1);
		}
		
		session.setAttribute("count",count);
		StringBuffer buffer=new StringBuffer();
		buffer.append("<!DOCTYPE html><html><head><title></title></head><body>");
		buffer.append("<h2 align='center'>"+head+"</h2>");
		buffer.append("<table border=1 align='center'>\n");
		buffer.append("<tr><th>Information Type</th><th>Session Count</th></tr>");
		buffer.append("<tr><td>Total Session Accesses</td><td>"+count+"</td></tr>\n");

		buffer.append("<tr><td>Sesssion Id</td><td>"+session.getId()+"</td></tr>");
		
		buffer.append("<tr><td>Session Creation Time</td><td>"+new Date(session.getCreationTime())+"</td></tr>");
		
		buffer.append("<tr><td>Session Last Accessed Time</td><td>"+new Date(session.getLastAccessedTime())+"</td></tr>");
		
		buffer.append("</table></body></html>");
		pw.print(buffer.toString());
		pw.flush();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
