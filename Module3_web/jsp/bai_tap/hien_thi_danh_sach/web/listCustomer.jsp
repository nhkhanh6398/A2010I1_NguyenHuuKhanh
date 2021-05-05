<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hiển Thị Danh Sách</title>
</head>
<body>
<div>
    <h2>Danh Sách Khách Hàng</h2>
    <table border="1">

        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td><c:out value="${customer.name}"/></td>
                <td><c:out value="${customer.dayOfBirth}"/></td>
                <td><c:out value="${customer.diaChi}"/></td>
                <td><img src="${customer.image}" style="width: 100px;height: 100px"/></td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
