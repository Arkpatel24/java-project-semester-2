<%-- 
    Document   : entrypage
    Created on : 18 Nov, 2019, 3:36:26 PM
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
        <h1>Will You like to compute your BMI?</h1>
        <form action="checkBMI" method="post">
        Please check one:<input type="radio" name="ans" value="yes">yes
                         <input type="radio" name="ans" value="no">no<br>
                         <input type="submit" value="submit">
        </form>
    </body>
</html>
