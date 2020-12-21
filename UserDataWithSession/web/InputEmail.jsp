<%-- 
    Document   : InputEmail
    Created on : 4-Nov-2019, 12:04:59 PM
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
    <p>Please type the email:</p>
    <form action="userEmail" method="post">             
        <label class="pad_top">Email:</label>
        <input type="email" name="email"  required><br> <br>    
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </center>
</body>
</html>