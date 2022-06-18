/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function validarVehiculo() {

    var placa = document.formVehiculo.txtPlaca.value;
    var color = document.formVehiculo.txtColor.value;
    var modelo = document.formVehiculo.txtModelo.value;
    var seguroFecha = document.formVehiculo.txtSeguro_Fecha_Vencimiento.value;
    var errorPlaca = document.getElementById("errorPlaca");
    var errorColor = document.getElementById("errorColor");
    var errorModelo = document.getElementById("errorModelo");
    var errorFechaSeguro = document.getElementById("errorFechaSeguro");

    if (placa === "") {

        errorPlaca.textContent = "Este campo es obligatorio!";
        return false;

    } else if (placa.length > 6) {

        errorPlaca.textContent = "Este campo solo puede tener 6 caracteres!";
        return false;

    } else if (color === "") {

        errorColor.textContent = "Este campo es obligatorio!";
        return false;

    } else if (color.length > 20) {

        errorColor.textContent = "Este campo tiene demasiados caracteres!";
        return false;

    } else if (modelo === "") {

        errorModelo.textContent = "Este campo es obligatorio!";
        return false;

    } else if (modelo.length > 4) {

        errorModelo.textContent = "Este campo solo puede tener 4 caracteres!";
        return false;

    } else if (seguroFecha = "") {

        errorFechaSeguro.textContent = "Este campo debe ser obligatorio!";
        return false;

    }
}
