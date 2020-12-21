<%-- 
    Document   : InputUserName
    Created on : 6-Nov-2019, 12:04:15 PM
    Author     : MuhammadShafique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>User List Processor</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body> <center>
    <h1>User Information</h1>
    <p>Please type the User first name and last name</p>
    <form action="userName" method="post">             
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" required><br><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" required><br><br>       
        <label>&nbsp;</label>
        <input type="submit" value="Input Email" class="margin_left">
    </form>
    </center>
</body>
</html>