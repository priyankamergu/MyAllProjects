<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h1>Using Beans in JSP.</h1>
<jsp:useBean id="test" class="com.servlet.request.TestBean"></jsp:useBean>
<jsp:setProperty property="message" name="test" value="Hello JSP..."/>
<p>Got Message.....</p>
<jsp:getProperty property="message" name="test"/>

</center>
</body>
</html>