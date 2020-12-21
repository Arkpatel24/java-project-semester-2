<%-- 
    Document   : EstimatedBMI
    Created on : 11 Oct, 2019, 9:51:04 AM
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
        <h1>Your Calculated BMI</h1>
        <%
              String name = (String) request.getAttribute("name");
              out.println("Your name:"+name);
        %><br>
        <%
               double bmi = (double) request.getAttribute("bmi");
            out.println("Your BMI:"+bmi);
        %><br>
        <%
              String status = (String) request.getAttribute("status");
            out.println("Your Status:"+status);
        %><br>
        <a href="BMIInput.jsp">CalculationPage</a>
        <a href="BMIApp.jsp">HomePage</a>
        </center>
    </body>
</html>
