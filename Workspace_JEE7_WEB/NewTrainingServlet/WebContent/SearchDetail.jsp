<%@page import="bean.or.pojo.RegistrationPOJO"%>
<%@page import="dao.service.RegisterDAO"%>
<%@page import="dao.service.RegistreDAOImpl"%>
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
RegisterDAO rdao=new RegistreDAOImpl();
int id=Integer.parseInt(request.getParameter("id"));
RegistrationPOJO r=(RegistrationPOJO)rdao.SerachUser(id);

if(r==null)
	out.print("User not having data");
%>
<center>
<%out.print("<h1>User "+id+" Details</h1>"); %>
 <TABLE BORDER="1">
            <TR>
                <TH>Id</TH>
                <TH>First Name</TH>
                <TH>Last Name</TH>
                <TH>Address</TH>
                <TH>Mobile Number</TH>
                <TH>Department</TH>
                <TH>UserName</TH>
                <TH>Password</TH>
            </TR>
                <TR>
                <TD> <%= r.getId() %></TD>
                <TD> <%= r.getFname()%></TD>
                <TD> <%= r.getLname() %></TD>
                <TD> <%= r.getAdd() %></TD>
                <TD> <%= r.getMobile() %></TD>
                <TD> <%= r.getDept() %></TD>
                <TD> <%= r.getUname() %></TD>
                 <TD> <%= r.getUpwd() %></TD>
            </TR>
            
        </TABLE>

</center>
<br><br><a href="Home.jsp"><b>Home page</b></a>
</body>
</html>
