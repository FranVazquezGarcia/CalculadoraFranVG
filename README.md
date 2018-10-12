# CalculadoraFranVG
Commit 12/10/2018
-Para esta aplicacion se va a crear primero el index.jsp, que muestra al usuario una pantalla con varios inputs, 2 de ellos le pide dos valores
numéricos al usuario y hay 4 inputs de tipo radio que segun el que se seleccione se sumara, restara, dividira o multiplicara.
Tambien hay 2 botones, limpiar, y enviar, este ultimo llamara al Servlet controlador.java, que esta en el paquete es.albarregas.beans.
Si se accede al controlador sin pasar por el index, se accedera a traves del metodo doGet, este establecera un atributo error, con el valor "Se esta
intentando acceder sin pasar por la calculadora", y mediante request.getRequestDispatcher se ridigira a la pagina de error.jsp, y este mostrara el mensaje de error.
Si en el index no se introducen valores, o se introducen valores no numericos el controlador llamara de nuevo al jsp error, y mostrara el mensaje.
En el caso de que se introduzcan valores correctos, se comprueba que operacion se va a realizar, y si se intenta dividir por 0 mostrara otro error de la  clase excepcion
DivisionPorCeroException.java. En cualquier otro caso, realizara la operacion correspondiente mediante las clases Sumador, restador, divisor y multiplicador, que tendran un metodo que devolveran
el valor de la operacion, y estos valores se le asignan a un objeto de tipo Atributos, que es el que se encarga de guardar los valores, y este objeto
se establecera en un atributo llamado resultado. 
Despues se comprobara en el controlador la fecha actual mediante LocalDate y se establecera un atributo String con la fecha escrita en español.
Finalmente el controlador redirigira al resultado.jsp, que sera el que muestre al usuario el resultado obteniedo el valor de los atributos del objeto que obtenemos a traves del mensaje,
y tambien mostrara la fecha.

Los jsp error.jsp y resultado.jsp utilizan 2 include cada uno, que da la forma al html, asi, parce que la pagina no cambia.
