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
import javax.servlet.http.HttpSession;

/**
 *
 * @author ARK PATEL
 */
public class checkBMI extends HttpServlet {

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
        
        String ans=request.getParameter("ans");
        
        if(ans.equals("yes"))
        {
          HttpSession session1=request.getSession();
                     
          RequestDispatcher view=
                request.getRequestDispatcher("name.jsp");
                 view.forward(request,response);    
        }
        else 
        {
          RequestDispatcher view=
                request.getRequestDispatcher("entrypage.jsp");
                 view.forward(request,response);    
        }            

    }
        
}

