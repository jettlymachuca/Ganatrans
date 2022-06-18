/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class CarreraVO {
    
    // Declarar variables
    private String Id, IdVehiculo, IdUsuario, Valor, Direccion, Hora_Inicio, Hora_Final, Fecha;

        // Crear constructor vacio

    public CarreraVO() {
    }

        // Crear constructor con las variables

    public CarreraVO(String Id, String IdVehiculo, String IdUsuario, String Valor, String Direccion, String Hora_Inicio, String Hora_Final, String Fecha) {
        this.Id = Id;
        this.IdVehiculo = IdVehiculo;
        this.IdUsuario = IdUsuario;
        this.Valor = Valor;
        this.Direccion = Direccion;
        this.Hora_Inicio = Hora_Inicio;
        this.Hora_Final = Hora_Final;
        this.Fecha = Fecha;
    }

            // Crear get and Set

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdVehiculo() {
        return IdVehiculo;
    }

    public void setIdVehiculo(String IdVehiculo) {
        this.IdVehiculo = IdVehiculo;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(String Hora_Inicio) {
        this.Hora_Inicio = Hora_Inicio;
    }

    public String getHora_Final() {
        return Hora_Final;
    }

    public void setHora_Final(String Hora_Final) {
        this.Hora_Final = Hora_Final;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
}
