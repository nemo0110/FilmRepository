<%-- 
    Document   : errore
    Created on : Jul 13, 2020, 5:06:52 PM
    Author     : catianiccolai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Errore!!!</h1>
        <h2><%out.print(request.getAttribute("messaggio"));%></h2>
    </body>
</html>
