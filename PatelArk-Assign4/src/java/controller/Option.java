/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import model.ProductIO;

/**
 *
 * @author ARK PATEL
 */
public class Option extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String code = request.getParameter("code");
        String option = request.getParameter("submit");

        if (option.equals("Yes"))
        {
            ProductIO pro1 = new ProductIO();
            Product pro = pro1.selectProduct(code);
            pro1.deleteProduct(pro);
        }
        else
        {
             getServletContext().getRequestDispatcher("/DeleteProduct.jsp").forward(request, response);
        }
        
        getServletContext().getRequestDispatcher("/Items").forward(request, response);
    }
        
}