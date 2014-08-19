package org.unijac.ingesoft3.ejercicio1.pojos;

/**
 * Created by alexhd on 14/08/14.
 */

import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.io.Serializable;

public class Persona implements Serializable {
    Integer identificacion;
    String nombres;
    String apellidos;
    LocalDate nacimiento;

    Persona(Integer identificacion, String nombres, String apellidos, LocalDate nacimiento) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
    }

    public Persona() {
        super();
    }

    public Integer getEdad(){
        if(nacimiento != null){
            Years years = Years.yearsBetween(nacimiento, new LocalDate());
            return years.getYears();
        }
        return null;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("identificacion=").append(identificacion);
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", nacimiento=").append(nacimiento);
        sb.append(", edad=").append(getEdad());
        sb.append('}');
        return sb.toString();
    }
}
