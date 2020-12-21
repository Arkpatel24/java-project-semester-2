/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import appointmentdb.Appointdb;
import model.Appointment;

/**
 *
 * @author ARK PATEL
 */
public class AppointProcess extends HttpServlet {

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
        //retrieve context params (db credentials) from DD
        String connUrl = getServletContext().
                    getInitParameter("connUrl");
        String user = getServletContext().
                    getInitParameter("user");
        String pass = getServletContext().
                    getInitParameter("pass"); 
            
        String url = "";
        String message = "";
        
        //taking input from the form
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String mobile = request.getParameter("mobile");
        String issue = request.getParameter("issue");
        String timing = request.getParameter("timing");
  
        //passing value to constructor
        Appointment app = new Appointment(firstName,lastName,age,address,mobile,gender,issue,timing);
        
        // Create a data access object for database interactions
         Appointdb appdb = new Appointdb(connUrl, user, pass);
        
        // insert user data to the database
            int in = Appointdb.insert(app);
            if (in != 0) {
                Appointment app2 = appdb.selectAppoint(firstName);
               message = "User information as inserted to the database";
               request.setAttribute("application", app2);
               request.setAttribute("message", message);
                url = "/Appointdatabase.jsp";
                } 
            else {
                message = "Data not inserted into the database. Input data was:";
                request.setAttribute("app", app);
                request.setAttribute("message", message);
                url = "/Appointdatabase.jsp"; 
            } 
             getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response); 
    }
    
}

   