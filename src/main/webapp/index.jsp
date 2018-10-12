<%-- 
    Document   : index
    Created on : 10-oct-2018, 17:47:55
    Author     : fjvaz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" media="screen" href="CSS/estilos.css" />
        <title>Calculadora</title>
    </head>
    <body>
        <form action="controlador" method="post" name="form">
        <%@include file="INC/cabecera.inc"%>
	<label for='op1' >Introduce el primer operando: </label>
	<input type="text" id="op1" name="operando1">

        <label for='op2' >Introduce el segundo operando: </label>
	<input type="text" id="op2" name="operando2">
        <br><br><br>
        <span class="radi">
        <input type="radio"  name="calculo" value="suma" checked="">Suma
        <input type="radio"  name="calculo" value="resta">Resta
        <input type="radio"  name="calculo" value="multiplicacion">Multiplicación
        <input type="radio"  name="calculo" value="division">División
        </span>
        <hr>
        <br>
        <br>
        <div class="botones">
        <input type="submit" name="Submit" id="button" value="Enviar">
        <input type="reset" name="Submit" id="button" value="Limpiar">
        </div>
        
        </fieldset>
        </form>
    </body>
</html>
