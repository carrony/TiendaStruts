<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> ${param.titulo} </title>
	<link type="text/css" rel="stylesheet" href="<s:url value='/css/estilo.css' />">
	
	<script src="https://kit.fontawesome.com/780b91c08b.js" crossorigin="anonymous"></script>
</head>
<body>
<header>
        <h1><s:text name="tituloCurso"/> </h1>
    </header>
    <main>