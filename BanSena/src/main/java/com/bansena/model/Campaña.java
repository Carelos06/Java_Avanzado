package com.bansena.model;

import java.util.Date;

public class Campaña implements Habilitante<CuentaBancaria> {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;

    public Campaña(String nombre, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public double calcularValor(CuentaBancaria cuenta) {
        // Implementación del cálculo
        return 0;
    }
}
