package Class11Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Class 1 Example
 * Java Web Application development environment
 * Author Muhammad Shafique
 * Summer 2019 May 7, 2019
 */
public class BeerSelect extends HttpServlet {

    /**
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest request, 
                    HttpServletResponse response)
                  throws IOException, ServletException {
        
        // Specify response type
        response.setContentType("text/html;charset=UTF-8");
 
        // Get color parameter from request
        String c = request.getParameter("color");
        
        // Create a  PrintWriter object to create response
        PrintWriter out = response.getWriter();
        
        // Create HTML document for the response contents
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<title>Class11Example</title>");            
        out.println("<body>");
        out.println("<h1 align=\"center\">Beer Recommendation</h1>");
        out.println("<p> <center> Try beer of color: " + c + "</p>");
        out.println("</body>");
        out.println("</html>");
        }
    }

