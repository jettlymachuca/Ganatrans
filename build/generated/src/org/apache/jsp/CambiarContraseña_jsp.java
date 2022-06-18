package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;

public final class CambiarContraseña_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");


    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);


      out.write('\n');
      out.write('\n');
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String Nombre = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
    } else {
        UsuarioVO UsuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        Nombre = (UsuVO.getNombre() + " " + UsuVO.getApellido());
    }


      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"assets/img/Logo-Ganatrans.svg\" rel=\"icon\">\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Ganatrans</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"float: right; margin-right: 2%\">\n");
      out.write("            <h2 style=\"color: black\">\n");
      out.write("                Bienvenido: ");
      out.print(Nombre);
      out.write("\n");
      out.write("            </h2>\n");
      out.write("            <form method=\"post\" action=\"Sesiones\">\n");
      out.write("                <input class=\"btn btn-info\" type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("            </form>\n");
      out.write("        </div><br><br>    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"assets/img/Logo-Ganatrans.svg\" rel=\"icon\">\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Cambiar Contraseña</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Cambiar Contraseña</h1>        \n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Usuario\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("                        <input type=\"hidden\" value=\"\" name=\"txtUsuario\">\n");
      out.write("                        Contraseña Actual<br>\n");
      out.write("                        <input type=\"password\" name=\"txtPassword\"><br><br>\n");
      out.write("                        Contraseña Nueva<br>\n");
      out.write("                        <input type=\"password\" name=\"txtPassword1\"><br><br>\n");
      out.write("                        Confirmar Contraseña<br>\n");
      out.write("                        <input type=\"password\" name=\"txtPasswordNueva\"><br><br>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <button class=\"btn btn-success\">Actualizar</button><br>\n");
      out.write("            <input type=\"hidden\" value=\"6\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("            ");
 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("            <div style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            ");
 } else {
      out.write("\n");
      out.write("            <div style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>    \n");
      out.write("</body>\n");
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
