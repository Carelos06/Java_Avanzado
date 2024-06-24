package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Paciente extends Persona {
    public String correoElectronico;
    public Long celular;
    public LocalDate fechaNacimiento;
    public Double altura;
    public Double peso;
    public TipoSangre TipoSangre; 
    public char factorRH;
    
    public Paciente(Integer id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            String correoElectronico, Long celular, LocalDate fechaNacimiento, Double altura, Double peso,
            com.citas.java.enumeraciones.TipoSangre tipoSangre, char factorRH) {
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        TipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        TipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String toString() {
        return "Paciente [correoElectronico=" + correoElectronico + ", altura=" + altura + ", peso=" + peso
                + ", TipoSangre=" + TipoSangre + ", factorRH=" + factorRH + ", getNombres()=" + getNombres()
                + ", getApellidos()=" + getApellidos() + "]";
    }
    
   

    

    
    

    


}
