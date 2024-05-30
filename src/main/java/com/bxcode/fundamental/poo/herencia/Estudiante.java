package com.bxcode.fundamental.poo.herencia;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Estudiante extends Persona {
    private String ciclo;

    public Estudiante() {
        super();
    }

    public Estudiante(String ciclo) {
        super();
        this.ciclo = ciclo;
    }

    public Estudiante(String nombre, String apellido, int edad, String ciclo) {
        super(nombre, apellido, edad);
        this.ciclo = ciclo;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nMi ciclo es: " + this.ciclo;
    }
}
