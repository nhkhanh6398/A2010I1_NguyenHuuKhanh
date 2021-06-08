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
    <link rel="stylesheet" href="bootstrap413/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css">

</head>
<body>

<p><c:if test='${requestScope["msg"] != null}'>
    <span class="message">${requestScope["msg"]}</span>
</c:if>
</p>
<div class="container-fluid">
    <div class="row mt-2 ">
        <div class="col-lg-2 ">
            <a class="nav-link rounded btn-primary" href="?action=create">Create</a>
        </div>
        <div class="col-lg-8"></div>
        <div class="col-lg-2">
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                Search type
            </button>
        </div>
    </div>
</div>
<div class="container-fluid">

    <div class="row">
        <div class="col-lg-12">
            <h2 class="text-center">List</h2>
            <table id="tableCustomer" class="table table-striped table-bordered table-dark">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Diện tích</th>
                    <th>Trạng thái</th>
                    <th>Tầng</th>
                    <th>Loại văn phòng</th>
                    <th>Mô tả</th>
                    <th>Giá cho thuê</th>
                    <th>Ngày bắt đầu</th>
                    <th>Ngày kết thúc</th>
                    <th>Option Delete</th>
                </tr>
                </thead>
                <tbody><c:forEach var="module" items="${list}">
                    <tr>
                        <td><c:out value="${module.id}"/></td>
                        <td><c:out value="${module.area}"/></td>
                        <td><c:out value="${module.status}"/></td>
                        <td><c:out value="${module.floot}"/></td>
                        <td><c:out value="${module.typeRoom}"/></td>
                        <td><c:out value="${module.describe}"/></td>
                        <td><c:out value="${module.rent}"/></td>
                        <td><c:out value="${module.dayStart}"/></td>
                        <td><c:out value="${module.dayEnd}"/></td>
                        <td><a class="btn btn-danger" href="#" onclick="customerSetId('${module.id}','${module.id}')"
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
                <h5 class="modal-title" id="exampleModalLabel22">Delete Customer</h5>
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
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" id="id">
</form>


<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="?action=search" method="post">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Search Customer</h5>
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
        document.getElementById("id").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name: " + name;
    }

    function submitDelete() {
        <!-- để submit form delete  -->
        document.getElementById("deleteCustomer").submit();
    }
</script>
</body>
</html>
