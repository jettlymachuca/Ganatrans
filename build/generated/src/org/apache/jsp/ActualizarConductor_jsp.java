package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloVO.UsuarioVO;

public final class ActualizarConductor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" sizes=\"16x16\" href=\"quixlab/images/Logo-Ganatrans.svg\">\n");
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
      out.write("        <!-- Custom Stylesheet -->\n");
      out.write("        <link href=\"quixlab/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>Actualizar Conductor</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--*******************\n");
      out.write("    Preloader start\n");
      out.write("********************-->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"loader\">\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--*******************\n");
      out.write("            Preloader end\n");
      out.write("        ********************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Main wrapper start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div id=\"main-wrapper\">\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Nav header start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"nav-header\">\n");
      out.write("                <div class=\"brand-logo\">\n");
      out.write("                    <a href=\"Menu.jsp\">\n");
      out.write("                        <b class=\"logo-abbr\"><img src=\"quixlab/images/Logo-Ganatrans.svg\" alt=\"\"> </b>\n");
      out.write("                        <span class=\"logo-compact\"><img src=\"quixlab/images/Logo-Gris.svg\" alt=\"\"></span>\n");
      out.write("                        <span class=\"brand-title\">\n");
      out.write("                            <img src=\"quixlab/images/Logo-Gris.svg\" alt=\"\">\n");
      out.write("                        </span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Nav header end\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Header start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header-content clearfix\">\n");
      out.write("                    <div class=\"nav-control\">\n");
      out.write("                        <div class=\"hamburger\">\n");
      out.write("                            <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header-right\">\n");
      out.write("                        <ul class=\"clearfix\">\n");
      out.write("                            <li class=\"icons dropdown d-none d-md-flex\">\n");
      out.write("                                <div >\n");
      out.write("                                    <h2 style=\"color: black\">\n");
      out.write("                                        Bienvenido: ");
      out.print(Nombre);
      out.write("\n");
      out.write("                                    </h2>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"icons dropdown\">\n");
      out.write("                                <div class=\"user-img c-pointer position-relative\" data-toggle=\"dropdown\">\n");
      out.write("                                    <span class=\"activity active\"></span>\n");
      out.write("                                    <img src=\"quixlab/images/user/1.png\" height=\"40\" width=\"40\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\n");
      out.write("                                    <div class=\"dropdown-content-body\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"Perfil.jsp\"><i class=\"icon-user\"></i>\n");
      out.write("                                                    <span>Perfil</span></a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"CambiarContrase??a.jsp\"><i class=\"icon-key\"></i> <span>CambiarContrase??a</span></a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <!--<form method=\"post\" action=\"Sesiones\">\n");
      out.write("                                                    <buttom type=\"submit\">\n");
      out.write("                                                        <i class=\"icon-lock\"></i> <span>Cerrar Sesi??n</span></buttom>\n");
      out.write("                                                </form>-->\n");
      out.write("                                                <a href=\"IniciarSesion.jsp\"><i class=\"icon-lock\"></i> <span>Cerrar Sesi??n</span></a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Header end ti-comment-alt\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Sidebar start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"nk-sidebar\">\n");
      out.write("                <div class=\"nk-nav-scroll\">\n");
      out.write("                    <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                        <li class=\"nav-label\">MEN??</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"icon-home menu-icon\"></i><span class=\"nav-text\">Men??</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul aria-expanded=\"false\">\n");
      out.write("                                <li><a href=\"Menu.jsp\">Inicio</a></li>\n");
      out.write("                                <!-- <li><a href=\"./index-2.html\">Home 2</a></li> -->\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-label\">FORMULARIOS</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"icon-note menu-icon\"></i><span class=\"nav-text\">Formularios</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul aria-expanded=\"false\">\n");
      out.write("                                <li><a href=\"RegistrarVehiculo.jsp\">Registar Vehiculo</a></li>\n");
      out.write("                                <li><a href=\"RegistrarCarrera.jsp\">Registar Carrera</a></li>\n");
      out.write("                                <li><a href=\"RegistrarGastos.jsp\">Registar Gastos</a></li>\n");
      out.write("                                <li><a href=\"RegistrarGanancias.jsp\">Registar Ganancias</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-label\">TABLAS</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"menu-icon bi bi-table\"></i><span class=\"nav-text\">Tablas</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul aria-expanded=\"false\">\n");
      out.write("                                <li><a href=\"ConsultarConductor.jsp\" aria-expanded=\"false\">Consultar Conductores</a></li>\n");
      out.write("                                <li><a href=\"ConsultarVehiculo.jsp\" aria-expanded=\"false\">Consultar Vehiculos</a></li>\n");
      out.write("                                <li><a href=\"ConsultarCarreras.jsp\" aria-expanded=\"false\">Consultar Carreras</a></li>\n");
      out.write("                                <li><a href=\"ConsultarGastos.jsp\" aria-expanded=\"false\">Consultar Gastos</a></li>\n");
      out.write("                                <li><a href=\"ConsultarGanancias.jsp\" aria-expanded=\"false\">Consultar Ganancias</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Sidebar end\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Content body start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"content-body\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"form-validation\">\n");
      out.write("                                        <h3>ACTUALIZAR CONDUCTOR</h3><br><br>\n");
      out.write("                                        ");


                                            UsuarioVO UsuVO = (UsuarioVO) request.getAttribute("conductorConsultado");
                                            if (UsuVO != null) {

                                        
      out.write("\n");
      out.write("                                        <form class=\"form-valide\" action=\"Usuario\" method=\"post\">\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" >Nombre:<span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtNombre\" value=\"");
      out.print(UsuVO.getNombre());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" >Apelido<span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtApellido\" value=\"");
      out.print(UsuVO.getApellido());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" >Direcci??n: <span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" name=\"txtDireccion\" value=\"");
      out.print(UsuVO.getDireccion());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\" >Correo: <span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"email\" class=\"form-control\" name=\"txtCorreo\" value=\"");
      out.print(UsuVO.getCorreo());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\">Telefono: <span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtTelefono\" value=\"");
      out.print(UsuVO.getTelefono());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-lg-4 col-form-label\">N?? Identificaci??n: <span class=\"text-danger\">*</span>\n");
      out.write("                                                </label>\n");
      out.write("                                                <div class=\"col-lg-6\">\n");
      out.write("                                                    <input type=\"number\" class=\"form-control\" name=\"txtNIdentificacion\" value=\"");
      out.print(UsuVO.getNIdentificacion());
      out.write("\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <div class=\"col-lg-8 ml-auto\">\n");
      out.write("                                                    <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("                                                    <button type=\"submit\" class=\"btn btn-danger\">Actualizar</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div>\n");
      out.write("                                                ");
 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                                                <div style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                ");
 } else {
      out.write("\n");
      out.write("                                                <div style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                                ");
 }
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                        ");
 } else {
                                                request.getRequestDispatcher("ConsultarConductor.jsp").forward(request, response);
                                            }
                                        
      out.write(" \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- #/ container -->\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Content body end\n");
      out.write("            ***********************************-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--**********************************\n");
      out.write("                Footer start\n");
      out.write("            ***********************************-->\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <p>Copyright &copy; Designed & Developed by <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a> 2018</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--**********************************\n");
      out.write("                Footer end\n");
      out.write("            ***********************************-->\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Main wrapper end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Scripts\n");
      out.write("        ***********************************-->\n");
      out.write("        <script src=\"quixlab/plugins/common/common.min.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/custom.min.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/settings.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/gleek.js\"></script>\n");
      out.write("        <script src=\"quixlab/js/styleSwitcher.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"quixlab/plugins/validation/jquery.validate.min.js\"></script>\n");
      out.write("        <script src=\"quixlab/plugins/validation/jquery.validate-init.js\"></script>\n");
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
