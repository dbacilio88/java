package com.bxcode.fundamental.instrucciones.ifs;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2
public class Mayusculas {
    public static void main(String[] args) {

        //123
        //321

        //tipo de dato: char => primitivo
        //tipo de dato: Character => wrapper
        Scanner scanner = new Scanner(System.in);
        log.info("Ingresar un texto: ");
        String cadena = scanner.nextLine();
        log.info("cadena = {}", cadena.length());
        char[] arr = cadena.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                log.info(" Es mayúscula {}", arr[i]);
            }
        }

    }
}
