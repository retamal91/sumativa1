<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio::</title>
</head>
<body>
	<h1>hola mundo desde inicio.jsp</h1>
	<br>
	<h2><c:out value="${nombre} ${pass}">
	</c:out></h2>
</body>
</html>