package org.example;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;
    private boolean aprobada;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas=new ArrayList<>();
        this.aprobada=false;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Materia> getCorrelativas() { return correlativas; }

    public void agregarCorrelativa(Materia materia) {
        correlativas.add(materia);
    }

    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    public boolean aprobada(){
        return aprobada;
    }
}
