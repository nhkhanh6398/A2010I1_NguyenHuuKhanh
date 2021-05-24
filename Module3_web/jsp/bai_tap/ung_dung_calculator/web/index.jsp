<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Simple Caculator</h2>
<form method="post" action="/caculator">
    <fieldset>
        <legend>Caculator</legend>
        <table>
            <tr>
                <td>Number one :</td>
                <td><input type="text" name="numberone"/></td>
            </tr>
            <tr>
                <td>Operator</td>
                <td>
                    <select name="select">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Multiplication</option>
                        <option value="/">Division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Number two</td>
                <td><input name="numbertwo" type="text"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="caculate"/></td>
            </tr>
        </table>
    </fieldset>
    <h2>Result : </h2>
    <p><c:out value="${resultnumber}"/></p>
</form>
</body>
</html>