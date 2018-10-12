<%-- 
    Document   : resultado
    Created on : 11-oct-2018, 10:53:20
    Author     : fjvaz
--%>
<%@page import="es.albarregas.beans.Atributos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link rel="stylesheet" type="text/css" media="screen" href="CSS/estilos.css" />
        <title>Resultado</title>
    </head>
    <body>
        <%@include file="../INC/cabecera.inc"%>
        <%Atributos misAtributos=(Atributos)request.getAttribute("resultado");%>
        <h1><%=misAtributos.getOperando1()%> <%=misAtributos.getOperacion()%> <%=misAtributos.getOperando2()%> = <%=misAtributos.getResultado()%></h1>
        <div class="textoFecha"><%=request.getAttribute("fecha")%></div>
        <%@include file="../INC/pie.inc"%>
    </body>
</html>
