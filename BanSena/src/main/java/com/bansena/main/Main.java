package com.bansena.main;

import com.bansena.model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un titular
        Titular titular = new Titular("Juan Perez", "123456");

        // Crear cuentas
        CuentaAhorros cuentaAhorros = new CuentaAhorros("001", 1000.0, "COP");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("002", 2000.0, "COP");

        // Agregar cuentas al titular
        titular.agregarCuenta(cuentaAhorros);
        titular.agregarCuenta(cuentaCorriente);

        // Crear cuotas de manejo
        CuotaManejo cuota1 = new CuotaManejo(10.0, new Date());
        CuotaManejo cuota2 = new CuotaManejo(15.0, new Date());

        // Agregar cuotas de manejo a las cuentas
        cuentaAhorros.agregarCuotaManejo(cuota1);
        cuentaCorriente.agregarCuotaManejo(cuota2);

        // Crear habilitantes
        Campaña campaña = new Campaña("Campaña Verano", new Date(), new Date());
        ReglaNegocio regla = new ReglaNegocio("Descuento por antigüedad", new Date());
        DecretoGubernamental decreto = new DecretoGubernamental("D001", 2024);

        // Calcular valores usando habilitantes
        double valorCampaña = campaña.calcularValor(cuentaAhorros);
        double valorRegla = regla.calcularValor(cuentaCorriente);
        double valorDecreto = decreto.calcularValor(cuentaCorriente);

        // Imprimir resultados
        System.out.println("Valor campaña: " + valorCampaña);
        System.out.println("Valor regla: " + valorRegla);
        System.out.println("Valor decreto: " + valorDecreto);
    }
}
