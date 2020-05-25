<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<s:include value="/WEB-INF/jsp/inicio.jsp">
	<s:param name="titulo"> <s:text name="tituloCurso"/></s:param>
</s:include>
	<h2><s:text name="saludoAdmin"/> </h2>

	
	<s:url action="listar_productos" var="linkEnglish">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:url action="listar_productos" var="linkEspanol">
		<s:param name="request_locale">es</s:param>
	</s:url>
	<p><a href="${linkEnglish}"><s:text name="listaProductosEn"/></a></p>
	
	
	<p><a href="${linkEspanol}"><s:text name="listaProductosEs"/></a></p>

	<s:url action="esperar_tarea" var="linkEspera"/>
	<p><a href="${linkEspera}"><s:text name="linkEspera"/></a></p>
	
	<s:url action="esperar_tareaProgreso" var="linkEspera2"/>
	<p><a href="${linkEspera2}"><s:text name="linkEsperaPersonalizado"/></a></p>
	
	<s:url action="action1" var="linkAjax"/>
	<p><a href="${linkAjax}"><s:text name="pruebaAJAX"/></a></p>
		
<s:include value="/WEB-INF/jsp/fin.jsp"/>