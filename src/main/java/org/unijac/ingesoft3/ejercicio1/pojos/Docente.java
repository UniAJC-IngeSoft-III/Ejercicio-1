package org.unijac.ingesoft3.ejercicio1.pojos;

import org.joda.time.LocalDate;

import java.io.Serializable;

/**
 * Created by alexhd on 14/08/14.
 */
public class Docente extends Persona implements Serializable{
    private NivelFormacion nivelFormacion;

    public Docente(Integer identificacion, String nombres, String apellidos, LocalDate nacimiento, NivelFormacion nivelFormacion) {
        super(identificacion, nombres, apellidos, nacimiento);
        this.nivelFormacion = nivelFormacion;
    }

    public Docente() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Docente{");
        sb.append("identificacion=").append(identificacion);
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", nacimiento=").append(nacimiento);
        sb.append(", edad=").append(getEdad());
        sb.append(", nivelFormacion=").append(nivelFormacion);
        sb.append('}');
        return sb.toString();
    }

    public NivelFormacion getNivelFormacion() {
        return nivelFormacion;
    }

    public void setNivelFormacion(NivelFormacion nivelFormacion) {
        this.nivelFormacion = nivelFormacion;
    }

    public enum NivelFormacion {
        pregrado(1), especialización(2),
        magister(3), doctor(4);

        private int code;

        private NivelFormacion(int code) {
            this.code = code;
        }

        public int getCode(){
            return this.code;
        }

        @Override public String toString(){
            String s = super.toString();
            return s.substring(0, 1) + s.substring(1).toLowerCase();
        }
    }
}
