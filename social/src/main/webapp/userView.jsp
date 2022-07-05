<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <title>Profile</title>
</head>
<body>
<jsp:include page="fragments/header.jsp"></jsp:include>
<section style="background-color: #eeeeee;">
    <div class="container py-5">
        <div class="row">
            <div class="col-lg-4">
                <div class="card mb-4">
                    <div class="card-body text-center">
                        <c:if test="${viewUser.gender == 'MALE'}">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp"
                                 alt="avatar"
                                 class="rounded-circle img-fluid" style="width: 150px;"/>
                        </c:if>
                        <c:if test="${viewUser.gender == 'FEMALE'}">
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
                                 alt="avatar" class="img-fluid" style="width: 150px;"/>
                        </c:if>
                        <h5 class="my-3">${viewUser.fullName}</h5>
                        <p class="text-muted mb-1">Age: ${viewUser.age}</p>
                        <p class="text-muted mb-4">Gender: ${viewUser.gender}</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-8">
                <div class="card mb-4">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Full Name</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0">${viewUser.fullName}</p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Email</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0">${viewUser.email}</p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Followers count</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0">${fn:length(viewUser.followers)}</p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Login</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0">${viewUser.login}</p>
                            </div>
                        </div>
                        <hr>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragments/script.jsp"></jsp:include>
</body>
</html>
