/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author HP PRO
 */
public class UsuarioVO {

    // Declarar variables
    private String Id, Nombre, Apellido, Direccion, Correo, Telefono, NIdentificacion, Usuario, Password, Asunto ,Destino, Mensaje;

    // Crear constructor vacio
    public UsuarioVO() {
    }

    // Crear constructor con las variables
    public UsuarioVO(String Id, String Nombre, String Apellido, String Direccion, String Correo, String Telefono, String NIdentificacion, String Usuario, String Password) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.NIdentificacion = NIdentificacion;
        this.Usuario = Usuario;
        this.Password = Password;
    }
    
    //Constructor Para cambio de contraseña dentro del sistema

    public UsuarioVO(String Password) {
        this.Password = Password;
    }

    // Constructor para Cambio de contraseña
    public UsuarioVO(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;
    }

    public UsuarioVO(String Asunto, String Destino, String Mensaje) {
        this.Asunto = Asunto;
        this.Destino = Destino;
        this.Mensaje = Mensaje;
    }
    
    // Crear get and Set

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNIdentificacion() {
        return NIdentificacion;
    }

    public void setNIdentificacion(String NIdentificacion) {
        this.NIdentificacion = NIdentificacion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

}
