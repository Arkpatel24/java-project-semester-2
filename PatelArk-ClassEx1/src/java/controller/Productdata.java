/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
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
public class Productdata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get input from user
        String productCode = request.getParameter("productcode");
        String productQlt = request.getParameter("productqlt");
        String productPrice=request.getParameter("productprice");
        
        //parsing input
        int proqlt=Integer.parseInt(productQlt);
        double propri=Double.parseDouble(productPrice);
        
        //calculating total price
        double total = proqlt * propri;
        
        //add response to the request
        request.setAttribute("productCode",productCode);
         request.setAttribute("productQlt",productQlt);
          request.setAttribute("productPrice",productPrice);
           request.setAttribute("total",total);
           
           ////forward request and response to productoutput.jsp
           RequestDispatcher view = request.getRequestDispatcher("productoutput.jsp");
           view.forward(request,response);
           
    }
}
