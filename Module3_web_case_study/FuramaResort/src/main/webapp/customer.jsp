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
                        <a class="nav-link" href="?action=create"> New Customer </a>
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
            <h2 class="text-center">List Customers</h2>
            <table id="tableCustomer" class="table table-striped table-bordered table-dark">
                <thead>
                <tr>
                    <th>ID Customer</th>
                    <th>ID Type Customer</th>
                    <th>Name Customer</th>
                    <th>CMND Customer</th>
                    <th>Gender Customer</th>
                    <th>BirthDay Customer</th>
                    <th>Email Customer</th>
                    <th>Address Customer</th>
                    <th>Phone Customer</th>
                    <th>Option Edit</th>
                    <th>Option Delete</th>
                </tr>
                </thead>
                <tbody><c:forEach var="customer" items="${list}">
                    <tr>
                        <td><c:out value="${customer.idCustomer}"/></td>
                        <td><c:out value="${customer.typeCustomer}"/></td>
                        <td><c:out value="${customer.nameCustomer}"/></td>
                        <td><c:out value="${customer.cmndCustomer}"/></td>
                        <td><c:out value="${customer.genderCustomer}"/></td>
                        <td><c:out value="${customer.birthCustomer}"/></td>
                        <td><c:out value="${customer.emailCustomer}"/></td>
                        <td><c:out value="${customer.addressCustomer}"/></td>
                        <td><c:out value="${customer.phoneCustomer}"/></td>
                        <td><a href="?action=edit&id=${customer.idCustomer}" class="text-white">Edit</a></td>
                        <td><a href="?action=delete&id=${customer.idCustomer}" class="text-white">Delete</a></td>
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
