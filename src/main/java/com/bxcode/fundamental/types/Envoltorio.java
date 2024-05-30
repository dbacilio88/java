package com.bxcode.fundamental.types;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Envoltorio {

    /**
     * @param args = String[]
     */
    public static void main(String[] args) {
        getByte();
        getTodo();
        getShort();
    }

    private static void getTodo() {
        //tipo de dato Integer: -32768, 32767
        int a = 1; //tipo de dato primitivo
        log.info("a = {}", a);
        //cadena: "001"
        int numero = Integer.parseInt("1111", 2);
        int entero = Integer.parseInt("10");
        double doble = Double.parseDouble("11");
        float flotante = Float.parseFloat("11");

        log.info("numero = {}", numero);
        log.info("entero = {}", entero);

        log.info("doble = {} ", doble);
        log.info("flotante = {} ", flotante);
        String nombre = "Hugo";
        int letras = nombre.length();
        log.info("nombre = {}", nombre.toUpperCase());
        log.info("nombre = {}", nombre.toLowerCase());
        log.info("letras = {}", letras);
    }

    private static void getShort() {
        //tipo de dato Short: -32768, 32767
        short a = 1; //tipo de dato primitivo
        log.info("b = {}", a);
        short number = 32767; //tipo de dato wrapper
        byte numberByte = (byte) number;//estrechamiento
        String cadena = Short.toString(number);

        log.info("numberInt long= {}", number);
        log.info("cadena long= {}", cadena);
        log.info("numberByte = {}", numberByte);
    }

    /**
     * @apiNote Este método realiza procedimiento de números byte, tipo de comentario de documentación javadoc
     * @author Christian bacilio
     * @since 12/01/2024
     */
    private static void getByte() {
        //tipo de dato Byte: -128, 127
        byte a = 1; //tipo de dato primitivo
        log.info("c = {}", a);
        byte number = 127; //tipo de dato wrapper
        String cadena = Byte.toString(number);
        log.info("numberInt = {}", number);
        log.info("cadena = {}", cadena);
    }

}
