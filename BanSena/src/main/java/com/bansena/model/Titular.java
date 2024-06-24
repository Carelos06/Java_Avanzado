package com.bansena.model;

import java.util.ArrayList;
import java.util.List;

public class Titular {
    private String nombre;
    private String numeroIdentificacion;
    private List<CuentaBancaria> cuentas;

    public Titular(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.cuentas = new ArrayList<>();
    }

    // Getters y setters

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }
}
