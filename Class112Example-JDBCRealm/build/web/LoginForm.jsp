<%-- 
    Document   : LoginForm
    Created on : 27-Nov-2019, 4:02:06 PM
    Author     : MuhammadShafique
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>JDBCRealmExample</title>
        <link rel="stylesheet" href="../styles/main.css" type="text/css"/>
    </head>
    <body>
        <h1>My Login Form</h1>
        <p>Please enter your username and password to continue:</p>
        <form action="j_security_check" method="get">
            <label class="pad_top">Username</label>
            <input type="text" name="j_username"><br><br>
            <label class="pad_top">Password</label>
            <input type="password" name="j_password"><br>
            <label>&nbsp;</label> <br>
            <input type="submit" value="Login" class="margin_left">    
        </form>
    </body>
</html>

