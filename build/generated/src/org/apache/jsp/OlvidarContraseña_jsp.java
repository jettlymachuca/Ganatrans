package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OlvidarContraseña_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        Escriba su correo electronico que tiene registrado<br>\n");
      out.write("                        <input type=\"email\" name=\"txtCorreo\"><br><br>\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <button>Recuperar</button><br>\n");
      out.write("            <input type=\"hidden\" value=\"7\" name=\"opcion\">\n");
      out.write("        </form><br>\n");
      out.write("        <p class=\"mb-0 mt-4 text-center\"><a href=\"IniciarSesion.jsp\" class=\"link\">Atras</a></p>\n");
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
