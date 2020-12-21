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

/**
 *
 * @author ARK PATEL
 */
public class Welcome extends HttpServlet {

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
        
        // Get input from the request
        String lastname=request.getParameter("ln");
        String firstname=request.getParameter("fn");
        
        //process input
        String name = lastname +"  "+firstname;
        
        //add response to the request
        request.setAttribute("name",name);
        
        //forward request and response to Welcome.jsp
        RequestDispatcher view = request.getRequestDispatcher("welcome.jsp");
        view.forward(request,response);
             
        }
}
