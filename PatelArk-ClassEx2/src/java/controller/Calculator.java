/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BMICalculate;

/**
 *
 * @author ARK PATEL
 */
public class Calculator extends HttpServlet {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String weight = request.getParameter("weight");
        String height = request.getParameter("height");
        
        int age1=Integer.parseInt(age);
        double wei=Double.parseDouble(weight);
        double hei=Double.parseDouble(height);
        
        
        BMICalculate cal = new BMICalculate(name,age1,wei,hei);
        
        double bmi=cal.getBMI();
        String status=cal.getStatus();
        
        request.setAttribute("name", name);
        request.setAttribute("bmi", bmi);
        request.setAttribute("status",status);
        
        
        
        //forward request and response to output.jsp
        RequestDispatcher view = request.getRequestDispatcher("EstimatedBMI.jsp");
        view.forward(request,response);
        
    }
}
