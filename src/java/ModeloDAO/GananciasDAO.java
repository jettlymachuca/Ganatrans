/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.GananciasVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP PRO
 */
public class GananciasDAO extends Conexion implements Crud {

    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql, gananciasTotales;

    private String Id = "", IdUsuario = "", IdVehiculo = "", IdGastos = "", Carrera = "", Ganancias = "";

    //Constructor vacio
    public GananciasDAO() {
    }

    // 2. Metodo principal para recibir los datos del VO
    public GananciasDAO(GananciasVO GanVO) {
        super();

        // 3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. Traer al DAO los datos del VO para hacer las operaciones.
            Id = GanVO.getId();
            IdUsuario = GanVO.getIdUsuario();
            IdVehiculo = GanVO.getIdVehiculo();
            IdGastos = GanVO.getIdGastos();
            Carrera = GanVO.getCarrera();
            Ganancias = GanVO.getGanancias();

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into ganancias values (?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdUsuario);
            puente.setString(3, IdVehiculo);
            puente.setString(4, IdGastos);
            puente.setString(5, Carrera);
            puente.setString(6, Ganancias);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update ganancias set IdVehiculo=? , IdGastos=? , Carrera=?, Ganancias=? , where IdConductor=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdVehiculo);
            puente.setString(2, IdGastos);
            puente.setString(3, Carrera);
            puente.setString(4, Ganancias);
            puente.setString(5, IdUsuario);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {

        try {

            sql = "delete from ganancias where Id=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdUsuario);
            puente.setString(3, IdVehiculo);
            puente.setString(4, IdGastos);
            puente.setString(5, Carrera);
            puente.setString(6, Ganancias);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public GananciasVO consultarIdUsuario(String IdUsuario) {

        GananciasVO GanVO = null;
        try {

            conexion = this.obtenerConexion();
            sql = "select * from ganancias where IdUsuario=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdUsuario);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                GanVO = new GananciasVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                operacion = true;

            }

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return GanVO;
    }

    public ArrayList<GananciasVO> listar() {

        ArrayList<GananciasVO> ListaGanancias = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from ganancias";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                GananciasVO GanVO = new GananciasVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));

                ListaGanancias.add(GanVO);

            }

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return ListaGanancias;

    }

    public GananciasVO consultarGastosVehiculo(String GastosVehiculo) {

        GananciasVO GanVO = null;
        try {

            conexion = this.obtenerConexion();
            sql = "select IdGastos from ganancias where IdVehiculo=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdVehiculo);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                GanVO = new GananciasVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                operacion = true;

            }

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return GanVO;
    }

    public String gananciasTotales(String IdUsuario) {

        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/ganatrans", "root", "");
            conexion = this.obtenerConexion();
            sql = "select gastos.Valor as 'Gastos', Carrera as 'Ganancias', Carrera-gastos.Valor as 'Total' from Ganancias JOIN gastos ON Ganancias.IdGastos=gastos.Id WHERE IdUsuario=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdUsuario);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                gananciasTotales = mensajero.getString(1);

            }

        } catch (Exception e) {
            Logger.getLogger(GananciasDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return gananciasTotales;

    }

}
