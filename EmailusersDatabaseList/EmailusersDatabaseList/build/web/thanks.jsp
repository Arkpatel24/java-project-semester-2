<%@page import="email.user.User"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Email List Processor</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>    
</head>

<body>
    <h1>Thank you for joining the Email list</h1>
    <p> <i> <% String msg = (String) request.getAttribute("message");
        out.print(msg); %> </i> </p>
    <p> Here is the information as added to the database: </p>
        <% User user1 = (User) request.getAttribute("user"); %>
    <label>Email:</label>
    <span> <% out.print(user1.getEmail()); %></span><br>
    <label>First Name:</label>
    <span><% out.print(user1.getFirstName()); %></span><br>
    <label>Last Name:</label>
    <span><% out.print(user1.getLastName()); %></span><br>

    <p>To enter another user email, <br>
        click on the link below 
    </p>
        <a href="index.jsp">  Enter user information </a> <br>
</body>
</html>