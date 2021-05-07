<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/7/2021
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh Sách Sản Phẩm</title>
</head>
<body>
<h2>Danh Sách Sản Phẩm</h2>
<table border="1">
    <tr>
        <th>No</th>
        <th>ID</th>
        <th>Name</th>
        <th>Cost</th>
    </tr>
    <c:forEach var="product" items="${productList}" varStatus="loop">
        <tr>
            <td>${loop.index+1}</td>
            <td><c:out value="${product.id}"/></td>
            <td><c:out value="${product.name}"/></td>
            <td><c:out value="${product.cost}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
