<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 6/8/2021
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<form method="post" action="/">
    <p>USD: </p>
    <input type="text" name="vnd">
    <input type="submit" value="Change">
    <p>Result</p>
    <h3>${result} VND</h3>
</form>
</body>
</html>
