<%-- 
    Document   : Compras
    Created on : 10/11/2019, 19:54:33
    Author     : Lucca
--%>
<%@page import="br.com.projeto05.db.Purchase"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf"%>
        <%try{%>
        <table border="1">
            <tr> 
               
                <th>Id</th>
                <th>Descrição</th>
                
            </tr>
           <%for(Purchase pc: Purchase.getList(Integer.parseInt(request.getParameter("id")))){%>
            <tr >
                <td><%= pc.getId()%></td>
                <td><%= pc.getDescription()%></td>
             
                
            </tr>
            <%}%>
        </table> 
        <%}catch (Exception ex){%>
            <tr><td colspan="5"><%= ex.getMessage()%></td></tr>
        <%}%>
    </body>
</html>