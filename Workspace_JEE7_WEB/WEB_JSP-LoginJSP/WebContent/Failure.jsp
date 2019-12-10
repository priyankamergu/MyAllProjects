<%@page import="com.jsp.bean.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

//
Login log=(Login)session.getAttribute("login");

if(log !=null)
{

	String msg=log.getUsername();
	out.print("Sorry " +msg);
	}
else
{
	String s=(String)request.getAttribute("Empty_Message");
	out.print(s);
}
//out.println(s);
%>
</body>
</html>