<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<style>body {background-color: lightskyblue;}

    tr:hover {
        background-color: #555;
        color: white;
    }
body {background-color: white  ;}

table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 45%;
}

td, th {
    border: 2px solid #566573 ;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd ;
}



</style>
<body>
<h2>Information on Students </h2>
<table border="3">
    <tr><th>First Name:</th><th>Last Name:</th><th>Gpa:</th><th>Link:</th> </tr>
    <c:forEach items="${stufftodo}" var="aToDo">
        <tr>
            <td> <c:out value="${aToDo.name}"/></td>
            <td> <c:out value="${aToDo.last}"/></td>
            <td> <c:out value="${aToDo.gpa}"/></td>
            <td><a href="/myweb/hello?action=detail&id=<c:out value="${aToDo.id}"/>"> View Detail</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>