<%-- 
    Document   : Login_Error
    Created on : 2 Dec, 2019, 4:51:18 PM
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
         <h1>My Login Form - Error</h1>
        <p>You did not log in successfully.</p>
        <p>Please check username and password 
            and try again.</p>
        <p>If that does not work, Please contact the administrator.</p>
        <form action="j_security_check" method="get">
            <label class="pad_top">Username</label>
            <input type="text" name="j_username"><br> <br>
            <label class="pad_top">Password</label>
            <input type="password" name="j_password"><br>
            <label>&nbsp;</label> <br>
            <input type="submit" value="Login" class="margin_left">    
        </form>
    </body>
</html>
