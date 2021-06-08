<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/21/2021
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="?action=customer">List All Customer</a>
    </h2>
    <p><c:if test='${requestScope["msg"] != null}'>
        <span class="message">${requestScope["msg"]}</span>
    </c:if>
    </p>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <tr>
                <th><label>Type Customer</label>
                </th>
                <td>
                    <select name="type" required>
                        <option value="">--Please choose an option--</option>
                        <option value="1">Diamond</option>
                        <option value="2">Platinium</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">Member</option>
<%--                <c:forEach var="typeCustomer" items="${listTypeCustomer}">--%>
<%--                        <option><c:out value="${typeCustomer.idType}"/></option>--%>
<%--                </c:forEach>--%>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45" value="${name}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Email:</th>
                <td>
                    <input type="email" name="email" id="email" size="45" value="${email}"/>
                    <p>
                        <span style="color: red" class="message">${messageEmail}</span>
                    </p>
                </td>
            </tr>
            <tr>
                <th>Customer Gender:</th>
                <td>
                    <input type="text" name="gender" id="gender" size="15" value="${gender}"/>
                </td>
            </tr>
            <tr>
                <th>Customer CMND:</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" size="15" value="${cmnd}"/>
                    <p>
                        <span style="color: red" class="message">${massageCmnd}</span>
                    </p>
                </td>
            </tr>
            <tr>
                <th>Customer BirthDay:</th>
                <td>
                    <input type="date" name="birthday" id="birthday" size="15" value="${birthday}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="15" value="${address}"/>
                </td>
            </tr>
            <tr>
                <th>Customer Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15" value="${phone}"/>
                    <p>
                        <span style="color: red" class="message">${massagePhone}</span>
                    </p>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>