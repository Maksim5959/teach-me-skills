<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <link rel="stylesheet" href="resources/css/login.css" type="text/css">
    <title>Login</title>
</head>
<body>
<%request.setAttribute("navigation", "group1");%>
<jsp:include page="fragments/header.jsp"></jsp:include>
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <form action="frontController" method="post">
                    <input type="hidden" name="command" value="login"/>
                    <!-- Login input -->
                    <div class="form-outline mb-4">
                        <label for="login"></label>
                        <input name="login" type="text" id="login" class="form-control" placeholder="Login" required/>
                    </div>
                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <label for="password"></label>
                        <input name="password" type="password" id="password" class="form-control" placeholder="Password" required/>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                            <label class="form-check-label" for="flexCheckDefault">Show password</label>
                        </div>
                    </div>
                    <!-- Submit button -->
                    <button  type="submit" class="btn btn-primary btn-lg btn-block">Sign in</button>
                </form>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragments/script.jsp"></jsp:include>
<script src="resources/js/login.js" type="text/javascript"></script>
</body>
</html>
