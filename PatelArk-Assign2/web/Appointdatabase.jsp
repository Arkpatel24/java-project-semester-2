<%-- 
    Document   : Appointdatabase
    Created on : 4 Nov, 2019, 4:03:32 PM
    Author     : ARK PATEL
--%>

<%@page import="model.Appointment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <h1>Appointment Table</h1>
        <p> <i> <% String msg = (String) request.getAttribute("message");
        out.print(msg); %> </i> </p>
        <p> Here is the information as added to the database: </p>
        <% Appointment app = (Appointment) request.getAttribute("application"); %>
        <table border="2">
            <tr>
                <th>First Name</th>
                <td><% out.print(app.getFirstName()); %></td>
            </tr>  
            <tr>
                <th>Last Name</th>
                <td><% out.print(app.getLastName()); %></td>
            </tr>  
            <tr>
                <th>Age</th>
                <td><% out.print(app.getAge()); %></td>
            </tr>  
            <tr>
                <th>Address</th>
                <td><% out.print(app.getAddress()); %></td>
            </tr>  
            <tr>
                <th>Mobile</th>
                <td><% out.print(app.getMobile()); %></td>
            </tr>  
            <tr>
                <th>Gender</th>
                <td><% out.print(app.getGender()); %></td>
            </tr>  
            <tr>
                <th>Issue</th>
                <td><% out.print(app.getIssue()); %></td>
            </tr>  
            <tr>
                <th>Time</th>
                <td><% out.print(app.getTiming()); %></td>
            </tr>  
        </table>
            <br>
        <a href="Appointinput.jsp">Appointment Form Page</a>&nbsp;&nbsp;&nbsp;
        <a href="Appointentry.jsp">Home Page</a>
    </center>
    </body>
</html>
