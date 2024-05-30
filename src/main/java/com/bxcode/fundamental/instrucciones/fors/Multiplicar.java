package com.bxcode.fundamental.instrucciones.fors;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2
public class Multiplicar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Ingresar un numero de la tabla: ");
        int num = Integer.parseInt(scanner.nextLine());
        log.info("Ingresar la cantidad : ");
        int cant = Integer.parseInt(scanner.nextLine());
        print(num, cant);

    }

    private static void print(int num, int cant) {

        for (int i = 1; i <= cant; i++) {
            log.info("{} x {} = {} ", num, i, (i * num));
        }

    }

}
