<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Email and SMS</title>
</head>
<body>
	<center>
		<form action="TechnicalOneController?action=sendEmailAndSMS"
			method="post">

			<c:if test="${param.action eq 'sendEmailAndSMS'}">
				<input type="hidden" name="action" value="sendEmailAndSMS" />
			</c:if>
			<br> <br>

			<h1>
				<font color="darkblue">Send Email and SMS to Selected
					Candidates</font>
			</h1>
			<br> <br>
			<table>
				<tr>
					<td>Date</td>
					<td>:</td>
					<td><input type="date" name="date"></td>
				</tr>
				<tr>
					<td>Time</td>
					<td>:</td>
					<td><input type="time" name="time"></td>
				</tr>
				<tr>
					<td>Note</td>
					<td>:</td>
					<td><input type="text" name="note"></td>
				</tr>
				<tr>
					<td>Location</td>
					<td>:</td>
					<td><input type="text" name="location"></td>
				</tr>
			</table>

			<br> <br> <input type="submit" name="send Email and SMS"
				value="Send Email">


		</form>
	</center>
</body>
</html>