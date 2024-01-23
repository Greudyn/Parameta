package com.parameta.prueba.decorator;

import com.parameta.prueba.dto.EmpleadoResponseDTO;

import java.time.LocalDate;
import java.time.Period;

public class TiempoVinculacionDecorator implements EmpleadoDecorator {
    @Override
    public EmpleadoResponseDTO decorar(EmpleadoResponseDTO empleadoResponseDTO) {
        LocalDate fechaVinculacion = LocalDate.parse(empleadoResponseDTO.getTiempoVinculacion());
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaVinculacion, fechaActual);
        String tiempoVinculacion = String.format("%d años, %d meses y %d días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());

        empleadoResponseDTO.setTiempoVinculacion(tiempoVinculacion);

        return empleadoResponseDTO;
    }
}
