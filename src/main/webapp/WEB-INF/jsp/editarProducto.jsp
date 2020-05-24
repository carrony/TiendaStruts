<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
	<s:param name="titulo"> <s:text name="editarProductoTitle"/></s:param>
</s:include>
	<h2><s:text name="editarProducto"/></h2>
	<s:form action="modificar_producto" >
		<s:textfield key="producto.nombre"/>
		<s:textfield key="producto.descripcion"/>
		<s:textfield key="producto.precio"/>
		<s:hidden key="producto.id" />
		<s:submit key="anadir"/>
	</s:form>
<s:include value="fin.jsp"/>