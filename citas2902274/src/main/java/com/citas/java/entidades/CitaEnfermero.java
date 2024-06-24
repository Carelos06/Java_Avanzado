package com.citas.java.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import com.citas.java.enumeraciones.Estado;

public class CitaEnfermero {
    private LocalDate fecha;
    private LocalTime hora;
    private String procedimientoRealizar;
    private Paciente paciente;
    private Enfermero enfermero;
    private Estado estado;

    public CitaEnfermero(LocalDate fecha, LocalTime hora, String procedimientoRealizar, Paciente paciente,
            Enfermero enfermero, Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.procedimientoRealizar = procedimientoRealizar;
        this.paciente = paciente;
        this.enfermero = enfermero;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaEnfermero [fecha=" + fecha + ", hora=" + hora + ", procedimientoRealizar=" + procedimientoRealizar
                + ", paciente=" + paciente + ", enfermero=" + enfermero + ", estado=" + estado + "]";
    }

    
}
