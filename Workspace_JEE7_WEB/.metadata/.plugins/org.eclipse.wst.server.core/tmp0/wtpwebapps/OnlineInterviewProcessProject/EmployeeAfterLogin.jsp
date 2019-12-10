<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Logged In</title>
</head>
<body>
	<center>
			<br> <br>
			<h1>
				<font color="darkblue"> Welcome ${employeeName} <br>
				
				<a href="EnterCandidateId.jsp">Enter Candidate Id</a>
				<br>
				<a href="TechnicalOneController?action=aptitudeSelectedList">Aptitude Selected List</a>
				<br>
				<a href="TechnicalOneController?action=displayFinalSelectedList">Selected Student List</a>
				</font>
			</h1>
		<!-- </form> -->
	</center>
</body>
</html>