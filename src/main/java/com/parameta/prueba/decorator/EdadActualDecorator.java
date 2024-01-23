package com.parameta.prueba.decorator;

import com.parameta.prueba.dto.EmpleadoResponseDTO;

import java.time.LocalDate;
import java.time.Period;

public class EdadActualDecorator implements EmpleadoDecorator {
    @Override
    public EmpleadoResponseDTO decorar(EmpleadoResponseDTO empleadoResponseDTO) {
        LocalDate fechaNacimiento = LocalDate.parse(empleadoResponseDTO.getTiempoVinculacion());
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        String edadActual = String.format("%d años, %d meses y %d días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());

        empleadoResponseDTO.setEdadActual(edadActual);

        return empleadoResponseDTO;
    }
}
