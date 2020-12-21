
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Welcome User
 * Date : Sep 9,2019
 * @author ARK PATEL
 */
public class WelcomeUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * 
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get the input from the request
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        
        //process input 
        String name = lastName + "," + firstName;
        
        //create a response
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet WelcomeUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(name);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
