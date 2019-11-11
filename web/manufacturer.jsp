<%-- 
    Document   : manufacturer
    Created on : 08/11/2019, 17:18:18
    Author     : Jefferson
--%>

<%@page import="br.com.projeto05.db.Manufacturer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fabricante</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf"%>
        <%try{%>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>E-mail</th>
                <th>Cidade</th>
                <th>Estado</th>
            </tr>
            <%for(Manufacturer m: Manufacturer.getList()){%>
            <tr >
                <td><%= m.getId()%></td>
                <td>
                    <a href="products.jsp?id=<%= m.getId()%>">
                        <%=m.getName()%>
                    </a>
                </td>
                <td><%= m.getEmail()%></td>
                <td><%= m.getCity()%></td>
                <td><%= m.getState()%></td>
                
            </tr>
            <%}%>
        </table> 
        <%}catch (Exception ex){%>
            <tr><td colspan="5"><%= ex.getMessage()%></td></tr>
        <%}%>
    </body>
</html>
