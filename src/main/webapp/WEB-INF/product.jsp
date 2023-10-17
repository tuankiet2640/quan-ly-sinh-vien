
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="C"  uri="http://java.sun.com/jsp/jstl/core"%><html>
<head>
    <title>Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <style>
        img{
            width: 50px;
            height: 50px;
        }
    </style>
</head>
<body>
<h2>
    T shirts
</h2>

<table class="table table-dark">
    <thead>
    <tr >
        <th>product name</th>
        <th>price</th>
        <th>image</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <C:forEach var="product" items="${products}">
        <tr>
            <td>
                <c:out value="${product.productName}"></c:out>
            </td>
            <td>
                <c:out value="${product.price}"></c:out>
            </td>
            <td>
                <img src="<c:out value="${product.imageUrl}"/>" alt="Product Image"/>
            </td>
            <td>
                <a href="/product?action=buy&productId=${product.productId}">BUY NOW</a>
            </td>
        </tr>
    </C:forEach>
    </tbody>
</table>

</body>
</html>
