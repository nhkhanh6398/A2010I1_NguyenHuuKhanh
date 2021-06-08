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
<div class="container">
    <div class="row mt-5">
        <div class="col-lg-12">
            <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="img/furama1.jpg" class="d-block w-100 h-75" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h1 class="text-dark">Wellcome to Furama</h1>
                        </div>
                    </div>
                    <div class="carousel-item">

                        <img src="img/furama2.jpg" class="d-block w-100 h-75" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h1 class="text-dark">Wellcome to Furama</h1>
                        </div>

                    </div>
                    <div class="carousel-item">
                        <img src="img/furama3.jpg" class="d-block w-100 h-75" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                            <h1 class="text-dark">Wellcome to Furama</h1>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
<%--            <h1 class="text-center">Wellcome to Furama</h1>--%>
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
