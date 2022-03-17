<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Boards Page</title>
</head>
<body>

<h3>Boards Page</h3>
<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Id</th>
        <th>Brand</th>
        <th>Wheel Size</th>
        <th>Wheel Color</th>
        <th>Price</th>
    </tr>
    <c:forEach var="skateboard" items="${skateboards }">
        <tr>
            <td>${skateboard.id }</td>
            <td>${skateboard.boardBrand }</td>
            <td>${skateboard.wheelSize }</td>
            <td>${skateboard.wheelColor }</td>
            <td>${skateboard.price }</td>
            <td align="center">
                <a href="${pageContext.request.contextPath }/cart/buyBoards/${skateboard.id}">Buy Now</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
