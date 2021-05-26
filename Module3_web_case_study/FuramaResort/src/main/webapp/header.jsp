<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/24/2021
  Time: 6:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <a class="navbar-brand" href="?action=home">Home</a>
                    <a class="navbar-brand" href="?action=employee">Employee</a>
                    <a class="navbar-brand" href="?action=customer">Customer</a>
                    <a class="navbar-brand" href="?action=service">Service</a>
                    <a class="navbar-brand" href="?action=contract">Contract</a>
                </div>
            </nav>
        </div>

    </div>
</div>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
