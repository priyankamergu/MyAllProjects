<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Candidate Id</title>
</head>
<body>
	<center>
		<form action="TechnicalOneController?action=getCandidateById" method="post">
			<table>

				<tr>
					<td>Enter Candidate Id :</td>
					<td><input type="text" name="candidateId"></td>

				</tr>
			</table>
			<br> <input type="submit" name="submit" value="Submit">
		</form>
	</center>
</body>
</html>