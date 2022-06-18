/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import ModeloVO.VehiculoVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class VehiculoDAO extends Conexion implements Crud {

    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String Id = "", Placa = "", Color = "", Modelo = "", Seguro_Fecha_Vencimiento = "";

    //Constructor vacio
    public VehiculoDAO() {
    }

    // 2. Metodo principal para recibir los datos del VO
    public VehiculoDAO(VehiculoVO VehVO) {
        super();

        // 3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. Traer al DAO los datos del VO para hacer las operaciones.
            Id = VehVO.getId();
            Placa = VehVO.getPlaca();
            Color = VehVO.getColor();
            Modelo = VehVO.getModelo();
            Seguro_Fecha_Vencimiento = VehVO.getSeguro_Fecha_Vencimiento();

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into vehiculo values (?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, Placa);
            puente.setString(3, Color);
            puente.setString(4, Modelo);
            puente.setString(5, Seguro_Fecha_Vencimiento);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update vehiculo set Color=? , Modelo=? , Seguro_Fecha_Vencimiento=? where Placa=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Color);
            puente.setString(2, Modelo);
            puente.setString(3, Seguro_Fecha_Vencimiento);
            puente.setString(4, Placa);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {

        try {

            sql = "delete from vehiculo where Id=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, Placa);
            puente.setString(3, Color);
            puente.setString(4, Modelo);
            puente.setString(5, Seguro_Fecha_Vencimiento);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public VehiculoVO consultarPlaca(String placa) {

        VehiculoVO vehVo = null;
        try {

            conexion = this.obtenerConexion();
            sql = "select * from vehiculo where Placa=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, placa);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                vehVo = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));
                operacion = true;

            }

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return vehVo;
    }

    public ArrayList<VehiculoVO> listar() {

        ArrayList<VehiculoVO> ListaVehiculos = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from vehiculo";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                VehiculoVO vehVO = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

                ListaVehiculos.add(vehVO);

            }

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return ListaVehiculos;

    }
    
    public ArrayList<VehiculoVO> listarVehiculos() {

        ArrayList<VehiculoVO> listarVehiculos = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from vehiculo where Id=?;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                VehiculoVO vehVO = new VehiculoVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

                listarVehiculos.add(vehVO);

            }

        } catch (Exception e) {
            Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(VehiculoDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarVehiculos;

    }

}
