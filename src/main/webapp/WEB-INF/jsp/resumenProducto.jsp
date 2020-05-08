<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style>
	.detalles { width: 280px; border:solid 2px black; 
				background: aliceblue; padding:10px;}
	.detalles li {display: flex; justify-content: space-between;}
	.detalles strong { color:navy; font-size:1.4em;}
</style>

<title>Producto Procesado</title>
</head>
<body>
	<h1>Artículo Procesado</h1>
	<p>Tu artículo ha sido procesado correctamente</p>
	<h2>Los detalles del artículo son:	</h2>
	<ul class="detalles">
		<li><p>Nombre:</p> 
			<p><strong><s:property value="producto.nombre"/></strong></p></li>
		<li><p>Descripción</p>
			<p><strong><s:property value="producto.descripcion"/></strong></p></li>
		<li><p>Precio</p>
			<p><strong><s:property value="producto.precio"/></strong></p></li>
	</ul>
</body>
</html>