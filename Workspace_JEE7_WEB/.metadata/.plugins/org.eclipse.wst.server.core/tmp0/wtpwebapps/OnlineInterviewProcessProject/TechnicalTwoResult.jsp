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
			<h1>Technical Two Result</h1>
			<form action="_______" method="post">
				<table border="1">
					<tr>
						<th>Candidate Id</th>
						<th>Candidate Name</th>
						<th>Candidate Email</th>
						<th>Candidate MobileNo</th>
						<th>Aptitude Marks</th>
						<th>Technical Round Two Status</th>						
						<th>HR Round</th>
					</tr>

					<c:forEach items="${techincalTwoList}" var="techincalTwoList"
						varStatus="status1">
						<tr>
							<td>${techincalTwoList.candidateId}</td>
							<td>${candidateList[status1.index].candidateName}</td>
							<td>${candidateList[status1.index].candidateEmailId}</td>
							<td>${candidateList[status1.index].candidateMobileNo}</td>
							<td>${candidateList[status1.index].candidateMarks}</td>
							<td>${techincalTwoList.technicalTwoStatus}</td>

							<c:choose>
								<c:when test="${hrRoundList[status1.index].status eq 'pass' and techincalTwoList.technicalTwoStatus eq 'pass'}">
									<td>Already Done</td>
								</c:when>
								<c:when test="${hrRoundList[status1.index].status eq 'fail' and techincalTwoList.technicalTwoStatus eq 'pass'}">
									<td>Already Done</td>
								</c:when>
								<c:when test="${techincalTwoList.technicalTwoStatus eq 'fail'}">
									<td>NA</td>
								</c:when>
								<c:otherwise><td><a
										href="TechnicalOneController?action=hrRoundAssessment&candidateId=${techincalTwoList.candidateId}">HR Round</a></td></c:otherwise>
							</c:choose>
						</tr>
					</c:forEach>

				</table>
			</form>

		</fieldset>




	</center>
</body>
</html>