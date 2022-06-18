<%-- 
    Document   : ConsultarCarreras
    Created on : 23/05/2022, 09:08:30 PM
    Author     : HP PRO
--%>

<%@page import="ModeloDAO.CarreraDAO"%>
<%@page import="ModeloVO.CarreraVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="quixlab/images/Logo-Ganatrans.svg">
        <!-- Google Fonts -->
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="">
        <!-- Custom Stylesheet -->
        <link href="quixlab/plugins/tables/css/datatable/dataTables.bootstrap4.min.css" rel="stylesheet">
        <link href="quixlab/css/style.css" rel="stylesheet">
        <title>Consultar Carreras</title>
    </head>
    <body>
        <!--*******************
                  Preloader start
              ********************-->
        <div id="preloader">
            <div class="loader">
                <svg class="circular" viewBox="25 25 50 50">
                <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
                </svg>
            </div>
        </div>
        <!--*******************
            Preloader end
        ********************-->


        <!--**********************************
            Main wrapper start
        ***********************************-->
        <div id="main-wrapper">

            <!--**********************************
                Nav header start
            ***********************************-->
            <div class="nav-header">
                <div class="brand-logo">
                    <a href="Menu.jsp">
                        <b class="logo-abbr"><img src="quixlab/images/Logo-Ganatrans.svg" alt=""> </b>
                        <span class="logo-compact"><img src="quixlab/images/Logo-Gris.svg" alt=""></span>
                        <span class="brand-title">
                            <img src="quixlab/images/Logo-Gris.svg" alt="">
                        </span>
                    </a>
                </div>
            </div>
            <!--**********************************
                Nav header end
            ***********************************-->

            <!--**********************************
                Header start
            ***********************************-->
            <div class="header">
                <div class="header-content clearfix">
                    <div class="nav-control">
                        <div class="hamburger">
                            <span class="toggle-icon"><i class="icon-menu"></i></span>
                        </div>
                    </div>
                    <div class="header-right">
                        <ul class="clearfix">
                            <li class="icons dropdown d-none d-md-flex">
                                <div >
                                    <h2 style="color: black">
                                        Bienvenido: <%=Nombre%>
                                    </h2>
                            </li>
                            <li class="icons dropdown">
                                <div class="user-img c-pointer position-relative" data-toggle="dropdown">
                                    <span class="activity active"></span>
                                    <img src="quixlab/images/user/1.png" height="40" width="40" alt="">
                                </div>
                                <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                                    <div class="dropdown-content-body">
                                        <ul>
                                            <hr class="my-2">
                                            <li>
                                                <a href="CambiarContraseña.jsp"><i class="icon-key"></i> <span>CambiarContraseña</span></a>
                                            </li>
                                            <li>
                                                <a href="IniciarSesion.jsp"><i class="icon-lock"></i> <span>Cerrar Sesión</span></a>
                                            </li>
                                            <hr class="my-2">
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--**********************************
                Header end ti-comment-alt
            ***********************************-->

            <!--**********************************
                Sidebar start
            ***********************************-->
            <div class="nk-sidebar">
                <div class="nk-nav-scroll">
                    <ul class="metismenu" id="menu">
                        <li class="nav-label">Menú</li>
                        <li>
                            <a href="Menu.jsp" aria-expanded="false">
                                <i class="icon-home menu-icon"></i><span class="nav-text">Inicio</span>
                            </a>
                        </li>
                        <li>
                            <a href="ConsultarConductor.jsp" aria-expanded="false">
                                <i class="bi bi-person menu-icon"></i><span class="nav-text">Conductores</span>
                            </a>
                        </li>
                        <li>
                            <a href="ConsultarVehiculo.jsp" aria-expanded="false">
                                <i class="bi bi-truck menu-icon"></i><span class="nav-text">Vehiculos</span>
                            </a>
                        </li>
                        <li>
                            <a href="ConsultarCarreras.jsp" aria-expanded="false">
                                <i class="bi bi-distribute-horizontal menu-icon"></i><span class="nav-text">Carreras</span>
                            </a>
                        </li>
                        <li>
                            <a href="ConsultarGastos.jsp" aria-expanded="false">
                                <i class="bi bi-cash-stack menu-icon"></i><span class="nav-text">Gastos</span>
                            </a>
                        </li>
                        <li>
                            <a href="ConsultarGanancias.jsp" aria-expanded="false">
                                <i class="bi bi-cash-coin menu-icon"></i><span class="nav-text">Ganancias</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <!--**********************************
                Sidebar end
            ***********************************-->

            <!--**********************************
                Content body start
            ***********************************-->

            <div class="content-body">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <div>
                                        <% if (request.getAttribute("mensajeError") != null) {%>
                                        <div style="color:red;">${mensajeError}</div>
                                        <% } else {%>
                                        <div style="color:green;">${mensajeExito}</div>
                                        <% }%>
                                    </div><br><br>
                                    <h4 class="card-title">Carreras</h4>
                                    <div>
                                        <a href="RegistrarCarrera.jsp"><button class="btn btn-danger" type="submit"><i class="menu-icon bi bi-plus-lg"> </i>AGREGAR</button></a><br><br>
                                    </div>
                                    <div class="table-responsive table-hover">
                                        <table class="table table-striped table-bordered zero-configuration">
                                            <thead>
                                                <tr>
                                                    <th>VEHICULO</th>
                                                    <th>CONDUCTOR</th>
                                                    <th>PRECIO</th>
                                                    <th>DIRECCIÓN</th>
                                                    <th>HORA DE INICIO</th>
                                                    <th>HORA FINAL</th>
                                                    <th>FECHA</th>
                                                    <th>ACCIONES</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%

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
                                                %>

                                                <tr>
                                                    <td><%=VehVO.getPlaca()%></td>
                                                    <td><%=UsuVO.getNombre()%></td>
                                                    <td>$ <%=CarrVO.getValor()%></td>
                                                    <td><%=CarrVO.getDireccion()%></td>
                                                    <td><%=CarrVO.getHora_Inicio()%></td>
                                                    <td><%=CarrVO.getHora_Final()%></td>
                                                    <td><%=CarrVO.getFecha()%></td>
                                                    <td>
                                                        <div class="eliminar">
                                                            <form method="post" action="Carrera"> 
                                                                <input type="hidden" value="3" name="opcion">
                                                                <button class="btn btn-danger" type="submit"><i class="menu-icon bi bi-trash-fill"></i></button>
                                                            </form>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <% }%>
                                            </tbody>
                                        </table>
                                        </form> 
                                        <form class="form-valide" method="post" action="ResportesPDF.jsp" target="_blank">
                                            <button class="btn btn-danger" type="submit" name="Generar_Reporte">GENERAR REPORTE</button>
                                            <input type="hidden" value="/Reportes/ReportesCarreras/ReporteCarrera.jasper" name="nombre">
                                        </form><br><br><br>
                                        <div class="reporteVehiculo">
                                            <form action="ReportesParametrisadosXConductor.jsp" method="post" target="_blank">
                                                <select class="form-control Modelo" id="val-skill" name="Nombre">
                                                    <option>Selecione...</option>
                                                    <option value="Jettly">Jettly</option>
                                                    <option value="Diego">Diego</option>
                                                    <option value="Alejandra">Alejandra</option>
                                                    <option value="Nicolas">Nicolas</option>
                                                </select><br><br>
                                                <button class="btn btn-danger" id="RModelo" type="submit">GENERAR REPORTE POR CONDUCTOR</button>
                                                <input type="hidden" value="/Reportes_Parametrizados/Reporte_Carrera/ReporteXConductor.jasper" name="nombre">
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- #/ container -->
            </div>


            <!--**********************************
                Content body end
            ***********************************-->


            <!--**********************************
                Footer start
            ***********************************-->
            <div class="footer">
                <div class="copyright">
                    <p>&copy; Copyright <strong><span>GANATRANS</span></strong>. Todos los derechos reservados</p>
                </div>
            </div>
            <!--**********************************
                Footer end
            ***********************************-->
        </div>
        <!--**********************************
            Main wrapper end
        ***********************************-->

        <!--**********************************
            Scripts
        ***********************************-->
        <script src="quixlab/plugins/common/common.min.js"></script>
        <script src="quixlab/js/custom.min.js"></script>
        <script src="quixlab/js/settings.js"></script>
        <script src="quixlab/js/gleek.js"></script>
        <script src="quixlab/js/styleSwitcher.js"></script>

        <!--<script src="./plugins/tables/js/jquery.dataTables.min.js"></script>
        <script src="./plugins/tables/js/datatable/dataTables.bootstrap4.min.js"></script>
        <script src="./plugins/tables/js/datatable-init/datatable-basic.min.js"></script>-->
    </body>
</html>
