/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author HP PRO
 */
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // 1. Recibir datos de la vista
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String Id = request.getParameter("txtId");
        String Nombre = request.getParameter("txtNombre");
        String Apellido = request.getParameter("txtApellido");
        String Direccion = request.getParameter("txtDireccion");
        String Correo = request.getParameter("txtCorreo");
        String Telefono = request.getParameter("txtTelefono");
        String NIdentificacion = request.getParameter("txtNIdentificacion");
        String Usuario = request.getParameter("txtUsuario");
        String Password = request.getParameter("txtPassword");
        String Password1 = request.getParameter("txtPassword1");
        String PasswordNueva = request.getParameter("txtPasswordNueva");

        UsuarioVO UsuVO = new UsuarioVO(Id, Nombre, Apellido, Direccion, Correo, Telefono, NIdentificacion, Usuario, Password);
        UsuarioDAO UsuDAO = new UsuarioDAO(UsuVO);

        switch (opcion) {

            case 1: // Agregar registro

                if (UsuDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El Usuario ha sido registrado!");

                } else {

                    request.setAttribute("mensajeErrorRegister", "El Usuario no se pudo registrar!");
                }
                request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);
                break;

            case 2: // Actualizar registro

                if (UsuDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El Conductor se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El Conductor no se pudo actualizar!");
                }
                request.getRequestDispatcher("ActualizarConductor.jsp").forward(request, response);
                break;

            case 3: // Eliminar registro

                if (UsuDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El Conductor se Elimino Correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El Conductor no se pudo Eliminar!");
                }
                request.getRequestDispatcher("ConsultarConductor.jsp").forward(request, response);
                break;

            case 4: // Consultar por N°Identificacion

                UsuVO = UsuDAO.consultarNIdentificacion(NIdentificacion);
                if (UsuVO != null) {

                    request.setAttribute("conductorConsultado", UsuVO);
                    request.getRequestDispatcher("ActualizarConductor.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El Conductor no Existe!");
                    request.getRequestDispatcher("ConsultarConductor.jsp").forward(request, response);
                }
                break;

            case 5: // Iniciar sesion

                UsuVO = UsuDAO.iniciarSesion(Usuario, Password);

                if (UsuVO != null) {

                    HttpSession miSesion = request.getSession(true);
                    String id = UsuVO.getId();
                    String nombreUsuario = UsuVO.getNombre();
                    String apellidoUsuario = UsuVO.getApellido();
                    String correoPerfil = UsuVO.getCorreo();

                    UsuVO = new UsuarioVO(id, nombreUsuario, apellidoUsuario, Direccion, Correo, Telefono, NIdentificacion, Usuario, Password);
                    miSesion.setAttribute("datosUsuario", UsuVO);
                    request.getRequestDispatcher("Menu.jsp").forward(request, response);

                } else {

                    request.setAttribute("mensajeErrorLogin", "El Usuario o la Contraseña son Invalidos!");
                    request.getRequestDispatcher("IniciarSesion.jsp").forward(request, response);

                }
                break;

            case 6: //Actualizar Contraseña
                UsuVO = UsuDAO.NuevaContraseña(Password);

                if (UsuVO != null) {
                    if (Password1.equals(PasswordNueva)) {
                        String usuario = UsuVO.getUsuario();
                        UsuarioVO usuVO = new UsuarioVO(usuario, PasswordNueva);
                        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
                        usuDAO.actualizarContraseña();

                        request.setAttribute("mensajeExito", "La contraseña se ha actualizado correctamente!");
                        request.getRequestDispatcher("CambiarContraseña.jsp").forward(request, response);
                    } else {
                        request.setAttribute("mensajeError", "Las contraseñas no coinciden!");
                        request.getRequestDispatcher("CambiarContraseña.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute("mensajeError", "La contraseña actual es incorrecta!");
                    request.getRequestDispatcher("CambiarContraseña.jsp").forward(request, response);
                }
                break;
            case 7: // Olvidar Contraseña

                UsuVO = UsuDAO.consultarCorreo(Correo);
                if (UsuVO != null) {

                    String usuario1 = UsuVO.getUsuario();
                    String PasswordGenerada = UsuDAO.GenerarContraseña();
                    String Destino = UsuVO.getCorreo();
                    String Asunto = "Recuperación de Contraseña";
                    String Mensaje = "Esta es tu Contraseña provisional: \n\n Contraseña:  " + PasswordGenerada + "\n\n Recuerda Cambiarla Cuando Ingreses al Sistema \n\n\n Muchas Gracias  \n\n\n Atentamente Ganatrans";

                    UsuarioVO usuVO = new UsuarioVO(Asunto, Destino, Mensaje);
                    UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
                    usuDAO.EnviarCorreo();

                    UsuarioVO usuVOf = new UsuarioVO(usuario1, PasswordGenerada);
                    UsuarioDAO usuDAOf = new UsuarioDAO(usuVOf);
                    usuDAOf.actualizarContraseña();

                    request.setAttribute("mensajeExito", "Hemos enviado una contraseña a tu correo");
                    request.getRequestDispatcher("OlvidarContraseña.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El Correo no esta registrado!");
                    request.getRequestDispatcher("OlvidarContraseña.jsp").forward(request, response);
                }
                break;

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
