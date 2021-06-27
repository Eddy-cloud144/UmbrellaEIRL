package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Acceso SISCLICO</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./asset/styles/login.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"login\">\n");
      out.write("            <section class=\"login__container\">\n");
      out.write("                <form class=\"login__container--form\" action=\"CValidar\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"login__container--banner\">\n");
      out.write("                        <img src=\"asset/img/logo-umbrella.png\" alt=\"\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"login--input\">\n");
      out.write("                        <p>Usuario:</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input type=\"text\" name=\"txtUsuario\" id=\"txtusuario\" placeholder=\"Usuario\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"login--input\">\n");
      out.write("                        <p>Password:</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input type=\"text\" id=\"txtpassword\" name=\"txtPassword\" placeholder=\"Password\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"login--button\">\n");
      out.write("                        <button class=\"button submit\" type=\"submit\" name=\"accion\" value=\"Ingresar\">Ingresar</button>\n");
      out.write("                        <button class=\"button reset\" type=\"reset\">Limpiar</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
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
