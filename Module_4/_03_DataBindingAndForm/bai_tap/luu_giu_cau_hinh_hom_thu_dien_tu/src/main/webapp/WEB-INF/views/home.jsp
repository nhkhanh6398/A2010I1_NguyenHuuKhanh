<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--@elvariable id="mail" type=""--%>
<form:form method="post" modelAttribute="mail">
    <fieldset>
        <legend><h1>Settings</h1></legend>
        <table>
            <tr>
                <td><form:label path="language">Languages :</form:label></td>
                <td><form:select path="language">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
                </td>
            </tr>
            <tr>
                <td>Page Size :</td>
                <td><span>Show</span>
                    <form:select path="size">
                        <form:option value="5">5</form:option>
                        <form:option value="10">10</form:option>
                        <form:option value="15">15</form:option>
                        <form:option value="25">25</form:option>
                        <form:option value="50">50</form:option>
                        <form:option value="100">100</form:option>
                    </form:select>
                    <span>emails per page</span></td>
            </tr>
            <tr>
                <td>Spam Filter :</td>
                <td><form:checkbox path="check" value="1"></form:checkbox><span>Enable spams filter</span></td>
            </tr>
            <tr>
                <td>Signature</td>
                <td><form:textarea path="textAra" cols="50" rows="4"></form:textarea>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update"> <input type="button" value="Cancel"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>