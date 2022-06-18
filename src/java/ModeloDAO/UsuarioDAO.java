/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP PRO
 */
public class UsuarioDAO extends Conexion implements Crud {

    // 1. Declarar variables y objetos
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String Id = "", Nombre = "", Apellido = "", Direccion = "", Correo = "", Telefono = "", NIdentificacion = "", Usuario = "", Password = "", Asunto = "", Destino = "", Mensaje = "";

    //Constructor vacio
    public UsuarioDAO() {
    }

    // 2. Metodo principal para recibir los datos del VO
    public UsuarioDAO(UsuarioVO UsuVO) {
        super();

        // 3. Conectarse a la base de datos
        try {

            conexion = this.obtenerConexion();
            // 4. Traer al DAO los datos del VO para hacer las operaciones.
            Id = UsuVO.getId();
            Nombre = UsuVO.getNombre();
            Apellido = UsuVO.getApellido();
            Direccion = UsuVO.getDireccion();
            Correo = UsuVO.getCorreo();
            Telefono = UsuVO.getTelefono();
            NIdentificacion = UsuVO.getNIdentificacion();
            Usuario = UsuVO.getUsuario();
            Password = UsuVO.getPassword();
            Asunto = UsuVO.getAsunto();
            Destino = UsuVO.getDestino();
            Mensaje = UsuVO.getMensaje();

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agregarRegistro() {

        try {

            sql = "insert into usuario values (?,?,?,?,?,?,?,?,?)";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, Nombre);
            puente.setString(3, Apellido);
            puente.setString(4, Direccion);
            puente.setString(5, Correo);
            puente.setString(6, Telefono);
            puente.setString(7, NIdentificacion);
            puente.setString(8, Usuario);
            puente.setString(9, Password);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {

        try {

            sql = "update usuario set Nombre=? , Apellido=? , Direccion=? , Correo=?, Telefono=? where NIdentificacion=? ";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Nombre);
            puente.setString(2, Apellido);
            puente.setString(3, Direccion);
            puente.setString(4, Correo);
            puente.setString(5, Telefono);
            puente.setString(6, NIdentificacion);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean eliminarRegistro() {

        try {

            sql = "delete from usuario where Id=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Id);
            puente.setString(2, Nombre);
            puente.setString(3, Apellido);
            puente.setString(4, Direccion);
            puente.setString(5, Correo);
            puente.setString(6, Telefono);
            puente.setString(7, NIdentificacion);
            puente.setString(8, Usuario);
            puente.setString(9, Password);
            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public UsuarioVO iniciarSesion(String Usuario, String Password) {
        UsuarioVO UsuVO = null;

        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario where Usuario=? and Password=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Usuario);
            puente.setString(2, Password);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {

                UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));

                operacion = true;
            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return UsuVO;

    }

    public UsuarioVO consultarNIdentificacion(String NIdentificacion) {

        UsuarioVO UsuVO = null;
        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario where NIdentificacion=?;";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, NIdentificacion);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                operacion = true;

            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return UsuVO;
    }

    public ArrayList<UsuarioVO> listar() {

        ArrayList<UsuarioVO> ListaConductores = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuarioVO UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));

                ListaConductores.add(UsuVO);

            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return ListaConductores;

    }
    
    public ArrayList<UsuarioVO> listarConductores() {

        ArrayList<UsuarioVO> listarConductores = new ArrayList<>();
        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario where Id=?;";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuarioVO UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));

                listarConductores.add(UsuVO);

            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarConductores;

    }

    public UsuarioVO consultarCorreo(String Correo) {

        UsuarioVO UsuVO = null;
        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario where Correo=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Correo);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {

                UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));
                operacion = true;

            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return UsuVO;
    }

    public String GenerarContraseña() {

        String[] Mayus = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] Minus = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] Numeros = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] CaracteresEsp = new String[]{"+", "-", "*", "/", "=", "%", "&", "#", "!", "?", "°", "|", ":", ";", ","};

        StringBuilder Caracteres = new StringBuilder();
        Caracteres.append(Mayus);
        Caracteres.append(Minus);
        Caracteres.append(Numeros);
        Caracteres.append(CaracteresEsp);

        StringBuilder Password = new StringBuilder();
        for (int i = 0; i <= 8; i++) {
            int Cantidad = Caracteres.length();
            int NumeroRandom = (int) (Math.random() * Cantidad);

            Password.append((Caracteres.toString()).charAt(NumeroRandom));
        }

        return Password.toString();
    }

    public boolean EnviarCorreo() {

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(propiedad);

        String CorreoEnvia = "gananciastrans@gmail.com";
        String Clave = "qdtktcohzxtvnzda";

        MimeMessage mensaje = new MimeMessage(sesion);
        try {

            mensaje.setFrom(new InternetAddress(CorreoEnvia));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(Destino));
            mensaje.setSubject(Asunto);
            mensaje.setText(Mensaje);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(CorreoEnvia, Clave);
            transporte.sendMessage(mensaje, mensaje.getRecipients(Message.RecipientType.TO));
            transporte.close();

            operacion = true;

        } catch (AddressException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } catch (MessagingException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return operacion;
    }

    public boolean actualizarContraseña() {

        try {

            sql = "update usuario set Password=? where Usuario=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Password);
            puente.setString(2, Usuario);

            puente.executeUpdate();
            operacion = true;

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    public UsuarioVO NuevaContraseña(String Password) {
        UsuarioVO UsuVO = null;

        try {

            conexion = this.obtenerConexion();
            sql = "select * from usuario where Password=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, Password);
            mensajero = puente.executeQuery();

            if (mensajero.next()) {

                UsuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6), mensajero.getString(7), mensajero.getString(8), mensajero.getString(9));

                operacion = true;
            }

        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {

            try {
                this.cerrarConexion();
            } catch (SQLException e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return UsuVO;

    }
}
