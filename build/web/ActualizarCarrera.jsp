<%-- 
    Document   : ActualizarCarrera
    Created on : 11/06/2022, 02:09:39 AM
    Author     : HP PRO
--%>

<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.CarreraDAO"%>
<%@page import="ModeloVO.CarreraVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Favicon icon -->
        <link rel="icon" sizes="16x16" href="quixlab/images/Logo-Ganatrans.svg">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Custom Stylesheet -->
        <link href="quixlab/css/style.css" rel="stylesheet">

        <title>Ganatrans</title>
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
                                            <li>
                                                <a href="Perfil.jsp"><i class="icon-user"></i>
                                                    <span>Perfil</span></a>
                                            </li>
                                            <hr class="my-2">
                                            <li>
                                                <a href="CambiarContraseña.jsp"><i class="icon-key"></i> <span>CambiarContraseña</span></a>
                                            </li>
                                            <li>
                                                <!--<form method="post" action="Sesiones">
                                                    <buttom type="submit">
                                                        <i class="icon-lock"></i> <span>Cerrar Sesión</span></buttom>
                                                </form>-->
                                                <a href="IniciarSesion.jsp"><i class="icon-lock"></i> <span>Cerrar Sesión</span></a>
                                            </li>
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
                    <div class="row justify-content-center">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="form-validation">
                                        <h3>ACTUALIZAR CARRERA</h3><br><br>

                                        <%

                                            VehiculoVO VehVO = new VehiculoVO();
                                            VehiculoDAO VehDAO = new VehiculoDAO();
                                            ArrayList<VehiculoVO> listarVehiculos = VehDAO.listarVehiculos();

                                            UsuarioVO UsuVO = new UsuarioVO();
                                            UsuarioDAO UsuDAO = new UsuarioDAO();
                                            ArrayList<UsuarioVO> listarConductores = UsuDAO.listarConductores();

                                            CarreraVO CarrVO = new CarreraVO();
                                            CarreraDAO CarrDAO = new CarreraDAO();
                                            ArrayList<CarreraVO> listarCarreras = CarrDAO.listarCarreras();

                                            for (int i = 0; i < listarCarreras.size(); i++) {

                                                VehVO = listarVehiculos.get(i);
                                                UsuVO = listarConductores.get(i);
                                                CarrVO = listarCarreras.get(i);
                                        %>

                                        <form class="form-valide" action="Carrera" method="post">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" >Vehiculo:<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" name="txtIdVehiculo" value="<%=VehVO.getPlaca()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" >Conductor:<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" name="txtIdUsuario" value="<%=UsuVO.getNombre()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" >Precio: <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="number" class="form-control" name="txtValor" value="<%=CarrVO.getValor()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" >Dirección: <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="text" class="form-control" name="txtDireccion" value="<%=CarrVO.getDireccion()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">Hora Inicio: <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="time" class="form-control" name="txtHora_Inicio" value="<%=CarrVO.getHora_Inicio()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">Hora Final:<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="time" class="form-control" name="txtHora_Final" value="<%=CarrVO.getHora_Final()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">Fecha: <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="date" class="form-control" name="txtFecha" value="<%=CarrVO.getFecha()%>">
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-lg-8 ml-auto">
                                                    <input type="hidden" value="2" name="opcion">
                                                    <button type="submit" class="btn btn-danger">Actualizar</button>
                                                </div>
                                            </div>
                                            <div>
                                                <% if (request.getAttribute("mensajeError") != null) {%>
                                                <div style="color:red;">${mensajeError}</div>
                                                <% } else {%>
                                                <div style="color:green;">${mensajeExito}</div>
                                                <% }%>
                                            </div>
                                        </form>
                                        <%
                                            }
                                        %> 
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
                    <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
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

        <!--<script src="quixlab/plugins/validation/jquery.validate.min.js"></script>
        <script src="quixlab/plugins/validation/jquery.validate-init.js"></script>-->    
    </body>
</html>
