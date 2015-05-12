package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("                <link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\" media=\"only screen\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"surface\">\n");
      out.write("            <header id=\"header-container\">\n");
      out.write("                <a class=\"header-logo-container\" href=\"#\" title=\"Back to main page\">\n");
      out.write("                    <span class=\"header-logo-default\"></span>\n");
      out.write("                </a>\n");
      out.write("            </header>\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("                <div class=\"wrapper clearfix\">\n");
      out.write("\n");
      out.write("                    <div class=\"login-container\">\n");
      out.write("                        <div id=\"login-form\">                           \n");
      out.write("                            <h3>Login</h3>\n");
      out.write("                <form action=\"javascript:void(0);\" method=\"get\">\n");
      out.write("                    <input type=\"email\" required value=\"Email\" onBlur=\"if (this.value == '')\n");
      out.write("                                this.value = 'Email'\" onFocus=\"if (this.value == 'Email')\n");
      out.write("                                            this.value = ''\"> <!-- JS because of IE support; better: placeholder=\"Email\" -->\n");
      out.write("                    <input type=\"password\" required value=\"Password\" onBlur=\"if (this.value == '')\n");
      out.write("                                this.value = 'Password'\" onFocus=\"if (this.value == 'Password')\n");
      out.write("                                            this.value = ''\"> <!-- JS because of IE support; better: placeholder=\"Password\" -->\n");
      out.write("                    <input type=\"submit\" value=\"Login\">\n");
      out.write("                    <footer class=\"clearfix\">\n");
      out.write("                        <p><span class=\"info\">?</span><a href=\"#\">Forgot Password</a></p>\n");
      out.write("                    </footer>\n");
      out.write("                </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- end login-form -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
