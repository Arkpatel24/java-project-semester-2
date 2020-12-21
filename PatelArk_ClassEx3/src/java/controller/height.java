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
import model.CalcBMI;

/**
 *
 * @author ARK PATEL
 */
public class height extends HttpServlet {

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
        
        String height= request.getParameter("hgt");
        double hgt=Double.parseDouble(height);
        
        HttpSession session1=request.getSession();
        
        session1.setAttribute("hgt",hgt);
        
         String firstName=(String) session1.getAttribute("fn");
          String lastName=(String) session1.getAttribute("ln");
           double weight=(double) session1.getAttribute("wgt");
           
           CalcBMI cal=new CalcBMI(firstName,lastName,weight,hgt);
           request.setAttribute("cal",cal);
       
                           RequestDispatcher view=
                request.getRequestDispatcher("output.jsp");
                           view.forward(request,response);

    }
}
