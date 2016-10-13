<?xml version="1.0" encoding="UTF-8"?>
<%@page contentType="text/html;charset=utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous"/>
    <title>JTechLog Badges</title>
</head>

<body>

<jsp:include page="menu.jsp" />

<div class="container" role="main">

<c:if test="${message}">
    <div class="alert alert-success" role="alert" >${message}</div>
    </c:if>

<form:form method="post" modelAttribute="badgeRequestForm" action="/badges/request">

        <div class="form-group">
            <label for="email">Email cím</label>
            <form:input name="email" type="email" class="form-control" id="email" placeholder="Email címed"
                   path="email"/>
            <form:errors path="email" />
        </span>
        </div>

        <div class="form-group">
            <label for="name">Név</label>
            <form:input name="name" type="text" class="form-control" id="name" placeholder="Neved"
            path="name"/>
            <form:errors path="name" />
        </span>
        </div>

        <div class="form-group">
            <label for="course">Tanfolyam</label>

             <form:select path="courseId">
                  <form:options items="${courses}" itemValue="id" itemLabel="name"/>
             </form:select>

            <form:errors path="courseId" />
        </span>
        </div>
        <button type="submit" class="btn btn-primary">Kérem a jelvényt</button>
    </form:form>

</div>

</body>
</html>