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
import model.Appointment;

/**
 *
 * @author ARK PATEL
 */
public class BookAppointment extends HttpServlet {

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
            throws ServletException, IOException 
    {
        //taking input from the form
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String issue = request.getParameter("issue");
        String time = request.getParameter("time");
  
        //passing value to constructor
        Appointment app = new Appointment(firstName,lastName,age,address,mobile,gender,issue,time);
        
        //invoking method from Appointment.java
        String result=app.getAppointment();
       
        //add response to the request
        request.setAttribute("result",result);
  
        //forward request and response to output.jsp
        RequestDispatcher view = request.getRequestDispatcher("output.jsp");
        view.forward(request,response);
        
    }

}
