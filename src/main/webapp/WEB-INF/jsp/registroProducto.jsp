<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registro de usuario sencillo</title>
	<style>
		form { width: 55%; border: 2px solid black; background: aliceblue;}
		label {width:30%; display:inline-block;}
		input {display:inline-block;}
		form>div { margin: 10px;}
		.error { color:red;}
	</style>
</head>
<body>
	<h1>Añadir un nuevo artículo</h1>
	<s:form action="registrar_producto">
		<s:textfield name="producto.nombre" label="Nombre"/>
		<s:textfield name="producto.descripcion" label="Descripción"/>
		<s:textfield name="producto.precio" label="Precio"/>
		<s:submit value="Añadir"></s:submit>
	</s:form>
</body>
</html>
