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
<h3>Grade Details </h3>
<table border="1">

    <tr>
        <td>First Name:</td>
        <td> <c:out  value="${detailToDo.firstname}"/></td>
    </tr>
        <tr>
            <td>Last Name:</td>
            <td> <c:out value="${detailToDo.lastname}"/></td>
        </tr>
        <tr>
            <td>Social Security Number:</td>
            <td> <c:out value="${detailToDo.age}"/></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td> <c:out value="${detailToDo.ssn}"/></td>
        </tr>
        <tr>
            <td>GPA:</td>
            <td> <c:out value="${detailToDo.gpa}"/></td>
        </tr>
        <tr>
            <td>Detail:</td>
            <td> <c:out value="${detailToDo.detail}"/></td>
        </tr>
        <tr>
            <td>Id:</td>
            <td> <c:out value="${detailToDo.id}"/></td>
        </tr>
</table>

<table border="1">
<c:forEach items="${detailToDo}" var="detailToDo">
    <tr>
        <td>Assignment Name:</td>
        <td> <c:out  value="${detailToDo.assignemntname}"/></td>
    </tr>
    <tr>
        <td>Possible Points:</td>
        <td> <c:out value="${detailToDo.possiblepoints}"/></td>
    </tr>
    <tr>
        <td>Points Awarded:</td>
        <td> <c:out value="${detailToDo.pointsawarded}"/></td>
    </tr>
</c:forEach>
</table>

    <a href=http://localhost:8080/myweb/hello<c:out value="${aToDo.id}"/>"> Back To Student Details</a>


</body>
</html>
