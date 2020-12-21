<%-- 
    Document   : productoutput
    Created on : 23 Sep, 2019, 3:48:20 PM
    Author     : ARK PATEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Bill</title>
    </head>
    <body>
        <h1>Shopping Store</h1>
        <%
            String productCode = (String) request.getAttribute("productCode");
            out.println("Product Code:"+productCode);
        %><br>
        <%
            String productQlt = (String) request.getAttribute("productQlt");
            out.println("Product Quantity:"+productQlt);
        %><br>
         <%
            String productPrice = (String) request.getAttribute("productPrice");
            out.println("Product Price:"+productPrice);
        %><br>
         <%
            Double total = (double) request.getAttribute("total");
            out.println("Total Price:"+total);
        %><br>
        <a href="productinput.jsp">back to first page</a>
        
    </body>
</html>
