package com.bansena.model;

import java.util.Date;

public class ReglaNegocio implements Habilitante<CuentaBancaria> {
    private String descripcion;
    private Date fechaInicio;

    public ReglaNegocio(String descripcion, Date fechaInicio) {
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    @Override
    public double calcularValor(CuentaBancaria cuenta) {
        // Implementación del cálculo
        return 0;
    }
}
