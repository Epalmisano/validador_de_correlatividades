package org.example;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private List<Materia> materias;

    public Inscripcion() {
        this.materias = new ArrayList<>();
    }

    public boolean aprobada(){
        for (Materia materia : materias){
            if (!materia.aprobada()){
                return false;
            }
        }
        return true;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
}

