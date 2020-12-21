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
import model.Product;
import model.ProductIO;

/**
 *
 * @author ARK PATEL
 */
public class addProduct extends HttpServlet {

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

        String code = request.getParameter("code");
        String desc = request.getParameter("desc");
        String price =request.getParameter("price");
        
        Double price1=Double.parseDouble(price);

        Product pro = new Product(code, desc, price1);

        ProductIO pro1 = new ProductIO();

        pro1.insertProduct(pro);

        RequestDispatcher view = request.getRequestDispatcher("Items");

        view.forward(request, response);
      
    }
}
