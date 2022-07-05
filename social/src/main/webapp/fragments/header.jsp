<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-light bg-light">

    <c:if test="${pageContext.request.requestURI == '/social/mainPage.jsp' || pageContext.request.requestURI == '/social/login.jsp'
    || pageContext.request.requestURI == '/social/registration.jsp'}">
        <form class="container-fluid justify-content-start">
            <a class="navbar-brand" href="mainPage.jsp">Social</a>
            <button onclick="document.location='registration.jsp'" class="btn btn-outline-success me-2" type="button">Register</button>
            <button onclick="document.location='login.jsp'" class="btn btn-sm btn-outline-secondary me-2" type="button">Login</button>
        </form>
    </c:if>

    <c:if test="${pageContext.request.requestURI == '/social/user/login' || pageContext.request.requestURI == '/social/user/userPage.jsp'}">
        <form class="container-fluid justify-content-start" action="user/logout" method="get">
            <a class="navbar-brand" href="userPage.jsp">Social</a>
            <button class="btn btn-sm btn-outline-secondary me-2" type="submit">Logout</button>
        </form>
    </c:if>

    <c:if test="${pageContext.request.requestURI == '/social/user/usersPage.jsp' || pageContext.request.requestURI == '/social/user/followers.jsp'
    || pageContext.request.requestURI == '/social/user/updatePage.jsp' || pageContext.request.requestURI == '/social/user/deletePage.jsp'
    || pageContext.request.requestURI == '/social/user/subscribe' || pageContext.request.requestURI == '/social/user/deleteFollower'}">
        <form  class="container-fluid justify-content-start" action="user/logout" method="get">
            <a class="navbar-brand" href="userPage.jsp">Social</a>
            <button class="btn btn-sm btn-outline-secondary me-2" type="submit">Logout</button>
            <button onclick="document.location='userPage.jsp'" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</button>
        </form>
    </c:if>

    <c:if test="${pageContext.request.requestURI == '/social/user/subscriber/profile'}">
        <form  class="container-fluid justify-content-start" action="user/logout" method="get">
            <a class="navbar-brand" href="http://localhost:8080/social/user/userPage.jsp">Social</a>
            <button class="btn btn-sm btn-outline-secondary me-2" type="submit">Logout</button>
            <button onclick="document.location='http://localhost:8080/social/user/usersPage.jsp'" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</button>
        </form>
    </c:if>

    <c:if test="${pageContext.request.requestURI == '/social/user/followers/profile'}">
        <form  class="container-fluid justify-content-start" action="user/logout" method="get">
            <a class="navbar-brand" href="http://localhost:8080/social/user/userPage.jsp">Social</a>
            <button class="btn btn-sm btn-outline-secondary me-2" type="submit">Logout</button>
            <button onclick="document.location='http://localhost:8080/social/user/followers.jsp'" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</button>
        </form>
    </c:if>
</nav>