<%-- 
    Document   : page3
    Created on : 20 Nov, 2019, 4:21:15 PM
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
        <form action="Ques2" method="post"> 
             
        <h3>Feedback Question 2</h3>
        What is one thing about the application that you did not like?
        <input type="text" name="q2"><br>
        <input type="submit" value="Next Question"><br>
        <a href="page2.jsp">Previous Question</a>
        </form>
        </center>
    </body>
</html>
