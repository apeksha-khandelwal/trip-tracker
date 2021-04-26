<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/22/2021
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Welcome</title>
</head>
<body>
        <td>Welcome ${sessionScope.username }</td>
   <div><a href="home.jsp">Home</a></div>
        <div>
            <form:form action="listAdventures" method="post">
        Select a City:&nbsp;
        <select name="city">
            <c:forEach items="${list}" var="city">
                <option value="${city.id}">${city.name}</option>
            </c:forEach>
        </select>
        <br/><br/>
        <input type="submit" value="Submit" />
            </form:form>
        </div>
        <div>
        <a href="${pageContext.request.contextPath }/logout">Logout</a>
        </div>
</body>
</html>
