/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Survey;

/**
 *
 * @author ARK PATEL
 */
public class name extends HttpServlet {

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
        String name= request.getParameter("name");
        
        
        HttpSession session1=request.getSession();
        
        session1.setAttribute("name",name);
        
        Survey sur1=new Survey(name);
        session1.setAttribute("sur1", sur1);
        
        
        getServletContext().getRequestDispatcher("/page2.jsp").forward(request, response);
        
    }
}
