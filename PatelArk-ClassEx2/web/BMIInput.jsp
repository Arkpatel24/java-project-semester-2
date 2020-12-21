<%-- 
    Document   : BMIInput
    Created on : 11 Oct, 2019, 9:59:33 AM
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
        <center>
        <h1>Calculate Body Mass Index</h1>
        <form action="Calculator" method="post">
        Name:<input type="text" name="name"><br>
        Age:<input type="text" name="age"><br>
        Weight:<input type="text" name="weight"><br>
        height:<input type="text" name="height"><br>
        <input type="submit" value="submit">
        <input type="reset" value="reset">
        <a href="BMIApp.jsp">HomePage</a>
        </form>
        <center>
    </body>
</html>
