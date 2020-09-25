<%-- 
    Document   : benvenuto
    Created on : 13 lug 2020, 10:11:19
    Author     : luigi
--%>

<%@page import="it.ld.prj13.model.Utente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Utente utente = ((Utente) request.getSession().getAttribute("utente"));%>
        <h1>BENVENUTO <%=utente.getUser()%></h1>
        <%
                out.println("<table border='1'>");

                out.println("<tr>");

                out.println("<form action='viaggioAcquistato.do' method='post' >");

                out.println("<td align='center' width=200>");
                out.println(utente.getNome());
                out.println("</td>");

                out.println("<td align='center' width=200>");
                out.println(utente.getCognome());
                out.println("</td>");
                
                out.println("<td align='center' width=200>");
                out.println(utente.getEmail());
                out.println("</td>");

               out.println("<td align='center' width=200>");
                out.println(utente.getMobile());
                out.println("</td>");
                
                out.println("</tr>");
                out.println("</form>");

                out.println("</table>");
            
        %>



    </body>
</html>