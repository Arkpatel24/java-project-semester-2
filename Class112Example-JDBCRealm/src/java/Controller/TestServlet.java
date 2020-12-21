package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.security.DeclareRoles;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 ** Class 11-2 Example JDBCRealm Test
 ** Web Application Security Using JDBC Realm
 ** Author: Muhammad Shafique
 ** Date: November 27, 2019
 */
@WebServlet(name = "TestServlet", urlPatterns = {"/TestServlet"})
@DeclareRoles("Admin")
public class TestServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        // Secured servlet
        // Authorization test successfull
        String url = "/Test.jsp";
        RequestDispatcher view = 
                    request.getRequestDispatcher(url); 
        view.forward(request, response);
    }
}


