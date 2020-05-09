<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
	<s:param name="titulo"> Producto Procesado</s:param>
</s:include>
	<h2>Artículo Procesado</h2>
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
<s:include value="fin.jsp"/>