<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="TechnicalOneController?action=candidateRegister" method="post" >
	<fieldset>
	<center>
		<h1>Registration Form</h1>
			<br>
			<br>
		<table>
			<tr>
				<th>Candidate Name:</th>
				<td><input type="text" name="candidateName"></td>
			</tr>
			<tr>
				<th>Candidate Email Id:</th>
				<td><input type="text" name="candidateEmail"></td>
			</tr>
			<tr>
				<th>Candidate Mobile No:</th>
				<td><input type="text" name="candidateMobile"></td>
			</tr>
			<tr>
				<th>Candidate PanCard No:</th>
				<td><input type="text" name="candidatePancard"></td>
			</tr>
			<tr>
				<th>Upload resume</th>
				<td><input type="file" name="candidateResume" /></td>		
			</tr>
			<tr>
			</tr>
			<tr><td><input type="submit" value="Register"></td></tr>
		</table>
		</center>
		</fieldset>
	</form>
</body>
</html>