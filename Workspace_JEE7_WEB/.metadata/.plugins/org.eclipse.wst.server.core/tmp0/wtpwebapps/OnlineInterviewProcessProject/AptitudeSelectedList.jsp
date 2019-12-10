<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aptitude Selected Student's Name</title>
</head>
<body>
	<center>
		<fieldset>
			<h1>Aptitude Selected Candidate's Name</h1>
			<form action="_______" method="post">
				<table border="1">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
						<th>MobileNo</th>
						<th>Marks</th>
						<th>PanCard</th>
						<th>First Round</th>
					</tr>
					
						<c:forEach items="${candidateList}" var="candidateList" varStatus="status">
						<tr>
							<td>${candidateList.candidateId}</td>
							<td>${candidateList.candidateName}</td>
							<td>${candidateList.candidateEmailId}</td>
							<td>${candidateList.candidateMobileNo}</td>
							<td>${candidateList.candidateMarks}</td>
							<td>${candidateList.candidatePanCardNo}</td>
							
							<c:choose>
								<c:when test="${technicalOneList[status.index].technicalOneStatus eq null }">
									<td><a href="TechnicalOneController?action=displayTechincalOne&candidateId=${candidateList.candidateId}">TechnicalOne</a></td>
								</c:when>
								<c:otherwise><td>Already Done</td></c:otherwise>
							</c:choose>
							
							</tr>
						</c:forEach>
					
				</table>
		</form>
		
		</fieldset>
		
		
		
		
	</center>
</body>
</html>