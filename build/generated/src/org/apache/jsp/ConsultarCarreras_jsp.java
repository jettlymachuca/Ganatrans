package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloDAO.CarreraDAO;
import ModeloVO.CarreraVO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import java.util.ArrayList;
import ModeloDAO.VehiculoDAO;
import ModeloVO.VehiculoVO;
import ModeloVO.UsuarioVO;

public final class ConsultarCarreras_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    String CorreoP = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
    } else {
        UsuarioVO UsuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        Nombre = (UsuVO.getNombre() + " " + UsuVO.getApellido());
        CorreoP = UsuVO.getCorreo();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"quixlab/images/Logo-Ganatrans.svg\">\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\n");
      out.write("            rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Vendor CSS Files -->\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"\">\n");
      out.write("        <!-- Custom Stylesheet -->\n");
      out.write("        <link href=\"quixlab/plugins/tables/css/datatable/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"quixlab/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Consultar Carreras</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--*******************\n");
      out.write("                  Preloader start\n");
      out.write("              ********************-->\n");
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
      out.write("                                            <hr class=\"my-2\">\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"CambiarContraseña.jsp\"><i class=\"icon-key\"></i> <span>CambiarContraseña</span></a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"IniciarSesion.jsp\"><i class=\"icon-lock\"></i> <span>Cerrar Sesión</span></a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <hr class=\"my-2\">\n");
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
      out.write("                        <li class=\"nav-label\">Menú</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Menu.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"icon-home menu-icon\"></i><span class=\"nav-text\">Inicio</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ConsultarConductor.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"bi bi-person menu-icon\"></i><span class=\"nav-text\">Conductores</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ConsultarVehiculo.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"bi bi-truck menu-icon\"></i><span class=\"nav-text\">Vehiculos</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ConsultarCarreras.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"bi bi-distribute-horizontal menu-icon\"></i><span class=\"nav-text\">Carreras</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ConsultarGastos.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"bi bi-cash-stack menu-icon\"></i><span class=\"nav-text\">Gastos</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"ConsultarGanancias.jsp\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"bi bi-cash-coin menu-icon\"></i><span class=\"nav-text\">Ganancias</span>\n");
      out.write("                            </a>\n");
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
      out.write("\n");
      out.write("            <div class=\"content-body\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div>\n");
      out.write("                                        ");
 if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                                        <div style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        ");
 } else {
      out.write("\n");
      out.write("                                        <div style=\"color:green;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                    </div><br><br>\n");
      out.write("                                    <h4 class=\"card-title\">Carreras</h4>\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"RegistrarCarrera.jsp\"><button class=\"btn btn-danger\" type=\"submit\"><i class=\"menu-icon bi bi-plus-lg\"> </i>AGREGAR</button></a><br><br>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"table-responsive table-hover\">\n");
      out.write("                                        <table class=\"table table-striped table-bordered zero-configuration\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>VEHICULO</th>\n");
      out.write("                                                    <th>CONDUCTOR</th>\n");
      out.write("                                                    <th>PRECIO</th>\n");
      out.write("                                                    <th>DIRECCIÓN</th>\n");
      out.write("                                                    <th>HORA DE INICIO</th>\n");
      out.write("                                                    <th>HORA FINAL</th>\n");
      out.write("                                                    <th>FECHA</th>\n");
      out.write("                                                    <th>ACCIONES</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");


                                                    VehiculoVO VehVO = new VehiculoVO();
                                                    VehiculoDAO VehDAO = new VehiculoDAO();
                                                    ArrayList<VehiculoVO> listaVehiculos = VehDAO.listar();

                                                    UsuarioVO UsuVO = new UsuarioVO();
                                                    UsuarioDAO UsuDAO = new UsuarioDAO();
                                                    ArrayList<UsuarioVO> ListaConductores = UsuDAO.listar();

                                                    CarreraVO CarrVO = new CarreraVO();
                                                    CarreraDAO CarrDAO = new CarreraDAO();
                                                    ArrayList<CarreraVO> listaCarreras = CarrDAO.listar();

                                                    for (int i = 0; i < listaCarreras.size(); i++) {

                                                        VehVO = listaVehiculos.get(i);
                                                        UsuVO = ListaConductores.get(i);
                                                        CarrVO = listaCarreras.get(i);
                                                
      out.write("\n");
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(VehVO.getPlaca());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(UsuVO.getNombre());
      out.write("</td>\n");
      out.write("                                                    <td>$ ");
      out.print(CarrVO.getValor());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(CarrVO.getDireccion());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(CarrVO.getHora_Inicio());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(CarrVO.getHora_Final());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(CarrVO.getFecha());
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <div class=\"editar\">\n");
      out.write("                                                            <a href=\"ActualizarCarrera.jsp\" class=\"btn btn-warning\" type=\"submit\">\n");
      out.write("                                                                <i class=\"menu-icon bi bi-pencil\"></i>\n");
      out.write("                                                            </a>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"eliminar\">\n");
      out.write("                                                            <form method=\"post\" action=\"Carrera\"> \n");
      out.write("                                                                <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                                                                <button class=\"btn btn-danger\" type=\"submit\"><i class=\"menu-icon bi bi-trash-fill\"></i></button>\n");
      out.write("                                                            </form>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
 }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        </form> \n");
      out.write("                                        <form class=\"form-valide\" method=\"post\" action=\"ResportesPDF.jsp\" target=\"_blank\">\n");
      out.write("                                            <button class=\"btn btn-danger\" type=\"submit\" name=\"Generar_Reporte\">GENERAR REPORTE</button>\n");
      out.write("                                            <input type=\"hidden\" value=\"/Reportes/ReportesCarreras/ReporteCarrera.jasper\" name=\"nombre\">\n");
      out.write("                                        </form><br><br><br>\n");
      out.write("                                        <div class=\"reporteVehiculo\">\n");
      out.write("                                            <form action=\"ReportesParametrisadosXConductor.jsp\" method=\"post\" target=\"_blank\">\n");
      out.write("                                                <select class=\"form-control Modelo\" id=\"val-skill\" name=\"Nombre\">\n");
      out.write("                                                        <option>Selecione...</option>\n");
      out.write("                                                        <option value=\"");
      out.print(UsuVO.getId());
      out.write("\"> ");
      out.print(UsuVO.getNombre());
      out.write("</option>\n");
      out.write("                                                    </select><br><br>\n");
      out.write("                                                <button class=\"btn btn-danger\" id=\"RModelo\" type=\"submit\">GENERAR REPORTE POR CONDUCTOR</button>\n");
      out.write("                                                <input type=\"hidden\" value=\"/Reportes_Parametrizados/Reporte_Carrera/ReporteXConductor.jasper\" name=\"nombre\">\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- #/ container -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                    <p>&copy; Copyright <strong><span>GANATRANS</span></strong>. Todos los derechos reservados</p>\n");
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
      out.write("        <!--<script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("        <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>-->\n");
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
