package org.unijac.ingesoft3.ejercicio1;

import org.unijac.ingesoft3.ejercicio1.pojos.Cadete;
import org.unijac.ingesoft3.ejercicio1.pojos.Docente;
import org.unijac.ingesoft3.ejercicio1.pojos.Persona;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by alexhd on 8/19/14.
 */
public class Escuela {
    private List<Object> personal;

    public Escuela() {
        personal = new ArrayList<Object>();
    }

    public void addPersonal(Object persona){
        personal.add(persona);
    }

    public List<Cadete> getCadetes() {
        List<Cadete> cadetes = new ArrayList<Cadete>();
        for (Object persona : personal) {
            if(persona instanceof Cadete){
                cadetes.add((Cadete) persona);
            }
        }
        return cadetes;
    }

    public List<Docente> getDocentes() {
        List<Docente> docentes = new ArrayList<Docente>();
        for (Object persona : personal) {
            if(persona instanceof Docente){
                docentes.add((Docente) persona);
            }
        }
        return docentes;
    }

    public int countCadetes(){
        List<Cadete> cadetes = getCadetes();
        return cadetes.size();
    }

    public int countDocentes(){
        List<Docente> docentes = getDocentes();
        return docentes.size();
    }

    public Map<Docente.NivelFormacion, Integer> registroDocentes(){
        Map<Docente.NivelFormacion, Integer> result = new HashMap<Docente.NivelFormacion, Integer>();
        List<Docente> docentes = getDocentes();
        Docente.NivelFormacion nivelFormacion;
        for (Docente docente : docentes) {
            nivelFormacion = docente.getNivelFormacion();
            if(result.containsKey(nivelFormacion)){
                result.put(nivelFormacion, result.get(nivelFormacion) + 1);
            }else{
                result.put(nivelFormacion, 1);
            }
        }
        return result;
    }

    public Map<Cadete.Rango, Integer> registroCadetes(){
        Map<Cadete.Rango, Integer> result = new HashMap<Cadete.Rango, Integer>();
        List<Cadete> cadetes = getCadetes();
        Cadete.Rango rango ;
        for (Cadete cadete : cadetes) {
            rango = cadete.getRango();
            if(result.containsKey(rango)){
                result.put(rango, result.get(rango) + 1);
            }else{
                result.put(rango, 1);
            }
        }
        return result;
    }
}
