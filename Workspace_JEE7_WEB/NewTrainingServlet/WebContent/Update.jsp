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
int id=(int)session.getAttribute("up");
RegistrationPOJO r=(RegistrationPOJO)rdao.SerachUser(id);
%>
<form action="UpdateOp.jsp">
Id :<input type="text" name="id" value="<%out.print(r.getId()); %>" required="required" readonly="readonly"> <br><br>
First Name : <input tye="text" name="fname" placeholder=" Enter updated First Name" value="<%out.print(r.getFname()); %>" required="required" ><br><br>
Last Name : <input tye="text" name="lname" placeholder=" Enter updated Last Name" value="<%out.print(r.getLname()); %>" required="required" ><br><br>
Address : <input tye="text" name="add" placeholder=" Enter updated Address" value="<%out.print(r.getAdd()); %>" required="required" ><br><br>
Mobile Number : <input tye="text" name="mobile" placeholder=" Enter updated Mobile" value="<%out.print(r.getMobile()); %>" required="required" ><br><br>
Department : <input tye="text" name="dept" placeholder=" Enter updated Department" value="<%out.print(r.getDept()); %>" required="required" ><br><br>
UserName : <input tye="text" name="uname" placeholder=" Enter updated UserName" value="<%out.print(r.getUname()); %>" required="required" ><br><br>
Password : <input tye="text" name="upwd" placeholder=" Enter updated Password" value="<%out.print(r.getUpwd()); %>" required="required" ><br><br>
<input type="Submit" value="Update">
</form>

</body>
</html>