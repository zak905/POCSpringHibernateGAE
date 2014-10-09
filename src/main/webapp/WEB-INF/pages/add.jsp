<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add a Client</title>
</head>
<body>
<h1>Add a client </h1>

<form:form method="post" action="add" modelAttribute="Client" >
    <table>
    <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td> 
    </tr>
    <tr>
        <td><form:label path="lastName">Last Name</form:label></td>
        <td><form:input path="lastName" /></td>
    </tr>
    <tr>
        <td><form:label path="accountNumber">Account Number</form:label></td>
        <td><form:input path="accountNumber" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="add"/>
        </td>
    </tr>
</table>
</form:form>  
</body>
</html>