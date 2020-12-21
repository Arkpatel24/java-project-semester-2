<%-- 
    Document   : page5
    Created on : 11 Nov, 2019, 4:36:38 PM
    Author     : ARK PATEL
--%>

<%@page import="model.userhobby"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Result</h1>
        <% userhobby user = (userhobby) request.getAttribute("hob"); %>
        First Name:<%out.print(user.getFirstName());%><br>
        Last Name:<%out.print(user.getLastName());%><br>
        Country:<%out.print(user.getCountry());%><br>
        Hobby:<%out.print(user.getHobby());%>
    </body>
</html>
