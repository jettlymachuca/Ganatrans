<%-- 
    Document   : OlvidarContraseña
    Created on : 24/05/2022, 02:08:01 PM
    Author     : AdminSena
--%>

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
        <title>Solicitar Contraseña</title>
    </head>
    <body>

        <!--**********************************
            Content body start
        ***********************************-->
        <div class="content-body">
            <div class="container-fluid">
                <div class="row justify-content-center">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="nav-header">
                                    <div class="Logo-Contraseña">
                                        <span class="brand-title">
                                            <img src="quixlab/images/Logo-Gris.svg" alt="">
                                        </span>
                                    </div>
                                </div><br><br><br><br>
                                <div class="form-validation">
                                    <h3>SOLICITAR CONTRASEÑA</h3><br><br>
                                    <form class="form-valide" action="Usuario" method="post">
                                        <div class="form-group row">
                                            <label class="col-lg-4 col-form-label" >Escriba el Correo que Tiene Registrado <span class="text-danger">*</span>
                                            </label>
                                            <div class="col-lg-6">
                                                <input type="email" class="form-control" name="txtCorreo" placeholder="Ingrese el Correo" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-lg-8 ml-auto">
                                                <input type="hidden" value="7" name="opcion">
                                                <button type="submit" class="btn btn-danger">Solicitar</button><br><br>
                                                <a href="IniciarSesion.jsp" type="submit" class="btn btn-dark">Atras</a>
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
