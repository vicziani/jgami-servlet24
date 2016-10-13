<%@page contentType="text/html;charset=utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<nav class="navbar">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">JTechLog Badges</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                        <c:forEach var="menuItem" items="${menuItems}" >
                <li><a href="${menuItem.url}"><spring:message code="${menuItem.name}" /></a></li>
                </c:forEach>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
