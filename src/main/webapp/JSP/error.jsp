<%-- 
    Document   : error
    Created on : 11-oct-2018, 10:53:07
    Author     : fjvaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" media="screen" href="CSS/estilos.css" />
        <title>Error</title>
    </head>
    <body>
        <%@include file="../INC/cabecera.inc"%>
        <h1 class="error"><%=request.getAttribute("error")%></h1>
        
        <%@include file="../INC/pie.inc"%>
    </body>
</html>
