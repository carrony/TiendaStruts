<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="inicio.jsp">
	<s:param name="titulo"> <s:text name="nuevoProductoTitle"/></s:param>
</s:include>
	<h2><s:text name="nuevoProducto"/></h2>
	<s:form action="crear_producto">
		<s:textfield key="producto.nombre"/>
		<s:textfield key="producto.descripcion"/>
		<s:textfield key="producto.precio"/>
		<s:submit key="anadir"/>
	</s:form>
	
	
	<h2><s:text name="listadoProductos"/></h2>
<ul class="articulo">
<s:iterator value="listaProductos" var="p">
	<li><div>
		<h3><s:property value="[0].nombre"/></h3>
		<p><s:property value="descripcion"/></p></div>
		<p><s:property value="#p.precio"/></p>
		<s:url action="ver_carrito" var="carritolink">
			<s:param name="nombre">#p.nombre"</s:param>
		</s:url>  
		<a href="<s:property value='#'/>">
		     <img src="<s:url value='/images/carrito.png'/>" alt="Añadir al carrito">
		</a>
		<s:url action="editar_producto" var="linkEditar">
			<s:param name="idProducto" value="#p.id"/>
		</s:url>
		<s:url action="eliminar_producto" var="linkEliminar">
			<s:param name="idProducto" value="#p.id"/>
		</s:url>
				
		<a href="${linkEditar}"><i class="fas fa-edit"></i></a> 
		<a href="${linkEliminar}"><i class="fas fa-times"></i></a>
		</li>
</s:iterator>
</ul>
<s:include value="fin.jsp"/>