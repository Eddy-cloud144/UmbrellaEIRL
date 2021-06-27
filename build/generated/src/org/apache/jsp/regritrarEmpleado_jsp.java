package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regritrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>SISCLICO</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/styles/headerandfooter.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/styles/styleregistro.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"asset/styles/stylerempleado.css\" />\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("\n");
      out.write("        <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("            integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("        ></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header__container\">\n");
      out.write("            <div class=\"header__container--banner\">\n");
      out.write("                <img src=\"asset/img/logo-umbrella.png\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navegation\">\n");
      out.write("                <div class=\"item--nav\">\n");
      out.write("                    <p>Mantenimiento</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Proveedor</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Producto</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Compra</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item--nav\">\n");
      out.write("                    <p>Consultas</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Consulta de Stock</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item--nav\">\n");
      out.write("                    <p>Reportes</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Proveedor</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Producto</a></li>\n");
      out.write("                        <li><a href=\"\">Registro Empleado</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item--nav\">\n");
      out.write("                    <p>Utilidades</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Crear Usuario</a></li>\n");
      out.write("                        <li><a href=\"\">Modificar Usuario</a></li>\n");
      out.write("                        <li><a href=\"\">Cambiar Contraseña</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item--nav\">\n");
      out.write("                    <p>Salir del Sistema</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"\">Cerrar Session</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <main class=\"registro__container\">\n");
      out.write("            <section class=\"container\">\n");
      out.write("                <form class=\"container__registro--form\" action=\"\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Id empleado</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input type=\"text\" name=\"txtid\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Id Tipo Doc.</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <select name=\"txttipodoc\" id=\"cars\">\n");
      out.write("                                <option value=\"\">Seleccionar</option>\n");
      out.write("                                <option value=\"1\">Activos</option>\n");
      out.write("                                <option value=\"0\">Inactivos</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Número</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input type=\"text\" name=\"txtnumero\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Nombre</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input class=\"name\" type=\"text\" name=\"txtnombre\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Apellidos</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input class=\"ape\" type=\"text\" name=\"txtapellido\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Dirección</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input class=\"dirc\" type=\"text\" name=\"txtdireccion\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"columns\">\n");
      out.write("                        <div class=\"registro--input\">\n");
      out.write("                            <p>Telefono</p>\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <input type=\"text\"name=\"txttelefono\" />\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"registro--input\">\n");
      out.write("                            <p class=\"label--dising\">Fecha Nacimiento</p>\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <input type=\"date\" name=\"txtfecha\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"registro--input\">\n");
      out.write("                        <p>Email</p>\n");
      out.write("                        <div class=\"input\">\n");
      out.write("                            <input class=\"email\" type=\"text\" name=\"txtemail\"/>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"columns\">\n");
      out.write("                        <div class=\"registro--input\">\n");
      out.write("                            <p>Genero</p>\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <select name=\"txtgenero\" >\n");
      out.write("                                    <option value=\"\">Seleccionar</option>\n");
      out.write("                                    <option value=\"M\">Masculio</option>\n");
      out.write("                                    <option value=\"F\">Femenino</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"registro--input\">\n");
      out.write("                            <p class=\"label--dising\">Estado</p>\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <select name=\"txtestado\">\n");
      out.write("                                    <option value=\"\">Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">Activos</option>\n");
      out.write("                                    <option value=\"0\">Inactivos</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"registro--input\">\n");
      out.write("                            <p class=\"label--dising\">Area</p>\n");
      out.write("                            <div class=\"input\">\n");
      out.write("                                <select name=\"txtarea\" id=\"cars\">\n");
      out.write("                                    <option value=\"\">Seleccionar</option>\n");
      out.write("                                    <option value=\"1\">Activos</option>\n");
      out.write("                                    <option value=\"0\">Inactivos</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button--registro\">\n");
      out.write("                        <button class=\"button--grabar\" name=\"accion\" value=\"grabar\">Grabar</button>\n");
      out.write("                        <button class=\"button--cancelar\" name=\"accion\">Cancelar</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"user\">\n");
      out.write("                <span class=\"span--img user--img\"></span>\n");
      out.write("                <label for=\"\">EDDY.GUIZADO</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"area\">\n");
      out.write("                <span class=\"span--img area--img\"></span>\n");
      out.write("                <label for=\"\">COMPUTO</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"subarea\">\n");
      out.write("                <span class=\"span--img sub--img\"></span>\n");
      out.write("                <label for=\"\">INFORMATICA</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"date\">\n");
      out.write("                <span class=\"span--img date--img\"></span>\n");
      out.write("                <label for=\"\">12/05/2021</label>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
