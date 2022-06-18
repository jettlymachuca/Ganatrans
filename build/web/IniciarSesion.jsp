<%-- 
    Document   : IniciarSesion
    Created on : 20/05/2022, 08:24:36 PM
    Author     : HP PRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Favicons -->
        <link href="assets/img/Logo-Ganatrans.svg" rel="icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <link href="assets/css/styleLogin.css" rel="stylesheet">
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Iniciar Sesion</title>
    </head>
    <body>
        <div class="section">
            <div class="container">
                <div class="row full-height justify-content-center">
                    <div class="col-12 text-center align-self-center py-5">
                        <div class="section pb-5 pt-5 pt-sm-2 text-center">
                            <h6 class="mb-0 pb-3"><span>INICIAR SESIÓN</span><span>REGISTRARSE</span></h6>
                            <input class="checkbox" type="checkbox" id="reg-log" name="reg-log"/>
                            <label for="reg-log"></label>
                            <div class="card-3d-wrap mx-auto">
                                <div class="card-3d-wrapper">
                                    <div class="card-front">
                                        <div class="center-wrap">
                                            <div class="section text-center">
                                                <img class="LogoTitulo" src="assets/img/LogoCompleto.svg" height="50px"><br><br>
                                                <form action="Usuario" method="post">
                                                    <h4 class="mb-4 pb-3">INICIAR SESIÓN</h4>
                                                    <div class="form-group">
                                                        <input type="text" name="txtUsuario" class="form-style" placeholder="USUARIO" id="logemail" autocomplete="off" required>
                                                        <i class="input-icon bi bi-person-fill"></i>
                                                    </div>	
                                                    <div class="form-group mt-2">
                                                        <input type="password" name="txtPassword" class="form-style" placeholder="CONTRASEÑA" id="logpass" autocomplete="off" required>
                                                        <i class="input-icon bi bi-lock-fill"></i>
                                                    </div>
                                                    <button class="btn mt-4">INGRESAR</button><br>
                                                    <input type="hidden" value="5" name="opcion">
                                                    <p class="mb-0 mt-4 text-center"><a href="OlvidarContraseña.jsp" class="link">Olvidaste tu Contraseña?</a></p>
                                                    <p class="mb-0 mt-4 text-center"><a href="index.html" class="link">Atras</a></p>
                                                    <div>
                                                        <% if (request.getAttribute("mensajeErrorLogin") != null) {%>
                                                        <div style="color:red;">${mensajeErrorLogin}</div>
                                                        <% } else {%>
                                                        <div style="color:white;">${mensajeExito}</div>
                                                        <% } %>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="card-back">
                                        <div>
                                            <div class="section text-center center-wrap">
                                                <img class="LogoTitulo" src="assets/img/LogoCompleto.svg" height="50px"><br><br>
                                                <form action="Usuario" method="post" name="formConductor">
                                                    <h4 class="mb-4 pb-3">REGISTRARSE</h4>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtNombre" class="form-style" placeholder="NOMBRE" id="logname" autocomplete="off">
                                                        <i class="input-icon bi bi-person-circle"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtApellido" class="form-style" placeholder="APELLIDO" id="logname" autocomplete="off">
                                                        <i class="input-icon bi bi-person-circle"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtDireccion" class="form-style" placeholder="DIRECCION" id="logname" autocomplete="off">
                                                        <i class=" input-icon bi bi-house-fill"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="email" name="txtCorreo" class="form-style" placeholder="CORREO ELECTRONICO" id="logname" autocomplete="off">
                                                        <i class="input-icon bi bi-envelope-fill"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtTelefono" class="form-style" placeholder="TELEFONO" id="logname" autocomplete="off">
                                                        <i class="input-icon bi bi-telephone-fill"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtNIdentificacion" class="form-style" placeholder="N° IDENTIFICACIÓN" id="logname" autocomplete="off">
                                                        <i class="input-icon bi bi-person-square"></i>
                                                    </div>
                                                    <div class="form-group mt-2">
                                                        <input type="text" name="txtUsuario" class="form-style" placeholder="USUARIO" id="logemail" autocomplete="off">
                                                        <i class="input-icon bi bi-person-fill"></i>
                                                    </div>	
                                                    <div class="form-group mt-2">
                                                        <input type="password" name="txtPassword" class="form-style" placeholder="CONTRASEÑA" id="logpass" autocomplete="off">
                                                        <i class="input-icon bi bi-lock-fill"></i>
                                                    </div>
                                                    <input class="btn mt-4" type="submit" value="REGISTRARSE"><br><br>                                                    
                                                    <input type="hidden" value="1" name="opcion">
                                                    <div>
                                                        <% if (request.getAttribute("mensajeErrorRegister") != null) {%>
                                                        <div style="color:red;">${mensajeErrorRegister}</div>
                                                        <% } else {%>
                                                        <div style="color:white;">${mensajeExito}</div>
                                                        <% }%>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>  

        <script src="quixlab/plugins/common/common.min.js"></script>
        <script src="quixlab/js/custom.min.js"></script>
        <script src="quixlab/js/settings.js"></script>
        <script src="quixlab/js/gleek.js"></script>
        <script src="quixlab/js/styleSwitcher.js"></script>
        
    </body>
</html>
