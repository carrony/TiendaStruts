<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
<s:param name="titulo"> Listado de Productos</s:param>
</s:include>
<h2>Lista de productos</h2>
<ul class="articulo">
<s:iterator value="listaProductos" var="p">
	<li><div>
		<h3><s:property value="[0].nombre"/></h3>
		<p><s:property value="descripcion"/></p></div>
		<p><s:property value="#p.precio"/></p></li>
</s:iterator>
</ul>
<s:include value="fin.jsp"/>