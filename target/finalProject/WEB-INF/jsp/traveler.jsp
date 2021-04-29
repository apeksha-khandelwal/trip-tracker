<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/29/2021
  Time: 1:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="header.jsp" %>
</head>
<body>
<h1>Trip Information</h1>
<form:form method="post" modelAttribute="traveler" action="addTraveler">
    <div class="container">
        <form:label path="firstname">First Name:</form:label>
        <form:input type="text" path="firstname" placeholder="Enter First Name" name="firstname" id="firstname"/>
        <br>
        <form:label path="lastname">Last Name:</form:label>
        <form:input type="text" path="lastname" placeholder="Enter Last Name" name="lastname" id="lastname"/>
        <br>
        <form:label path="phone">Phone Number: </form:label>
        <form:input path="phone"  placeholder="Enter Phone Number" type="text" name="phone" id="phone" />
        <br>
        <form:label path="days">Number of Days: </form:label>
        <form:input path="days" placeholder="Enter the number of days for the trip" type="number"  name="days" id="days" />
        <br>
        <form:label path="adults">Adults: </form:label>
        <form:input path="adults"  placeholder="Enter number of Adults travelling" type="number" name="adults" id="adults" />
        <br>
        <form:label path="children">Children: </form:label>
        <form:input path="children" placeholder="Enter number of Children travelling" type="number" name="children" id="children" />
        <br>
        <form:button id="add" name="add">Submit Hotel Details</form:button>
    </div>
</form:form>
</body>
</html>
