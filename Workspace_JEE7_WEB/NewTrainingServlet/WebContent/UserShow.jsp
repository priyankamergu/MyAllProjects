<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of All Users</h1>
<sql:setDataSource var="user" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/allianz?serverTimezone=UTC"
user="root" password=""/>

<sql:query dataSource="${user}" var="result">
SELECT * FROM registration;

</sql:query>
  <table border = "1" width = "100%">
         <tr>
         	<th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Address</th>
            <th>Mobile No</th>
            <th>Department</th>
            <th>UserName</th>
            <th>Password</th>
         </tr>
                  <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.ID}"/></td>
               <td><c:out value = "${row.First_Name}"/></td>
               <td><c:out value = "${row.Last_Name}"/></td>
               <td><c:out value = "${row.Address}"/></td>
               <td><c:out value = "${row.Mobile_No}"/></td>
               <td><c:out value = "${row.Dept}"/></td>
               <td><c:out value = "${row.UserName}"/></td>
               <td><c:out value = "${row.Password}"/></td>
               
            </tr>
         </c:forEach>
</table>

<br><br>

<a href="Home.jsp"><b>Home page</b></a>
</body>
</html>