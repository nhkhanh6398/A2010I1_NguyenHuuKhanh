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
                    <input type="text" name="cmnd" size="15"
                           value="<c:out value='${showByIdEmployee.cmndEmployee}' />"
                    />
                </td>
            </tr>
            <tr>
                <th> Salary:</th>
                <td>
                    <input type="text" name="salary" size="15"
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
                    <select name="education" id="education">
                        <option value="1" id="tc">Trung Cấp</option>
                        <option value="1" id="cd">Cao Đẳng</option>
                        <option value="1" id="dh">Đại Học</option>
                        <option value="1" id="sdh">Sau Đại Học</option>
                    </select>
                </td>
                <%--                <td>--%>
                <%--                    <input type="text" name="education" size="45"--%>
                <%--                           value="<c:choose><c:when test="${showByIdEmployee.educationIdEmployee ==1}">Trung cấp</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 2}">Cao đẳng</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 3}">Đại học</c:when><c:when test="${showByIdEmployee.educationIdEmployee == 4}">Sau đại học</c:when></c:choose>"--%>
                <%--                    />--%>
                <%--                </td>--%>
            </tr>
            <tr>
                <th> Position:</th>
                <td>
                    <select name="position" id="position">
                        <option value="1" id="lt">Lễ Tân</option>
                        <option value="2" id="pvu">Phục Vụ</option>
                        <option value="3" id="cv">Chuyên Viên</option>
                        <option value="4" id="gs">Giám Sát</option>
                        <option value="5" id="qly">Quản Lý</option>
                        <option value="5" id="gd">Giám Đốc</option>
                    </select>
                </td>

            </tr>
            <tr>
                <th> Division:</th>
                <td>
                    <select name="division" id="division">
                        <option value="1" id="sl">Sale – Marketing</option>
                        <option value="2" id="hc">Hành Chính</option>
                        <option value="3" id="pv">Phục vụ</option>
                        <option value="4" id="ql">Quản lý</option>
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
<jsp:include page="footer.jsp"></jsp:include>
<script>
    function editSelect() {
        let id = ${showByIdEmployee.divisionIdEmployee};
        let division = "";
        switch (id) {
            case 1:
                division = "sl";
                break;
            case 2:
                division = "hc";
                break;
            case 3:
                division = "pv";
                break;
            case 4:
                division = "ql";
                break;
        }
        document.getElementById(division).selected = true;
    }
    function editSelectPosition() {
        let id = ${showByIdEmployee.positionIdEmployee};
        let position = " ";
        switch (id) {
            case 1:
                position = "lt";
                break;
            case 2:
                position = "pvu";
                break;
            case 3:
                position = "cv";
                break;
            case 4:
                position = "gs";
                break;
            case 5:
                position = "qly";
                break;
            case 6:
                position = "gd";
                break;
        }
        document.getElementById(position).selected = true;
    };
    function editSelectEducation() {
        let id = ${showByIdEmployee.educationIdEmployee};
        let education = " ";
        switch (id) {
            case 1:
                education = "tc";
                break;
            case 2:
                education = "cd";
                break;
            case 3:
                education = "dh";
                break;
            case 4:
                education = "sdh";
                break;
        }
        document.getElementById(education).selected = true;
    };
    $(window).on('load', function () {
        editSelectEducation();
        editSelectPosition();
        editSelect();
    });
</script>
</body>
</html>
