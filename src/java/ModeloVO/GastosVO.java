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
public class GastosVO {
    
    // Declarar variables
    private String Id, IdVehiculo, IdCategoria, Fecha, Valor;

        // Crear constructor vacio

    public GastosVO() {
    }
    
            // Crear constructor con las variables

    public GastosVO(String Id, String IdVehiculo, String IdCategoria, String Fecha, String Valor) {
        this.Id = Id;
        this.IdVehiculo = IdVehiculo;
        this.IdCategoria = IdCategoria;
        this.Fecha = Fecha;
        this.Valor = Valor;
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

    public String getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(String IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    }
