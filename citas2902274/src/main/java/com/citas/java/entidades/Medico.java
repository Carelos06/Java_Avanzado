package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

public class Medico extends Persona{
    private Long registroMedico;
    private Especialidad especialidad;
    
    public Medico(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Medico [especialidad=" + especialidad + ", getNombres()=" + getNombres() + ", getApellidos()="
                + getApellidos() + "]";
    }
    
    
    
    
}
