<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">

   function changeFunc() {
    var selectBox = document.getElementById("selectBox");
    var selectedValue = selectBox.options[selectBox.selectedIndex].text;
    var values = selectedValue.split(" ");
    document.getElementById("nameInput").value = values[2];
    document.getElementById("lastNameInput").value = values[5];
    document.getElementById("accountNumberInput").value = values[8];
   }

  </script>
<title>Update a Client</title>
</head>
<body>
<h1>Update a Client</h1>
<form:form method="post"  action="update" modelAttribute="Client">

    <form:select name="clientList" path="id" onchange="changeFunc();" id="selectBox">
     <c:forEach items="${list}" var="listValue">
    <option value="${listValue.id}"> First Name: ${listValue.name} Last Name: ${listValue.lastName} Account Number: ${listValue.accountNumber}</option>
     </c:forEach>
     </form:select>
     
     <table>
    <tr>
         <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name"  value="${list[0].name}"  id="nameInput"/></td> 
    </tr>
    <tr>
        <td><form:label path="lastName">Last Name</form:label></td>
        <td><form:input path="lastName"  value="${list[0].lastName}"  id="lastNameInput"/></td>
    </tr>
    <tr>
        <td><form:label path="accountNumber">Account Number</form:label></td>
        <td><form:input path="accountNumber"  value="${list[0].accountNumber}"  id="accountNumberInput"/></td>
    </tr>
</table>
  <input type="submit" value="update">
</form:form>
</body>
</html>