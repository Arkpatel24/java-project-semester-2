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
import model.userhobby;

/**
 *
 * @author ARK PATEL
 */
public class gethobby extends HttpServlet {

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
         
        String hobby= request.getParameter("hb");
     
        HttpSession session1=request.getSession();
        
        session1.setAttribute("hb",hobby);
        String firstName=(String) session1.getAttribute("fn");
          String lastName=(String) session1.getAttribute("ln");
            String country=(String) session1.getAttribute("cn");
            
        userhobby hob = new userhobby (firstName,lastName,country,hobby);
        
        request.setAttribute("hob",hob);
        
        
        
        getServletContext().getRequestDispatcher("/page5.jsp").forward(request, response);
    }
    }
