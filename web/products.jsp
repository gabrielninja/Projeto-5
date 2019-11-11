<%-- 
    Document   : products
    Created on : 10/11/2019, 15:49:01
    Author     : cassianolucasvieira
--%>
<%@page import="br.com.projeto05.db.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Description</th>
                
            </tr>
            
            <%for(Products m: Products.getList(Integer.parseInt(request.getParameter("id")))){%>
            <tr>
                <td><%= m.getId()%></td>
                <td>
                   <%=m.getDescription()%>
                </td>
                
            </tr>
            <%}%>
        </table> 
    </body>
</html>
