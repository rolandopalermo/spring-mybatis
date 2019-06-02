<%-- 
    Document   : home
    Created on : 23/04/2017, 08:18:57 PM
    Author     : rolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Products</h1>
        <c:forEach var="item" items="${products}">
            <c:out value="${item.name} ${item.price}"/>
            <br>
        </c:forEach>
    </body>
</html>
