<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
	<s:param name="titulo"> Crear un Producto nuevo</s:param>
</s:include>
	<h2>Añadir un nuevo artículo</h2>
	<s:form action="registrar_producto">
		<s:textfield name="producto.nombre" label="Nombre"/>
		<s:textfield name="producto.descripcion" label="Descripción"/>
		<s:textfield name="producto.precio" label="Precio"/>
		<s:submit value="Añadir"></s:submit>
	</s:form>
<s:include value="fin.jsp"/>