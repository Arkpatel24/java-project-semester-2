<%-- 
    Document   : welcome
    Created on : 13 Sep, 2019, 9:48:43 AM
    Author     : ARK PATEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Class2Example</title>
    </head>
    <body>
        <p>
        <% String name = (String)request.getAttribute("name");
            out.println(name);    
        %><br>
        Welcome to JSP world</p>
    </body>
</html>
