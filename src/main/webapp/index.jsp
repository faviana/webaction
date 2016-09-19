<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
Hello
<h3>List of Students </h3>
<table border="1">
    <c:forEach items="${stufftodo}" var="aToDo">
        <tr>
            <td> <c:out value="${aToDo.firstname}"/></td>
            <td> <c:out value="${aToDo.lastname}"/></td>
            <td> <c:out value="${aToDo.ssn}"/></td>
            <td> <c:out value="${aToDo.age}"/></td>
            <td> <c:out value="${aToDo.gpa}"/></td>
            <td><a href="/myweb/hello?action=detail&id=<c:out value="${aToDo.id}"/>"> View Grade Details</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
