<%--
  Created by IntelliJ IDEA.
  User: snowleopard
  Date: 3/22/18
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Atasozler page</title>
</head>
<body>
<form th:action="@{/logout}" method="post">
    <input type="submit" value="Sign Out"/>
</form>
<table border="1">
    <tr>
        <th>id</th>
        <th>KG</th>
        <th>TR</th>
        <th>maining</th>
    </tr>
    <c:forEach items="${ATASOZLERI}" var="ATASOZLER">
        <tr>
            <td>${ATASOZLER.id}</td>
            <td>${ATASOZLER.KG}</td>
            <td>${ATASOZLER.TR}</td>
            <td>${ATASOZLER.maining}</td>
            <td><a href="/getATASOZLERI?id=${ATASOZLER.id}">View details</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
