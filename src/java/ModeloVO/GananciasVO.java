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
public class GananciasVO {
    
    // Declarar variables
    private String Id, IdUsuario, IdVehiculo, IdGastos, Carrera, Ganancias;

    // Crear constructor vacio
    public GananciasVO() {
    }
    
        // Crear constructor con las variables

    public GananciasVO(String Id, String IdUsuario, String IdVehiculo, String IdGastos, String Carrera, String Ganancias) {
        this.Id = Id;
        this.IdUsuario = IdUsuario;
        this.IdVehiculo = IdVehiculo;
        this.IdGastos = IdGastos;
        this.Carrera = Carrera;
        this.Ganancias = Ganancias;
    }
    
            // Crear get and Set

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getIdVehiculo() {
        return IdVehiculo;
    }

    public void setIdVehiculo(String IdVehiculo) {
        this.IdVehiculo = IdVehiculo;
    }

    public String getIdGastos() {
        return IdGastos;
    }

    public void setIdGastos(String IdGastos) {
        this.IdGastos = IdGastos;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getGanancias() {
        return Ganancias;
    }

    public void setGanancias(String Ganancias) {
        this.Ganancias = Ganancias;
    }

    
    

}
