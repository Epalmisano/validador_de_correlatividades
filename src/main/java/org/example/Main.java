package org.example;

public class Main {
    public static void main(String[] args) {
        // Test
        Alumno alumno = new Alumno();
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseño = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseño.agregarCorrelativa(paradigmas);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.agregarMateria(diseño);

        // materias aprobadas
        algoritmos.setAprobada(true);
        paradigmas.setAprobada(true);
        diseño.setAprobada(true);

        alumno.agregarInscripcion(inscripcion);

        // verificar si la inscripcion esta aprobada
        if (inscripcion.aprobada()) {
            System.out.println("Inscripción aprobada");
        } else {
            System.out.println("Inscripción rechazada");
        }
    }
}