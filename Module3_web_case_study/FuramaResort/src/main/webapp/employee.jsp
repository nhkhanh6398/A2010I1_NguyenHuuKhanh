<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/19/2021
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Furama Resort</title>
    <link rel="icon" href="img/logo.png">
    <%--    <link rel="stylesheet" href="css/bootstrap.min.css"/>--%>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container-fluid">
    <div class="row ">
        <div class="col-lg-2 border ">
            <nav class="sidebar">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link" href="?action=createEmployee"> New Employee </a>
                    </li>
                </ul>
            </nav>
        </div>
        <div class="col-lg-10"></div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center">List Employee</h2>
            <table id="tableCustomer" class="table table-striped table-bordered table-dark">
                <thead>
                <tr>
                    <th>ID Employee</th>
                    <th>Name Employee</th>
                    <th>Birthday</th>
                    <th>CMND Employee</th>
                    <th>Salary Employee</th>
                    <th>Phone Employee</th>
                    <th>Email Employee</th>
                    <th>Address Employee</th>
                    <th>Education Employee</th>
                    <th>Position Employee</th>
                    <th>Division Employee</th>
                    <th>UserName Employee</th>
                    <th>Option Edit</th>
                    <th>Option Delete</th>
                </tr>
                </thead>
                <tbody><c:forEach var="employee" items="${list}">
                    <tr>
                        <td><c:out value="${employee.idEmployee}"/></td>
                        <td><c:out value="${employee.nameEmployee}"/></td>
                        <td><c:out value="${employee.birthEmployee}"/></td>
                        <td><c:out value="${employee.cmndEmployee}"/></td>
                        <td><c:out value="${employee.salaryEmployee}"/></td>
                        <td><c:out value="${employee.phoneEmployee}"/></td>
                        <td><c:out value="${employee.emailEmployee}"/></td>
                        <td><c:out value="${employee.addressEmployee}"/></td>
                        <td><c:out value="${employee.educationIdEmployee}"/></td>
                        <td><c:out value="${employee.positionIdEmployee}"/></td>
                        <td><c:out value="${employee.divisionIdEmployee}"/></td>
                        <td><c:out value="${employee.usernameEmployee}"/></td>
                        <td><a href="?action=editEmployee&id=${employee.idEmployee}" class="text-white">Edit</a></td>
                        <td><a href="?action=deleteEmployee&id=${employee.idEmployee}" class="text-white">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>

<%--<script src="js/jquery-3.6.0.min.js"></script>--%>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
</body>
</html>
