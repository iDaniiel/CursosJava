<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un javabean</title>
    </head>
    <body>
        <h1>JSP que modifica a un javabean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session" />
        Modificamos los atributos:
        <br />
        <br />
        <% 
            int baseValor = 5;
            int altura = 10;
        %>
        <jsp:setProperty name="rectangulo" property="base" value="<%= baseValor  %>" />
        <jsp:setProperty name="rectangulo" property="altura" value="<%= altura %>" />
        
        <br />
        <br/>
        <a href="index.jsp">Regresar al inciio</a>
    </body>
</html>
