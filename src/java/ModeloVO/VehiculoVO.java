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
public class VehiculoVO {
    
    // Declarar variables
    private String Id, Placa, Color, Modelo, Seguro_Fecha_Vencimiento;

    // Crear constructor vacio

    public VehiculoVO() {
    }
    
    // Crear constructor con las variables

    public VehiculoVO(String Id, String Placa, String Color, String Modelo, String Seguro_Fecha_Vencimiento) {
        this.Id = Id;
        this.Placa = Placa;
        this.Color = Color;
        this.Modelo = Modelo;
        this.Seguro_Fecha_Vencimiento = Seguro_Fecha_Vencimiento;
    }
    
            // Crear get and Set

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSeguro_Fecha_Vencimiento() {
        return Seguro_Fecha_Vencimiento;
    }

    public void setSeguro_Fecha_Vencimiento(String Seguro_Fecha_Vencimiento) {
        this.Seguro_Fecha_Vencimiento = Seguro_Fecha_Vencimiento;
    }


    
}
