package com.parameta.prueba.decorator;

import com.parameta.prueba.dto.EmpleadoResponseDTO;

import java.util.Date;

public interface EmpleadoDecorator {
    EmpleadoResponseDTO decorar(EmpleadoResponseDTO empleadoResponseDTO);
}

