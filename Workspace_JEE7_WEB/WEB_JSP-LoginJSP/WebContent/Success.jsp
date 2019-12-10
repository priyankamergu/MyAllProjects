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

Login log=(Login)session.getAttribute("login");

String msg=log.getUsername();
out.print("Welcome " +msg);
%>
</body>
</html>