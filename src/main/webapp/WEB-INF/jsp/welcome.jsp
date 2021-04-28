<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/22/2021
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div>
    <form:form action="listActivities" modelAttribute="city" method="get">
        Select a City:&nbsp;
        <select name="cityId">
            <c:forEach items="${list}" var="city">
                <option path = "cityId" name = "cityId" value="${city.cityId}">${city.name}</option>
            </c:forEach>
        </select>
        <br/><br/>
        <input type="submit" value="Submit"/>
    </form:form>
</div>
<div>
    <form:form action="addTrip" method="post">
        <c:forEach items="${activities}" var="item">
            <h1>${item.name}</h1>
        </c:forEach>
        <%--                <form:checkboxes path="activities" items="${activities}" itemLabel="name" itemValue="Id"/>--%>
        <%--                            <div>--%>
        <%--                                <label>Activity:</label>--%>
        <%--                                <input type="text" disabled value="$">--%>
        <%--                            </div>--%>
    </form:form>
</div>
</body>
</html>
