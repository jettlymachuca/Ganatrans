<%-- 
    Document   : Menu
    Created on : 24/03/2022, 10:21:04 AM
    Author     : Sena
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
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
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="">
        <!-- Pignose Calender -->
        <link href="quixlab/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
        <!-- Chartist -->
        <link rel="stylesheet" href="quixlab/plugins/chartist/css/chartist.min.css">
        <link rel="stylesheet" href="quixlab/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
        <!-- Custom Stylesheet -->
        <link href="quixlab/css/style.css" rel="stylesheet">

        <title>Menú</title>
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

                <div class="container-fluid mt-3">
                    <div class="row">
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-1">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Vehiculos Registrados</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">9</h2>
                                        <p class="text-white mb-0">17 - Junio 2022</p>
                                    </div>
                                    <span class="float-right display-5 "><i class="bi bi-truck menu-icon"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-2">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Ganacia mas Alta</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">$ 85000</h2>
                                        <p class="text-white mb-0">17 - Junio 2022</p>
                                    </div>
                                    <span class="float-right display-5 "><i class="fa fa-money"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-3">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Conductores Registrados</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">4</h2>
                                        <p class="text-white mb-0">17 - Junio 2022</p>
                                    </div>
                                    <span class="float-right display-5"><i class="fa fa-users"></i></span>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <div class="card gradient-4">
                                <div class="card-body">
                                    <h3 class="card-title text-white">Porcentaje de Ganacias</h3>
                                    <div class="d-inline-block">
                                        <h2 class="text-white">99%</h2>
                                        <p class="text-white mb-0">17 - Junio 2022</p>
                                    </div>
                                    <span class="float-right display-5"><i class="fa fa-money"></i></span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="active-member">
                                        <div class="table-responsive">
                                            <table class="table table-xs mb-0 table-hover">
                                                <tr>
                                                    <th>NOMBRE</th>
                                                    <th>APELLIDO</th>
                                                    <th>DIRECCIÓN</th>
                                                    <th>CORREO ELECTRONICO</th>
                                                    <th>TELEFONO</th>
                                                    <th>N° IDENTIFICACIÓN</th>
                                                </tr>

                                                <%

                                                    UsuarioVO UsuVO = new UsuarioVO();
                                                    UsuarioDAO UsuDAO = new UsuarioDAO();
                                                    ArrayList<UsuarioVO> listaConductores = UsuDAO.listar();
                                                    for (int i = 0; i < listaConductores.size(); i++) {

                                                        UsuVO = listaConductores.get(i);
                                                %>

                                                <tr>
                                                    <td><%=UsuVO.getNombre()%></td>
                                                    <td><%=UsuVO.getApellido()%></td>
                                                    <td><%=UsuVO.getDireccion()%></td>
                                                    <td><%=UsuVO.getCorreo()%></td>
                                                    <td><%=UsuVO.getTelefono()%></td>
                                                    <td><%=UsuVO.getNIdentificacion()%></td>
                                                </tr>
                                                <% }%>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

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

        <!-- Chartjs -->
        <script src="quixlab/plugins/chart.js/Chart.bundle.min.js"></script>
        <!-- Circle progress -->
        <script src="quixlab/plugins/circle-progress/circle-progress.min.js"></script>
        <!-- Datamap -->
        <script src="quixlab/plugins/d3v3/index.js"></script>
        <script src="quixlab/plugins/topojson/topojson.min.js"></script>
        <script src="quixlab/plugins/datamaps/datamaps.world.min.js"></script>
        <!-- Morrisjs -->
        <script src="quixlab/plugins/raphael/raphael.min.js"></script>
        <script src="quixlab/plugins/morris/morris.min.js"></script>
        <!-- Pignose Calender -->
        <script src="quixlab/plugins/moment/moment.min.js"></script>
        <script src="quixlab/plugins/pg-calendar/js/pignose.calendar.min.js"></script>
        <!-- ChartistJS -->
        <script src="quixlab/plugins/chartist/js/chartist.min.js"></script>
        <script src="quixlab/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>



        <script src="quixlab/js/dashboard/dashboard-1.js"></script>

        <!--<center>
            <div class="container">
                <a class="btn btn-info" href="CambiarContraseña.jsp" style="float: left">Cambiar Contraseña</a>
                <h1 style="width: 45%">Menú</h1>
                <h2>Consultar Conductores</h2>
                <a class="btn btn-success" href="ConsultarConductor.jsp">Consultar</a>
                <h2>Consultar Vehiculos</h2>
                <a class="btn btn-success" href="ConsultarVehiculo.jsp">Consultar</a>
                <h2>Consultar Carreras</h2>
                <a class="btn btn-success" href="ConsultarCarreras.jsp">Consultar</a>
                <h2>Consultar Gastos</h2>
                <a class="btn btn-success" href="ConsultarGastos.jsp">Consultar</a>
                <h2>Consultar Ganancias</h2>
                <a class="btn btn-success" href="ConsultarGanancias.jsp">Consultar</a>
            </div>
        </center>-->
    </body>
</html>
