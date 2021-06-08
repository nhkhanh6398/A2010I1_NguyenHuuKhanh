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
<center>
    <h1>Customer</h1>
    <h2>
        <a href="/">List All</a>
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
                <th>ID:</th>
                <td>
                    <input type="text" name="id" id="name" size="45" value="${id}" required/>
                    <p>
                        <span style="color: red" class="message">${messageId}</span>
                    </p>
                </td>
            </tr>
            <tr>
                <th>Diện tích:</th>
                <td>
                    <input type="area" name="area" id="area" size="45" value="${area}" required/>
                    <p>
                        <span style="color: red" class="message">${messageArea}</span>
                    </p>

                </td>
            </tr>
            <tr>
                <th>Trạng thái:</th>
                <td>
                <select name="status" required>
                    <option value="${status}">--Please choose an option--</option>
                    <option value="Trống">Trống</option>
                    <option value="Hạ Tầng">Hạ Tầng</option>
                    <option value="Đầy Đủ">Đầy Đủ</option>
                </select>
                </td>
            </tr>
            <tr>
                <th>Tầng</th>
                <td>

                    <select name="floot" required>
                        <option value="${floot}">--Please choose an option--</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                        <option value="13">13</option>
                        <option value="14">14</option>
                        <option value="15">15</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Loại văn phòng</th>
                <td>
                    <select name="type" required>
                        <option value="${type}">--Please choose an option--</option>
                        <option value="Cho thuê">Cho thuê</option>
                        <option value="Trọn gói">Trọn gói</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Mô tả chi tiết:</th>
                <td>
                    <input type="text" name="mota" id="mota" size="100" value="${mota}" required/>
                </td>
            </tr>
            <tr>
                <th>Giá:</th>
                <td>
                    <input type="text" name="rent" id="rent" size="15" value="${rent}" required/>
                    <p>
                        <span style="color: red" class="message">${messageRent}</span>
                    </p>
                </td>
            </tr>
            <tr>
                <th>Ngày bắt đầu:</th>
                <td>
                    <input type="date" name="start" id="start" size="15" value="${dayStart}" required/>
                </td>
            </tr>
            <tr>
                <th>Ngày kết thúc:</th>
                <td>
                    <input type="date" name="end" id="end" size="15" value="${dayEnd}" required/>
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