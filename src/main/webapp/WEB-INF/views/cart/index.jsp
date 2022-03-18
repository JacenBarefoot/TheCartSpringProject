<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Cart Page</title>
</head>
<style>
    table {
        width: 50%;
        border-collapse: collapse;
    }
    td {
        text-align: center;
    }
    nav {
        background-color: steelblue;
        color: white;
        height: auto;
        display: flex;
        flex-direction: row;
        align-items: center;
        margin-bottom: 5vh;
        width: 50%;
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
<body style="padding-bottom: 2%;">
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
<div id="whole">
    <div id="BoardsCart">
        <h3>Skateboards</h3>
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <th>Option</th>
                <th>Id</th>
                <th>Brand</th>
                <th>Board Size</th>
                <th>Wheel Size</th>
                <th>Wheel Color</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
                <th>Purchase</th>
            </tr>
            <c:set var="total" value="0"></c:set>
            <c:forEach var="item" items="${sessionScope.cartBoards }">
                <c:set var="total"
                       value="${total + item.skateboard.price * item.quantity }"></c:set>
                <tr>
                    <td align="center"><a
                            href="${pageContext.request.contextPath }/cart/removeBoards/${item.skateboard.id }"
                            onclick="return confirm('Are you sure?')">Remove</a></td>
                    <td>${item.skateboard.id }</td>
                    <td>${item.skateboard.boardBrand }</td>
                    <td>${item.skateboard.boardSize }in</td>
                    <td>${item.skateboard.wheelSize }cm</td>
                    <td>${item.skateboard.wheelColor }</td>
                    <td>$${item.skateboard.price }</td>
                    <td>${item.quantity }</td>
                    <td>$${item.skateboard.price * item.quantity }</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/cart/removeBoards/${item.skateboard.id }"
                           onclick="return confirm('This will subtract $${item.skateboard.price * item.quantity } from your bank account! Are you sure you want purchase?? ')">Purchase</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8" align="right" style="text-align: right !important">Sum</td>
                <td>$${total }</td>
            </tr>
        </table>
        <br>
    </div>
    <div id="BackpackCart">
        <h3>Backpacks</h3>
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <th>Option</th>
                <th>Id</th>
                <th>Brand</th>
                <th>Size</th>
                <th>Color</th>
                <th>Waterproof?</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
                <th>Purchase</th>
            </tr>
            <c:set var="total" value="0"></c:set>
            <c:forEach var="item" items="${sessionScope.cartBackpacks }">
                <c:set var="total"
                       value="${total + item.backpack.price * item.quantity }"></c:set>
                <tr>
                    <td align="center"><a
                            href="${pageContext.request.contextPath }/cart/removeBackpacks/${item.backpack.id }"
                            onclick="return confirm('Are you sure?')">Remove</a></td>
                    <td>${item.backpack.id }</td>
                    <td>${item.backpack.bagBrand }</td>
                    <td>${item.backpack.bagSize }</td>
                    <td>${item.backpack.bagColor }</td>
                    <td>${item.backpack.isWaterproof }</td>
                    <td>$${item.backpack.price }</td>
                    <td>${item.quantity }</td>
                    <td>$${item.backpack.price * item.quantity }</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/cart/removeBackpacks/${item.backpack.id }"
                           onclick="return confirm('This will subtract $${item.backpack.price * item.quantity } from your bank account! Are you sure you want purchase?? ')">Purchase</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8" align="right" style="text-align: right !important">Sum</td>
                <td>$${total }</td>
            </tr>
        </table>
        <br>
    </div>
    <div id="ShoesCart">
        <h3>Shoes</h3>
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <th>Option</th>
                <th>Id</th>
                <th>Brand</th>
                <th>Type</th>
                <th>Size</th>
                <th>Color</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
                <th>Purchase</th>
            </tr>
            <c:set var="total" value="0"></c:set>
            <c:forEach var="item" items="${sessionScope.cartShoes }">
                <c:set var="total"
                       value="${total + item.shoe.price * item.quantity }"></c:set>
                <tr>
                    <td align="center"><a
                            href="${pageContext.request.contextPath }/cart/removeShoes/${item.shoe.id }"
                            onclick="return confirm('Are you sure?')">Remove</a></td>
                    <td>${item.shoe.id }</td>
                    <td>${item.shoe.shoeBrand }</td>
                    <td>${item.shoe.shoeType }</td>
                    <td>${item.shoe.shoeSize }</td>
                    <td>${item.shoe.shoeColor }</td>
                    <td>$${item.shoe.price }</td>
                    <td>${item.quantity }</td>
                    <td>$${item.shoe.price * item.quantity }</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/cart/removeShoes/${item.shoe.id }"
                           onclick="return confirm('This will subtract $${item.shoe.price * item.quantity } from your bank account! Are you sure you want purchase?? ')">Purchase</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8" align="right" style="text-align: right !important">Sum</td>
                <td>$${total }</td>
            </tr>
        </table>
        <br>
    </div>
    <div id="HoodiesCart">
        <h3>Hoodies</h3>
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <th>Option</th>
                <th>Id</th>
                <th>Brand</th>
                <th>Size</th>
                <th>Color</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
                <th>Purchase</th>
            </tr>
            <c:set var="total" value="0"></c:set>
            <c:forEach var="item" items="${sessionScope.cartHoodies }">
                <c:set var="total"
                       value="${total + item.hoodie.price * item.quantity }"></c:set>
                <tr>
                    <td align="center"><a
                            href="${pageContext.request.contextPath }/cart/removeHoodies/${item.hoodie.id }"
                            onclick="return confirm('Are you sure?')">Remove</a></td>
                    <td>${item.hoodie.id }</td>
                    <td>${item.hoodie.hoodieBrand }</td>
                    <td>${item.hoodie.hoodieSize }</td>
                    <td>${item.hoodie.hoodieColor }</td>
                    <td>$${item.hoodie.price }</td>
                    <td>${item.quantity }</td>
                    <td>$${item.hoodie.price * item.quantity }</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/cart/removeHoodies/${item.hoodie.id }"
                           onclick="return confirm('This will subtract $${item.hoodie.price * item.quantity } from your bank account! Are you sure you want purchase?? ')">Purchase</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="7" align="right" style="text-align: right !important">Sum</td>
                <td>$${total }</td>
            </tr>
        </table>
        <br>
    </div>

    <div id="PantsCart">
        <h3>Pants</h3>
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
                <th>Option</th>
                <th>Id</th>
                <th>Brand</th>
                <th>Type</th>
                <th>Size</th>
                <th>Color</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Sub Total</th>
                <th>Purchase</th>
            </tr>
            <c:set var="total" value="0"></c:set>
            <c:forEach var="item" items="${sessionScope.cartPants }">
                <c:set var="total"
                       value="${total + item.pant.price * item.quantity }"></c:set>
                <tr>
                    <td align="center"><a
                            href="${pageContext.request.contextPath }/cart/removePants/${item.pant.id }"
                            onclick="return confirm('Are you sure?')">Remove</a></td>
                    <td>${item.pant.id }</td>
                    <td>${item.pant.pantsBrand }</td>
                    <td>${item.pant.pantsType }</td>
                    <td>${item.pant.pantsSize }</td>
                    <td>${item.pant.pantsColor }</td>
                    <td>$${item.pant.price }</td>
                    <td>${item.quantity }</td>
                    <td>$${item.pant.price * item.quantity }</td>
                    <td>
                        <a href="${pageContext.request.contextPath }/cart/removePants/${item.pant.id }"
                           onclick="return confirm('This will subtract $${item.pant.price * item.quantity } from your bank account! Are you sure you want purchase?? ')">Purchase</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8" align="right" style="text-align: right !important">Sum</td>
                <td>$${total }</td>
            </tr>
        </table>
        <br>
    </div>
</div>
</body>
</html>