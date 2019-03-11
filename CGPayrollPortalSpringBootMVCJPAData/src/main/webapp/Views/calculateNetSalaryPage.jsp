<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
CALCULATE NET SALARY
<form name="salaryform" action="netSalary" method="post">
<table>
<tr>
<th>Associate id</th>
<td><input type="text" name="associateId"></td>
</tr>
<tr>
<td><input type="submit" name="click"></td>
</tr>
</table>
</form>
<div>
<table>
<tr>
<td> The net salary is: ${netSalary}</td>
</tr>
</table></div>
</body>
</html>
