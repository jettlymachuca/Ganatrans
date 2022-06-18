/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CarreraVO;
import ModeloVO.GastosVO;
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
 * @author Sena
 */
public class GastosDAO extends Conexion implements Crud {

    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql, gastoTotal;

    private String Id = "", IdVehiculo = "", IdCategoria = "", Fecha = "", Valor = "";

    // 2. Metodo principal para recibir los datos del VO
    public GastosDAO(GastosVO GasVO) {
        super();

        // 3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. Traer al DAO los datos del VO para hacer las operaciones.
            Id = GasVO.getId();
            IdVehiculo = GasVO.getIdVehiculo();
            IdCategoria = GasVO.getIdCategoria();
            Fecha = GasVO.getFecha();
            Valor = GasVO.getValor();

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    //Constructor vacio
    public GastosDAO() {
    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into gastos values (?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdVehiculo);
            puente.setString(3, IdCategoria);
            puente.setString(4, Fecha);
            puente.setString(5, Valor);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update gastos set IdVehiculo=?, IdCategoria=?, Valor=? where Fecha=?; ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdVehiculo);
            puente.setString(2, IdCategoria);
            puente.setString(4, Valor);
            puente.setString(5, Fecha);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {

        try {

            sql = "delete from 'gastos' where 'gastos'.'Id'=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdVehiculo);
            puente.setString(3, IdCategoria);
            puente.setString(4, Fecha);
            puente.setString(5, Valor);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public ArrayList<GastosVO> listar() {

        ArrayList<GastosVO> listaGastos = new ArrayList<>();
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/ganatrans", "root", "");
            conexion = this.obtenerConexion();
            sql = "select * from gastos;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                GastosVO GasVO = new GastosVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));

                listaGastos.add(GasVO);

            }

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaGastos;

    }

    public String gastosTotales(String IdVehiculo) {

        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/ganatrans", "root", "");
            conexion = this.obtenerConexion();
            sql = "SELECT SUM(Valor) FROM gastos WHERE IdVehiculo=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdVehiculo);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                gastoTotal = mensajero.getString(1);

            }

        } catch (Exception e) {
            Logger.getLogger(GastosDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return gastoTotal;

    }
}
