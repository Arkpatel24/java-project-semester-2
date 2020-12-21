<%-- 
    Document   : LoanPayment
    Created on : 16 Sep, 2019, 3:52:49 PM
    Author     : ARK PATEL
--%>

<%@page import="model.Loan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Loan Payment Estimate</h1>
        <%
            Loan loan=(Loan) request.getAttribute("loan");
            double amt=loan.getLoanAmount();
            out.println("Amount of loan:" +amt);
            double rate=loan.getAnnualInterestRate();
            out.println(" Amount of interest:" +rate);
            int years=loan.getNumberOfYears();
            out.println(" Amount of duration:" +years);
        %><br>
        <%
            String pay =(String) request.getAttribute("pay");
            out.println("Amount to pay:" +pay);
        %><br>
        <%
            String payMonthly =(String) request.getAttribute("payMonthly");
            out.println("Amount to pay monthly:" +payMonthly);
        %>
    </body>
</html>
