<%-- 
    Document   : ResportesPDF
    Created on : 12/06/2022, 01:46:11 AM
    Author     : HP PRO
--%>

<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="Util.Conexion"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ganatrans</title>
    </head>
    <body>

        <%
            String nombreReporte = request.getParameter("nombre");
            
            File reporte = new File(application.getRealPath(nombreReporte));
            Map<String, Object> Parametros = new HashMap<String, Object>();
            
            Conexion conexionbd = new Conexion();
            Connection conexion = conexionbd.obtenerConexion();
            byte[] reportebytes = JasperRunManager.runReportToPdf(reporte.getPath(), Parametros, conexion);
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "filename=\"Reporte.pdf\";");
            response.setContentLength(reportebytes.length);
            ServletOutputStream salida = response.getOutputStream();
            salida.write(reportebytes,0 , reportebytes.length);
            salida.flush();
            salida.close();
        %>

    </body>
</html>
