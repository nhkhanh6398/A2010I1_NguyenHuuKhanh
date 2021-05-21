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
<div class="container-fluid" >
    <div class="row">
        <div class="col-lg-2">
            <img class="w-25 m-3" src="img\logo.png" alt="logo" >
        </div>
        <div class="col-lg-8"></div>
        <div class="col-lg-2 pt-lg-5">
            <b class="text-danger text-center">Nguyễn Hữu Khánh</b>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row bg-light">
        <div class="col-lg-2"></div>
        <div class="col-lg-8">
            <nav class="navbar navbar-light bg-light">
                <div class="container-fluid">
                    <a class="navbar-brand" href="">Home</a>
                    <a class="navbar-brand" href="?action=employee">Employee</a>
                    <a class="navbar-brand" href="?action=customer">Customer</a>
                    <a class="navbar-brand" href="?action=service">Service</a>
                    <a class="navbar-brand" href="?action=contract">Contract</a>
                </div>
            </nav>
        </div>
        <div class="col-lg-2 ">
            <form class="d-flex m-3">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-3 border">
            <nav class="sidebar">
                <ul class="nav flex-column">
                    <li class="nav-item">
                        <a class="nav-link" href="?action=create"> New Customer </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="?action=edit"> Edit Customer </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"> Delete Customer </a>
                    </li>

                </ul>
            </nav>
        </div>
        <div class="col-lg-9">
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
                    </tr>
                </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 mt-2">
            <p class="text-center">Footer</p>
        </div>
    </div>
</div>

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
