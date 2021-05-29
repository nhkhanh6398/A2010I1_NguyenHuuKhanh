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
        <a href="?action=service">List All Users</a>
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
                <input type="hidden" name="id" value="<c:out value='${showByIdService.idService}' />"/>
            </c:if>

            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${showByIdService.nameService}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Area:</th>
                <td>
                    <input type="text" name="area" size="45"
                           value="<c:out value='${showByIdService.areaService}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Cost:</th>
                <td>
                    <input type="text" name="cost" size="15"
                           value="<c:out value='${showByIdService.costService}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Max People:</th>
                <td>
                    <input type="text" name="people" size="15"
                           value="<c:out value='${showByIdService.peopleMaxService}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Type RentService:</th>
                <td>
                    <input type="text" name="rent" size="15"
                           value="<c:out value='${showByIdService.typeRentService}' />"
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
