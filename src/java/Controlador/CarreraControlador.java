/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.CarreraDAO;
import ModeloVO.CarreraVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sena
 */
@WebServlet(name = "CarreraControlador", urlPatterns = {"/Carrera"})
public class CarreraControlador extends HttpServlet {

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
        String IdVehiculo = request.getParameter("txtIdVehiculo");
        String IdUsuario = request.getParameter("txtIdUsuario");
        String Valor = request.getParameter("txtValor");
        String Direccion = request.getParameter("txtDireccion");
        String Hora_Inicio = request.getParameter("txtHora_Inicio");
        String Hora_Final = request.getParameter("txtHora_Final");
        String Fecha = request.getParameter("txtFecha");

        CarreraVO CarrVO = new CarreraVO(Id, IdVehiculo, IdUsuario, Valor, Direccion, Hora_Inicio, Hora_Final, Fecha);
        CarreraDAO CarrDAO = new CarreraDAO(CarrVO);

        switch (opcion) {

            case 1: // Agregar registro

                if (CarrDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "La Carrera se Registro Correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La Carrera no se Pudo Registrar!");
                }
                request.getRequestDispatcher("RegistrarCarrera.jsp").forward(request, response);
                break;

            case 2: // Actualizar registro

                if (CarrDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "La Carrera se Actualizo Correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La Carrera no se Pudo Actulizar!");
                }
                request.getRequestDispatcher("ActualizarCarrera.jsp").forward(request, response);
                break;

            case 3: // Eliminar registro

                if (CarrDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "La Carrera se elimino correctamente!");

                } else {

                    request.setAttribute("mensajeError", "La Carrera no se pudo eliminar!");
                }
                request.getRequestDispatcher("ConsultarCarreras.jsp").forward(request, response);
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
