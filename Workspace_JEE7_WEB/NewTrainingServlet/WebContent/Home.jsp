<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Home Page</h1><br><br>
<a href="UserShow.jsp"><b>List of Users</b></a><br><br>

<%

session.setAttribute("up",session.getAttribute("id"));
out.print("<a href='Update.jsp'><b>Update</b></a><br><br>");

%>
<%

session.setAttribute("se",session.getAttribute("id"));
out.print("<a href='Search.jsp'><b>Search</b></a><br><br>");

%>
<a href="Delete.jsp"><b>Delete</b></a><br><br>


</center>
</body>
</html>