<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
	font: weight:bold;
}
</style>
</head>
<body>
	<div><form align="center" action="findAssociate" method="post">
		<h2>Enroll Associate Details Here</h2>
		<table>
		<tr>
		<td>AssociateId </td>
		<td><input type="text" name="associateId"></td>
		<td><input type="submit" name="Click"></td>
		<td><a href="index">||Home||</td>
		</tr>
		</table>
	</form>
		</div>
		<div align="center" class="error">
		${errorMessage}</div>
		<br><br>
		<div align="center">
		<table>
		<tr>
		<th>AssociateId</th>
		<th>FirstName</th>
		<th>LastName</th>

		</tr>
		<tr>
		<td>${associate.associateId}</td>
		<td>${associate.firstName}</td>
		<td>${associate.lastName }</td>

		</tr>
		</table></div>
<table>
<tr>
<td><a href="indexPage.jsp">Home Page</a> 
</td>
</tr></table>

</body>
</html>