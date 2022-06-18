/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.UsuarioDAO;
import ModeloDAO.VehiculoDAO;
import ModeloVO.UsuarioVO;
import ModeloVO.VehiculoVO;
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
@WebServlet(name = "VehiculoControlador", urlPatterns = {"/Vehiculo"})
public class VehiculoControlador extends HttpServlet {

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
        String Placa = request.getParameter("txtPlaca");
        String Color = request.getParameter("txtColor");
        String Modelo = request.getParameter("txtModelo");
        String Seguro_Fecha_Vencimiento = request.getParameter("txtSeguro_Fecha_Vencimiento");

        VehiculoVO VehVO = new VehiculoVO(Id, Placa, Color, Modelo, Seguro_Fecha_Vencimiento);
        VehiculoDAO VehDAO = new VehiculoDAO(VehVO);

        switch (opcion) {

            case 1: // Agregar registro

                if (VehDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "El Vehiculo se registro correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El Vehiculo no se pudo registrar!");
                }
                request.getRequestDispatcher("RegistrarVehiculo.jsp").forward(request, response);
                break;

            case 2: // Actualizar registro

                if (VehDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "El Vehiculo se actualizo correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El Vehiculo no se pudo actualizar!");
                }
                request.getRequestDispatcher("ActualizarVehiculo.jsp").forward(request, response);
                break;

            case 3: // Eliminar registro

                if (VehDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "El Vehiculo se Elimino Correctamente!");

                } else {

                    request.setAttribute("mensajeError", "El Vehiculo no se pudo Eliminar!");
                }
                request.getRequestDispatcher("ConsultarVehiculo.jsp").forward(request, response);
                break;
                
            case 4: // Consultar por Placa

                VehVO = VehDAO.consultarPlaca(Placa);
                if (VehVO != null) {

                    request.setAttribute("vehiculoConsultado", VehVO);
                    request.getRequestDispatcher("ActualizarVehiculo.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "El vehiculo no existe!");
                    request.getRequestDispatcher("ConsultarVehiculo.jsp").forward(request, response);
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
