package org.unijac.ingesoft3.ejercicio1;

import org.joda.time.LocalDate;
import org.unijac.ingesoft3.ejercicio1.pojos.Cadete;
import org.unijac.ingesoft3.ejercicio1.pojos.Docente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Object> información = new ArrayList<Object>();
        información.add(new Cadete(111,"Nombre 1", "Apellido 1", new LocalDate(1970, 5, 8), Cadete.Rango.alto));
        información.add(new Cadete(112,"Nombre 2", "Apellido 2", new LocalDate(1975, 7, 22), Cadete.Rango.medio));
        información.add(new Cadete(113,"Nombre 3", "Apellido 3", new LocalDate(1985, 12, 23), Cadete.Rango.basico));
        información.add(new Docente(211, "Nombre 04", "Apellido 04", new LocalDate(1971, 1, 21), Docente.NivelFormacion.doctor));
        información.add(new Docente(212, "Nombre 05", "Apellido 05", new LocalDate(1986, 5, 22), Docente.NivelFormacion.magister));
        información.add(new Docente(213, "Nombre 06", "Apellido 06", new LocalDate(1972, 2, 21), Docente.NivelFormacion.doctor));
        información.add(new Docente(214, "Nombre 07", "Apellido 07", new LocalDate(1985, 4, 22), Docente.NivelFormacion.magister));
        información.add(new Docente(215, "Nombre 08", "Apellido 08", new LocalDate(1973, 3, 21), Docente.NivelFormacion.doctor));
        información.add(new Docente(216, "Nombre 09", "Apellido 09", new LocalDate(1984, 3, 22), Docente.NivelFormacion.pregrado));
        información.add(new Docente(217, "Nombre 10", "Apellido 10", new LocalDate(1974, 4, 21), Docente.NivelFormacion.especialización));
        información.add(new Docente(218, "Nombre 11", "Apellido 11", new LocalDate(1983, 2, 22), Docente.NivelFormacion.magister));

        Map<Docente.NivelFormacion, Integer> registro = new HashMap<Docente.NivelFormacion, Integer>();
        Cadete menor = new Cadete();
        Cadete mayor = new Cadete();
        Docente.NivelFormacion nivelFormacion;
        int edad;

        for (Object persona : información) {
            if( persona instanceof Cadete){
                edad = ((Cadete) persona).getEdad();
                if(menor.getEdad() == null && mayor.getEdad() == null){
                    menor = ((Cadete) persona);
                    mayor = ((Cadete) persona);
                }else{
                    if(edad<menor.getEdad()){
                        menor = ((Cadete) persona);
                    }
                    if(edad>mayor.getEdad()){
                        mayor = ((Cadete) persona);
                    }
                }
            }else if( persona instanceof Docente){
                nivelFormacion = ((Docente) persona).getNivelFormacion();
                if(registro.containsKey(nivelFormacion)){
                    registro.put(nivelFormacion, registro.get(nivelFormacion) + 1);
                }else{
                    registro.put(nivelFormacion, 1);
                }
            }
        }
        System.out.println("Cadete:");
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        for (Docente.NivelFormacion formacion : registro.keySet()) {
            System.out.printf("%s : %d%n", formacion, registro.get(formacion));
        }
    }
}
