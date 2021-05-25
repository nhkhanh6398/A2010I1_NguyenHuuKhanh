<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/24/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="?action=employee">List All Users</a>
    </h2>
    <p><c:if test='${requestScope["msg"] != null}'>
        <span class="message">${requestScope["msg"]}</span>
    </c:if>
    </p>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <c:if test="${customer != null}">
                <input type="hidden" name="id" value="<c:out value='${showByIdEmployee.idEmployee}' />"/>
            </c:if>

            <tr>
                <th> Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${showByIdEmployee.nameEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${showByIdEmployee.birthEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>CMND:</th>
                <td>
                    <input type="text" name="gender" size="15"
                           value="<c:out value='${showByIdEmployee.cmndEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Salary:</th>
                <td>
                    <input type="text" name="cmnd" size="15"
                           value="<c:out value='${showByIdEmployee.salaryEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Phone:</th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${showByIdEmployee.phoneEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Email:</th>
                <td>
                    <input type="text" name="email" size="15"
                           value="<c:out value='${showByIdEmployee.emailEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${showByIdEmployee.addressEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Education:</th>
                <td>
                    <input type="text" name="type" size="45"
                           value="<c:choose><c:when test="${showByIdEmployee.educationIdEmployee ==1}">Trung cấp</c:when>
<c:when test="${showByIdEmployee.educationIdEmployee == 2}">Cao đẳng</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 3}">Đại học</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 4}">Sau đại học</c:when></c:choose>"
                    />
                    <%--<c:out value='${showById.typeCustomer}' />--%>
                </td>
            </tr>
            <tr>
                <th> Position:</th>
                <td>
                    <input type="text" name="type" size="45"
                           value="<c:choose><c:when test="${showByIdEmployee.positionIdEmployee ==1}">Lễ Tân</c:when>
<c:when test="${showByIdEmployee.positionIdEmployee == 2}">Phục Vụ</c:when><c:when test="${showByIdEmployee.positionIdEmployee == 3}">Chuyên Viên</c:when><c:when test="${showByIdEmployee.positionIdEmployee == 4}">Giám Sát</c:when>
<c:when test="${showByIdEmployee.positionIdEmployee == 5}">Quản Lý</c:when><c:when test="${showByIdEmployee.positionIdEmployee == 6}">Giám Đốc</c:when></c:choose>"
                    />
                    <%--<c:out value='${showById.typeCustomer}' />--%>
                </td>
            </tr>
            <tr>
                <th> Division:</th>
                <td>
                    <input type="text" name="type" size="45"
                           value="<c:choose><c:when test="${showByIdEmployee.educationIdEmployee ==1}">Sale – Marketing</c:when>
<c:when test="${showByIdEmployee.educationIdEmployee == 2}">Hành Chính</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 3}">Phục vụ</c:when>
<c:when test="${showByIdEmployee.educationIdEmployee == 4}">Quản lý</c:when></c:choose>"
                    />
                    <%--<c:out value='${showById.typeCustomer}' />--%>
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
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
