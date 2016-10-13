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

<div class="container">

    <h1>Kurzus létrehozása</h1>

    <c:if test="${message}">
    <div class="alert alert-success" role="alert">${message}</div>
    </c:if>

<form:form method="post" modelAttribute="courseForm" action="/courses">

        <div class="form-group">
            <label for="nameInput">Név</label>
            <form:input path="name" id="nameInput" class="form-control" placeholder="Kurzus neve"/>
            <form:errors path="name" />
        </div>
        <div class="form-group">
            <label for="descriptionInput">Leírás</label>
            <form:textarea path="description" id="descriptionInput" class="form-control" placeholder="Kurzus leírása"/>
            <form:errors path="description" />
        </span>
        </div>
        <div class="form-group">
            <label for="startInput">Kezdete</label>
            <form:input path="start" id="startInput" class="form-control"/>
            <form:errors path="start" />
        </span>
        </div>
        <div class="form-group">
            <label for="endInput">Vége</label>
            <form:input path="end" id="startInput" class="form-control"/>
            <form:errors path="end" />
        </span>
        </div>

        <button type="submit" class="btn btn-primary">Kurzus létrehozása</button>
    </form:form>

    <h2>Kurzusok</h2>

    <table class="table table-hover">

        <tr>
            <th>Név</th>
            <th>Időpont</th>
        </tr>

        <tbody>
             <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.name}</td>
                <td>${course.start} - ${course.end}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>