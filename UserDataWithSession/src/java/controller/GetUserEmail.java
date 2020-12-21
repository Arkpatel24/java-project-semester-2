package controller;

import java.io.IOException;
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
public class GetUserEmail extends HttpServlet {

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
        String email = request.getParameter("email");
        
        // Create a session object
        HttpSession session1 = request.getSession();
        
        // Get first name and last name from the session object
        String firstName = (String)session1.getAttribute("fn");
        String lastName = (String)session1.getAttribute("ln");

        // Create User object from the input data
        User userInput = new User(firstName, lastName, email);
        request.setAttribute("user", userInput);
        
        // Communicate userInput object to the UserInfo.jsp
        getServletContext().getRequestDispatcher("/UserInfo.jsp")
                .forward(request, response);  
            } 
        }
