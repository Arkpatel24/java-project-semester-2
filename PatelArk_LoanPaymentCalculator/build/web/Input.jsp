<%-- 
    Document   : Input
    Created on : 16 Sep, 2019, 3:52:07 PM
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
        <form action="LoanPayment" method="get">
            Loan Amount:<input type="text" name="amount"><br>
            Annual Interest Rate:<input type="text" name="rate"><br>
            Number of Years:<input type="text" name="year"><br>
            <input type="submit" value="Calculate">
        </form>
    </body>
</html>
