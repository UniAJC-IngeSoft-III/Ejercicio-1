package org.unijac.ingesoft3.ejercicio1.pojos;

import org.joda.time.LocalDate;

/**
 * Created by alexhd on 14/08/14.
 */
public class Cadete extends Persona {
    private Rango rango;

    public Cadete(Integer identificacion, String nombres, String apellidos, LocalDate nacimiento, Rango rango) {
        super(identificacion, nombres, apellidos, nacimiento);
        this.rango = rango;
    }

    public Cadete() {
        super();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cadete{");
        sb.append("identificacion=").append(identificacion);
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", nacimiento=").append(nacimiento);
        sb.append(", edad=").append(getEdad());
        sb.append(", rango='").append(getRango()).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Rango getRango() {
        return rango;
    }

    public enum Rango {
        basico(1), medio(2),
        alto(3), graduado(4);

        private int code;

        private Rango(int code) {
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
