<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/28/2021
  Time: 11:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hotel</title>
    <%@ include file="header.jsp" %>
</head>
<body>
<form:form method="post" modelAttribute="hotel" action="addHotel">
<div class="container">
    <form:label path="name">Hotel Name:</form:label>
    <form:input type="text" path="name" placeholder="Enter Hotel Name" name="name" id="name"/>
<br>
    <form:label path="date">Date: </form:label>
    <form:input path="date"  placeholder="Select date" type="text" name="date" id="date" />
<br>
    <form:label path="checkin">Checkin: </form:label>
    <form:input path="checkin" placeholder="Enter checkin" type="text"  name="checkin" id="checkin" />
<br>
    <form:label path="checkout">Checkout: </form:label>
    <form:input path="checkout"  placeholder="Enter checkout" type="text" name="checkout" id="checkout" />
<br>
    <form:checkbox path="breakfast" name="breakfast" id="breakfast"/>Breakfast
    <form:checkbox path="lunch" name="lunch" id="lunch"/>Lunch
    <form:checkbox path="dinner" name="dinner" id="dinner"/>Dinner
<br>
<%--    <script>--%>
<%--    $( function() {--%>
<%--    $.date.setDefaults({--%>
<%--    onClose:function(date, inst){--%>
<%--    }--%>
<%--    });--%>
<%--    $( "#date" ).datepicker();--%>
<%--    });--%>
<%--    </script>--%>

    <form:button id="add" name="add">Submit Hotel Details</form:button>
</div>
</form:form>
</body>
</html>
