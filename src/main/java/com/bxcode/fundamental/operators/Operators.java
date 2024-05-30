package com.bxcode.fundamental.operators;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class Operators {

    public static void main(String[] args) {
        //OPERADORES ARITMÉTICOS COMBINADOS
        log.info("OPERADORES ARITMÉTICOS");
        int opa = 15;
        int opb = 3;
        log.info("a+b= {}", (opa + opb));
        //OPERADORES ARITMÉTICOS COMBINADOS
        log.info("OPERADORES ARITMÉTICOS COMBINADOS");
        int edad = 21;

        if (edad > 15 && edad < 20) {
            log.info("descuento = 10 % {}", edad);
        } else {
            log.info("No hay descuento");
        }

        //OPERADORES ARITMÉTICOS INCREMENTALES
        log.info("OPERADORES ARITMÉTICOS INCREMENTALES");
        int op = 10;
        int ops = 10;
        log.info("op = {}", op + 2);
        log.info("ops = {}", ++ops);

        //OPERADORES LÓGICOS O BOOLEANOS
        log.info("OPERADORES LÓGICOS O BOOLEANOS");
        log.info("!false {}", true);
        log.info("!true {}", false);

        //EL OPERADOR CONDICIONAL
        log.info("EL OPERADOR CONDICIONAL");
        int number = 23;
        String value = (number >= 25) ? "Verdadero" : "Falso";
        log.info("value = {}", value);

        //OPERADOR CONCATENACIÓN DE CADENAS
        log.info("OPERADOR CONCATENACIÓN DE CADENAS");
        String nombre = "Christian";
        nombre = nombre + " Bacilio";
        log.info("nombre = {}", nombre);
    }
}
