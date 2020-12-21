<%-- 
    Document   : output
    Created on : 18 Nov, 2019, 3:37:38 PM
    Author     : ARK PATEL
--%>

<%@page import="model.CalcBMI"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% CalcBMI cal = (CalcBMI) request.getAttribute("cal"); %>
        Hello:<%out.print(cal.getFirstName());%><nbsp>
        <%out.print(cal.getLastName());%><br>
        BMI:<%out.print(cal.getBMI());%><br>
        Status:<%out.print(cal.getStatus());%>
    </body>
</html>
