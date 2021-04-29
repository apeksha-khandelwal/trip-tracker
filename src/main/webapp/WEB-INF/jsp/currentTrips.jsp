<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/29/2021
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>trips</title>
</head>
<body>
<form:form action="deleteTrip" method="get">
<div class="row">
<c:forEach items="${trips}" var="trip">
    <div class="column" style="background-color:#aaa;" id = "${trip.tripId}" onclick="myFunction()">
        <h2>${trip.city.name}</h2>
        <c:forEach items="${trip.activities}" var="act">
            <p>${act.name}</p>
        </c:forEach>
    </div>
</c:forEach>
    <input type = "text" id="tripId" >
</div>
    <input type="submit" value="Delete"/>
</form:form>
<script>
    function myFunction() {
        document.getElementById("tripId").innerHTML = this.attr('id').replace('#', '');
    }
</script>
</body>
</html>
