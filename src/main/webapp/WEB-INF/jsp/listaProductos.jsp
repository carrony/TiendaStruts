<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listado de productos</title>
	<style>
		.detalles { border:solid 2px black; 
				background: aliceblue; padding:10px;}
		.detalles li {display: flex; justify-content: space-between;}
		.detalles strong { color:navy; font-size:1.2em;}
	</style>
</head>
<body>
	<h1>Lista de productos</h1>
	<s:iterator value="listaProductos" var="p">
		<ul class="detalles">
			<li><p>Nombre:</p> 
				<p><strong><s:property value="[0].nombre"/></strong></p></li>
			<li><p>Descripción</p>
				<p><strong><s:property value="descripcion"/></strong></p></li>
			<li><p>Precio</p>
				<p><strong><s:property value="#p.precio"/></strong></p></li>
		</ul>
	</s:iterator>
</body>
</html>