<%-- 
    Document   : page2
    Created on : 20 Nov, 2019, 4:20:28 PM
    Author     : ARK PATEL
--%>

<%@page import="model.Survey"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h3> Hello ${sur1.name}</h3>
            <form action="Ques1" method="post">   
            
        <h3>Feedback Question 1</h3>
        What is one thing about the application that you like?
        <input type="text" name="q1"><br>
        <input type="submit" value="Next Question"><br>
        <a href="page1.jsp">Previous Question</a>
        </form>
            
        </center>
    
    </body>
</html>
