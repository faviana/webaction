<%--
  Created by IntelliJ IDEA.
  User: favianalopez
  Date: 9/17/16
  Time: 12:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date,java.util.List,java.io.*" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Students Assignments</title>
</head>
<body>

<h3>Assignment Information</h3>

<table border="1">
    <tr><td>Students Assignment</td><td>Points Earned</td><td>Possible Points</td><td>Home</td></tr>

        <c:forEach items="${ListOfAssignments}" var="assignments"/>
    <tr>

            <td><c:out value="${ListOfAssignments.assignmentName}"/></td>


    <td><c:out value="${ListOfAssignments.grade}"/></td>


    <td><c:out value="${ListOfAssignments.possible}"/></td>


</table>

</body>
</html>




