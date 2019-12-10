<%@page import="com.jsp.bean.Login_DAO_Impl"%>
<%@page import="com.jsp.bean.Login_DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="login" class="com.jsp.bean.Login" scope="session" ></jsp:useBean>
<jsp:setProperty property="username" name="login" param="uname"/>
<jsp:setProperty property="password" name="login" param="pwd"/>

 
<%
//if(login.getUsername().equals(login.getPassword()))
//{
	//request.getRequestDispatcher("Success.jsp").forward(request,response);
//}
//else
//{
	//request.getRequestDispatcher("Failure.jsp").forward(request, response);
//}

	Login_DAO_Impl logdao=new Login_DAO_Impl(); //Login_DAO logdao=new Login_DAO_Impl();
	try
	{
		boolean flag=logdao.validate(login);
		if(flag==true)
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}



%>
 
</body>
</html>