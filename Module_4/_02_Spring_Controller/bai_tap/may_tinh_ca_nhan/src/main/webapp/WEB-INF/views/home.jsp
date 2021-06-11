<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 6/11/2021
  Time: 11:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <th>Number One: </th>
            <th>Calculation: </th>
            <th>Number Two: </th>
        </tr>
        <tr>
            <td><input type="text" name="one" value="${one}"></td>
            <td><select name="cal">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>
            </td>
            <td><input type="text" name="two" value="${two}"></td>
        </tr>
    </table>
    <input type="submit" value="Submit">
</form>
<p>${result}</p>
</body>
</html>
