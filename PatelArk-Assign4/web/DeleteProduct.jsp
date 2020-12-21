<%-- 
    Document   : DeleteProduct
    Created on : 6 Dec, 2019, 6:21:26 PM
    Author     : ARK PATEL
--%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <% String code = (String) request.getAttribute("code"); %>
    <% String desc = (String) request.getAttribute("desc"); %>
    <% Double price = (Double) request.getAttribute("price"); %>
    <h1>Do you want to delete?</h1>
    <form action="Option=<%out.print(code); %>">
        <input type="submit" value="Yes" name="submit"/>
        <input type="submit" value="No" name="submit"/>
    </form>
    </body>
</html>
