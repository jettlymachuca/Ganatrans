/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.GananciasDAO;
import ModeloVO.GananciasVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP PRO
 */
@WebServlet(name = "GananciasControlador", urlPatterns = {"/Ganancias"})
public class GananciasControlador extends HttpServlet {

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
        String IdUsuario = request.getParameter("txtIdUsuario");
        String IdVehiculo = request.getParameter("txtIdVehiculo");
        String IdGastos = request.getParameter("txtIdGastos");
        String Carrera = request.getParameter("txtCarrera");
        String Ganancias = request.getParameter("txtGanancias");

        GananciasVO GanVO = new GananciasVO(Id, IdUsuario, IdVehiculo, IdGastos, Carrera, Ganancias);
        GananciasDAO GanDAO = new GananciasDAO(GanVO);

        switch (opcion) {

            case 1: // Agregar registro

                if (GanDAO.agregarRegistro()) {

                    request.setAttribute("mensajeExito", "Las Ganancias se registraron correctamente!");

                } else {

                    request.setAttribute("mensajeError", "Las Ganancias no se pudieron registrar!");
                }
                request.getRequestDispatcher("RegistrarGanancias.jsp").forward(request, response);
                break;

            case 2: // Actualizar registro

                if (GanDAO.actualizarRegistro()) {

                    request.setAttribute("mensajeExito", "Las Ganancias se actualizaron correctamente!");

                } else {

                    request.setAttribute("mensajeError", "Las Ganancias no se pudieron actualizar!");
                }
                request.getRequestDispatcher("ActualizarGanancias.jsp").forward(request, response);
                break;

            case 3: // Eliminar registro

                if (GanDAO.eliminarRegistro()) {

                    request.setAttribute("mensajeExito", "Las Ganancias se eliminaron correctamente!");

                } else {

                    request.setAttribute("mensajeError", "Las Ganancias no se pudieron eliminar!");
                }
                request.getRequestDispatcher("ConsultarGanancias.jsp").forward(request, response);
                break;

            case 4: // Consultar por IdUsuario

                GanVO = GanDAO.consultarIdUsuario(IdUsuario);
                if (GanVO != null) {

                    request.setAttribute("Ganancias Consultadas", GanVO);
                    request.getRequestDispatcher("ActualizarGanancias.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "Las Ganancias no existen!");
                    request.getRequestDispatcher("ConsultarGanancias.jsp").forward(request, response);
                }
                break;

            case 5: //Calcular

                GanVO = GanDAO.GananciasTotales(IdUsuario);
                if (GanVO != null) {

                    request.setAttribute("mensajeExito", "Las Ganancias se Calcularon correctamente!");

                } else {

                    request.setAttribute("mensajeError", "Las Ganancias no se Pudieron Calcular!");

                }
                request.getRequestDispatcher("RegistrarGanancias.jsp").forward(request, response);
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
