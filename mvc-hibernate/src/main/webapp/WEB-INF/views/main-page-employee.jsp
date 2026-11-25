<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19.11.2026
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees Info Page</title>
</head>
<body>
<h2>Информация о работниках</h2>
<br>
<br>
<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Отдел</th>
    </tr>
    <c:forEach var="empl" items="${employees}">
        <tr>
            <td>${empl.empName}</td>
            <td>${empl.surname}</td>
            <td>${empl.department}</td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<input type="button" value="Добавить" onclick="window.location.href='add'">
</body>
</html>
