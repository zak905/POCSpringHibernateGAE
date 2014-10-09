<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client List</title>
</head>
<body>
<h1>Client List</h1>

		<table>
		<tr>  <td> First Name </td>  <td> Last Name </td> <td> Account Number</td></tr> 
			<c:forEach var="listValue" items="${list}">
			<tr>
				<td>${listValue.name}</td><td>${listValue.lastName}</td><td>${listValue.accountNumber}</td>
			<tr>
			</c:forEach>
		</table>
 

</body>
</html>