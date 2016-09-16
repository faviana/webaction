<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
Hello
<h3>Students </h3>
<table border="1">
    <tr><td>First Name</td><td>Last Name</td><td>GPA</td></tr>
    <c:forEach items="${listOfAllStudents}" var="aStudent">
        <tr>
            <td> <c:out value="${aStudent.firstName}"/></td>
            <td> <c:out value="${aStudent.lastName}"/></td>
            <td> <c:out value="${aStudent.gpa}"/></td>
            <td><a href="/myweb/hello?action=detail&id=<c:out value="${aStudent.id}"/>"> View Details</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
