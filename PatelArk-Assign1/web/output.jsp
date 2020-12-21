<%-- 
    Document   : output
    Created on : 1 Oct, 2019, 6:14:56 PM
    Author     : ARK PATEL
--%>

<%@page import="model.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booked Appointment</title>
        <style>
            body{
                background-color: #a7b8fa;
            }
            h4
            {
                background-color:#cad0e8;
                border:2px solid red;
                padding:2px;
                margin:3%;
            }
        </style>
    </head>
    <body>
        <center>
        <h1>Your Appointment has been booked successfully </h1>
        <h2>Your Appointment Detail</h2>
        <h4>
        <%
            String result = (String) request.getAttribute("result");
            out.println(result);
        %><br>
        </h4>
       <br>
        <a href="input.jsp">Appointment Form Page</a>&nbsp;&nbsp;&nbsp;
        <a href="index.jsp">Home Page</a>
        <center>
    </body>
</html>
