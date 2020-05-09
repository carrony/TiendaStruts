<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="/WEB-INF/jsp/inicio.jsp">
	<s:param name="titulo"> Bienvenid@ a la tenda</s:param>
</s:include>
	<h2>Hola Administrador. </h2>
	<a href="<s:url action="crear_producto"/>">Insertar Productos Nuevos</a>
	
	<h2>Listado de Productos</h2>
	<a href="<s:url action="listar_productos"/>">Listar Productos</a>
<s:include value="/WEB-INF/jsp/fin.jsp"/>