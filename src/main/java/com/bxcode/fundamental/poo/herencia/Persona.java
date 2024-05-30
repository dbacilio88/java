package com.bxcode.fundamental.poo.herencia;


import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Setter
@Getter
@Log4j2
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {

        return "Mi nombre es " + nombre
                + "\nMi apellido es " + apellido
                + "\nMi edad es " + edad;
    }
}
