<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.11.2026
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
    <h2>Добавление работника</h2>
    <br>
    <br>
<form:form action="save" modelAttribute="saveEmployeeDto">
    Name: <form:input path="name"/>
    <br>
    Surname: <form:input path="surname"/>
    <br>
    Salary: <form:input path="salary"/>
    <br>
    Department: <form:input path="department"/>
    <br>
    <br>
    <input type="submit" value="Сохранить"/>
</form:form>
</body>
</html>
