<%-- 
    Document   : registrazione
    Created on : Jul 13, 2020, 5:05:20 PM
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
        <h1>Registrati qui</h1>
        <form action="registrati.do" method="post">
            <table id="rcorners1" allign="center">
                <tr>
                    <td> User</td><br>
                <td><input type="text" name="user"></td>
                </tr>
                
                <tr>
                    <td> Password</td><br>
                <td><input type="password" name="password"></td>
                </tr>
                
                <tr>
                    <td> Nome</td><br>
                <td><input type="text" name="nome"></td>
                </tr>
                
                <tr>
                    <td> Cognome</td><br>
                <td><input type="text" name="cognome"></td>
                </tr>
                
                <tr>
                    <td> Email</td><br>
                <td><input type="text" name="email"></td>
                </tr>
                
                <tr>
                    <td> Mobile</td><br>
                <td><input type="text" name="mobile"></td>
                </tr>
                
                <tr>
                    <td colspan ='2' ><input type="submit" value="OK"></td>
                </tr>
                <tr>
                    <td colspan ='2' > <%=request.getAttribute("messaggio") == null ? "" : request.getAttribute("messaggio")%></td>
                </tr>
            </table>
        </form>

    </body>
</html>
