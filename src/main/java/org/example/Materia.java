package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public boolean cumpleCorrelativas(List<Materia> materias){
        for (Materia correlativa : correlativas){
            if (!correlativa.aprobada()){
                return false;
            }
        }
        return true;
    }

    }
