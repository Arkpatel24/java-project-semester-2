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

/**
 *
 * @author ARK PATEL
 */
public class deleteProduct extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String code=request.getParameter("code");        
        String desc=request.getParameter("desc");
        String price =request.getParameter("price");
        
        Double price1=Double.parseDouble(price);
        
        request.setAttribute("code", code);
        request.setAttribute("desc", desc);
        request.setAttribute("price", price1);
        
        getServletContext().getRequestDispatcher("/DeleteProduct.jsp").forward(request, response);   
    }
}