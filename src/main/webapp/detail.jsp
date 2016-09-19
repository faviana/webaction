<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students Details</title>
</head>
<body>

<h3>Students Information</h3>

<table border="1">
    <tr>
        <td>Name:</td>
        <td> <c:out value="${detailToDo.name}"/></td>
    </tr>

    <tr>
        <td>Last Name:</td>
        <td> <c:out value="${detailToDo.lastname}"/></td>
    </tr>

    <tr>
        <td>SSN:</td>
        <td> <c:out value="${detailToDo.social}"/></td>
    </tr>

    <tr>
        <td>Age:</td>
        <td> <c:out value="${detailToDo.age}"/></td>
    </tr>

    <tr>
        <td>GPA:</td>
        <td><a href="/myweb/hello?action=assignment&id=<c:out value="${detailToDo.id}"/>"><c:out value="${detailToDo.gpa}"/>
        </a></td>
    </tr>

    <tr>
        <td>Student Id:</td>
        <td> <c:out value="${detailToDo.id}"/></td>
    </tr>
</table>


</body>
</html>
