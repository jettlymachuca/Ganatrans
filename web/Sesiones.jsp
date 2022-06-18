<%-- 
    Document   : Sesiones
    Created on : 20/05/2022, 09:22:38 PM
    Author     : HP PRO
--%>

<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);

%>

<%    HttpSession buscarSesion = (HttpSession) request.getSession();
    String Nombre = "";
    String CorreoP = "";
    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
    } else {
        UsuarioVO UsuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        Nombre = (UsuVO.getNombre() + " " + UsuVO.getApellido());
        CorreoP = UsuVO.getCorreo();
    }

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Favicons -->
        <link href="assets/img/Logo-Ganatrans.svg" rel="icon">
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Ganatrans</title>
    </head>
    <body>
          
    </body>
</html>
