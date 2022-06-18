<%-- 
    Document   : RegistrarGastos
    Created on : 24/03/2022, 10:09:30 AM
    Author     : Sena
--%>

<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Favicon icon -->
        <link rel="icon" type="image/png" sizes="16x16" href="quixlab/images/Logo-Ganatrans.svg">

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

        <title>Registrar Gastos</title>
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
                    <div class="row justify-content-center">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <div class="form-validation">
                                        <h3>REGISTRAR GASTOS</h3><br><br>
                                        <form class="form-valide" action="Gastos" method="post">
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-skill">Placa Vehiculo<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <select class="form-control" id="val-skill" name="txtIdVehiculo" required>
                                                        <option>Selecione...</option>
                                                        <%
                                                            VehiculoDAO VehDAO = new VehiculoDAO();
                                                            for (VehiculoVO VehVO : VehDAO.listar()) {;
                                                        %>
                                                        <option value="<%=VehVO.getId()%>"> <%=VehVO.getPlaca()%></option>
                                                        <% } %>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" for="val-skill">Categoria<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <select class="form-control" id="val-skill"  name="txtIdCategoria" required>
                                                        <option>Selecione...</option>
                                                        <%
                                                            CategoriaDAO CatDAO = new CategoriaDAO();
                                                            for (CategoriaVO CatVO : CatDAO.listar()) {
                                                        %>
                                                        <option value="<%=CatVO.getId()%>"> <%=CatVO.getCategoria()%></option>
                                                        <% } %>
                                                    </select>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label">Fecha<span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="date" class="form-control" name="txtFecha" required>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-lg-4 col-form-label" >Valor: <span class="text-danger">*</span>
                                                </label>
                                                <div class="col-lg-6">
                                                    <input type="number" class="form-control" placeholder="Ingrese el Valor" name="txtValor" required>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <div class="col-lg-8 ml-auto">
                                                    <input type="hidden" value="1" name="opcion">
                                                    <button type="submit" class="btn btn-danger">Registrar</button>
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

        <script src="quixlab/plugins/validation/jquery.validate.min.js"></script>
        <script src="quixlab/plugins/validation/jquery.validate-init.js"></script>

    </body>
</html>
