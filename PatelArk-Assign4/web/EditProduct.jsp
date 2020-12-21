<%-- 
    Document   : EditProduct
    Created on : 6 Dec, 2019, 7:38:01 PM
    Author     : ARK PATEL
--%>

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
    
    <form action="Option2=<%out.print(code); %>">
    <input type="submit" value="Edit" name="submit">
    </form>
    </body>
</html>
