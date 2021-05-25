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
    <h1>Employee Management</h1>
    <h2>
        <a href="?action=employee">List All Employee</a>
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
                <th>Employee Name:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee BirthDay:</th>
                <td>
                    <input type="date" name="birthday" id="birthday" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Employee CMND:</th>
                <td>
                    <input type="text" name="cmnd" id="cmnd" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Salary:</th>
                <td>
                    <input type="text" name="salary" id="salary" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Phone:</th>
                <td>
                    <input type="text" name="phone" id="phone" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Email:</th>
                <td>
                    <input type="text" name="email" id="email" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Employee Address:</th>
                <td>
                    <input type="text" name="address" id="address" size="15"/>
                </td>
            </tr>
            <tr>
                <th><label>Position Employee</label>
                </th>
                <td>
                    <select name="position" required>
                        <option value="">--Please choose an option--</option>
                        <option value="1">Lễ Tân</option>
                        <option value="2">Phục Vụ</option>
                        <option value="3">Chuyên Viên</option>
                        <option value="4">Giám Sát</option>
                        <option value="5">Quản Lý</option>
                        <option value="6">Giám Đốc</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th><label>Education Employee</label>
                </th>
                <td>
                    <select name="education" required>
                        <option value="">--Please choose an option--</option>
                        <option value="1">Trung cấp</option>
                        <option value="2">Cao đẳng</option>
                        <option value="3">Đại học</option>
                        <option value="4">Sau đại học</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th><label>Division Employee</label>
                </th>
                <td>
                    <select name="division" required>
                        <option value="">--Please choose an option--</option>
                        <option value="1">Sale – Marketing</option>
                        <option value="2">Hành Chính</option>
                        <option value="3">Phục vụ</option>
                        <option value="4">Quản lý</option>
                    </select>
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