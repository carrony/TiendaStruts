<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>Bienvenido a la tienda!</h1>
	<h2>Hola Administrador. </h2>
	<a href="<s:url action="crear_producto"/>">Insertar Productos Nuevos</a>
</body>
</html>
