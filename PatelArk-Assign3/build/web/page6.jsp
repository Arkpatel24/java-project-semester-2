<%-- 
    Document   : page6
    Created on : 20 Nov, 2019, 4:22:12 PM
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
            
        <h1>Thanks</h1><h1>${sur.name}</h1> <h1>For Your Feedback</h1><br>
         Question1:What is one thing about the application that you like?<br>
         Answer:${sur.ques1}<br>
          Question2:What is one thing about the application that you did not like?<br>
         Answer:${sur.ques2}<br>
          Question3:What is one feature that you will like to be added to the application?<br>
         Answer:${sur.ques3}<br>
          Question4:Will you recommend the application to someone else?<br>
         Answer:${sur.ques4}<br>
         <a href="page1.jsp">Take Survey Again</a>
        <center>
    </body>
</html>
