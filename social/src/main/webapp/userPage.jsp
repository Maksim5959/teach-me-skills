<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <title>User page</title>
</head>
<body>
<%request.setAttribute("navigation", "userPage");%>
<jsp:include page="fragments/header.jsp"></jsp:include>
<section style="background-color: #eeeeee;">
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
                        <h5 class="my-3"><c:out value="${user.fullName}"/></h5>
                        <p class="text-muted mb-1">Age: <c:out value="${user.age}"/></p>
                        <p class="text-muted mb-4">Gender: <c:out value="${user.gender}"/></p>
                        <div class="d-flex justify-content-center mb-2">
                                <a href="${pageContext.request.contextPath}/frontController?command=all_users" class="btn btn-outline-success btn-rounded">Get all users </a>
                                <a href="${pageContext.request.contextPath}/frontController?command=followers"  class="btn btn-outline-primary btn-rounded ms-1">Show followers
                                        <span class="badge bg-secondary">${fn:length(user.followers)}</span>
                                </a>
                        </div>
                        <div class="d-flex justify-content-center mb-2">
                                <a href="updatePage.jsp" type="submit" class="btn btn-outline-primary btn-rounded">Update account</a>
                                <a href="${pageContext.request.contextPath}/frontController?command=delete_user" onclick="test(event)" type="submit" class="btn btn-outline-danger btn-rounded ms-1">Delete account</a>
                        </div>
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
                                <p class="text-muted mb-0"><c:out value="${user.fullName}"/></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Email</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><c:out value="${user.email}"/></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Phone</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><c:out value="${user.phone}"/></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Login</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><c:out value="${user.login}"/></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Address</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><c:out value="${user.address}"/></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="fragments/script.jsp"></jsp:include>
<script charset="UTF-8" src="${pageContext.request.contextPath}/resources/js/delete.js" type="text/javascript"></script>
</body>
</html>
