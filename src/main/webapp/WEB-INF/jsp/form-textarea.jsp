<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba de AJAX con textfield</title>

<!-- begin jquery -->



</head>
<body>

<sj:head jqueryui="true" />
<h2>Textarea con contenido AJAX</h2>

<p class="text">
	Un textarea que toma el contenido de un fichero externo.
</p>
<s:form id="formTextarea" action="echo" theme="simple" cssClass="yform">
	<fieldset>
		<legend>Formulario AJAX</legend>
		<div class="type-text"> <label for="echo">Escribir: </label>
			<s:url var="remoteurl" action="ajax1"/>
			<sj:textarea
				href="%{remoteurl}" id="echo" name="echo" rows="10"
				cols="80" effect="highlight" effectDuration="1500"
				loadingText="Cargando el contenido del textarea ..." />
		</div>
		<div class="type-button">
			<sj:submit targets="result" effect="slide" value="AJAX Submit"
					indicator="indicator" button="true" />
			<img id="indicator" src="images/indicator.gif" 
			     alt="Cargando..." style="display:none"/>
		</div>
	</fieldset>
</s:form>

<strong>Div con el resultado :</strong>

<div id="result" class="result ui-widget-content ui-corner-all">Enviar el texto.</div>

</body>
</html>