<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label >Lettuce
        <input type="checkbox" name="c" value="Lettuce">
    </label>
    <label >Tomato
        <input type="checkbox" name="c" value="Tomato">
    </label>
    <label >Mustard
        <input type="checkbox" name="c" value="Mustard">
    </label>
    <label>Sprouts
        <input type="checkbox" name="c" value="Sprouts">
    </label><br>
    <input type="submit" value="Save">
</form>
<c:forEach items="${c}" var="eat">
    <h1>${eat}</h1>
</c:forEach>
</body>
</html>