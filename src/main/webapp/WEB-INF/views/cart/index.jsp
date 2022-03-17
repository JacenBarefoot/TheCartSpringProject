<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Cart Page</title>
</head>
<body>
<div id="ExampleProducts">
    <h3>Cart Page</h3>
    <table cellpadding="2" cellspacing="2" border="1">
        <tr>
            <th>Option</th>
            <th>Id</th>
            <th>Name</th>
            <th>Photo</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Sub Total</th>
        </tr>
        <c:set var="total" value="0"></c:set>
        <c:forEach var="item" items="${sessionScope.cart }">
            <c:set var="total"
                   value="${total + item.product.price * item.quantity }"></c:set>
            <tr>
                <td align="center"><a
                        href="${pageContext.request.contextPath }/cart/remove/${item.product.id }"
                        onclick="return confirm('Are you sure?')">Remove</a></td>
                <td>${item.product.id }</td>
                <td>${item.product.name }</td>
                <td><img src="${pageContext.request.contextPath }/resources/http://learningprogramming.net/wp-content/uploads/java/spring_mvc/${item.product.photo }"
                         width="50"></td>
                <td>${item.product.price }</td>
                <td>${item.quantity }</td>
                <td>${item.product.price * item.quantity }</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="right">Sum</td>
            <td>${total }</td>
        </tr>
    </table>
    <br>
    <a href="${pageContext.request.contextPath }/product">Continue
        Shopping</a>
</div>
<div id="backpacks_cart">
    <h3>Backpacks Cart</h3>
    <table cellpadding="2" cellspacing="2" border="1">
        <tr>
            <th>Option</th>
            <th>Id</th>
            <th>Brand</th>
            <th>Board Size</th>
            <th>Wheel Size</th>
            <th>Wheel Color</th>
            <th>Price</th>
            <th>Sub Total</th>
        </tr>
        <c:set var="total" value="0"></c:set>
        <c:forEach var="item" items="${sessionScope.cartb }">
            <c:set var="total"
                   value="${total + item.skateboard.price * item.quantity }"></c:set>
            <tr>
                <td align="center"><a
                        href="${pageContext.request.contextPath }/cart/removeBoards/${item.skateboard.id }"
                        onclick="return confirm('Are you sure?')">Remove</a></td>
                <td>${item.skateboard.id }</td>
                <td>${item.skateboard.boardBrand }</td>
                <td>${item.skateboard.boardSize }</td>
                <td>${item.skateboard.wheelSize }</td>
                <td>${item.skateboard.wheelColor }</td>
                <td>${item.skateboard.price }</td>
                <td>${item.quantity }</td>
                <td>${item.skateboard.price * item.quantity }</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="right">Sum</td>
            <td>${total }</td>
        </tr>
    </table>
    <br>
    <a href="${pageContext.request.contextPath }/skateboard">Continue
        Shopping</a>
</div>
<div id="BoardsCart">
    <h3>Skateboard Page</h3>
    <table cellpadding="2" cellspacing="2" border="1">
        <tr>
            <th>Option</th>
            <th>Id</th>
            <th>Brand</th>
            <th>Board Size</th>
            <th>Wheel Size</th>
            <th>Wheel Color</th>
            <th>Price</th>
            <th>Sub Total</th>
        </tr>
        <c:set var="total" value="0"></c:set>
        <c:forEach var="item" items="${sessionScope.cartb }">
            <c:set var="total"
                   value="${total + item.skateboard.price * item.quantity }"></c:set>
            <tr>
                <td align="center"><a
                        href="${pageContext.request.contextPath }/cart/removeBoards/${item.skateboard.id }"
                        onclick="return confirm('Are you sure?')">Remove</a></td>
                <td>${item.skateboard.id }</td>
                <td>${item.skateboard.boardBrand }</td>
                <td>${item.skateboard.boardSize }</td>
                <td>${item.skateboard.wheelSize }</td>
                <td>${item.skateboard.wheelColor }</td>
                <td>${item.skateboard.price }</td>
                <td>${item.quantity }</td>
                <td>${item.skateboard.price * item.quantity }</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="6" align="right">Sum</td>
            <td>${total }</td>
        </tr>
    </table>
    <br>
    <a href="${pageContext.request.contextPath }/skateboard">Continue
        Shopping</a>
</div>

</body>
</html>