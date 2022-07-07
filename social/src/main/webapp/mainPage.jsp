<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Main page</title>
    <jsp:include page="fragments/style.jsp"></jsp:include>
</head>
<body>
<%request.setAttribute("navigation", "group1");%>
<jsp:include page="fragments/header.jsp"></jsp:include>
<div class="container">
    <h1 class="display-2" align="center">Social Network</h1>
</div>
<jsp:include page="fragments/script.jsp"></jsp:include>
</body>
</html>