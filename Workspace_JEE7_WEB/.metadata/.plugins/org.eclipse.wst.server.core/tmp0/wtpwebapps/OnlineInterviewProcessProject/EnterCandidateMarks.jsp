<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Candidate Marks</title>
</head>
<body>
	<center>
		<form action="TechnicalOneController?action=saveCandidateMarks"
			method="post">

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
				<td><b>Enter Candidate Marks</b></td>
				<td>:</td>
				<td colspan="4"><input type="text" name="candidateMarks">
				</td>
			</tr>

			<input type="submit" name="save" value="Save">

		</form>
	</center>
</body>
</html>