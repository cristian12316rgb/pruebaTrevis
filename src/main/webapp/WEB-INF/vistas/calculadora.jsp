<%--
  Created by IntelliJ IDEA.
  User: cquip
  Date: 1/5/2021
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
</head>
<body>
<h1>Calculadora</h1>
<form action="operacionCalculadora">

    <input type="radio" name="operacion"  value="1">
    <input type="radio" name="operacion"  value="2">
    <input type="radio" name="operacion"  value="3">

    <label for="termino1"></label>
    <input type="number" name="termino1" id="termino1">
    <label for="termino2"></label>
    <input type="number" name="termino2" id="termino2">
    <input type="submit" value="realizar operacion">
</form>



<c:if test="${not empty resultado}">
    <h1> El resultado de ${operacion } ${termino1} y ${termino2} es ${resultado} </h1>
    <br>
</c:if>


</body>
</html>
