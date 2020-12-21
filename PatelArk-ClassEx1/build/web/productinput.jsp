<%-- 
    Document   : productinput
    Created on : 23 Sep, 2019, 3:47:58 PM
    Author     : ARK PATEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping store input</title>
    </head>
    <body>
        <center>
        <h1>Shopping Store</h1>
        
        <form action="inputdata" method="get">
            
            Product Code : <input type="text" name="productcode"><br><br>
            Product Quality : <input type="text" name="productqlt"><br><br>
            Product Price : <input type="text" name="productprice"><br><br>
            <input type="submit" value="submit">
            <input type="reset" value="reset">
        </form>
        </center>
    </body>
</html>
