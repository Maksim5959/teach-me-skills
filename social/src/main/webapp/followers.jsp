<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <jsp:include page="fragments/style.jsp"></jsp:include>
    <link rel="stylesheet" href="followers.jsp" type="text/css">
    <title>Followers</title>
</head>
<body>
<jsp:include page="fragments/header.jsp"></jsp:include>
<h1>Followers:</h1>
<table class="table align-middle mb-0 bg-white">
    <thead class="bg-light">
    <tr>
        <th scope="col">#</th>
        <th>Name</th>
        <th>Login</th>
        <th>Gender</th>
        <th>Age</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="user" items="${users}" varStatus="counter">
        <tr>
            <th scope="row">${counter.count}</th>
            <td>
                <div class="d-flex align-items-center">
                    <form action="followers/profile" method="post" class="f1">
                        <c:if test="${user.gender == 'MALE'}">
                            <input type="hidden" value="${user.id}" name="userId">
                            <input type="image"
                                   src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp"
                                   alt="avatar"
                                   class="rounded-circle img-fluid" style="width: 45px; height: 45px"/>
                        </c:if>
                        <c:if test="${user.gender == 'FEMALE'}">
                            <input type="hidden" value="${user.id}" name="userId">
                            <input type="image"
                                   src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava1-bg.webp"
                                   alt="avatar" class="img-fluid" style="width: 45px; height: 45px"/>
                        </c:if>
                    </form>
                    <div class="ms-3">
                        <p class="fw-bold mb-1"><c:out value="${user.fullName}"/></p>
                        <p class="text-muted mb-0"><c:out value="${user.email}"/></p>
                    </div>
                </div>
            </td>
            <td>
                <p class="fw-normal mb-1"><c:out value="${user.login}"/></p>
            </td>
            <td>
                <p class="fw-normal mb-1"><c:out value="${user.gender}"/></p>
            </td>
            <td>
                <p class="fw-normal mb-1"><c:out value="${user.age}"/></p>
            </td>
            <td>
                <form action="deleteFollower" method="post">
                <button type="submit" value="${user.id}" name="id" class="btn btn-danger">Delete</button>
                </form>
            </td>
        </tr>
</c:forEach>
    </tbody>
</table>
<jsp:include page="fragments/script.jsp"></jsp:include>
</body>
</html>
