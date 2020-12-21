<%-- 
    Document   : welcome
    Created on : 20-Sep-2019, 6:13:28 AM
    Author     : Owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <p>
                <% String nam= (String)request.getAttribute("Nm");                 
                    out.print(nam);
                %>
                
                <% String em= (String)request.getAttribute("Em");                 
                    out.print(em);
                %>
                
                WElcome to your page.!!!
                </p>
            </h1>
    </body>
</html>
