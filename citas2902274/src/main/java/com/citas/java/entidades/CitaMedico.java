package com.citas.java.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import com.citas.java.enumeraciones.Estado;

public class CitaMedico {
    private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private Paciente paciente;
    private Medico medico;
    private Estado estado;

    public CitaMedico(LocalDate fecha, LocalTime hora, String motivoConsulta, Paciente paciente, Medico medico,
            Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaMedico [fecha=" + fecha + ", hora=" + hora + ", motivoConsulta=" + motivoConsulta + ", paciente="
                + paciente + ", medico=" + medico + ", estado=" + estado + "]";
    }
    
    

}
