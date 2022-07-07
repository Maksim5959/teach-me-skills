<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/update.css" type="text/css">
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <title>Update user</title>
</head>
<body>
<%request.setAttribute("navigation", "group2");%>
<jsp:include page="fragments/header.jsp"></jsp:include>
<section style="background-color: #eeeeee;">
    <form action="frontController" method="post">
        <input type="hidden" name="command" value="update_user"/>
        <div class="container py-5">
            <div class="row">
                <div class="col-lg-4">
                    <div class="card mb-4">
                        <div class="card-body text-center">
                            <c:if test="${user.gender == 'MALE'}">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp"
                                 alt="avatar"
                                 class="rounded-circle img-fluid" style="width: 150px;"/>
                        </c:if>
                        <c:if test="${user.gender == 'FEMALE'}">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
                                 alt="avatar" class="img-fluid" style="width: 150px;"/>
                        </c:if>
                        <h5 class="my-3">${user.fullName}</h5>
                        <div class="d-flex justify-content-center mb-2">
                                <button  type="submit" class="btn btn-primary">Update</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-8">
                <div class="card mb-4">
                    <div class="card-body">
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Full Name</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="Name"></label>
                                <input name="name" type="text" id="Name" class="form-control" placeholder="Address" value="${user.fullName}" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Age</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="Age"></label>
                                <input name="age" type="text" id="Age" class="form-control" placeholder="Age (1-200)" value="${user.age}"
                                       pattern="^(0?[1-9]|[1-9][0-9]|[1][0-9][0-9]|200)$" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Gender</p>
                            </div>
                            <div class="col-sm-9">
                                    <c:if test="${user.gender == 'MALE'}">
                                        <div class="gender">
                                            <div class="form-check form-check-inline">
                                                <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox3" value="MALE" checked>
                                                <label class="form-check-label" for="inlineCheckbox1">Male</label>
                                            </div>
                                            <div  class="form-check form-check-inline">
                                                <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox4" value="FEMALE">
                                                <label class="form-check-label" for="inlineCheckbox2">Female</label>
                                            </div>
                                        </div>
                                    </c:if>
                                <c:if test="${user.gender == 'FEMALE'}">
                                    <div class="gender">
                                        <div class="form-check form-check-inline">
                                            <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox1" value="MALE">
                                            <label class="form-check-label" for="inlineCheckbox1">Male</label>
                                        </div>
                                        <div  class="form-check form-check-inline">
                                            <input name="gender" class="form-check-input" type="radio" id="inlineCheckbox2" value="FEMALE" checked>
                                            <label class="form-check-label" for="inlineCheckbox2">Female</label>
                                        </div>
                                    </div>
                                </c:if>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Phone</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="Phone"></label>
                                <input name="phone" type="tel" id="Phone" class="form-control" value="${user.phone}" placeholder="+375290000000"
                                       pattern="^(\+375|80)(29|25|44|33)(\d{3})(\d{2})(\d{2})$" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Email</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="Email"></label>
                                <input name="email" type="email" id="Email" class="form-control" placeholder="Email" value="${user.email}" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Address</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="Address"></label>
                                <input name="address" type="text" id="Address" class="form-control" placeholder="Address" value="${user.address}" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Login</p>
                            </div>
                            <div class="col-sm-9">
                                <label for="loginName"></label>
                                <input name="login" type="text" id="loginName" class="form-control" placeholder="Login" value="${user.login}" required/>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Password</p>
                            </div>
                            <div class="col-sm-9">
                                <div class="form-outline mb-4">
                                    <label for="corePassword"></label>
                                    <input onChange="onChange()" name="password" type="password" class="form-control cor_password"
                                           id="corePassword" placeholder="Password"  required>
                                </div>
                                <div class="form-outline mb-4">
                                    <label for="password"></label>
                                    <input onChange="onChange()" name="confirm"  type="password" class="form-control password"
                                           id="password" placeholder="Confirm password"  required>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                                    <label class="form-check-label" for="flexCheckDefault">
                                        Show password
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form>
</section>
<jsp:include page="fragments/script.jsp"></jsp:include>
<script src="${pageContext.request.contextPath}/resources/js/registration.js" ></script>
</body>
</html>
