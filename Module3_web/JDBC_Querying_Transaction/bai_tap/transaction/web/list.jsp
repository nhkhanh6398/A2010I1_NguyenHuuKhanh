<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/13/2021
  Time: 9:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <p>Seach by name: </p>
    <form method="post" action="?action=search">
        <input type="text" name="name" placeholder="Search...">
        <input type="submit" value="Search">
    </form>
</div>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${showList}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.address}"/></td>
                <td>
                    <a href="?action=edit&id=${user.id}">Edit</a>
                    <a href="?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
