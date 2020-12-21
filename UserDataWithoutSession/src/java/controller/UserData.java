
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 ** User Data without Session
 ** Author: Muhammad Shafique
 ** Date: November 6, 2019
 */
public class UserData extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
        
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        // Create User object from the input data
        User userInput = new User(firstName, lastName, email);
        request.setAttribute("user", userInput);
        
        // Communicate userInput object to the UserInfo.jsp
        getServletContext().getRequestDispatcher("/UserInfo.jsp")
                .forward(request, response);  
            } 
        }
