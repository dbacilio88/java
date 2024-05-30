package com.bxcode.fundamental.poo.polimorfismo;


import com.bxcode.fundamental.poo.herencia.*;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Polimorfismo {

    public static void main(String[] args) {
        //para que exista el polimorfismo, primero debe existir herencia
        Estudiante e1 = new Estudiante("David", "Garcia", 10, "Primero");
        log.info("e1 {}", e1);
        Empleado emp = new Empleado("David", "Garcia", 10, "arquitecto", 50f);
        log.info("emp {}", emp);

        Persona p1 = new Empleado();
        Persona p2 = new com.bxcode.fundamental.poo.herencia.Estudiante();
        Persona p3 = new Gerente();
        Persona p4 = new Administrativo();

        log.info("p1 {}", p1);
        log.info("p2 {}", p2);
        log.info("p3 {}", p3);
        log.info("p4 {}", p4);
    }

}
