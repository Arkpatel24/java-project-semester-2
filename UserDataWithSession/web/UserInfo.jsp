<%-- 
    Document   : UserInfo
    Created on : 4-Nov-2019, 12:05:43 PM
    Author     : MuhammadShafique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.User"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>User Data Without Session App</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body> <center>
    <h1>Thank you for joining the user list</h1>
    <p> Here is the information as added to the list: </p>
        <% User user1 = (User) request.getAttribute("user"); %>
    <label>Email:</label>
    <span> <% out.print(user1.getEmail()); %></span><br>
    <label>First Name:</label>
    <span><% out.print(user1.getFirstName()); %></span><br>
    <label>Last Name:</label>
    <span><% out.print(user1.getLastName()); %></span><br>

    <p>To enter another user information, <br>
        Please click on the link below:
    </p>
        <a href="UserDataWithSessionApp.jsp">  Enter another user information </a> <br>
</center>
</body>
</html>
