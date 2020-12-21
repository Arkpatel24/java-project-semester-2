<%-- 
    Document   : ViewProduct
    Created on : 6 Dec, 2019, 6:18:54 PM
    Author     : ARK PATEL
--%>

<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
       <table border="1">  
            <tr>
                <th>#</th>
                <th>Code</th>
                <th>Description</th>
                <th>Price</th>
                <th>Delete Product</th>
                <th>Edit Product</th>
            </tr>
                  
            <%
                int i = 1;
                List<Product> list = (List) request.getAttribute("prod");
            %>

            <%
                for (Product pro : list) {
            %>
            
            <tr>
                <td><%=i++ %></td>
                <td><%=pro.getCode()%></td>
                <td><%=pro.getDescription()%></td>
                <td><%=pro.getPrice()%></td>
                <td><a href="DeleteProduct=<%=pro.getCode()%>&desc=<%=pro.getDescription()%>&price=<%=pro.getPrice()%>" >delete</a></td>
                <td><a href="EditProduct=<%=pro.getCode()%>&desc=<%=pro.getDescription()%>&price=<%=pro.getPrice()%>" >Edit</a></td>
            </tr>
            <%
                }
            %>

        </table>
        <form action="InputProduct.jsp">
            <input type="submit" value="Add Product" action="InputProduct.jsp" >
        </form>
            </center>
    </body>
</html>
