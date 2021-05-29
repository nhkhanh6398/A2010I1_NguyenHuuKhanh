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
    <style>
        table {
            display: block;
            max-width: fit-content;
            margin: 0 auto;
            overflow-x: auto;
            white-space: nowrap;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container-fluid">
    <div class="row mt-2 ">
        <div class="col-lg-2">
            <div class="row">
                <div class="col-12 text-center">
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal1">
                       Create Employee
                    </button>
                </div>
            </div>
        </div>
        <div class="col-lg-8"></div>
        <div class="col-lg-2">
            <div class="row">
                <div class="col-12 text-center">
                    <!-- Button trigger modal -->
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                        Search Employee
                    </button>
                </div>
            </div>
        </div>
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
                        <td><c:choose><c:when test="${employee.educationIdEmployee==1}">Trung Cấp</c:when>
                            <c:when test="${employee.educationIdEmployee==2}">Cao Đẳng</c:when>
                            <c:when test="${employee.educationIdEmployee==3}">Đại Học</c:when>
                            <c:when test="${employee.educationIdEmployee==4}">Sau Đại Học</c:when>
                        </c:choose></td>
                        <td>
                            <c:choose><c:when test="${employee.positionIdEmployee==1}">Lễ Tân</c:when>
                                <c:when test="${employee.positionIdEmployee==2}">Phục Vụ</c:when>
                                <c:when test="${employee.positionIdEmployee==3}">Chuyên viên</c:when>
                                <c:when test="${employee.positionIdEmployee==4}">Giám Sát</c:when>
                                <c:when test="${employee.positionIdEmployee==5}">Quản Lý</c:when>
                                <c:when test="${employee.positionIdEmployee==6}">Giám Đốc</c:when>
                            </c:choose>
                        </td>
                        <td><c:choose><c:when test="${employee.divisionIdEmployee==1}">Sale – Marketing</c:when>
                            <c:when test="${employee.divisionIdEmployee==2}">Hành Chính</c:when>
                            <c:when test="${employee.divisionIdEmployee==3}">Phục vụ</c:when>
                            <c:when test="${employee.divisionIdEmployee==4}">Quản lý</c:when>
                        </c:choose></td>
                        <td><c:out value="${employee.usernameEmployee}"/></td>
                        <td><a href="?action=editEmployee&id=${employee.idEmployee}" class="text-white">Edit</a></td>
                        <td><a class="btn btn-danger" href="#" onclick="customerSetId('${employee.idEmployee}','${employee.nameEmployee}')"
                               data-toggle="modal" data-target="#deleteModal">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
</div>
<div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel33"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel33">Modal title</h5>
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
    <input type="hidden" name="action" value="deleteEmployee">
    <input type="hidden" name="idEmployee" id="idEmployee">
</form>
<jsp:include page="footer.jsp"></jsp:include>
<!-- Modal -->
<div class="modal fade" id="exampleModal1" tabindex="-1" aria-labelledby="exampleModalLabel1" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="?action=createEmployee" method="post" >
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel1">Create Employee</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <table border="1" cellpadding="5">

                        <tr>
                            <th>Employee Name:</th>
                            <td>
                                <input type="text" name="name" id="name" size="45" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee BirthDay:</th>
                            <td>
                                <input type="date" name="birthday" id="birthday" size="45" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee CMND:</th>
                            <td>
                                <input type="text" name="cmnd" id="cmnd" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee Salary:</th>
                            <td>
                                <input type="text" name="salary" id="salary" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee Phone:</th>
                            <td>
                                <input type="text" name="phone" id="phone" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee Email:</th>
                            <td>
                                <input type="text" name="email" id="email" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th>Employee Address:</th>
                            <td>
                                <input type="text" name="address" id="address" size="15" required/>
                            </td>
                        </tr>
                        <tr>
                            <th><label>Position Employee</label>
                            </th>
                            <td>
                                <select name="position" required>
                                    <option value="">--Please choose an option--</option>
                                    <option value="1">Lễ Tân</option>
                                    <option value="2">Phục Vụ</option>
                                    <option value="3">Chuyên Viên</option>
                                    <option value="4">Giám Sát</option>
                                    <option value="5">Quản Lý</option>
                                    <option value="6">Giám Đốc</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th><label>Education Employee</label>
                            </th>
                            <td>
                                <select name="education" required>
                                    <option value="">--Please choose an option--</option>
                                    <option value="1">Trung cấp</option>
                                    <option value="2">Cao đẳng</option>
                                    <option value="3">Đại học</option>
                                    <option value="4">Sau đại học</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th><label>Division Employee</label>
                            </th>
                            <td>
                                <select name="division" required>
                                    <option value="">--Please choose an option--</option>
                                    <option value="1">Sale – Marketing</option>
                                    <option value="2">Hành Chính</option>
                                    <option value="3">Phục vụ</option>
                                    <option value="4">Quản lý</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" align="center">
                                <input type="submit" value="Save"/>
                            </td>
                        </tr>
                    </table>
<%--                    <p><c:if test='${requestScope["msg"] != null}'>--%>
<%--                        <span class="message">${requestScope["msg"]}</span>--%>
<%--                    </c:if>--%>
<%--                    </p>--%>

                </div>
            </form>
        </div>
    </div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="?action=searchEmployee" method="post">
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
    function customerSetId(id, name) {
        document.getElementById("idEmployee").value = id;
        document.getElementById("modelId").value = "Do you want delete customer name: " + name;
    }

    function submitDelete() {
        <!-- để submit form delete  -->
        document.getElementById("deleteCustomer").submit();
    }

</script>
</body>
</html>
