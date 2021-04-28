<%--
  Created by IntelliJ IDEA.
  User: apeks
  Date: 4/25/2021
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
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
                    <li class="active"><a href="${pageContext.request.contextPath }/welcome">Home</a></li>
                    <li class="currentTrip"><a href="${pageContext.request.contextPath }/currentTrip" style="width:auto;">Current Trips</a></li>
                    <li class="aboutUs"><a href="#">About US</a></li>
                    <li class="logout"><a href="${pageContext.request.contextPath }/logout" style="width:auto;">Logout</a></li>
                </ul>
            </span>
    </div>
</nav>
