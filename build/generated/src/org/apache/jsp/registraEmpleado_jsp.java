package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registraEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>SISCLICO</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/styles/headerandfooter.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/styles/styleregistro.css\" />\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script\n");
      out.write("      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("      integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header class=\"header__container\">\n");
      out.write("      <div class=\"header__container--banner\">\n");
      out.write("        <img src=\"asset/img/logo-umbrella.png\" alt=\"\" />\n");
      out.write("      </div>\n");
      out.write("      <nav class=\"navegation\">\n");
      out.write("        <div class=\"item--nav\">\n");
      out.write("          <p>Mantenimiento</p>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("            <li><a href=\"\">Registro Proveedor</a></li>\n");
      out.write("            <li><a href=\"\">Registro Producto</a></li>\n");
      out.write("            <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item--nav\">\n");
      out.write("          <p>Consultas</p>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"\">Consulta de Stock</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item--nav\">\n");
      out.write("          <p>Reportes</p>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("            <li><a href=\"\">Registro Proveedor</a></li>\n");
      out.write("            <li><a href=\"\">Registro Producto</a></li>\n");
      out.write("            <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item--nav\">\n");
      out.write("          <p>Utilidades</p>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"\">Crear Usuario</a></li>\n");
      out.write("            <li><a href=\"\">Modificar Usuario</a></li>\n");
      out.write("            <li><a href=\"\">Cambiar Contraseña</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"item--nav\">\n");
      out.write("          <p>Salir del Sistema</p>\n");
      out.write("          <ul>\n");
      out.write("            <li><a href=\"\">Cerrar Session</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <main class=\"registro__container\">\n");
      out.write("      <section class=\"container\">\n");
      out.write("        <form action=\"\" method=\"get\">\n");
      out.write("          <div class=\"btn--nuevo\">\n");
      out.write("            <button>Nuevo</button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"buscar\">\n");
      out.write("            <div class=\"buscar--input\">\n");
      out.write("              <p>Nombre</p>\n");
      out.write("              <div class=\"input\">\n");
      out.write("                <input type=\"text\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buscar--input\">\n");
      out.write("              <p>Apellido</p>\n");
      out.write("              <div class=\"input\">\n");
      out.write("                <input type=\"text\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buscar--input\">\n");
      out.write("              <p>Tipo de documento</p>\n");
      out.write("              <div class=\"input\">\n");
      out.write("                <select name=\"tDocumento\" id=\"cars\">\n");
      out.write("                  <option value=\"\">Seleccionar</option>\n");
      out.write("                  <option value=\"1\">Activos</option>\n");
      out.write("                  <option value=\"0\">Inactivos</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buscar--input\">\n");
      out.write("              <p>N° documento</p>\n");
      out.write("              <div class=\"input\">\n");
      out.write("                <input type=\"text\" />\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buscar--input\">\n");
      out.write("              <p>Estado</p>\n");
      out.write("              <div class=\"input\">\n");
      out.write("                <select name=\"estado\" id=\"cars\">\n");
      out.write("                  <option value=\"\">Seleccionar</option>\n");
      out.write("                  <option value=\"1\">Activos</option>\n");
      out.write("                  <option value=\"0\">Inactivos</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"buscar--input button\">\n");
      out.write("              <button>buscar</button>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("        <div class=\"table--container\">\n");
      out.write("          <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("              <th></th>\n");
      out.write("              <th>Nombre</th>\n");
      out.write("              <th>Apellido</th>\n");
      out.write("              <th>Documento</th>\n");
      out.write("              <th>Fecha_nac</th>\n");
      out.write("              <th>Area</th>\n");
      out.write("              <th>Sub-Area</th>\n");
      out.write("              <th>Estado</th>\n");
      out.write("            </thead>\n");
      out.write("            <tr>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("              <td></td>\n");
      out.write("            </tr>\n");
      out.write("          </table>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("      <div class=\"user\">\n");
      out.write("        <span class=\"span--img user--img\"></span>\n");
      out.write("        <label for=\"\">EDDY.GUIZADO</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"area\">\n");
      out.write("        <span class=\"span--img area--img\"></span>\n");
      out.write("        <label for=\"\">COMPUTO</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"subarea\">\n");
      out.write("        <span class=\"span--img sub--img\"></span>\n");
      out.write("        <label for=\"\">INFORMATICA</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"date\">\n");
      out.write("        <span class=\"span--img date--img\"></span>\n");
      out.write("        <label for=\"\">12/05/2021</label>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("  </body>\n");
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
