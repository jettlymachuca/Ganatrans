/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CarreraVO;
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
public class CarreraDAO extends Conexion implements Crud {

    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String Id = "", IdVehiculo = "", IdUsuario = "", Valor = "", Direccion = "", Hora_Inicio = "", Hora_Final = "", Fecha = "";

    // 2. Metodo principal para recibir los datos del VO
    public CarreraDAO(CarreraVO CarrVO) {
        super();

        // 3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. Traer al DAO los datos del VO para hacer las operaciones.
            Id = CarrVO.getId();
            IdVehiculo = CarrVO.getIdVehiculo();
            IdUsuario = CarrVO.getIdUsuario();
            Valor = CarrVO.getValor();
            Direccion = CarrVO.getDireccion();
            Hora_Inicio = CarrVO.getHora_Inicio();
            Hora_Final = CarrVO.getHora_Final();
            Fecha = CarrVO.getFecha();

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    //Constructor vacio
    public CarreraDAO() {
    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into carrera values (?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdVehiculo);
            puente.setString(3, IdUsuario);
            puente.setString(4, Valor);
            puente.setString(5, Direccion);
            puente.setString(6, Hora_Inicio);
            puente.setString(7, Hora_Final);
            puente.setString(8, Fecha);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update carrera set IdVehiculo=? , IdUsuario=? , Valor=? , Direccion=? , Hora_Inicio=? , Hora_Final=?, Fecha=?  where Id=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, IdVehiculo);
            puente.setString(2, IdUsuario);
            puente.setString(3, Valor);
            puente.setString(4, Direccion);
            puente.setString(5, Hora_Inicio);
            puente.setString(6, Hora_Final);
            puente.setString(7, Fecha);
            puente.setString(8, Id);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {

        try {

            sql = "delete from 'carrera' where 'carrera'.'Id'=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, IdVehiculo);
            puente.setString(3, IdUsuario);
            puente.setString(4, Valor);
            puente.setString(5, Direccion);
            puente.setString(6, Hora_Inicio);
            puente.setString(7, Hora_Final);
            puente.setString(8, Fecha);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public ArrayList<CarreraVO> listar() {

        ArrayList<CarreraVO> listaCarreras = new ArrayList<>();
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/ganatrans", "root", "");
            conexion = this.obtenerConexion();
            sql = "select * from carrera";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                CarreraVO CarrVO = new CarreraVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));

                listaCarreras.add(CarrVO);

            }

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaCarreras;

    }
    
    public ArrayList<CarreraVO> listarCarreras() {

        ArrayList<CarreraVO> listarCarreras = new ArrayList<>();
        try {

            conexion = DriverManager.getConnection("jdbc:mysql://localhost:33065/ganatrans", "root", "");
            conexion = this.obtenerConexion();
            sql = "select * from carrera where Id=?;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                CarreraVO CarrVO = new CarreraVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8));

                listarCarreras.add(CarrVO);

            }

        } catch (Exception e) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarCarreras;

    }
}
