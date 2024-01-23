package com.parameta.prueba.dto;

public class EmpleadoResponseDTO {
    private String nombres;
    private String apellidos;
    private String cargo;
    private Double salario;
    private String tiempoVinculacion;
    private String edadActual;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTiempoVinculacion() {
        return tiempoVinculacion;
    }

    public void setTiempoVinculacion(String tiempoVinculacion) {
        this.tiempoVinculacion = tiempoVinculacion;
    }

    public String getEdadActual() {
        return edadActual;
    }

    public void setEdadActual(String edadActual) {
        this.edadActual = edadActual;
    }
}
