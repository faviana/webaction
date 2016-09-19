<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students Personal Details</title>
</head>
<body>

<h2>Students List </h2>

<h3>List is organized by Gpa average</h3>

<table border="2">


    <tr><th>Students Name</th><th>Students Last Name</th><th>Students GPA</th><th>Information</th></tr>

    <c:forEach items="${stufftodo}" var="aToDo">

        <tr>

            <td> <c:out value="${aToDo.name}"/></td>

            <td> <c:out value="${aToDo.lastname}"/></td>

            <td> <c:out value="${aToDo.gpa}"/></td>
            <td> <a href="/myweb/hello?action=detail&id=<c:out value="${aToDo.id}"/>"> -> </a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
