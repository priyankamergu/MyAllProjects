<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technical Two Result</title>
</head>
<body>
	<center>
		<fieldset>
			<h1>Technical One Result</h1>
			<form action="_______" method="post">
				<table border="1">
					<tr>
						<th>Candidate Id</th>
						<th>Candidate Name</th>
						<th>Candidate Email</th>
						<th>Candidate MobileNo</th>
						<th>Aptitude Marks</th>
						<th>Technical Round One Status</th>
						<th>Second Round</th>
					</tr>

					<c:forEach items="${techincalOneList}" var="techincalOneList"
						varStatus="status1">
						<tr>
							<td>${techincalOneList.candidateId}</td>
							<td>${candidateList[status1.index].candidateName}</td>
							<td>${candidateList[status1.index].candidateEmailId}</td>
							<td>${candidateList[status1.index].candidateMobileNo}</td>
							<td>${candidateList[status1.index].candidateMarks}</td>
							<td>${techincalOneList.technicalOneStatus}</td>
							
							<c:choose>
								<c:when test="${technicalTwoList[status1.index].technicalTwoStatus eq 'pass' and techincalOneList.technicalOneStatus eq 'pass' }">
									<td>Already Done</td>
								</c:when>
								<c:when test="${technicalTwoList[status1.index].technicalTwoStatus eq 'fail' and techincalOneList.technicalOneStatus eq 'pass' }">
									<td>Already Done</td>
								</c:when>
								<c:when test="${techincalOneList.technicalOneStatus eq 'fail' }">
									<td>NA</td>		
								</c:when>
								<c:otherwise>
									<td><a href="TechnicalOneController?action=technicalTwoAssessment&candidateId=${techincalOneList.candidateId}">TechnicalTwo</a></td>
								</c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>

				</table>
		

			</form>

		</fieldset>




	</center>
</body>
</html>