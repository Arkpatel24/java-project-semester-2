/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Loan;

/**
 *
 * @author ARK PATEL
 */
public class LoanPaymentCalculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get input from user
        String loanAmount = request.getParameter("amount");
        String interestRate = request.getParameter("rate");
        String numYear = request.getParameter("year");
        
        double amt = Double.parseDouble(loanAmount);
        double air = Double.parseDouble(interestRate);
        int noy = Integer.parseInt(numYear);
        
        //create object threw default constructor
        Loan loan = new Loan();
        loan.setAnnualInterestRate(air);
        loan.setNumberOfYears(noy);
        loan.setLoanAmount(amt);
        
        //create object threw parameterized constructor
        //Loan loan = new Loan(air,noy,amt);
        
        double payment=loan.getTotalPayment();
        String pay =loan.currencyFormat(payment);
        double paymentMonthly=loan.getMonthlyPayment();
        String payMonthly =loan.currencyFormat(paymentMonthly);
        
         request.setAttribute("loan",loan);
        request.setAttribute("pay",pay);
         request.setAttribute("payMonthly",payMonthly);
        
        RequestDispatcher view = request.getRequestDispatcher("LoanPayment.jsp");
        view.forward(request,response);
        }
    }


