<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.io.PrintWriter" %>
<%@ page language="java" %>
<%
PrintWriter pw=response.getWriter();
pw.println("Solapur");
out.println("Pune");
pw.println("Bhiwandi");
out.println("Akola");
pw.println("Mumbai");
out.println("Bhid");
%>
</body>
</html>