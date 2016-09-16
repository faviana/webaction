<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<style>
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
    tr:hover {
        background-color: #555;
        color: white;
    }




</style>
<body>

<h2>Details On Student </h2>
<table>

        <tr>
            <th>First Name:</th>
            <td> <c:out value="${detailToDo.name}"/></td>
        </tr>
        <tr>
            <th>Last Name:</th>
            <td> <c:out value="${detailToDo.last}"/></td>
        </tr>
        <tr>
            <th>GPA:</th>
            <td> <c:out value="${detailToDo.gpa}"/></td>
        </tr>
    <tr>
        <th>Age:</th>
        <td> <c:out value="${detailToDo.age}"/></td>
    </tr>
    <tr>
        <th>SSN:</th>
        <td> <c:out value="${detailToDo.ssn}"/></td>
    </tr>

    <ul>
        <li><a href="/myweb/hello<c:out value="${aToDo}"/>">HOME</a></li>
    </ul>

</table>

<br/>
<br/>
<br/>
<br/>


<table border="3">
    <tr><th>Assignment</th><th>Score</th><th>Total Possible Points</th> </tr>
    <c:forEach items="${detailToDo.assignments}" var="aToDo">
        <tr>
            <td> <c:out value="${aToDo.assignt}"/></td>
            <td> <c:out value="${aToDo.score}"/></td>
            <td> <c:out value="${aToDo.totalpossible}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
