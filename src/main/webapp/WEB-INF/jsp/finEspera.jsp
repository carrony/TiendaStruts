<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
	<s:param name="titulo"> Producto Procesado</s:param>
</s:include>
	<h2><s:text name="tareaCompleta"/></h2>
	<p><s:text name="datosProcesador"/></p>

	<a href="<s:url action='index'/>"> <s:text name="volver"/></a>
<s:include value="fin.jsp"/>