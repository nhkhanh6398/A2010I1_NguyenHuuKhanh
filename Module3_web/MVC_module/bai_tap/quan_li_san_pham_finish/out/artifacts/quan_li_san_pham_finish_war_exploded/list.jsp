<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<p><a href="/product?action=create">Thêm Sản Phẩm</a></p>

<table border="1">
    <tr>
        <td>Num</td>
        <td>ID</td>
        <td>Name</td>
        <td>Cost</td>
    </tr>
    <c:forEach var="products" items='${requestScope["list"]}' varStatus="loop">
        <tr>
            <td>${loop.index+1}</td>
            <td>${products.getId()}</td>
            <td><a href="/product?action=view$id=${products.getId()}">${products.getName()}</a></td>
            <td>${products.getCost()}</td>
            <td><a href="/product?action=edit=${products.getId()}">Edit</a></td>
            <td><a href="/product?action=delete=${products.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
