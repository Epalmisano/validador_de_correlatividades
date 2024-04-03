package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Alumno() {
        this.inscripciones=new ArrayList<>();
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void agregarInscripcion(Inscripcion inscripcion) {
        inscripciones.add(inscripcion);
    }
}
