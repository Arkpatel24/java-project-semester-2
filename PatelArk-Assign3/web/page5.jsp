<%-- 
    Document   : page5
    Created on : 20 Nov, 2019, 4:21:47 PM
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
             <h3>Hello ${sur1.name}</h3>
        <form action="Ques4" method="post"> 
            
        <h3>Feedback Question 4</h3>
        Will you recommend the application to someone else?
        <input type="text" name="q4"><br>
        <input type="submit" value="Next Question"><br>
        <a href="page4.jsp">Previous Question</a>
        </form>
        </center>
    </body>
</html>
