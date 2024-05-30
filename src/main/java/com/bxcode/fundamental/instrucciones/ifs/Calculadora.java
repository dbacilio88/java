package com.bxcode.fundamental.instrucciones.ifs;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Ingresar número A: ");
        int numA = Integer.parseInt(scanner.nextLine()); //"1234","54512","785ghh"
        log.info("Ingresar número B: ");
        int numB = Integer.parseInt(scanner.nextLine());
        dividir(numA, numB);
        sumar(numA, numB);
        restar(numA, numB);
        multiplicar(numA, numB);


    }

    private static void sumar(int a, int b) {
        int sumar = a + b;
        log.info("sumar = {}", sumar);
    }

    private static void restar(int a, int b) {
        int restar = a - b;
        log.info("restar = {}", restar);
    }

    private static void multiplicar(int a, int b) {
        int multiplicar = a * b;
        log.info("multiplicar = {}", multiplicar);
    }

    private static void dividir(int a, int b) {

        try {
            int dividir = a / b;
            log.info("dividir = {}", dividir);
        } catch (ArithmeticException e) {
            log.error(" No se puede dividir entre cero");
        }

    }
}
