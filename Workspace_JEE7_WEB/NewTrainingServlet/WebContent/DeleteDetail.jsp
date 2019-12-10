<%@page import="dao.service.RegistreDAOImpl"%>
<%@page import="dao.service.RegisterDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.util.DbConnection"%>
<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.cj.jdbc.Driver"); %>
<HTML>
    <HEAD>
       
    </HEAD>

    <BODY>
       

        <% 
        int id=Integer.parseInt(request.getParameter("id"));
		
			RegisterDAO rdao=new RegistreDAOImpl();
			boolean result=rdao.DeleteUser(id);
			if(result==true)
			{
				out.print("Deletion Successfully Completed");
				out.print("<br><br><a href='UserShow.jsp'>show</a>");
			}
			else
				out.print("Deletion Failed");
         
        %>

       <center><h1>Record Deleted</h1> </center>
    </BODY>
</HTML>