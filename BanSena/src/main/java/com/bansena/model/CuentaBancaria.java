package com.bansena.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
    private String numero;
    private double saldo;
    private String divisa;
    private List<CuotaManejo> cuotasManejo;

    public CuentaBancaria(String numero, double saldo, String divisa) {
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
        this.cuotasManejo = new ArrayList<>();
    }

    // Getters y setters

    public void agregarCuotaManejo(CuotaManejo cuota) {
        cuotasManejo.add(cuota);
    }
}
