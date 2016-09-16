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
<h3>Student Details </h3>
<table border="1">
        <tr>
            <td>Name:</td>
            <td> <c:out value="${theStudentThatWasClicked.firstName}"/></td>
        </tr>
        <tr>
            <td>SSN:</td>
            <td> <c:out value="${theStudentThatWasClicked.ssn}"/></td>
        </tr>
        <tr>
            <td>Age:</td>
            <td> <c:out value="${theStudentThatWasClicked.age}"/></td>
        </tr>
        <tr>
            <td>GPA:</td>
            <td> <c:out value="${theStudentThatWasClicked.gpa}"/></td>
        </tr>

</table>

<!-- New table here that uses foreach to show list of assignments  -->
<table border="1">
    <tr><td>Assignment</td><td>Score</td><td>TotalPointsPossible</td>
    <c:forEach items="${theStudentThatWasClicked.assignments}" var="aAssignment">
    <tr>
        <td> <c:out value="${aAssignment.assignmentName}"/></td>
        <td> <c:out value="${aAssignment.score}"/></td>
        <td> <c:out value="${aAssignment.totalPointsPossible}"/></td>
    </tr>
    </c:forEach>
</body>
</html>
