package com.citas.java;

import java.time.LocalDate;
import java.time.LocalTime;

import com.citas.java.entidades.CitaEnfermero;
import com.citas.java.entidades.CitaMedico;
import com.citas.java.entidades.Consultorio;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.Estado;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        Medico m = new Medico(3, 
        "Yeison", 
        "Diaz", 
        TipoDocumento.TI, 
        1012918054L, 
        455656L, 
        Especialidad.PEDIATRIA);

        m.setNombres("Camilo");
        System.out.println(m.toString());

        Paciente p = new Paciente(4, 
                                "Carlos", 
                                "Valencia", 
                                TipoDocumento.TI, 
                                1023373774L,
                                "cav4956@gmail.com",
                                3001214662L, 
                                LocalDate.of(2006, 10, 28), 
                                1.66, 
                                50.5, 
                                TipoSangre.O, 
                                '+');

        System.out.println(p.toString());

        Consultorio c = new Consultorio(5, 
                                        "Cra69p #77-74", 
                                        3216446449L);

        Enfermero e = new Enfermero(2, "Laura", "Valencia", TipoDocumento.TI, 39898892L);

        CitaMedico a = new CitaMedico(LocalDate.of(2024, 4, 15), LocalTime.of(3, 20), "Revisión General", p, m, Estado.Agendada);
        System.out.println(a.toString());

        CitaEnfermero b = new CitaEnfermero(LocalDate.of(2024, 4, 15), LocalTime.of(3, 27), "Revisión", p, e, Estado.Cancelada);
        System.out.println(b.toString());
    }
}   