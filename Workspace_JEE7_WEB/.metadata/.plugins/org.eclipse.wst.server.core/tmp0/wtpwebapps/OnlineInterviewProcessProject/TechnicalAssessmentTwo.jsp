<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Technical Assessment Two Page</title>
</head>
<body>
	<form action="TechnicalOneController?action=insertTechnicalTwo"
		method="post">
		<center>
			<br> <br>
			<h1>
				<font color="darkblue">Technical Assessment Two</font>
			</h1>
			<br>
			<h3>
				<table>
					<!-- border="2" -->
					<tr>
						<td><b>Enter Technical Two Id
								<td>:</td>
						</b></td>
						<td><label><input type="text" name="employeeId" /></label></td>
					</tr>
					<tr>
						<td><b>Technical One by Employee Id
								<td>:</td>
						</b></td>
						<td><input type="text" name="employeeIdRoundOne"
							value="${employee.employeeId}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b> Technical One by Employee Name
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateName"
							value="${employee.employeeName}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Candidate Id
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateId"
							value="${candidate.candidateId}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Candidate Name
								<td>:</td>
						</b></td>
						<td><input type="text" name="candidateName"
							value="${candidate.candidateName}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Aptitude Marks
								<td>:</td>
						</b></td>
						<td><label><input type="text" name="candidateMarks"
								value="${candidate.candidateMarks}" readonly="readonly" /></label></td>
					</tr>

					<tr>
						<td><b>Technical 1 Review
								<td>:</td>
						</b></td>
						<td><label>${technicalOne.review}</label></td>
					</tr>
					<tr>
						<td><b>Technical 1 Remarks
								<td>:</td>
						</b></td>
						<td><label>${technicalOne.remark}</label></td>
					</tr>
					<tr>
						<td><b>Technical 2 Review
								<td>:</td>
						</b></td>
						<td><input type="radio" name="review" value="Excellent">Excellent</input></td>
						<td><input type="radio" name="review" value="Good">Good</input></td>
						<td><input type="radio" name="review" value="Average">Average</input></td>
						<td><input type="radio" name="review" value="Poor">Poor</input></td>
					</tr>
					<tr>
						<td><b>Techincal 2 Remarks</b></td>
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
				<!-- sending technical one id -->
				<input type="hidden" name="technicalOneId"
					value="${technicalOne.technicalOneId}" />
				
				<br> <input type="submit" name="submit" value="Submit">


			</h3>
		</center>
	</form>


</body>
</html>