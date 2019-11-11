 <%-- 
    Document   : customer
    Created on : 10/11/2019, 15:32:54
    Author     : Jefferson
--%>
<%@page import="br.com.projeto05.db.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf"%>
            <h1>Clientes</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nome</th>
                
            </tr>
            <%try{%>
            <% for (Customer c : Customer.getClientes()) {%>
            <tr>
                <th><%=c.getId()%></th>
                
                <th> 
                    <a href="Compras.jsp?id=<%= c.getId()%>">
                    <%=c.getNome()%></th>
                
                
            </tr>
            <%}%>
            <%}catch(Exception ex){%>
            <%=ex.getMessage()%>
            <%}%>
        </table>
    </body>
</html>
