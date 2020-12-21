package email.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import email.user.User;
import email.data.UserDB;
import java.sql.SQLException;

public class EmailListServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @throws SQLException
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        //retrieve context params (db credentials) from DD
        String connUrl = getServletContext().
                    getInitParameter("connUrl");
        String user = getServletContext().
                    getInitParameter("user");
        String pass = getServletContext().
                    getInitParameter("pass"); 
            
        String url = "";
        String message = "";
        
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");

        // Create User object from the input data
        User userInput = new User(firstName, lastName, email);

        // Create a data access object for database interactions
        UserDB userDB = new UserDB(connUrl, user, pass);
            
        // Check if the email already exists in the database
        boolean exists = UserDB.emailExists(userInput.getEmail());
        if (exists){
            message ="Email already exists. User information in the database is:";
            User user1 = UserDB.selectUser(userInput.getEmail());
            request.setAttribute("user", user1);
            request.setAttribute("message", message);
            url = "/thanks.jsp";
        }
        else {
            // insert user data to the database
            int in = UserDB.insert(userInput);
            if (in != 0) {
                User user2 = UserDB.selectUser(email);
               message = "User information as inserted to the database";
               request.setAttribute("user", user2);
               request.setAttribute("message", message);
                url = "/thanks.jsp";
                } 
            else {
                message = "Email not inserted into the database. Input data was:";
                request.setAttribute("user", userInput);
                request.setAttribute("message", message);
                url = "/thanks.jsp"; 
            } 
        }
        
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);   
    }
}