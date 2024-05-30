package com.bxcode.fundamental.instrucciones.fors;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2
public class NumerosPares {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        log.info("Ingresar un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        print(num);

    }

    private static void print(int num) {

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                log.info("El número: {} es par", i);
            } else {
                log.info("El número: {} es impar", i);
            }

            String result = (i % 2 == 0) ? i + " es par" : i + " es impar";
            log.info("result = {}", result);

        }

    }
}
