package com.bansena.model;

public class DecretoGubernamental implements Habilitante<CuentaBancaria> {
    private String numero;
    private int año;

    public DecretoGubernamental(String numero, int año) {
        this.numero = numero;
        this.año = año;
    }

    @Override
    public double calcularValor(CuentaBancaria cuenta) {
        // Implementación del cálculo
        return 0;
    }
}
