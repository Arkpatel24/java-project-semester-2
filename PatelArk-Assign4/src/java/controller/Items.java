package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.List;
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
public class Items extends HttpServlet {

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
             
            ProductIO prod1=new ProductIO();
            prod1.init("E:\\SHERIDAN\\TERM-3\\JAVA\\programs\\PatelArk-Assign4\\web\\WEB-INF\\Product.txt");
                        
            List<Product> prod = ProductIO.selectProducts();          
            request.setAttribute("prod", prod );     
    
            getServletContext().getRequestDispatcher("/ViewProduct.jsp").forward(request, response);
    }
}
        
