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
        <a href="?action=customer">List All Users</a>
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
                <input type="hidden" name="id" value="<c:out value='${showById.idCustomer}' />"/>
            </c:if>
            <tr>
                <th>Customer Type:</th>
                <td>
                    <select name="type" id="type">
                        <option value="1" id="Diamond">Diamond</option>
                        <option value="2" id="Platinium">Platinium</option>
                        <option value="3" id="Gold">Gold</option>
                        <option value="4" id="Silver">Silver</option>
                        <option value="5" id="Member">Member</option>
                    </select>

                </td>
            </tr>
            <tr>
                <th>Customer Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${showById.nameCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Birthday:</th>
                <td>
                    <input type="text" name="birthday" size="45"
                           value="<c:out value='${showById.birthCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Gender:</th>
                <td>
                    <input type="text" name="gender" size="15"
                           value="<c:out value='${showById.genderCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer CMND:</th>
                <td>
                    <input type="text" name="cmnd" size="15"
                           value="<c:out value='${showById.cmndCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Phone:</th>
                <td>
                    <input type="text" name="phone" size="15"
                           value="<c:out value='${showById.phoneCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Email:</th>
                <td>
                    <input type="text" name="email" size="15"
                           value="<c:out value='${showById.emailCustomer}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Customer Address:</th>
                <td>
                    <input type="text" name="address" size="15"
                           value="<c:out value='${showById.addressCustomer}' />"
                    />
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
    function editSelect(){
        let id = ${showById.typeCustomer};
        let type = "";
        switch (id) {
            case 1:
                type = "Diamond";
                break;
            case 2:
                type = "Platinium";
                break;
            case 3:
                type = "Gold";
                break;
            case 4:
                type = "Silver";
                break;
            case 5:
                type = "Member";
                break;
        }
        document.getElementById(type).selected = true;
    }
    $(window).on('load', function () {
        editSelect();
    });
</script>
</body>
</html>
