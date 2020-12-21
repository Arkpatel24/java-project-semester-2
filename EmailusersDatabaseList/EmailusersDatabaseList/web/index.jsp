<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Email List Processor</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Join email list</h1>
    <p>To join email list, enter your name and
       email address below.</p>
    <form action="emailList" method="post">             
        <label class="pad_top">Email:</label>
        <input type="email" name="email"  required><br>
        <label class="pad_top">First Name:</label>
        <input type="text" name="firstName" required><br>
        <label class="pad_top">Last Name:</label>
        <input type="text" name="lastName" required><br>        
        <label>&nbsp;</label>
        <input type="submit" value="Join" class="margin_left">
    </form>
</body>
</html>