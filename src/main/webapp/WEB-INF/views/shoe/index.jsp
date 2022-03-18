<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Shoes Page</title>
</head>
<style>
    nav {
        background-color: steelblue;
        color: white;
        height: auto;
        display: flex;
        flex-direction: row;
        align-items: center;
        margin-bottom: 5vh;
    }
    .nav-section a, .anon-section a, .auth-section a {
        background-color: steelblue;
        color: white;
        text-decoration: none;
        font-size: 1rem;
        padding: 0.85rem 1rem;
        margin: 0;
    }

    .anon-section a, .auth-section a {
        font-size: 3rem;
        padding: 1.1rem 1rem !important;
    }

    nav a:hover {
        background-color: cadetblue;
        color: white;
        text-decoration: none;
        transition: background-color 0.5s;
    }
    .nav-section {
        display: flex;
        flex-direction: row;
        align-items: center;
        margin: 0;
        padding: 0;
    }
    nav a {
        font-size: 1.5em !important;
    }
    .dropdown {
        float: left;
        overflow: hidden;
    }

    .dropdown .dropbtn {
        cursor: pointer;
        font-size: 16px;
        border: none;
        outline: none;
        color: white;
        padding: 14px 16px;
        background-color: inherit;
        font-family: inherit;
        margin: 0;
    }
    .dropdown-content {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        min-width: 160px;
        box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
        z-index: 1;
    }

    .dropdown-content a {
        float: none;
        color: black;
        padding: 12px 16px;
        text-decoration: none;
        display: block;
        text-align: left;
    }

    .dropdown-content a:hover {
        background-color: cadetblue;
    }

    .show {
        display: block;
    }
</style>
<script>
    function myFunction() {
        document.getElementById("myDropdown").classList.toggle("show");
    }

    // Close the dropdown if the user clicks outside of it
    window.onclick = function(e) {
        if (!e.target.matches('.dropbtn')) {
            let myDropdown = document.getElementById("myDropdown");
            if (myDropdown.classList.contains('show')) {
                myDropdown.classList.remove('show');
            }
        }
    }
</script>
<body>

<br>
<nav class="nav-section">
    <a href="${pageContext.request.contextPath }/cart/index">Home</a>
    <a href="${pageContext.request.contextPath }/skateboard">Skateboards</a>
    <a href="${pageContext.request.contextPath }/backpack">Backpacks</a>
    <a href="${pageContext.request.contextPath }/shoe">Shoes</a>
    <div class="dropdown">
        <a><button style="font-size: 1em" class="dropbtn" onclick="myFunction()">Clothing
            <i class="fa fa-caret-down"></i>
        </button></a>
        <div class="dropdown-content" id="myDropdown">
            <a href="${pageContext.request.contextPath }/hoodie">Hoodies</a>

            <a href="${pageContext.request.contextPath }/pant">Pants</a>
        </div>
    </div>
    <br>
    <a href="${pageContext.request.contextPath }/cart/index">Carts</a>
</nav>
<br>

<h2>Shoes</h2>
<table cellpadding="12" cellspacing="12" border="2">
    <tr>
        <th>Id</th>
        <th>Brand</th>
        <th>Type</th>
        <th>Size</th>
        <th>Color</th>
        <th>Price</th>
        <th>Option</th>
    </tr>
    <c:forEach var="shoe" items="${shoes }">
        <tr>
            <td>${shoe.id }</td>
            <td>${shoe.shoeBrand }</td>
            <td>${shoe.shoeType }</td>
            <td>${shoe.shoeSize }in</td>
            <td>${shoe.shoeColor }</td>
            <td>$${shoe.price }</td>
            <td align="center">
                <a href="${pageContext.request.contextPath }/cart/buyShoes/${shoe.id}"
                   onclick="return confirm('Added to cart!!')">Buy Now</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>