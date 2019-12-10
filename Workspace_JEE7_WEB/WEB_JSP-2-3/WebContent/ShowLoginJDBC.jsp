<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
Connection connection=null;
	public void jspInit()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC", "root", "");
		}
		catch(Exception e)
		{
			System.err.print(e);
		}
		
	}
%>
<%

	try
	(	Statement stmt = connection.createStatement();)
	{
		ResultSet rs=stmt.executeQuery("select * from login");
 		while(rs.next())
 		{
	 		out.print("<table border=1>");
		 out.print("<tr><th>Username</th><th>Password</th></tr>");
		 out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td></tr>");
		 out.print("<table border=1>");
 	}
}
catch(Exception e){
System.err.print(e);}

%>
<%!
	public void jspDestory() 
	{
		try
		{
		connection.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
%>

</body>
</html>