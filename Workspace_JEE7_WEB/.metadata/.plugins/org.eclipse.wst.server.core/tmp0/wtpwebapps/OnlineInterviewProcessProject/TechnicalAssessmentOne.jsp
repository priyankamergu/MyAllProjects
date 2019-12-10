<%@page import="com.interview.pojo.Candidate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technical Assessment One Page</title>
</head>
<body>
	<form action="TechnicalOneController?action=insertTechnicalOne"
		method="post">
		<center>
			<br> <br>
			<h1>
				<font color="darkblue">Technical Assessment One</font>
			</h1>
			<br>
			<h3>
				<table border=1>
					<!-- border="2" -->
					<tr>
						<td><b>Enter Employee Id
								<td>:</td>
						</b></td>
						<td><input type="text" name="employeeId" /></td>
					</tr>
					<tr>
						<td><b>Candidate Id
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateId"
							value="${candidate.candidateId}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Cadidate Name
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateName"
							value="${candidate.candidateName}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Aptitude Marks
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateMarks"
							value="${candidate.candidateMarks}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Technical 1 Review
								<td>:</td>
						</b></td>
						<td><input type="radio" name="review" value="Excellent">Excellent</input></td>
						<td><input type="radio" name="review" value="Good">Good</input></td>
						<td><input type="radio" name="review" value="Average">Average</input></td>
						<td><input type="radio" name="review" value="Poor">Poor</input></td>
					</tr>
					<tr>
						<td><b>Technical 1 Remarks</b></td>
						<td>:</td>
						<td colspan="4"><input type="text" name="remarks" size="35">
							<!-- rows="3" cols="20" --></td>
					</tr>
					<tr>
						<td><b>Status</b></td>
						<td>:</td>
						<td><input type="radio" name="status" value="pass">Pass</input></td>
						<td><input type="radio" name="status" value="fail">Fail</input></td>

					</tr>
				</table>

				<br> <input type="submit" name="submit" value="Submit">
			</h3>
		</center>
	</form>


</body>
</html>