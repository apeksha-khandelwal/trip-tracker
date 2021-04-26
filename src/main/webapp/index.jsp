<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/22/2021
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
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

<video width="1200" height="800" controls>
    <source src=".././WEB-INF/videos/video-1.mp4" type="video/mp4">
    Your browser does not support HTML video.
</video>
</body>
</html>

