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
<p><c:if test='${requestScope["msg"] != null}'>
    <span class="message">${requestScope["msg"]}</span>
</c:if>
</p>
<div class="container-fluid">
    <div class="row mt-2 ">
        <div class="col-lg-2 ">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal1">
                Create Service
            </button>
        </div>
        <div class="col-lg-8"></div>
        <div class="col-lg-2">
            <div class="row">
                <div class="col-12 text-center">
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                        Search Service
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container-fluid">

    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center">List Service</h2>
            <table id="tableCustomer" class="table table-striped table-bordered table-dark">
                <thead>
                <tr>
                    <th>ID Service</th>
                    <th>Name Service</th>
                    <th>Area Service</th>
                    <th>Cost Service</th>
                    <th>Max People Service</th>
                    <th>Rent Service</th>
                    <th>Option Edit</th>
                    <th>Option Delete</th>
                </tr>
                </thead>
                <tbody><c:forEach var="service" items="${list}">
                    <tr>
                        <td><c:out value="${service.idService}"/></td>

                        <td><c:out value="${service.nameService}"/></td>
                        <td><c:out value="${service.areaService}"/></td>
                        <td><c:out value="${service.costService}"/></td>
                        <td><c:out value="${service.peopleMaxService}"/></td>
                        <td><c:choose><c:when test="${service.typeRentService==1}">Theo Năm</c:when>
                            <c:when test="${service.typeRentService==2}">Theo Tháng</c:when>
                            <c:when test="${service.typeRentService==3}">Theo Ngày</c:when>
                            <c:when test="${service.typeRentService==4}">Theo Giờ</c:when>
                        </c:choose></td>

                        <td><a href="?action=editService&id=${service.idService}" class="text-white">Edit</a></td>
                        <td><a class="btn btn-danger" href="#" onclick="customerSetId('${service.idService}','${service.nameService}')"
                               data-toggle="modal" data-target="#deleteModal">Delete</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel22"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel22">Delete Service</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <input type="text" id="modelId" size="50" disabled style="border: none;background: white; color: red">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="submitDelete()">Delete</button>
            </div>
        </div>
    </div>
</div>
<form action="/" method="get" id="deleteCustomer">
    <input type="hidden" name="action" value="deleteService">
    <input type="hidden" name="idService" id="idService">
</form>
<jsp:include page="footer.jsp"></jsp:include>
<!-- Modal -->
<div class="modal fade" id="exampleModal1" tabindex="-1" aria-labelledby="exampleModalLabel1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="?action=createService" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel1">Create Service</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <table border="1" cellpadding="5">
                        <tr>
                            <th>Service Name:</th>
                            <td>
                                <input type="text" name="name" id="name" size="45" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Service Area:</th>
                            <td>
                                <input type="text" name="area" id="email" size="45" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Service Cost:</th>
                            <td>
                                <input type="text" name="cost" id="gender" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Service Max People:</th>
                            <td>
                                <input type="text" name="people" id="cmnd" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Service Rent:</th>
                            <td>
                                <input type="text" name="rent" id="birthday" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Save"/>
                            </td>
                        </tr>
                    </table>
                </div>

            </form>
        </div>
    </div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="?action=searchService" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Search Service</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <label>Input Name: </label>
                    <input type="text" name="name" placeholder="Name">
                    <input type="submit" value="Search">
                </div>
            </form>
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
    $(document).on('load', function () {
        $('#exampleModal').modal('show');
    })
    function customerSetId(id, name) {
        document.getElementById("idService").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name: " + name;
    }

    function submitDelete() {
        <!-- để submit form delete  -->
        document.getElementById("deleteCustomer").submit();
    }
</script>
</body>
</html>
