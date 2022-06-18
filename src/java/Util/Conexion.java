/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP PRO
 */
public class Conexion {

    // 1. Declarar variables y objetos.
    private String driver, user, password, dataBase, urlBd;
    private Connection conexion;

    // 2. Asignar Valores
    public Conexion() {

        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        dataBase = "ganatrans";
        urlBd = "jdbc:mysql://localhost:33065/" + dataBase;

        // 3. Conectarse
        try {
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(urlBd, user, password);
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Conexion Fallida" + e.toString());
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }

    public Connection cerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }

    public static void main(String[] args) {
        new Conexion();
    }

}
