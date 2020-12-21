<%-- 
    Document   : input
    Created on : 1 Oct, 2019, 6:14:41 PM
    Author     : ARK PATEL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Appointment</title>
        <style>
            body{
                background-color: #a7b8fa;
            }
            .form{
                background-color:#cad0e8;
                border:2px solid red;
                padding:2px;
                margin:3%;
            }
        </style>
    </head>
    <body>
        <center>
            <h1>Book Appointment Form </h1>
            <form class="form" action="BookAppointment" method="post">    
            <br>
            First Name :<input type="text" name="firstname"><br><br>
            Last Name :<input type="text" name="lastname"><br><br>
            Age:<input type="text" name="age"><br><br>
            Gender: <input type="radio" name="gender" value="male" checked> Male<br>
                    <input type="radio" name="gender" value="female"> Female<br>
                    <input type="radio" name="gender" value="other"> Other<br><br>
            Address:<textarea name="address"></textarea><br><br>
            Mobile Number:<input type="text" name="mobile"><br> <br>  
            Issue :<select name="issue">
                        <option value="Eye Issue">Eye Issue</option>
                        <option value="Ear Issue">Ear Issue</option>
                        <option value="Hair Issue">Hair Issue</option>
                        <option value="Teeth Issue">Teeth Issue</option>
                        <option value="Common Cold">Common Cold</option>
                        <option value="Vomiting">Vomiting</option>
                    </select><br><br>
            Appointment Time:<select name="time">
                                <option value="10AM-11AM">10AM-11AM</option>
                                <option value="11AM-12PM">11AM-12PM</option>
                                <option value="12PM-1PM">12PM-1PM</option>
                                <option value="1PM-2PM">1PM-2PM</option>
                                <option value="2PM-3PM">2PM-3PM</option>
                                <option value="3PM-4PM">3PM-4PM</option>
                                <option value="4PM-5PM">4PM-5PM</option>
                                <option value="5PM-6PM">5PM-6PM</option>
                                <option value="6PM-7PM">6PM-7PM</option>
                            </select><br> <br>  
            
            <input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;
            <input type="reset" value="Reset">&nbsp;&nbsp;&nbsp;
            <a href="index.jsp">Back</a>
            <br>
            <br>
            </form>
        </center>
    </body>
</html>
