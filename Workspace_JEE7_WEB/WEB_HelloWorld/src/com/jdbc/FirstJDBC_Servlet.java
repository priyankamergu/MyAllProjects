package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;


@WebServlet("/FirstJDBC_Servlet")
public class FirstJDBC_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   Connection con;
   String sql;
    public FirstJDBC_Servlet() {
    	
        
    }
    @Override
    public void init() throws ServletException
    {
    	try
    	{
    	  	Class.forName("com.mysql.cj.jdbc.Driver");
    	  	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC", "root", "");
    	}
    	catch (Exception e) {
			System.err.print(e);
		}
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		PreparedStatement p;
		sql = "SELECT * from student" ;//LIMIT 1";
		try
		{
			p = con.prepareStatement(sql);
			ResultSet rs = p.executeQuery();
			
			ResultSetMetaData resmeta=rs.getMetaData();
			int count=resmeta.getColumnCount();
			pw.print("<table border=1>");
		//	pw.print("<tr><th>"+ resmeta.getColumnName(1)+"</th><th>"+resmeta.getColumnName(2)+"</th><th>" +resmeta.getColumnName(3)+"</th>");
			pw.print("<tr>");
			for(int i=1;i<=count;i++)
			{
				pw.print("<th>"+resmeta.getColumnName(i)+"</th>");
			}
			pw.print("</tr>");
			while (rs.next())
			{
			//	pw.print("Details of Students..");
			//	pw.print(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
				
				
				//pw.print("<tr><th>Rollno</th><th>Name</th><th>Marks</th></tr>");
				
				pw.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getFloat(3)+"</td></tr>");
				
			}
			pw.print("</table>");
		}
		catch (Exception e) {
			System.err.print(e);
		}
	}

	
}
