package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Appointment</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <form action=\"BookAppointment\" method=\"post\">    \n");
      out.write("            <h1>Book Appointment Form </h1>\n");
      out.write("            First Name :<input type=\"text\" name=\"firstname\"><br><br>\n");
      out.write("            Last Name :<input type=\"text\" name=\"lastname\"><br><br>\n");
      out.write("            Age:<input type=\"text\" name=\"age\"><br><br>\n");
      out.write("            Gender: <input type=\"radio\" name=\"gender\" value=\"male\" checked> Male<br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"female\"> Female<br>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"other\"> Other<br><br>\n");
      out.write("            Address:<textarea name=\"address\"></textarea><br><br>\n");
      out.write("            Mobile Number:<input type=\"text\" name=\"mobile\"><br> <br>  \n");
      out.write("            Issue :<select name=\"issue\">\n");
      out.write("                        <option value=\"Eye Issue\">Eye Issue</option>\n");
      out.write("                        <option value=\"Ear Issue\">Ear Issue</option>\n");
      out.write("                        <option value=\"Hair Issue\">Hair Issue</option>\n");
      out.write("                        <option value=\"Teeth Issue\">Teeth Issue</option>\n");
      out.write("                        <option value=\"Common Cold\">Common Cold</option>\n");
      out.write("                        <option value=\"Vomiting\">Vomiting</option>\n");
      out.write("                    </select><br><br>\n");
      out.write("            Appointment Time:<select name=\"time\">\n");
      out.write("                                <option value=\"10AM-11AM\">10AM-11AM</option>\n");
      out.write("                                <option value=\"11AM-12PM\">11AM-12PM</option>\n");
      out.write("                                <option value=\"12PM-1PM\">12PM-1PM</option>\n");
      out.write("                                <option value=\"1PM-2PM\">1PM-2PM</option>\n");
      out.write("                                <option value=\"2PM-3PM\">2PM-3PM</option>\n");
      out.write("                                <option value=\"3PM-4PM\">3PM-4PM</option>\n");
      out.write("                                <option value=\"4PM-5PM\">4PM-5PM</option>\n");
      out.write("                                <option value=\"5PM-6PM\">5PM-6PM</option>\n");
      out.write("                                <option value=\"6PM-7PM\">6PM-7PM</option>\n");
      out.write("                            </select><br> <br>  \n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("            <input type=\"reset\" value=\"Reset\">\n");
      out.write("            <a href=\"index.jsp\">Back</a>\n");
      out.write("            </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
