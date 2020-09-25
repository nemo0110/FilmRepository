<%-- 
    Document   : index
    Created on : 13 lug 2020, 09:39:30
    Author     : luigi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prova</title>
    </head>
    <body>
        <h1>Ciao! Accedi o registrati</h1>
        <form action="login.do" method="post">
            <input type="text" name="user" required>
            <input type="password" name="password" required>
            <input type='submit' value='mostra la select'>

            <tr><br>
                <td colspan ='2' > <%=request.getAttribute("messaggio") == null ? "" : request.getAttribute("messaggio")%></td>
            </tr>
        </form>
            
             <br/>
        <a href="registrazione.jsp">Registrazione</a>
    </body>
</html>
