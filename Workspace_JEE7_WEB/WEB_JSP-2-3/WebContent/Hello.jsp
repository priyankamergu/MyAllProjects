<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to JSP World.....<br>
The on server is<%=  new Date()%> /<!-- java.util.Date() -->


<%! int count=0; %>
	public void increament()
	{
	count++;
	}
The count is <%= count %>
<% %>
</body>
</html>