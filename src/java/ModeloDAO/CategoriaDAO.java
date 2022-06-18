/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CategoriaVO;
import ModeloVO.UsuarioVO;
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
public class CategoriaDAO extends Conexion{
    
    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    // Constructor vacio

    public CategoriaDAO() {
    }
    

    public CategoriaDAO(CategoriaVO CatVO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<CategoriaVO> listar() {

        ArrayList<CategoriaVO> ListaCategoria = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from categoria";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                CategoriaVO CatVO = new CategoriaVO(mensajero.getString(1), mensajero.getString(2));

                ListaCategoria.add(CatVO);

            }

        } catch (Exception e) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return ListaCategoria;

    }
    
    
}
