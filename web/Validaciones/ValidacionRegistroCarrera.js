/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validarCarrera() {

    var IdVehiculo = document.formCarrera.txtIdVehiculo.value;
    var IdUsuario = document.formCarrera.txtIdUsuario.value;
    var valor = document.formCarrera.txtValor.value;
    var Direccion = document.formCarrera.txtDireccion.value;
    var horaInicio = document.formCarrera.txtHora_Inicio.value;
    var horaFin = document.formCarrera.txtHora_Fin.value;
    var fecha = document.formCarrera.txtFecha.value;
    var errorIdVehiculo = document.getElementById("errorIdVehiculo");
    var errorIdUsuario = document.getElementById("errorIdUsuario");
    var errorValor = document.getElementById("errorValor");
    var errorDireccion = document.getElementById("errorDireccion");
    var errorHoraInicio = document.getElementById("errorHoraInicio");
    var errorHoraFin = document.getElementById("errorHoraFin");
    var errorFecha = document.getElementById("errorFecha");


    if (IdVehiculo === "") {

        errorIdVehiculo.textContent = "Este campo es obligatorio!";
        return false;

    }else if (IdUsuario === "") {

        errorIdUsuario.textContent = "Este campo es obligatorio!";
        return false;

    }else if (valor === "") {

        errorValor.textContent = "Este campo es obligatorio!";
        return false;

    }else if (Direccion = "") {

        errorDireccion.textContent = "Este campo debe ser obligatorio!";
        return false;

    }else if (Direccion.length > 255) {

        errorDireccion.textContent = "Este campo tiene demasiados caracteres!";
        return false;

    }else if (horaInicio = "") {

        errorHoraInicio.textContent = "Este campo debe ser obligatorio!";
        return false;

    }else if (horaFin = "") {

        errorHoraFin.textContent = "Este campo debe ser obligatorio!";
        return false;

    }else if (fecha = "") {

        errorFecha.textContent = "Este campo debe ser obligatorio!";
        return false;

    }
}
