package com.bxcode.fundamental.poo.herencia;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Herencia {
    public static void main(String[] args) {

        Gerente produccion = new Gerente();
        produccion.setNombre("Nombre A");
        produccion.setApellido("Apellido A");
        produccion.setEdad(35);
        produccion.setCarrera("Mecanica");

        Gerente construccion = new Gerente();
        construccion.setNombre("Nombre B");
        construccion.setApellido("Apellido B");
        construccion.setEdad(40);
        construccion.setCarrera("Ing Civil");

        Administrativo rrhh = new Administrativo();
        rrhh.setNombre("Eliseo");
        rrhh.setApellido("Juarez");
        rrhh.setEdad(40);
        rrhh.setCarrera("Administracion");

        Estudiante arq = new Estudiante();
        arq.setEdad(20);
        arq.setNombre("Jose");
        arq.setApellido("Ramos");
        arq.setCiclo("Octavo");


    }

    static void getPadre() {
        Padre padre = new Padre();
        padre.setApellido("Flores");
        padre.setFecha("18-02-1980");


        Hija hija = new Hija();
        hija.setApellido("Flores");
        hija.setFecha("19-01-2010");

        log.info(padre.getApellido());
        log.info(padre.getFecha());
        log.info(hija.getApellido());
        log.info(hija.getFecha());
    }
}
