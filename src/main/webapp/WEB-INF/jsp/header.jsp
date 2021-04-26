<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/25/2021
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<nav class="navbar navbar-default navbar-dark bg-dark">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">WebSiteName</a>
        </div>
        <span class="navbar-text">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li class="register"><a href="${pageContext.request.contextPath }/register" style="width:auto;">Sign Up</a></li>
                    <li class="login"><a href="${pageContext.request.contextPath }/login" style="width:auto;">Login</a></li>
                    <li class="aboutUs"><a href="#">About US</a></li>
                </ul>
            </span>
    </div>
</nav>
