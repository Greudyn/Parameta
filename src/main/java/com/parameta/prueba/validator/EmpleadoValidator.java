package com.parameta.prueba.validator;

import com.parameta.prueba.entity.Empleado;
import com.parameta.prueba.exception.ValidationException;
import com.parameta.prueba.util.Constant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class EmpleadoValidator {

    public void validar(Empleado empleado) throws ValidationException {
        validarCamposNoVacios(empleado);
        validarFormatoFecha(String.valueOf(empleado.getFechaNacimiento()), Constant.FECHA_DE_NACIMIENTO);
        validarFormatoFecha(String.valueOf(empleado.getFechaVinculacion()), Constant.FECHA_DE_VINCULACION);
    }

    private void validarCamposNoVacios(Empleado empleado) throws ValidationException {
        if (esCampoVacio(empleado.getNombres())) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_NOMBRES_VACIO);
        }
        if (esCampoVacio(empleado.getApellidos())) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_APELLIDOS_VACIO);
        }
        if (esCampoVacio(empleado.getTipoDocumento())) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_TIPO_DE_DOCUMENTO_VACIO);
        }
        if (esCampoVacio(empleado.getNumeroDocumento())) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_NUMERO_DE_DOCUMENTOS_VACIO);
        }
        if (esCampoVacio(empleado.getCargo())) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_CARGO_VACIO);
        }

        if (esCampoVacio(String.valueOf(empleado.getSalario()))) {
            throw new ValidationException(Constant.MENSAJE_CAMPO_SALARIO_VACIO);
        }

    }

    private void validarFormatoFecha(String fecha, String nombreCampo) throws ValidationException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constant.FORMATO_FECHA);
            LocalDate.parse(fecha, formatter);
        } catch (Exception e) {
            throw new ValidationException(String.format(Constant.MENSAJE_FORMATO_FECHA_INCORRECTO, nombreCampo));
        }
    }

    private boolean esCampoVacio(String campo) {
        return campo == null || campo.trim().isEmpty();
    }
}
