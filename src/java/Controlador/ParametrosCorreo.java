/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.PropiedadesCorreo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP PRO
 */
@WebServlet(name = "ParametrosCorreo", urlPatterns = {"/ParametrosCorreo"})
public class ParametrosCorreo extends HttpServlet {

    private String host;
    private String puerto;
    private String usuario;
    private String clave;

    public void init() {

        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        puerto = context.getInitParameter("puerto");
        usuario = context.getInitParameter("usuario");
        clave = context.getInitParameter("clave");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String destino = request.getParameter("destino");
        String asunto = request.getParameter("asunto");
        String contenido = request.getParameter("contenido");
        
        String resultadoEnvio = "";
        
        try {
            PropiedadesCorreo.eviarCorreo(host, puerto, usuario, clave, destino, asunto, contenido);
            resultadoEnvio = "El mensaje se envio correctamente";
        } catch (Exception e) {
            e.printStackTrace();
            resultadoEnvio = "Error al enviar el mensaje " + e.getMessage();
        }finally{
           request.setAttribute("resultado", resultadoEnvio);
           getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        }

    }
}
