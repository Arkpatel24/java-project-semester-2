<%-- 
    Document   : UserDataInput
    Created on : 6-Nov-2019, 11:15:50 AM
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
    <p>Please type the user last name, first name and email:</p>
    <form action="userData" method="post">             
        <label class="pad_top">Email:</label>
        <input type="email" name="email"  required><br> <br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" required><br> <br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" required><br> <br>        
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </center>
</body>
</html>