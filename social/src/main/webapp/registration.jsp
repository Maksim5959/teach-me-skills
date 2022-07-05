<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/registration.css">
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <title>Registration</title>
</head>
<body>
<jsp:include page="fragments/header.jsp"></jsp:include>
<section class="vh-100">
    <div class="container py-5 h-100">
        <div class="row d-flex align-items-center justify-content-center h-100">
            <div class="col-md-8 col-lg-7 col-xl-6">
                <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
                     class="img-fluid" alt="Phone image">
            </div>
            <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
                <form action="user/register" method="post">
                    <!-- Full name input -->
                    <div class="form-outline mb-4">
                        <label for="FullName"></label>
                        <input name="name" type="text" id="FullName" class="form-control" placeholder="Full name" required/>
                    </div>
                    <!-- Age input -->
                    <div class="form-outline mb-4">
                        <label for="Age"></label>
                        <input name="age" type="text" id="Age" class="form-control" placeholder="Age (1-200)"
                               pattern="^(0?[1-9]|[1-9][0-9]|[1][0-9][0-9]|200)$" required/>
                    </div>
                    <!-- Gender input -->
                    <div class="gender">
                        <div class="form-check form-check-inline">
                            <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox1" value="MALE">
                            <label class="form-check-label" for="inlineCheckbox1">Male</label>
                        </div>
                        <div  class="form-check form-check-inline">
                            <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox2" value="FEMALE">
                            <label class="form-check-label" for="inlineCheckbox2">Female</label>
                        </div>
                    </div>
                    <!-- Phone input -->
                    <div class="form-outline mb-4">
                        <label for="Phone"></label>
                        <input name="phone" type="tel" id="Phone" class="form-control" placeholder="+375290000000"
                               pattern="^(\+375|80)(29|25|44|33)(\d{3})(\d{2})(\d{2})$" required/>
                    </div>
                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <label for="Email"></label>
                        <input name="email" type="email" id="Email" class="form-control" placeholder="Email" required/>
                    </div>
                    <!-- Address input -->
                    <div class="form-outline mb-4">
                        <label for="Address"></label>
                        <input name="address" type="text" id="Address" class="form-control" placeholder="Address" required/>
                    </div>
                    <!-- Login input -->
                    <div class="form-outline mb-4">
                        <label for="loginName"></label>
                        <input name="login" type="text" id="loginName" class="form-control" placeholder="Login" required/>
                    </div>
                    <!-- Password input -->
                    <div class="form-outline mb-4">
                        <label for="corePassword"></label>
                        <input onChange="onChange()" name="password" type="password" class="form-control cor_password" id="corePassword" placeholder="Password" required>
                    </div>
                    <div class="form-outline mb-5">
                        <label for="password"></label>
                        <input onChange="onChange()" name="confirm"  type="password" class="form-control password" id="password" placeholder="Confirm password" required>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                        <label class="form-check-label" for="flexCheckDefault">Show password</label>
                    </div>
                    <!-- Submit button -->
                    <button id="submit" type="submit" class="btn btn-primary btn-lg btn-block">Sign up</button>
                </form>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragments/script.jsp"></jsp:include>
<script src="resources/js/registration.js" type="text/javascript"></script>
</body>
</html>
