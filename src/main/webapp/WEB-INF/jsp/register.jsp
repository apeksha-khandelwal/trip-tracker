<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/22/2021
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration</title>
</head>
<style>
    body {font-family: Arial, Helvetica, sans-serif;}

    /* Full-width input fields */
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    /* Set a style for all buttons */
    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }

    /* Extra styles for the cancel button */
    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    /* Center the image and position the close button */
    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
        position: relative;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* The Modal (background) */
    .modal {
        position: fixed; /* Stay in place */
        z-index: 1; /* Sit on top */
        left: 0;
        top: 0;
        width: 100%; /* Full width */
        height: 100%; /* Full height */
        overflow: auto; /* Enable scroll if needed */
        background-color: rgb(0,0,0); /* Fallback color */
        background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
        padding-top: 60px;
    }

    /* Modal Content/Box */
    .modal-content {
        background-color: #fefefe;
        margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
        border: 1px solid #888;
        width: 80%; /* Could be more or less, depending on screen size */
    }

    /* The Close Button (x) */
    .close {
        position: absolute;
        right: 25px;
        top: 0;
        color: #000;
        font-size: 35px;
        font-weight: bold;
    }

    .close:hover,
    .close:focus {
        color: red;
        cursor: pointer;
    }

    /* Add Zoom Animation */
    .animate {
        -webkit-animation: animatezoom 0.6s;
        animation: animatezoom 0.6s
    }

    @-webkit-keyframes animatezoom {
        from {-webkit-transform: scale(0)}
        to {-webkit-transform: scale(1)}
    }

    @keyframes animatezoom {
        from {transform: scale(0)}
        to {transform: scale(1)}
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>
<body>

<div id="registerModal" class="modal">
    <form:form class="modal-content animate" id="regForm" method="post" modelAttribute="user" action="registerProcess">
        <div class="imgcontainer">
        <span onclick="document.getElementById('registerModal').style.display='none'" class="close" title="Close Modal">&times;</span>
        <img src="img_avatar2.png" alt="Avatar" class="avatar">
    </div>

        <div class="container">
            <form:label path="username">Username</form:label>
            <form:input type="text" path="username" placeholder="Enter Username" name="username" id="username"/>

            <form:label path="password"><b>Password</b></form:label>
            <form:input type="password" path="password" placeholder="Enter Password" name="password" id="password"/>

            <form:label path="firstname">FirstName</form:label>
            <form:input path="firstname" placeholder="Enter Firstname" type="text" name="firstname" id="firstname" />


            <form:label path="lastname">LastName</form:label>
            <form:input path="lastname"  placeholder="Enter LastName" type="text" name="lastname" id="lastname" />


            <form:label path="email">Email</form:label>
            <form:input path="email" placeholder="Enter Email" type="text"  name="email" id="email" />


            <form:label path="address">Address</form:label>
            <form:input path="address"  placeholder="Enter Address" type="text" name="address" id="address" />


            <form:label path="phone">Phone</form:label>
            <form:input path="phone"  placeholder="Enter Phone" type="text" name="phone" id="phone" />

            <form:button id="register" name="register">Register</form:button>
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('registerModal').style.display='none'" class="cancelbtn">Cancel</button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form:form>
    <div>
        style="font-style: italic; color: red;">${message}
    </div>
</div>
</body>
</html>
