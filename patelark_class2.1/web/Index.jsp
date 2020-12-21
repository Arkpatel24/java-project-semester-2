<%-- 
    Document   : Index
    Created on : 9 Sep, 2019, 3:27:26 PM
    Author     : ARK PATEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <center>
        <h1>Welcome User</h1>
        <form action="WelcomeUser" method="get">
            First Name:<input type="text" name="firstname"><br>
            Last Name:<input type="text" name="lastname"><br>
            <input type="submit" value="submit">
        </form>
        </center>  
    </body>
</html>
