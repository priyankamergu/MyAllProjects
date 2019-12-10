<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Selected Student's Name</title>
</head>
<body>
<form action="SendEmailAndSMS.jsp" method="post">
	<center>
		<fieldset>
			<h1>Final Result</h1>
			
				<table border="1">
					<tr>
						<th>Candidate Id</th>
						<th>Candidate Name</th>
						<th>Candidate Mobile No</th>
						<th>Candidate Email Id</th>
						<th>Aptitude Marks</th>
						<th>Technical One Employee Name</th>
						<th>Technical Two Employee Name</th>
						<th>HR Round Status</th>

					</tr>
					<c:forEach items="${candidateList}" var="candidateList"
						varStatus="status">
						<tr>
							<td>${candidateList.candidateId}</td>
							<td>${candidateList.candidateName}</td>
							<td>${candidateList.candidateMobileNo}</td>
							<td>${candidateList.candidateEmailId}</td>
							<td>${candidateList.candidateMarks}</td>
							<td>${employeeListOne[status.index]}</td>
							<td>${employeeListTwo[status.index]}</td>
							<td>${hrRoundList[status.index].status}</td>
						</tr>
					</c:forEach>
				</table>
				<br> <br> <br> <input type="submit" value="Send Mail">
		</fieldset>
		
	</center>
	</form>
</body>
</html>