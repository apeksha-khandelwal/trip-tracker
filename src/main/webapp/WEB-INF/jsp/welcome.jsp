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
    <style>
        .collapsible {
            background-color: #777;
            color: white;
            cursor: pointer;
            padding: 18px;
            width: 100%;
            border: none;
            text-align: left;
            outline: none;
            font-size: 15px;
        }

        .active, .collapsible:hover {
            background-color: #555;
        }

        .content {
            padding: 0 18px;
            display: none;
            overflow: hidden;
            background-color: #f1f1f1;
        }
    </style>
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
    <c:if test="${sessionScope.city != null}">
    <form:form action="addActivities" method="get">
        <c:forEach items="${activities}" var="act">
            <tr>
                <td><input type="checkbox" class= "collapsible" name="activityId" value="${act.activityId}"/> ${act.name}</td>
                <div class="content">
                    <label>Price: ${act.price}</label>m
                    <label>Timing: ${act.timing}</label>
                </div>
            </tr>

        </c:forEach>
        <input type="submit" value="Submit"/>

        <script>
            var coll = document.getElementsByClassName("collapsible");
            var i;

            for (i = 0; i < coll.length; i++) {
                coll[i].addEventListener("click", function() {
                    this.classList.toggle("active");
                    var content = this.nextElementSibling;
                    if (content.style.display === "block") {
                        content.style.display = "none";
                    } else {
                        content.style.display = "block";
                    }
                });
            }
        </script>
    </form:form>
    </c:if>
</div>
</body>
</html>
