
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

/**
 ** User Data with Session App
 ** Author: Muhammad Shafique
 */
public class GetUserName extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        
        // Create a session object and 
        // add input data to the session object
        // Create a session object
        HttpSession session1 = request.getSession();
        
        session1.setAttribute("fn", firstName);
        session1.setAttribute("ln", lastName);
        getServletContext()
            .getRequestDispatcher("/InputEmail.jsp")
                .forward(request, response);
                }
}
