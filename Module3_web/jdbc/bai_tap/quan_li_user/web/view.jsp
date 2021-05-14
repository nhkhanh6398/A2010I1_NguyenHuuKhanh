<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/9/2021
  Time: 11:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<p>
    <a href="/product">Back to customer list</a>
</p>
<table>
    <tr>
        <td>ID: </td>
        <td>${requestScope["product"].getId()}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["product"].getCost()}</td>
    </tr>

</table>
</body>
</html>
