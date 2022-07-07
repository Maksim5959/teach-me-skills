<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-light bg-light">
    <c:if test="${requestScope.navigation == 'group1'}">
        <form class="container-fluid justify-content-start">
            <a class="navbar-brand" href="mainPage.jsp">Social</a>
            <a href="registration.jsp"  class="btn btn-outline-success me-2" type="button">Register</a>
            <a href="login.jsp" class="btn btn-sm btn-outline-secondary me-2" type="button">Login</a>
        </form>
    </c:if>
    <c:if test="${requestScope.navigation == 'userPage'}">
        <form class="container-fluid justify-content-start">
            <a class="navbar-brand" href="userPage.jsp">Social</a>
            <a href="${pageContext.request.contextPath}/frontController?command=logout" class="btn btn-sm btn-outline-secondary me-2">Logout</a>
        </form>
    </c:if>

    <c:if test="${requestScope.navigation == 'group2'}">
        <form  class="container-fluid justify-content-start">
            <a class="navbar-brand" href="userPage.jsp">Social</a>
            <a href="${pageContext.request.contextPath}/frontController?command=logout" class="btn btn-sm btn-outline-secondary me-2">Logout</a>
            <a href="userPage.jsp" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</a>
        </form>
    </c:if>

    <c:if test="${requestScope.navigation == 'subscribes'}">
        <form  class="container-fluid justify-content-start">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/userPage.jsp">Social</a>
            <a href="${pageContext.request.contextPath}/frontController?command=logout" class="btn btn-sm btn-outline-secondary me-2">Logout</a>
            <a href="${pageContext.request.contextPath}/allUsersPage.jsp" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</a>
        </form>
    </c:if>

    <c:if test="${requestScope.navigation == 'followers'}">
        <form  class="container-fluid justify-content-start">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/userPage.jsp">Social</a>
            <a href="${pageContext.request.contextPath}/frontController?command=logout" class="btn btn-sm btn-outline-secondary me-2">Logout</a>
            <a href="${pageContext.request.contextPath}/followers.jsp" class="btn btn-sm btn-outline-secondary me-2" type="button">Back</a>
        </form>
    </c:if>
</nav>