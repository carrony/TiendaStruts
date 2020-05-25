<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta http-equiv="refresh" content="1;"/>
<s:include value="inicio.jsp">
	<s:param name="titulo"> <s:text name="espera"/></s:param>
</s:include>
	<h2><s:text name="esperaMensaje"/>
		<s:property value="progreso"/>%
	</h2>
	<p><s:text name="esperaMensaje2"/></p>

	<a href="<s:url action='index'/>"> <s:text name="volver"/></a>
<s:include value="fin.jsp"/>