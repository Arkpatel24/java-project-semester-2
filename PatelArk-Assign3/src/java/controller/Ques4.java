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
public class Ques4 extends HttpServlet {

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
       String ques4= request.getParameter("q4");
        
        
        HttpSession session1=request.getSession();
        
        session1.setAttribute("ques4",ques4);
        
         String name=(String) session1.getAttribute("name");
          String ques1=(String) session1.getAttribute("ques1");
          String ques2=(String) session1.getAttribute("ques2");
          String ques3=(String) session1.getAttribute("ques3");
          
          Survey sur = new Survey(name,ques1,ques2,ques3,ques4);
          session1.setAttribute("sur", sur);
        getServletContext().getRequestDispatcher("/page6.jsp").forward(request, response); 
    }
}
