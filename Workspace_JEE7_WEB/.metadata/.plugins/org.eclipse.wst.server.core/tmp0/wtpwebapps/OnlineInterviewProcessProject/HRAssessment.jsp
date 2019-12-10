<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HR Assessment Page</title>
</head>
<body>
	<form action="TechnicalOneController?action=insertHrRound"
		method="post">
		
		<center>
			<br> <br>
			<h1>
				<font color="darkblue">HR Assessment</font>
			</h1>
			<br>
			<h3>
				<table>
					<!-- border="2" -->
					<tr>
						<td><b>Enter HR Id
								<td>:</td>
						</b></td>
						<td><label><input type="text" name="hrId" /></label></td>
					</tr>
					<tr>
						<td><b>Technical Two by Employee Id
								<td>:</td>
						</b></td>
						<td><label><input type="text" name="employeeIdTwo" value="${technicalTwo.employeeId}" readonly="readonly" /></label></td>
					</tr>
					<tr>
						<td><b> Technical Two by Employee Name
								<td>:</td>
						</b></td>
						<td><input type="text" name="employeeNameTwo"
							value="${technicalTwoEmployeeName}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Technical Two Review
								<td>:</td>
						</b></td>
						<td><label>${technicalTwo.review}</label></td>
					</tr>
					<tr>
						<td><b>Technical Two Remarks
								<td>:</td>
						</b></td>
						<td><label>${technicalTwo.remark}</label></td>
					</tr>
					<tr>
						<td><b>Technical One by Employee Id
								<td>:</td>
						</b></td>
						<td><input type="text" name="employeeIdRoundOne"
							value="${technicalOne.employeeId}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b> Technical One by Employee Name
								<td>:</td>
						</b></td>
						<td><input type="text" name="employeeNameOne"
							value="${technicalOneEmployeeName}" readonly="readonly" /></td>
					</tr>
					<tr>
						<td><b>Technical One Review
								<td>:</td>
						</b></td>
						<td><label>${technicalOne.review}</label></td>
					</tr>
					<tr>
						<td><b>Technical One Remarks
								<td>:</td>
						</b></td>
						<td><label>${technicalOne.remark}</label></td>
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
						<td><b>HR Review
								<td>:</td>
						</b></td>
						<td><input type="radio" name="review" value="Excellent">Excellent</input></td>
						<td><input type="radio" name="review" value="Good">Good</input></td>
						<td><input type="radio" name="review" value="Average">Average</input></td>
						<td><input type="radio" name="review" value="Poor">Poor</input></td>
					</tr>
					<tr>
						<td><b>HR Remarks</b></td>
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
				<input type="hidden" name="technicalTwoId"
					value="${technicalTwo.techincalTwoId}" /> <br> <input
					type="submit" name="submit" value="Submit">


			</h3>
		</center>
	</form>


</body>
</html>