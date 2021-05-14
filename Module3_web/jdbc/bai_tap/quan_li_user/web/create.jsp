<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<body>
<h1>Create Product</h1>
<p>
    <c:if test='${requestScope["msg"] != null}'>
        <span class="message">${requestScope["msg"]}</span>
    </c:if>
</p>
<p>
    <a href="/product">Back Product List</a>
</p>
<form method="post">
<fieldset>
    <legend>Product Infomation</legend>
    <table>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Cost: </td>
            <td><input type="text" name="cost" id="cost"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create customer"></td>
        </tr>
    </table>
</fieldset>
</form>
</body>
</html>
