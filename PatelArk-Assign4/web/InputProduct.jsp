
<%-- 
    Document   : InputProduct
    Created on : 6 Dec, 2019, 6:14:22 PM
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
        <center>
        <h1>Product List</h1>
        <form action="addProduct" method="get" >
            CODE:  <input type="text" name="code" ><br>
            Description: <input type="text" name="desc" ><br>
            Price: <input type="text" name="price" ><br>
            <input type="submit" value="Add Product" >
        </form>
        </center>
    </body>
</html>
