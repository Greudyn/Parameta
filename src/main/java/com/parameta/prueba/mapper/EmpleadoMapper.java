package com.parameta.prueba.mapper;

import com.parameta.prueba.dto.EmpleadoResponseDTO;
import com.parameta.prueba.entity.Empleado;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EmpleadoMapper {

    public Empleado mapToEmpleado(String nombres, String apellidos, String tipoDocumento,
                                  String numeroDocumento, Date fechaNacimiento, Date fechaVinculacion, String cargo, Double salario) {
        Empleado empleado = new Empleado();
        empleado.setNombres(nombres);
        empleado.setApellidos(apellidos);
        empleado.setTipoDocumento(tipoDocumento);
        empleado.setNumeroDocumento(numeroDocumento);
        empleado.setFechaNacimiento(fechaNacimiento);
        empleado.setFechaVinculacion(fechaVinculacion);
        empleado.setCargo(cargo);
        empleado.setSalario(salario);
        return empleado;
    }

    public EmpleadoResponseDTO mapToEmpleadoResponseDTO(Empleado empleado) {
        EmpleadoResponseDTO responseDTO = new EmpleadoResponseDTO();
        responseDTO.setNombres(empleado.getNombres());
        responseDTO.setApellidos(empleado.getApellidos());
        responseDTO.setEdadActual(String.valueOf(empleado.getFechaNacimiento()));
        responseDTO.setTiempoVinculacion(String.valueOf(empleado.getFechaVinculacion()));
        responseDTO.setCargo(empleado.getCargo());
        responseDTO.setSalario(empleado.getSalario());
        return responseDTO;
    }
}
