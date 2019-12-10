<%@page import="bean.or.pojo.RegistrationPOJO"%>
<%@page import="dao.service.RegistreDAOImpl"%>
<%@page import="dao.service.RegisterDAO"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.util.DbConnection"%>
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
RegistrationPOJO rpojo=new RegistrationPOJO();
int id=(Integer.parseInt(request.getParameter("id")));
rpojo.setId(id);
rpojo.setFname(request.getParameter("fname"));
rpojo.setLname(request.getParameter("lname"));
rpojo.setAdd(request.getParameter("add"));
rpojo.setMobile(request.getParameter("mobile"));
rpojo.setDept(request.getParameter("dept"));
rpojo.setUname(request.getParameter("uname"));
rpojo.setUpwd(request.getParameter("upwd"));
RegisterDAO rdao=new RegistreDAOImpl();
int result=(int)rdao.UpdateUser(rpojo);
if(result==0)
	out.print("Updation Failed");
else
{
	out.print("Updation Successfully Done");
	out.print("<br><br><a href='UserShow.jsp'>List</a>");
}
%>



</body>
</html>