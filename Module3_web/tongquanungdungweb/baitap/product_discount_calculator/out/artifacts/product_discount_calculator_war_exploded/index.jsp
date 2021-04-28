<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 4/28/2021
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/form" method="post">
    <p>Mô tả:</p>
    <input type="text" placeholder="Mô tả"/>
    <p>Giá: </p>
    <input type="text" name="price"/>
    <p>Tỷ lệ chiết khấu: %</p>
    <input type="text" name="percent">
    <input type="submit" value="Calculate Discount"/>

  </form>
  </body>
</html>
