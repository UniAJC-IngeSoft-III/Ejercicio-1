package org.unijac.ingesoft3.ejercicio1;

import org.joda.time.LocalDate;
import org.unijac.ingesoft3.ejercicio1.pojos.Cadete;
import org.unijac.ingesoft3.ejercicio1.pojos.Docente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App {

    public static String readString(String message) {
        String response = null;
        System.out.println(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            response = br.readLine();
        }catch (IOException e){
            System.err.println("IO error trying to read from stdin");
        }
        return response;
    }

    public static void main( String[] args ){
        Escuela escuela = new Escuela();

        escuela.addPersonal(new Cadete(111,"Nombre 1", "Apellido 1", new LocalDate(1970, 5, 8), Cadete.Rango.alto));
        escuela.addPersonal(new Cadete(112,"Nombre 2", "Apellido 2", new LocalDate(1975, 7, 22), Cadete.Rango.medio));
        escuela.addPersonal(new Cadete(113,"Nombre 3", "Apellido 3", new LocalDate(1985, 12, 23), Cadete.Rango.basico));
        escuela.addPersonal(new Cadete(113,"Nombre 4", "Apellido 4", new LocalDate(1984, 11, 4), Cadete.Rango.graduado));
        escuela.addPersonal(new Docente(211, "Nombre 04", "Apellido 04", new LocalDate(1971, 1, 21), Docente.NivelFormacion.doctor));
        escuela.addPersonal(new Docente(212, "Nombre 05", "Apellido 05", new LocalDate(1986, 5, 22), Docente.NivelFormacion.magister));
        escuela.addPersonal(new Docente(213, "Nombre 06", "Apellido 06", new LocalDate(1972, 2, 21), Docente.NivelFormacion.doctor));
        escuela.addPersonal(new Docente(214, "Nombre 07", "Apellido 07", new LocalDate(1985, 4, 22), Docente.NivelFormacion.magister));
        escuela.addPersonal(new Docente(215, "Nombre 08", "Apellido 08", new LocalDate(1973, 3, 21), Docente.NivelFormacion.doctor));
        escuela.addPersonal(new Docente(216, "Nombre 09", "Apellido 09", new LocalDate(1984, 3, 22), Docente.NivelFormacion.pregrado));
        escuela.addPersonal(new Docente(217, "Nombre 10", "Apellido 10", new LocalDate(1974, 4, 21), Docente.NivelFormacion.especialización));
        escuela.addPersonal(new Docente(218, "Nombre 11", "Apellido 11", new LocalDate(1983, 2, 22), Docente.NivelFormacion.magister));

        // Número de cadetes
        System.out.println(escuela.countCadetes());
        // Número de docentes
        System.out.println(escuela.countDocentes());
        // Registro de docentes
        System.out.println(escuela.registroDocentes());
        // Registro de cadetes
        System.out.println(escuela.registroCadetes());
        List<Cadete> cadetes = escuela.getCadetes();
        // oredenamiento de una lista por un atributo
        cadetes.sort(new Comparator<Cadete>() {
            @Override
            public int compare(Cadete o1, Cadete o2) {
                return o1.getEdad() - o2.getEdad();
            }
        });
        // Cadete menor
        System.out.println(cadetes.get(0));
        // Cadete mayor
        System.out.println(cadetes.get(cadetes.size() - 1));
    }
}
