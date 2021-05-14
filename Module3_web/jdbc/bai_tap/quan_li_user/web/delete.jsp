<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/10/2021
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Form</title>
</head>
<body>
<h1>Delete Form</h1>
<p>
    <a href="/">Back to customer list</a>
</p>
<form>
<h3>Bạn muốn xóa?</h3>
    <fieldset>
        <legend>Product information</legend>
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
                <td>Cost: </td>
                <td>${requestScope["product"].getCost()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete customer"></td>
                <td><a href="/">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
