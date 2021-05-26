<%--
  Created by IntelliJ IDEA.
  User: Hữu Khánh
  Date: 5/26/2021
  Time: 7:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Service</title>
    <link rel="icon" href="img/logo.png">
    <%--    <link rel="stylesheet" href="css/bootstrap.min.css"/>--%>
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-4">
            <div class="card mx-auto" style="width: 18rem;">
                <img src="img/house.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">House</h5>

                    <a href="?action=house" class="btn btn-primary">Go House</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="card mx-auto" style="width: 18rem;">
                <img src="img/room.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Room</h5>

                    <a href="?action=room" class="btn btn-primary">Go Room</a>
                </div>
            </div>
        </div>
        <div class="col-lg-4">
            <div class="card mx-auto" style="width: 18rem;">
                <img src="img/villa.jpg" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">Villa</h5>
                    <a href="?action=villa" class="btn btn-primary">Go Villa</a>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
