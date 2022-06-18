package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IniciarSesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"assets/css/styleLogin.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Iniciar Sesion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row full-height justify-content-center\">\n");
      out.write("                    <div class=\"col-12 text-center align-self-center py-5\">\n");
      out.write("                        <div class=\"section pb-5 pt-5 pt-sm-2 text-center\">\n");
      out.write("                            <h6 class=\"mb-0 pb-3\"><span>INICIAR SESIÓN</span><span>REGISTRARSE</span></h6>\n");
      out.write("                            <input class=\"checkbox\" type=\"checkbox\" id=\"reg-log\" name=\"reg-log\"/>\n");
      out.write("                            <label for=\"reg-log\"></label>\n");
      out.write("                            <div class=\"card-3d-wrap mx-auto\">\n");
      out.write("                                <div class=\"card-3d-wrapper\">\n");
      out.write("                                    <div class=\"card-front\">\n");
      out.write("                                        <div class=\"center-wrap\">\n");
      out.write("                                            <div class=\"section text-center\">\n");
      out.write("                                                <img class=\"LogoTitulo\" src=\"assets/img/LogoCompleto.svg\" height=\"50px\"><br><br>\n");
      out.write("                                                <form action=\"Usuario\" method=\"post\">\n");
      out.write("                                                    <h4 class=\"mb-4 pb-3\">INICIAR SESIÓN</h4>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtUsuario\" class=\"form-style\" placeholder=\"USUARIO\" id=\"logemail\" autocomplete=\"off\" required>\n");
      out.write("                                                        <i class=\"input-icon bi bi-person-fill\"></i>\n");
      out.write("                                                    </div>\t\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"password\" name=\"txtPassword\" class=\"form-style\" placeholder=\"CONTRASEÑA\" id=\"logpass\" autocomplete=\"off\" required>\n");
      out.write("                                                        <i class=\"input-icon bi bi-lock-fill\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <button class=\"btn mt-4\">INGRESAR</button><br>\n");
      out.write("                                                    <input type=\"hidden\" value=\"5\" name=\"opcion\">\n");
      out.write("                                                    <p class=\"mb-0 mt-4 text-center\"><a href=\"OlvidarContraseña.jsp\" class=\"link\">Olvidaste tu Contraseña?</a></p>\n");
      out.write("                                                    <p class=\"mb-0 mt-4 text-center\"><a href=\"index.html\" class=\"link\">Atras</a></p>\n");
      out.write("                                                    <div>\n");
      out.write("                                                        ");
 if (request.getAttribute("mensajeErrorLogin") != null) {
      out.write("\n");
      out.write("                                                        <div style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeErrorLogin}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                        ");
 } else {
      out.write("\n");
      out.write("                                                        <div style=\"color:white;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                        ");
 } 
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"card-back\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <div class=\"section text-center center-wrap\">\n");
      out.write("                                                <img class=\"LogoTitulo\" src=\"assets/img/LogoCompleto.svg\" height=\"50px\"><br><br>\n");
      out.write("                                                <form action=\"Usuario\" method=\"post\">\n");
      out.write("                                                    <h4 class=\"mb-4 pb-3\">REGISTRARSE</h4>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtNombre\" class=\"form-style\" placeholder=\"NOMBRE\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-person-circle\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtApellido\" class=\"form-style\" placeholder=\"APELLIDO\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-person-circle\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtDireccion\" class=\"form-style\" placeholder=\"DIRECCION\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\" input-icon bi bi-house-fill\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"email\" name=\"txtCorreo\" class=\"form-style\" placeholder=\"CORREO ELECTRONICO\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-envelope-fill\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtTelefono\" class=\"form-style\" placeholder=\"TELEFONO\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-telephone-fill\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtNIdentificacion\" class=\"form-style\" placeholder=\"N° IDENTIFICACIÓN\" id=\"logname\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-person-square\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"text\" name=\"txtUsuario\" class=\"form-style\" placeholder=\"USUARIO\" id=\"logemail\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-person-fill\"></i>\n");
      out.write("                                                    </div>\t\n");
      out.write("                                                    <div class=\"form-group mt-2\">\n");
      out.write("                                                        <input type=\"password\" name=\"txtPassword\" class=\"form-style\" placeholder=\"CONTRASEÑA\" id=\"logpass\" autocomplete=\"off\">\n");
      out.write("                                                        <i class=\"input-icon bi bi-lock-fill\"></i>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <button class=\"btn mt-4\">REGISTRARSE</button><br><br>                                                    \n");
      out.write("                                                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                                                    <div>\n");
      out.write("                                                        ");
 if (request.getAttribute("mensajeErrorRegister") != null) {
      out.write("\n");
      out.write("                                                        <div style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeErrorRegister}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                        ");
 } else {
      out.write("\n");
      out.write("                                                        <div style=\"color:white;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                        ");
 }
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("        <script src=\"quixlab/plugins/common/common.min.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/custom.min.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/settings.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/gleek.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/styleSwitcher.js\"></script>\n");
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
