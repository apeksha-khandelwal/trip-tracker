<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/29/2021
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Review</title>
    <%@ include file="header.jsp" %>
</head>
<body>
<form:form method="post" modelAttribute="trip" action="addTrip">
    <form:label path="user">User: </form:label>
    <input path="user" type="text" name="user" id="user" disabled="true" value="${sessionScope.user.firstname}"/>
    <form:label path="city">City: </form:label>
    <input path="city" type="text" name="city" id="city" disabled="true"value="${sessionScope.city.name}"/>
    <form:label path="activities">Activities: </form:label>
    <c:forEach items="${sessionScope.activities}" var="act">
        <input path="activities" type="text" name="activity" id="activity" disabled="true" value="${act}"/>
    </c:forEach>
    <form:label path="hotel">Hotel: </form:label>
    <input path="hotel" type="text" name="hotel" id="hotel" disabled="true" value="${sessionScope.hotel.name}"/>
    <form:label path="traveler">Traveler: </form:label>
    <input path="traveler" type="text" name="traveler" id="traveler" disabled="true" value="${sessionScope.traveler.firstname}"/>
    <form:button id="add" name="add">Add Trip</form:button>
</form:form>
</body>
</html>
