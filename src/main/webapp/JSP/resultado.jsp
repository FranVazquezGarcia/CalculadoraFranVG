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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=request.getAttribute("resultado")%></h1>
    </body>
</html>
