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

    <h2>Jelvények</h2>

        <table class="table table-hover">

            <tr>
                <th>Név</th>
                <th>E-mail</th>
                <th>Kurzus</th>
            </tr>

            <tbody>
            <c:forEach var="badge" items="${badges}">
                <tr>
                    <td>${badge.name}</td>
                    <td>${badge.email}</td>
                    <td>${badge.courseName}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>

</div>

</body>
</html>